/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOAdmin;
import DAOInterface.AdminInterface;
import DAOInterface.BarangInterface;
import DAOInterface.BukuInterface;
import DAOInterface.Laporan_PenjualanInteface;
import DAOInterface.operatorInterface;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import static com.itextpdf.text.PageSize.A4;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import static java.lang.Float.parseFloat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.TableRowSorter;
import model.TabelBuku;
import model.TabelItem;
import model.TabelKasir;
import model.TabelLaporan;
import model.adminLogin;
import model.buku;
import model.item;
import model.kasir;
import model.laporan_penjualan;
import view.adminDashboard;
import view.loginAdmin;

/**
 *
 * @author Suhaili Faruq
 */
public class controllerAdmin {

    AdminInterface admlogin;
    adminDashboard adm;
    loginAdmin frame;
    loginAdmin admlog;
    BarangInterface bi;
    BukuInterface bukui;
    operatorInterface Oi;
    Laporan_PenjualanInteface report;
    List<buku> bkList;
    List<kasir> bkKsr;
    List<item> bkItem;
    List<laporan_penjualan> reports;

    public controllerAdmin(adminDashboard adm) {
        this.adm = adm;
        this.adm.setTitle("Admin Dashboard");
        bi = new DAOAdmin();
        bukui = new DAOAdmin();
        Oi = new DAOAdmin();
        report = new DAOAdmin();
        bkList = bukui.showBukuAll();
        bkKsr = Oi.showKasirAll();
        bkItem = bi.showBarangAll();
        reports = report.ShowLaporan();

    }

    public controllerAdmin(loginAdmin frame) {
        this.frame = frame;
        this.frame.setTitle("login Admin");
        admlogin = new DAOAdmin();
    }


    public void updateBuku() {
        buku m = new buku();
        m.setKd_buku(adm.getTxtKodebukuUp().getText());
        m.setJudul_buku(adm.getTxtJudulBukuUp().getText());
        m.setGenre_buku(adm.getTxtGenreBukuUp().getText());
        m.setPenulis_buku(adm.getTxtPenulisBukuUp().getText());
        m.setPenerbit_buku(adm.getTxtPenerbitBukuUp().getText());
        m.setTahun_buku(adm.getTxtTahunTerbitBukuUp().getText());
        m.setHarga_buku(Float.parseFloat(adm.getTxtHargaBukuUp().getText()));
        m.setHarga_jual_buku(Float.parseFloat(adm.getTxtHargaJualBukuUp().getText()));
        m.setStok_buku(Integer.parseInt(adm.getTxtStokBukuUp().getText()));
        bukui.updateBuku(m);
    }

    public void insertBuku() {
        buku m = new buku();
        m.setKd_buku(adm.getTxtKodeBuku().getText());
        m.setJudul_buku(adm.getTxtJudulBuku().getText());
        m.setGenre_buku(adm.getTxtGenreBuku().getText());
        m.setPenulis_buku(adm.getTxtPenulisBuku().getText());
        m.setPenerbit_buku(adm.getTxtPenerbitBuku().getText());
        m.setTahun_buku(adm.getTxtTahunTerbitBuku().getText());
        m.setHarga_buku(Float.parseFloat(adm.getTxtHargaBuku().getText()));
        m.setHarga_jual_buku(Float.parseFloat(adm.getTxtHargaJualBuku().getText()));
        m.setStok_buku(Integer.parseInt(adm.getTxtStokBuku().getText()));
        bukui.insertBuku(m);
    }

