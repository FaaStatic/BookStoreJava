/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOAdmin;
import DAO.DAOKasir;
import DAO.DAOPenjualan;
import DAOInterface.*;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.TableRowSorter;
import model.*;
import view.DaftarUsernameKasir;
import view.loginOperator;
import view.operatorDashboard;
/**
 *
 * @author Suhaili Faruq
 */
public class ControllerKasir {

    operatorDashboard frame;
    loginOperator frame2;
    DaftarUsernameKasir frame3;
    BukuInterface book;
    BarangInterface itemku;
    Ringkas listTemp;
    Laporan_PenjualanInteface Oi;
    List<Ringkas> df = new ArrayList<Ringkas>();
    loginOperator Lo;
    List<buku> uwu;
    List<item> yu;
    DaftarUsernameKasir usersignup;
    DAOKasir data;

    public ControllerKasir(operatorDashboard frame) {
        this.frame = frame;
        this.frame.setTitle("Kasir App");
        book = new DAOAdmin();
        itemku = new DAOAdmin();
        Oi = new DAOPenjualan();
        uwu = book.showBukuAll();
        yu = itemku.showBarangAll();
        this.data = new DAOKasir();
    }

    public ControllerKasir(DaftarUsernameKasir frame1) {
        this.usersignup = frame1;
        this.usersignup.setTitle("SignUp Kasir");
        this.data = new DAOKasir();

    }

    public ControllerKasir(loginOperator u) {
        this.Lo = u;
        this.Lo.setTitle("Login Kasir");
        this.data = new DAOKasir();
    }

    public void addUser() {
        kasir u = new kasir();
        u.setUser(usersignup.getRegisKasirUsername().getText());
        u.setPass(usersignup.getRegisKasirPassword().getText());
        u.setKodeunik(Integer.parseInt(usersignup.getKodeUnikAdmin().getText()));
        boolean tes = this.data.addKasirUser(u);
        if (tes) {
            JOptionPane.showMessageDialog(usersignup, "Pendaftaran Berhasil");
            this.Lo = new loginOperator();
            this.Lo.setVisible(true);
            usersignup.dispose();
        }
        else {
            JOptionPane.showMessageDialog(usersignup, "Pendaftaran Gagal");
        }

    }

    public void daftarKasir() {
        usersignup = new DaftarUsernameKasir();
        usersignup.setVisible(true);
        this.Lo.dispose();
    }

    public void kasirLogin() {
        String user = this.Lo.getTxtOPUser().getText();
        String nama = data.cekLoginOperator(user, new String(this.Lo.getTxtPasswordOP().getPassword()));
        data.insertAbsen(user);
        if (nama == null) {
            JOptionPane.showMessageDialog(this.Lo, "Login Gagal");
        }
        else {

            JOptionPane.showMessageDialog(this.Lo, "Login Berhasil Absen Otomatis Input");
            operatorDashboard dash = new operatorDashboard(nama);
            dash.setVisible(true);
            this.Lo.dispose();
        }
    }

    public void showRingkasan() {
        float hasil = 0;
        Tabel_Ringkasan u = new Tabel_Ringkasan(this.df);
        frame.getTabelRingkas().setModel(u);
        for (int i = 0; i < u.getRowCount(); i++) {
            hasil += Float.parseFloat(u.getValueAt(i, 3).toString());
        }
        frame.getTxtDibayar().setText(String.valueOf(hasil));
    }

    public void tampilBuku() {
        uwu = book.showBukuAll();
        TabelBuku bookone = new TabelBuku(uwu);
        frame.getTabelList().setModel(bookone);

    }

    public void tampilanItem() {
        yu = itemku.showBarangAll();
        TabelItem brg = new TabelItem(yu);
        frame.getTabelList().setModel(brg);
    }

    public void SelectItem(int row) {
        frame.getTxtBarang().setText(yu.get(row).getNama_item());
        frame.getTxtKategori().setText("Perlengkapan");
        frame.getTxtHarga().setText(String.valueOf(yu.get(row).getHarga_jual_item()));
    }