    public void deleteBuku() {
        int y = JOptionPane.showOptionDialog(adm,
                "Yakin Hapus?",
                "Hapus",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (y == JOptionPane.YES_OPTION) {
            String kode = adm.getTxtHapus().getText();
            bukui.HapusBuku(kode);
        }
        else {
            adm.getTxtHapus().setText("");
        }

    }

    public void ShowBuku() {
        bkList = bukui.showBukuAll();
        TabelBuku tabel = new TabelBuku(bkList);
        adm.getTabelBuku().setModel(tabel);
        adm.getTabelBuku().getTableHeader().setResizingAllowed(false);

    }

    public void selectRowBuku(int row) {
        adm.getTxtKodebukuUp().setText(bkList.get(row).getKd_buku());
        adm.getTxtJudulBukuUp().setText(bkList.get(row).getJudul_buku());
        adm.getTxtGenreBukuUp().setText(bkList.get(row).getGenre_buku());
        adm.getTxtPenulisBukuUp().setText(bkList.get(row).getPenulis_buku());
        adm.getTxtPenerbitBukuUp().setText(bkList.get(row).getPenerbit_buku());
        adm.getTxtTahunTerbitBukuUp().setText(bkList.get(row).getTahun_buku());
        adm.getTxtHargaBukuUp().setText(String.valueOf(bkList.get(row).getHarga_buku()));
        adm.getTxtHargaJualBukuUp().setText(String.valueOf(bkList.get(row).getHarga_jual_buku()));
        adm.getTxtStokBukuUp().setText(String.valueOf(bkList.get(row).getStok_buku()));
        adm.getTxtKodeBuku().setText("");

    }

    public void selectFilterBuku(int row) {
        TabelBuku modelku = new TabelBuku(bkList);
        adm.getTabelBuku().setModel(modelku);
        TableRowSorter<TabelBuku> sorter = new TableRowSorter<TabelBuku>(modelku);
        adm.getTabelBuku().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariBuku().getText()));
        row = adm.getTabelBuku().getRowSorter().convertRowIndexToModel(row);
        selectRowBuku(row);
    }

    public void caridataBuku() {

        TabelBuku modelku = new TabelBuku(bkList);
        adm.getTabelBuku().setModel(modelku);
        TableRowSorter<TabelBuku> sorter = new TableRowSorter<TabelBuku>(modelku);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariBuku().getText()));
        adm.getTabelBuku().setRowSorter(sorter);

    }

    public void caridataBarang() {

        TabelItem modelku = new TabelItem(bkItem);
        adm.getTabelBarang().setModel(modelku);
        TableRowSorter<TabelItem> sorter = new TableRowSorter<TabelItem>(modelku);
        adm.getTabelBarang().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariItem().getText()));
    }

    public void selectFilterBarang(int row) {
        TabelItem modelku = new TabelItem(bkItem);
        adm.getTabelBarang().setModel(modelku);
        TableRowSorter<TabelItem> sorter = new TableRowSorter<TabelItem>(modelku);
        adm.getTabelBarang().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariItem().getText()));
        row = adm.getTabelBarang().getRowSorter().convertRowIndexToModel(row);
        selectRowItem(row);
    }

    public void updateBarang() {
        item m = new item();
        m.setKd_item(adm.getTxtKodeBrgUp().getText());
        m.setNama_item(adm.getTxtNamaBrgUp().getText());
        m.setHarga_item(Float.parseFloat(adm.getTxtHargaUp().getText()));
        m.setHarga_jual_item(Float.parseFloat(adm.getTxtHargaBrgJualUp().getText()));
        m.setStok_item(Integer.parseInt(adm.getTxtStokUp().getText()));
        bi.updateBarang(m);
    }

    public void insertBarang() {
        item m = new item();
        m.setKd_item(adm.getTxtKodeBrg().getText());
        m.setNama_item(adm.getTxtNamaBrg().getText());
        m.setHarga_item(Float.parseFloat(adm.getTxtHargaBrg().getText()));
        m.setHarga_jual_item(Float.parseFloat(adm.getTxtHargaBrgJual().getText()));
        m.setStok_item(Integer.parseInt(adm.getTxtStokBrg().getText()));
        bi.insertBarang(m);
    }

    public void deleteBarang() {

        int y = JOptionPane.showOptionDialog(adm,
                "Yakin Hapus?",
                "Hapus",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (y == JOptionPane.YES_OPTION) {
            String kode = adm.getTxtHapusBarang().getText();
            bi.HapusBarang(kode);
        }
    }

    public void ShowBarang() {
        bkItem = bi.showBarangAll();
        TabelItem tabel = new TabelItem(bkItem);
        adm.getTabelBarang().setModel(tabel);
        adm.getTabelBarang().getTableHeader().setResizingAllowed(false);

    }

    public void selectRowItem(int row) {
        adm.getTxtKodeBrgUp().setText(bkItem.get(row).getKd_item());
        adm.getTxtNamaBrgUp().setText(bkItem.get(row).getNama_item());
        adm.getTxtHargaUp().setText(String.valueOf(bkItem.get(row).getHarga_item()));
        adm.getTxtHargaBrgJualUp().setText(String.valueOf(bkItem.get(row).getHarga_jual_item()));
        adm.getTxtStokUp().setText(String.valueOf(bkItem.get(row).getStok_item()));

    }

    public void reset() {
        adm.getTxtCariBuku().setText("");
        adm.getTxtCariItem().setText("");
        adm.getTxtCariKasir().setText("");
        adm.getTxtKodeBrg().setText("");
        adm.getTxtKodeBrgUp().setText("");
        adm.getTxtKodeBuku().setText("");
        adm.getTxtKodeKasir().setText("");
        adm.getTxtKodeUnik().setText("");
        adm.getTxtKodebukuUp().setText("");
        adm.getTxtHargaBrgJual().setText("");
        adm.getTxtHargaJualBuku().setText("");
        adm.getTxtHargaJualBukuUp().setText("");
        adm.getTxtHargaBrgJualUp().setText("");
        adm.getTxtHapusBarang().setText("");
        adm.getTxtNamaBrgUp().setText("");
        adm.getTxtNamaBrg().setText("");
        adm.getTxtNamaOperator().setText("");
        adm.getTxtNamaOperatorUp().setText("");
        adm.getTxtStokBrg().setText("");
        adm.getTxtStokBuku().setText("");
        adm.getTxtStokBukuUp().setText("");
        adm.getTxtStokUp().setText("");
        adm.getTxtCariOperator().setText("");
        adm.getTxtPenerbitBuku().setText("");
        adm.getTxtPenulisBuku().setText("");
        adm.getTxtTahunTerbitBuku().setText("");
        adm.getTxtPenerbitBukuUp().setText("");
        adm.getTxtPenulisBukuUp().setText("");
        adm.getTxtTahunTerbitBukuUp().setText("");
        adm.getTxtHargaUp().setText("");

    }

    public void caridataKasir() {

        TabelKasir modelku = new TabelKasir(bkKsr);
        adm.getTabelOperator().setModel(modelku);
        TableRowSorter<TabelKasir> sorter = new TableRowSorter<TabelKasir>(modelku);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariKasir().getText()));
        adm.getTabelOperator().setRowSorter(sorter);

    }

    public void updateKasir() {
        kasir m = new kasir();
        m.setKode(adm.getTxtNIPUp().getText());
        m.setNama(adm.getTxtNamaOperatorUp().getText());
        m.setShift(adm.getSelectShiftUp().getSelectedItem().toString());
        Oi.updateKasir(m);
    }

    public void insertKasir() {
        kasir m = new kasir();
        m.setKode(adm.getTxtKodeKasir().getText());
        m.setNama(adm.getTxtNamaOperator().getText());
        m.setShift(adm.getSelectShift().getSelectedItem().toString());
        m.setKodeunik(Integer.parseInt(adm.getTxtKodeUnik().getText()));
        Oi.insertKasir(m);
    }

    public void deleteKasir() {
        int y = JOptionPane.showOptionDialog(adm,
                "Yakin Hapus?",
                "Hapus",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (y == JOptionPane.YES_OPTION) {
            String kode = adm.getTxtHapusKasir().getText();
            Oi.HapusKasir(kode);
        }
    }

    public void ShowKasir() {
        bkKsr = Oi.showKasirAll();
        TabelKasir tabel = new TabelKasir(bkKsr);
        adm.getTabelOperator().setModel(tabel);
      adm.getTabelOperator().getTableHeader().setResizingAllowed(false);

    }

    public void selectFilterKasir(int row) {
        TabelKasir modelku = new TabelKasir(bkKsr);
        adm.getTabelOperator().setModel(modelku);
        TableRowSorter<TabelKasir> sorter = new TableRowSorter<TabelKasir>(modelku);
        adm.getTabelOperator().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(adm.getTxtCariKasir().getText()));
        row = adm.getTabelOperator().getRowSorter().convertRowIndexToModel(row);
        selectRowKasir(row);
    }

    public void selectRowKasir(int row) {
        adm.getTxtNIPUp().setText(bkKsr.get(row).getKode());
        adm.getTxtNamaOperatorUp().setText(bkKsr.get(row).getNama());
        adm.getSelectShiftUp().getSelectedItem().equals(String.valueOf(bkKsr.get(row).getShift()));
    }

    public void Prosesrandom() {
        int i = 0;
        Random kodeRandom = new Random();
        int kode = kodeRandom.nextInt(999999);
        adm.getTxtKodeUnik().setText(String.valueOf(kode));

    }

    public void showLaporan() {
        reports = report.ShowLaporan();
        TabelLaporan tb = new TabelLaporan(reports);
        adm.getTabelLapor().setModel(tb);
    }

    public void ceklogin() {
        adminLogin n = new adminLogin();
        n.setUsername(frame.getTxtadminUser().getText());
        n.setPass(new String(frame.getTxtPassword().getPassword()));
        String hasil = admlogin.checkAdmin(n);
        if (hasil != null) {
            JOptionPane.showMessageDialog(frame, "Login Berhasil");
            adm = new adminDashboard(hasil);
            adm.setVisible(true);
            frame.dispose();
        }
        else {
                JOptionPane.showMessageDialog(frame, "Login Gagal Perhatikan User dan Password");
        }
    }

    public void logout() {
        frame = new loginAdmin();
        int u = JOptionPane.showOptionDialog(adm,
                "Yakin Logout?",
                "Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (u == JOptionPane.YES_OPTION) {
            frame.setVisible(true);
            adm.dispose();
        }

    }

    public void exportPDF() {
        reports = report.ShowLaporan();
        TabelLaporan u = new TabelLaporan(reports);
        adm.getTabelLapor().setModel(u);
        String FILE = "E:\\hasil\\Laporan.pdf";

        try {
            Document dokDocument = new Document(A4);
            PdfWriter.getInstance(dokDocument, new FileOutputStream(FILE));
            dokDocument.open();
              Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
               Font.BOLD);
              Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
              Font subFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.BOLD);
              
              Font subFont3 = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL);
            Paragraph judul = new Paragraph("Laporan Pendapatan Toko",catFont);
             judul.setAlignment(Element.ALIGN_CENTER);
            dokDocument.add(judul);
            dokDocument.add(new Paragraph(Chunk.NEWLINE));
            PdfPTable table = new PdfPTable(6);
            
            PdfPCell c1 = new PdfPCell(new Phrase("Nama Barang",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Kategori",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Jumlah terjual",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Total",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("Kasir",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("Tanggal Transaksi",catFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setVerticalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
              float hasil = 0;
               PdfPCell isi;
            for (int i = 0; i < u.getRowCount(); i++) {
               isi = new PdfPCell(new Phrase(u.getValueAt(i, 1).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
               isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                 isi = new PdfPCell(new Phrase(u.getValueAt(i, 2).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
               isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                 isi = new PdfPCell(new Phrase(u.getValueAt(i, 3).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
               isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                 isi = new PdfPCell(new Phrase(u.getValueAt(i, 4).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
               isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                 isi = new PdfPCell(new Phrase(u.getValueAt(i, 5).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
                isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                 isi = new PdfPCell(new Phrase(u.getValueAt(i, 6).toString(),subFont2));
               isi.setHorizontalAlignment(Element.ALIGN_CENTER);
                isi.setVerticalAlignment(Element.ALIGN_CENTER);
                table.addCell(isi);
                hasil += parseFloat(u.getValueAt(i, 4).toString());
            }
            
            dokDocument.add(table);
            
         dokDocument.add(new Paragraph(Chunk.NEWLINE));
          PdfPTable tabeltot = new PdfPTable(1);
           PdfPCell head = new PdfPCell(new Phrase("Total"));
           head.setHorizontalAlignment(Element.ALIGN_CENTER);
           tabeltot.addCell(head);
            PdfPCell t = new PdfPCell(new Phrase("Total : RP "+String.valueOf(hasil),subFont2));
           t.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabeltot.addCell(t);
            dokDocument.add(tabeltot);
         
          dokDocument.add(new Paragraph(Chunk.NEWLINE));
          dokDocument.add(new Paragraph(Chunk.NEWLINE));
         dokDocument.add(new Paragraph("Admin Melapor",subFont2));
         dokDocument.add(new Paragraph(Chunk.NEWLINE));
         dokDocument.add(new Paragraph(adm.getTxtAdmin().getText(),subFont3));
            dokDocument.close();
        }
        catch (Exception e) {
            System.out.println("err " + e);
        }

    }
    
    public void tampiljam(){
        Timer tim;
        ActionListener aksi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         Date f = new Date();
        DateFormat dateku = new SimpleDateFormat("HH:mm:ss");
        String time = dateku.format(f);
        adm.getTimeAdmin().setText(time);
            }
        };
        tim = new Timer(1000, aksi);
        tim.setDelay(0);
          tim.start();
       
    }
    
    public void tampiltanggal(){
        Timer tim;
        ActionListener aksi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         Date f = new Date();
        DateFormat dateku = new SimpleDateFormat("dd/mm/yyyy");
        String time = dateku.format(f);
        adm.getTglAdmin().setText(time);
            }
        };
        tim = new Timer(1000, aksi);
        tim.setDelay(0);
          tim.start();
    }
    
    

}