    public void selectFilterItem(int row) {
        TabelItem modelku = new TabelItem(yu);
        frame.getTabelList().setModel(modelku);
        TableRowSorter<TabelItem> tr = new TableRowSorter<TabelItem>(modelku);
        frame.getTabelList().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(frame.getTxtCariList().getText()));
        row = frame.getTabelList().getRowSorter().convertRowIndexToModel(row);
        SelectItem(row);
    }

    public void SelectBuku(int row) {
        frame.getTxtBarang().setText(uwu.get(row).getJudul_buku());
        frame.getTxtKategori().setText("Buku");
        frame.getTxtHarga().setText(String.valueOf(uwu.get(row).getHarga_jual_buku()));
    }

    public void selectFilterBuku(int row) {
        TabelBuku modelku = new TabelBuku(uwu);
        frame.getTabelList().setModel(modelku);
        TableRowSorter<TabelBuku> tr = new TableRowSorter<TabelBuku>(modelku);
        frame.getTabelList().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(frame.getTxtCariList().getText()));
        row = frame.getTabelList().getRowSorter().convertRowIndexToModel(row);
        SelectBuku(row);
    }

    public void addlapor() {
        Tabel_Ringkasan uwu = new Tabel_Ringkasan(this.df);
        int i;
        for (i = 0; i < uwu.getRowCount(); i++) {
            laporan_penjualan u = new laporan_penjualan();
            u.setNama_barang(uwu.getValueAt(i, 0).toString());
            u.setKategori(uwu.getValueAt(i, 1).toString());
            u.setJumlah(Integer.parseInt(uwu.getValueAt(i, 2).toString()));
            u.setBayar(Float.parseFloat(uwu.getValueAt(i, 3).toString()));
            u.setKasir(uwu.getValueAt(i, 4).toString());
            Oi.insertLaporan(u);
        }

        this.df.clear();
    }

    public void addRicician() {

        Ringkas u = new Ringkas();
        float harga = Float.parseFloat(frame.getTxtHarga().getText());
        int jumlah = Integer.parseInt(frame.getTxtJumlah().getText());
        float total = harga * (float) jumlah;
        u.setNama_barang(frame.getTxtBarang().getText());
        u.setKategori(frame.getTxtKategori().getText());
        u.setTotal(total);
        u.setKasir(frame.getTxtKasir().getText());
        u.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));

        this.df.add(u);

    }

    public void caridataBuku() {
        TabelBuku modelku = new TabelBuku(uwu);
        frame.getTabelList().setModel(modelku);
        TableRowSorter<TabelBuku> tr = new TableRowSorter<TabelBuku>(modelku);
        frame.getTabelList().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(frame.getTxtCariList().getText()));
        frame.getTabelList().setRowSorter(tr);

    }

    public void caridataItem() {
        TabelItem modelku = new TabelItem(yu);
        frame.getTabelList().setModel(modelku);
        TableRowSorter<TabelItem> tr = new TableRowSorter<TabelItem>(modelku);
        frame.getTabelList().setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(frame.getTxtCariList().getText()));
        frame.getTabelList().setRowSorter(tr);

    }

    public void resetJumlah() {
        frame.getTxtJumlah().setText("");
        frame.getTxtBarang().setText("");
        frame.getTxtHarga().setText("");
        frame.getTxtKategori().setText("");
        frame.getTxtJumlah().setText("");
    }

    public void logout() {
        Lo = new loginOperator();
        int yuhu = JOptionPane.showOptionDialog(frame,
                "Yakin Logout?",
                "Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (yuhu == JOptionPane.YES_OPTION) {
            Lo.setVisible(true);
            frame.dispose();
        }
        else {

        }

    }
    
    public boolean stokBukuProses(){
        int jumlah;
        String nama;
        nama = frame.getTxtBarang().getText();
        jumlah = Integer.parseInt(frame.getTxtJumlah().getText());
        boolean status = this.data.getStokBuku(nama, jumlah);
        return status;
    }
    
     public boolean stokItemProses(){
        int jumlah;
        String nama;
        nama = frame.getTxtBarang().getText();
        jumlah = Integer.parseInt(frame.getTxtJumlah().getText());
        boolean status = this.data.getStokItem(nama, jumlah);
        return status;
    }
    
    public void exportPDFPembeli()throws FileNotFoundException{
        Tabel_Ringkasan u = new Tabel_Ringkasan(this.df);
        frame.getTabelRingkas().setModel(u);
         String Path = "E:\\Hasil\\struk.pdf";
         try {
             Rectangle ukuran = new Rectangle(600,800);
            Document struk = new Document(ukuran);
            PdfWriter.getInstance(struk,new FileOutputStream(Path));
            struk.open();
             Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
               Font.BOLD);
              Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
              Font subFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 14,
            Font.BOLD);
            
            Paragraph header = new Paragraph("STRUK",catFont);
            header.setAlignment(Element.ALIGN_CENTER);
            struk.add(header);
            Paragraph garis = new Paragraph("============================================================");
            garis.setAlignment(Element.ALIGN_CENTER);
            struk.add(garis);
            struk.add(new Paragraph(Chunk.NEWLINE));
            Paragraph bayaran = new Paragraph("Beli",subFont);
            bayaran.setAlignment(Element.ALIGN_LEFT);
            float hasil = 0;
            PdfPTable rinci = new PdfPTable(3);
            PdfPCell rincian;
            for(int i = 0;i<u.getRowCount();i++){
                rincian = new PdfPCell(new Phrase(u.getValueAt(i, 0).toString()));
                rincian.setHorizontalAlignment(Element.ALIGN_CENTER);
                rincian.setBorder(Rectangle.NO_BORDER);
                rinci.addCell(rincian);
                rincian = new PdfPCell(new Phrase("x"+String.valueOf(u.getValueAt(i, 2).toString())));
                rincian.setHorizontalAlignment(Element.ALIGN_CENTER);
                rincian.setBorder(Rectangle.NO_BORDER);
                rinci.addCell(rincian);
                 rincian = new PdfPCell(new Phrase("Rp "+String.valueOf(Float.parseFloat(u.getValueAt(i, 3).toString()))));
                rincian.setHorizontalAlignment(Element.ALIGN_CENTER);
                rincian.setBorder(Rectangle.NO_BORDER);
                rinci.addCell(rincian);
               
                 hasil+=Float.parseFloat(u.getValueAt(i, 3).toString());
            }
            struk.add(rinci);
             struk.add(new Paragraph(Chunk.NEWLINE));
             PdfPTable tabel = new PdfPTable(3);
             PdfPCell isi;
             isi = new PdfPCell(new Phrase(""));
              isi.setBorder(Rectangle.NO_BORDER);
             tabel.addCell(isi);
             isi = new PdfPCell(new Phrase(""));
              isi.setBorder(Rectangle.NO_BORDER);
             tabel.addCell(isi);
             isi = new PdfPCell(new Phrase("Total : Rp "+hasil,subFont2));
             isi.setHorizontalAlignment(Element.ALIGN_CENTER);
             isi.setBorder(Rectangle.NO_BORDER);
             tabel.addCell(isi);
             struk.add(tabel);
             struk.add(new Paragraph(Chunk.NEWLINE));
             struk.add(new Paragraph(Chunk.NEWLINE));
             
              struk.add(new Paragraph(frame.getTxtKasir().getText()+"Kasir : ",subFont2));
              
            struk.close();
        }
        catch (Exception e) {
            System.out.println("err "+e);
        }
    }
         
     public void tampiljam()
     {
        Timer tim;
        ActionListener aksi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         Date f = new Date();
        DateFormat dateku = new SimpleDateFormat("HH:mm:ss");
        String time = dateku.format(f);
        frame.getTimeOp().setText(time);
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
        frame.getTglOp().setText(time);
            }
        };
        tim = new Timer(1000, aksi);
        tim.setDelay(0);
        tim.start();
    }
}    



