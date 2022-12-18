/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controllerAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author Suhaili Faruq
 */
public class adminDashboard
        extends javax.swing.JFrame {

    /**
     * @return the TimeAdmin
     */
    public javax.swing.JLabel getTimeAdmin() {
        return TimeAdmin;
    }

    /**
     * @param TimeAdmin the TimeAdmin to set
     */
    public void setTimeAdmin(javax.swing.JLabel TimeAdmin) {
        this.TimeAdmin = TimeAdmin;
    }

    /**
     * @return the tglAdmin
     */
    public javax.swing.JLabel getTglAdmin() {
        return tglAdmin;
    }

    /**
     * @param tglAdmin the tglAdmin to set
     */
    public void setTglAdmin(javax.swing.JLabel tglAdmin) {
        this.tglAdmin = tglAdmin;
    }

    /**
     * @return the tabelLapor
     */
    public javax.swing.JTable getTabelLapor() {
        return tabelLapor;
    }

    /**
     * @param tabelLapor the tabelLapor to set
     */
    public void setTabelLapor(javax.swing.JTable tabelLapor) {
        this.tabelLapor = tabelLapor;
    }

    /**
     * @return the txtKodeKasir
     */
    public javax.swing.JTextField getTxtKodeKasir() {
        return txtKodeKasir;
    }

    /**
     * @param txtKodeKasir the txtKodeKasir to set
     */
    public void setTxtKodeKasir(javax.swing.JTextField txtKodeKasir) {
        this.txtKodeKasir = txtKodeKasir;
    }

    /**
     * @return the txtCariKasir
     */
    public javax.swing.JTextField getTxtCariKasir() {
        return txtCariKasir;
    }

    /**
     * @param txtCariKasir the txtCariKasir to set
     */
    public void setTxtCariKasir(javax.swing.JTextField txtCariKasir) {
        this.txtCariKasir = txtCariKasir;
    }

    /**
     * @return the btnRandom
     */
    public javax.swing.JButton getBtnRandom() {
        return btnRandom;
    }

    /**
     * @param btnRandom the btnRandom to set
     */
    public void setBtnRandom(javax.swing.JButton btnRandom) {
        this.btnRandom = btnRandom;
    }

    /**
     * @return the txtKodeUnik
     */
    public javax.swing.JTextField getTxtKodeUnik() {
        return txtKodeUnik;
    }

    /**
     * @param txtKodeUnik the txtKodeUnik to set
     */
    public void setTxtKodeUnik(javax.swing.JTextField txtKodeUnik) {
        this.txtKodeUnik = txtKodeUnik;
    }

    /**
     * @return the BtnHapusBarang
     */
    public javax.swing.JButton getBtnHapusBarang() {
        return BtnHapusBarang;
    }

    /**
     * @param BtnHapusBarang the BtnHapusBarang to set
     */
    public void setBtnHapusBarang(javax.swing.JButton BtnHapusBarang) {
        this.BtnHapusBarang = BtnHapusBarang;
    }

    /**
     * @return the TxtHapusBarang
     */
    public javax.swing.JTextField getTxtHapusBarang() {
        return TxtHapusBarang;
    }

    /**
     * @param TxtHapusBarang the TxtHapusBarang to set
     */
    public void setTxtHapusBarang(javax.swing.JTextField TxtHapusBarang) {
        this.TxtHapusBarang = TxtHapusBarang;
    }

    /**
     * @return the BtnHapusBuku
     */
    public javax.swing.JButton getBtnHapusBuku() {
        return BtnHapusBuku;
    }

    /**
     * @param BtnHapusBuku the BtnHapusBuku to set
     */
    public void setBtnHapusBuku(javax.swing.JButton BtnHapusBuku) {
        this.BtnHapusBuku = BtnHapusBuku;
    }

    /**
     * @return the TxtHapus
     */
    public javax.swing.JTextField getTxtHapus() {
        return TxtHapus;
    }

    /**
     * @param TxtHapus the TxtHapus to set
     */
    public void setTxtHapus(javax.swing.JTextField TxtHapus) {
        this.TxtHapus = TxtHapus;
    }

    /**
     * @return the TxtPenerbitBuku
     */
    public javax.swing.JTextField getTxtPenerbitBuku() {
        return TxtPenerbitBuku;
    }

    /**
     * @param TxtPenerbitBuku the TxtPenerbitBuku to set
     */
    public void setTxtPenerbitBuku(javax.swing.JTextField TxtPenerbitBuku) {
        this.TxtPenerbitBuku = TxtPenerbitBuku;
    }

    /**
     * @return the TxtPenerbitBukuUp
     */
    public javax.swing.JTextField getTxtPenerbitBukuUp() {
        return TxtPenerbitBukuUp;
    }

    /**
     * @param TxtPenerbitBukuUp the TxtPenerbitBukuUp to set
     */
    public void setTxtPenerbitBukuUp(javax.swing.JTextField TxtPenerbitBukuUp) {
        this.TxtPenerbitBukuUp = TxtPenerbitBukuUp;
    }

    /**
     * @return the TxtPenulisBuku
     */
    public javax.swing.JTextField getTxtPenulisBuku() {
        return TxtPenulisBuku;
    }

    /**
     * @param TxtPenulisBuku the TxtPenulisBuku to set
     */
    public void setTxtPenulisBuku(javax.swing.JTextField TxtPenulisBuku) {
        this.TxtPenulisBuku = TxtPenulisBuku;
    }

    /**
     * @return the TxtPenulisBukuUp
     */
    public javax.swing.JTextField getTxtPenulisBukuUp() {
        return TxtPenulisBukuUp;
    }

    /**
     * @param TxtPenulisBukuUp the TxtPenulisBukuUp to set
     */
    public void setTxtPenulisBukuUp(javax.swing.JTextField TxtPenulisBukuUp) {
        this.TxtPenulisBukuUp = TxtPenulisBukuUp;
    }

    /**
     * @return the btnExport
     */
    public javax.swing.JButton getBtnExport() {
        return btnExport;
    }

    /**
     * @param btnExport the btnExport to set
     */
    public void setBtnExport(javax.swing.JButton btnExport) {
        this.btnExport = btnExport;
    }

    /**
     * @return the txtHargaBrgJual
     */
    public javax.swing.JTextField getTxtHargaBrgJual() {
        return txtHargaBrgJual;
    }

    /**
     * @param txtHargaBrgJual the txtHargaBrgJual to set
     */
    public void setTxtHargaBrgJual(javax.swing.JTextField txtHargaBrgJual) {
        this.txtHargaBrgJual = txtHargaBrgJual;
    }

    /**
     * @return the txtHargaBrgJualUp
     */
    public javax.swing.JTextField getTxtHargaBrgJualUp() {
        return txtHargaBrgJualUp;
    }

    /**
     * @param txtHargaBrgJualUp the txtHargaBrgJualUp to set
     */
    public void setTxtHargaBrgJualUp(javax.swing.JTextField txtHargaBrgJualUp) {
        this.txtHargaBrgJualUp = txtHargaBrgJualUp;
    }

    /**
     * @return the txtHargaJualBuku
     */
    public javax.swing.JTextField getTxtHargaJualBuku() {
        return txtHargaJualBuku;
    }

    /**
     * @param txtHargaJualBuku the txtHargaJualBuku to set
     */
    public void setTxtHargaJualBuku(javax.swing.JTextField txtHargaJualBuku) {
        this.txtHargaJualBuku = txtHargaJualBuku;
    }

    /**
     * @return the txtHargaJualBukuUp
     */
    public javax.swing.JTextField getTxtHargaJualBukuUp() {
        return txtHargaJualBukuUp;
    }

    /**
     * @param txtHargaJualBukuUp the txtHargaJualBukuUp to set
     */
    public void setTxtHargaJualBukuUp(javax.swing.JTextField txtHargaJualBukuUp) {
        this.txtHargaJualBukuUp = txtHargaJualBukuUp;
    }

    /**
     * @return the txtTahunTerbitBuku
     */
    public javax.swing.JTextField getTxtTahunTerbitBuku() {
        return txtTahunTerbitBuku;
    }

    /**
     * @param txtTahunTerbitBuku the txtTahunTerbitBuku to set
     */
    public void setTxtTahunTerbitBuku(javax.swing.JTextField txtTahunTerbitBuku) {
        this.txtTahunTerbitBuku = txtTahunTerbitBuku;
    }

    /**
     * @return the txtTahunTerbitBukuUp
     */
    public javax.swing.JTextField getTxtTahunTerbitBukuUp() {
        return txtTahunTerbitBukuUp;
    }

    /**
     * @param txtTahunTerbitBukuUp the txtTahunTerbitBukuUp to set
     */
    public void setTxtTahunTerbitBukuUp(
            javax.swing.JTextField txtTahunTerbitBukuUp) {
        this.txtTahunTerbitBukuUp = txtTahunTerbitBukuUp;
    }

    /**
     * @return the BtnCariBukuUp
     */
    /**
     * @param BtnCariBukuUp the BtnCariBukuUp to set
     */
    /**
     * @return the ResetFieldUpdateOp
     *
     *
     * /
     **
     * @return the SelectShift
     */
    public javax.swing.JComboBox<String> getSelectShift() {
        return SelectShift;
    }

    /**
     * @param SelectShift the SelectShift to set
     */
    public void setSelectShift(javax.swing.JComboBox<String> SelectShift) {
        this.SelectShift = SelectShift;
    }

    /**
     * @return the SelectShiftUp
     */
    public javax.swing.JComboBox<String> getSelectShiftUp() {
        return SelectShiftUp;
    }

    /**
     * @param SelectShiftUp the SelectShiftUp to set
     */
    public void setSelectShiftUp(javax.swing.JComboBox<String> SelectShiftUp) {
        this.SelectShiftUp = SelectShiftUp;
    }

    /**
     * @return the TabelBuku
     */
    public javax.swing.JTable getTabelBuku() {
        return TabelBuku;
    }

    /**
     * @param TabelBuku the TabelBuku to set
     */
    public void setTabelBuku(javax.swing.JTable TabelBuku) {
        this.TabelBuku = TabelBuku;
    }

    /**
     * @return the TabelOperator
     */
    public javax.swing.JTable getTabelOperator() {
        return TabelOperator;
    }

    /**
     * @param TabelOperator the TabelOperator to set
     */
    public void setTabelOperator(javax.swing.JTable TabelOperator) {
        this.TabelOperator = TabelOperator;
    }

    /**
     * @return the btnCariOperator
     *
     *
     * /
     **
     * @return the btnCariOperatorUp
     */
    /**
     * @return the btnHapusBuku
     */
    /**
     * @return the btnHapusItem
     */
    /**
     * @return the btnLogoutAdmin
     */
    public javax.swing.JButton getBtnLogoutAdmin() {
        return btnLogoutAdmin;
    }

    /**
     * @param btnLogoutAdmin the btnLogoutAdmin to set
     */
    public void setBtnLogoutAdmin(javax.swing.JButton btnLogoutAdmin) {
        this.btnLogoutAdmin = btnLogoutAdmin;
    }

    /**
     * @return the btnResetFieldBuku
     */
   

    /**
     * @return the btnSimpanBrg
     */
    public javax.swing.JButton getBtnSimpanBrg() {
        return btnSimpanBrg;
    }

    /**
     * @param btnSimpanBrg the btnSimpanBrg to set
     */
    public void setBtnSimpanBrg(javax.swing.JButton btnSimpanBrg) {
        this.btnSimpanBrg = btnSimpanBrg;
    }

    /**
     * @return the btnSimpanBrgUp
     */
    public javax.swing.JButton getBtnSimpanBrgUp() {
        return btnSimpanBrgUp;
    }

    /**
     * @param btnSimpanBrgUp the btnSimpanBrgUp to set
     */
    public void setBtnSimpanBrgUp(javax.swing.JButton btnSimpanBrgUp) {
        this.btnSimpanBrgUp = btnSimpanBrgUp;
    }

    /**
     * @return the btnSimpanBuku
     */
    public javax.swing.JButton getBtnSimpanBuku() {
        return btnSimpanBuku;
    }

    /**
     * @param btnSimpanBuku the btnSimpanBuku to set
     */
    public void setBtnSimpanBuku(javax.swing.JButton btnSimpanBuku) {
        this.btnSimpanBuku = btnSimpanBuku;
    }

    /**
     * @return the btnUodateBuku
     */
    public javax.swing.JButton getBtnUodateBuku() {
        return btnUodateBuku;
    }

    /**
     * @param btnUodateBuku the btnUodateBuku to set
     */
    public void setBtnUodateBuku(javax.swing.JButton btnUodateBuku) {
        this.btnUodateBuku = btnUodateBuku;
    }

    /**
     * @return the btnUp
     */
    /**
     * @return the btnUpdateOperator
     */
    public javax.swing.JButton getBtnUpdateOperator() {
        return btnUpdateOperator;
    }

    /**
     * @param btnUpdateOperator the btnUpdateOperator to set
     */
    public void setBtnUpdateOperator(javax.swing.JButton btnUpdateOperator) {
        this.btnUpdateOperator = btnUpdateOperator;
    }

    /**
     * @return the btncariBuku
     */
    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel10
     */
    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    /**
     * @param jLabel10 the jLabel10 to set
     */
    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    /**
     * @return the jLabel11
     */
    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    /**
     * @param jLabel11 the jLabel11 to set
     */
    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    /**
     * @return the jLabel12
     */
    public javax.swing.JLabel getjLabel12() {
        return jLabel12;
    }

    /**
     * @param jLabel12 the jLabel12 to set
     */
    public void setjLabel12(javax.swing.JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    /**
     * @return the jLabel13
     */
    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    /**
     * @param jLabel13 the jLabel13 to set
     */
    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    /**
     * @return the jLabel14
     */
    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    /**
     * @param jLabel14 the jLabel14 to set
     */
    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    /**
     * @return the jLabel15
     */
    public javax.swing.JLabel getjLabel15() {
        return jLabel15;
    }

    /**
     * @param jLabel15 the jLabel15 to set
     */
    public void setjLabel15(javax.swing.JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    /**
     * @return the jLabel16
     */
    public javax.swing.JLabel getjLabel16() {
        return jLabel16;
    }

    /**
     * @param jLabel16 the jLabel16 to set
     */
    public void setjLabel16(javax.swing.JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    /**
     * @return the jLabel17
     */
    public javax.swing.JLabel getjLabel17() {
        return jLabel17;
    }

    /**
     * @param jLabel17 the jLabel17 to set
     */
    public void setjLabel17(javax.swing.JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    /**
     * @return the jLabel18
     */
    public javax.swing.JLabel getjLabel18() {
        return jLabel18;
    }

    /**
     * @param jLabel18 the jLabel18 to set
     */
    public void setjLabel18(javax.swing.JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    /**
     * @return the jLabel19
     */
    public javax.swing.JLabel getjLabel19() {
        return jLabel19;
    }

    /**
     * @param jLabel19 the jLabel19 to set
     */
    public void setjLabel19(javax.swing.JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    /**
     * @return the jLabel20
     */
    public javax.swing.JLabel getjLabel20() {
        return jLabel20;
    }

    /**
     * @param jLabel20 the jLabel20 to set
     */
    public void setjLabel20(javax.swing.JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    /**
     * @return the jLabel21
     */
    public javax.swing.JLabel getjLabel21() {
        return jLabel21;
    }

    /**
     * @param jLabel21 the jLabel21 to set
     */
    public void setjLabel21(javax.swing.JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    /**
     * @return the jLabel22
     */
    public javax.swing.JLabel getjLabel22() {
        return jLabel22;
    }

    /**
     * @param jLabel22 the jLabel22 to set
     */
    public void setjLabel22(javax.swing.JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    /**
     * @return the jLabel23
     */
    public javax.swing.JLabel getjLabel23() {
        return jLabel23;
    }

    /**
     * @param jLabel23 the jLabel23 to set
     */
    public void setjLabel23(javax.swing.JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    /**
     * @return the jLabel24
     */
    public javax.swing.JLabel getjLabel24() {
        return jLabel24;
    }

    /**
     * @param jLabel24 the jLabel24 to set
     */
    public void setjLabel24(javax.swing.JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    /**
     * @return the jLabel25
     */
    public javax.swing.JLabel getjLabel25() {
        return jLabel25;
    }

    /**
     * @param jLabel25 the jLabel25 to set
     */
    public void setjLabel25(javax.swing.JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    /**
     * @return the jLabel28
     */
    public javax.swing.JLabel getjLabel28() {
        return jLabel28;
    }

    /**
     * @param jLabel28 the jLabel28 to set
     */
    public void setjLabel28(javax.swing.JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    /**
     * @return the jLabel29
     */
    public javax.swing.JLabel getjLabel29() {
        return jLabel29;
    }

    /**
     * @param jLabel29 the jLabel29 to set
     */
    public void setjLabel29(javax.swing.JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel30
     */
    public javax.swing.JLabel getjLabel30() {
        return jLabel30;
    }

    /**
     * @param jLabel30 the jLabel30 to set
     */
    public void setjLabel30(javax.swing.JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    /**
     * @return the jLabel31
     */
    public javax.swing.JLabel getjLabel31() {
        return jLabel31;
    }

    /**
     * @param jLabel31 the jLabel31 to set
     */
    public void setjLabel31(javax.swing.JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    /**
     * @return the jLabel34
     */
    public javax.swing.JLabel getjLabel34() {
        return jLabel34;
    }

    /**
     * @param jLabel34 the jLabel34 to set
     */
    public void setjLabel34(javax.swing.JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel10
     */
    public javax.swing.JPanel getjPanel10() {
        return jPanel10;
    }

    /**
     * @param jPanel10 the jPanel10 to set
     */
    public void setjPanel10(javax.swing.JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    /**
     * @return the jPanel11
     */
    public javax.swing.JPanel getjPanel11() {
        return jPanel11;
    }

    /**
     * @param jPanel11 the jPanel11 to set
     */
    public void setjPanel11(javax.swing.JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the jPanel3
     */
    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    /**
     * @param jPanel3 the jPanel3 to set
     */
    public void setjPanel3(javax.swing.JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    /**
     * @return the jPanel4
     */
    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    /**
     * @param jPanel4 the jPanel4 to set
     */
    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    /**
     * @return the jPanel5
     */
    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    /**
     * @param jPanel5 the jPanel5 to set
     */
    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    /**
     * @return the jPanel6
     */
    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }

    /**
     * @param jPanel6 the jPanel6 to set
     */
    public void setjPanel6(javax.swing.JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    /**
     * @return the jPanel7
     */
    public javax.swing.JPanel getjPanel7() {
        return jPanel7;
    }

    /**
     * @param jPanel7 the jPanel7 to set
     */
    public void setjPanel7(javax.swing.JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    /**
     * @return the jPanel8
     */
    public javax.swing.JPanel getjPanel8() {
        return jPanel8;
    }

    /**
     * @param jPanel8 the jPanel8 to set
     */
    public void setjPanel8(javax.swing.JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    /**
     * @return the jPanel9
     */
    public javax.swing.JPanel getjPanel9() {
        return jPanel9;
    }

    /**
     * @param jPanel9 the jPanel9 to set
     */
    public void setjPanel9(javax.swing.JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the jScrollPane3
     */
    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    /**
     * @param jScrollPane3 the jScrollPane3 to set
     */
    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    /**
     * @return the jTabbedPane1
     */
    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    /**
     * @param jTabbedPane1 the jTabbedPane1 to set
     */
    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    /**
     * @return the jTabbedPane2
     */
    public javax.swing.JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    /**
     * @param jTabbedPane2 the jTabbedPane2 to set
     */
    public void setjTabbedPane2(javax.swing.JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    /**
     * @return the jTabbedPane3
     */
    public javax.swing.JTabbedPane getjTabbedPane3() {
        return jTabbedPane3;
    }

    /**
     * @param jTabbedPane3 the jTabbedPane3 to set
     */
    public void setjTabbedPane3(javax.swing.JTabbedPane jTabbedPane3) {
        this.jTabbedPane3 = jTabbedPane3;
    }

    /**
     * @return the jTabbedPane4
     */
    public javax.swing.JTabbedPane getjTabbedPane4() {
        return jTabbedPane4;
    }

    /**
     * @param jTabbedPane4 the jTabbedPane4 to set
     */
    public void setjTabbedPane4(javax.swing.JTabbedPane jTabbedPane4) {
        this.jTabbedPane4 = jTabbedPane4;
    }

    /**
     * @return the resetBrgUpdate
     */
    /**
     * @return the resetBukuUp
     */
    /**
     * @return the resetFieldTambah
     */
    /**
     * @return the tabelBarang
     */
    public javax.swing.JTable getTabelBarang() {
        return tabelBarang;
    }

    /**
     * @param tabelBarang the tabelBarang to set
     */
    public void setTabelBarang(javax.swing.JTable tabelBarang) {
        this.tabelBarang = tabelBarang;
    }

    /**
     * @return the txtAdmin
     */
    public javax.swing.JLabel getTxtAdmin() {
        return txtAdmin;
    }

    /**
     * @param txtAdmin the txtAdmin to set
     */
    public void setTxtAdmin(javax.swing.JLabel txtAdmin) {
        this.txtAdmin = txtAdmin;
    }

    /**
     * @return the txtCariBrgUp
     */
    /**
     * @return the txtCariBuku
     */
    public javax.swing.JTextField getTxtCariBuku() {
        return txtCariBuku;
    }

    /**
     * @param txtCariBuku the txtCariBuku to set
     */
    public void setTxtCariBuku(javax.swing.JTextField txtCariBuku) {
        this.txtCariBuku = txtCariBuku;
    }

    /**
     * @return the txtCariBukuUp
     */
    /**
     * @return the txtCariItem
     */
    public javax.swing.JTextField getTxtCariItem() {
        return txtCariItem;
    }

    /**
     * @param txtCariItem the txtCariItem to set
     */
    public void setTxtCariItem(javax.swing.JTextField txtCariItem) {
        this.txtCariItem = txtCariItem;
    }

    /**
     * @return the txtCariOperator
     */
    public javax.swing.JTextField getTxtCariOperator() {
        return getTxtCariKasir();
    }

    /**
     * @param txtCariOperator the txtCariOperator to set
     */
    public void setTxtCariOperator(javax.swing.JTextField txtCariOperator) {
        this.setTxtCariKasir(txtCariOperator);
    }

    /**
     * @return the txtCariOperatorUp
     */
    /**
     * @param txtCariOperatorUp the txtCariOperatorUp to set
     */
    /**
     * @return the txtGenreBuku
     */
    public javax.swing.JTextField getTxtGenreBuku() {
        return txtGenreBuku;
    }

    /**
     * @param txtGenreBuku the txtGenreBuku to set
     */
    public void setTxtGenreBuku(javax.swing.JTextField txtGenreBuku) {
        this.txtGenreBuku = txtGenreBuku;
    }

    /**
     * @return the txtGenreBukuUp
     */
    public javax.swing.JTextField getTxtGenreBukuUp() {
        return txtGenreBukuUp;
    }

    /**
     * @param txtGenreBukuUp the txtGenreBukuUp to set
     */
    public void setTxtGenreBukuUp(javax.swing.JTextField txtGenreBukuUp) {
        this.txtGenreBukuUp = txtGenreBukuUp;
    }

    /**
     * @return the txtHargaBrg
     */
    public javax.swing.JTextField getTxtHargaBrg() {
        return txtHargaBrg;
    }

    /**
     * @param txtHargaBrg the txtHargaBrg to set
     */
    public void setTxtHargaBrg(javax.swing.JTextField txtHargaBrg) {
        this.txtHargaBrg = txtHargaBrg;
    }

    /**
     * @return the txtHargaBuku
     */
    public javax.swing.JTextField getTxtHargaBuku() {
        return txtHargaBuku;
    }

    /**
     * @param txtHargaBuku the txtHargaBuku to set
     */
    public void setTxtHargaBuku(javax.swing.JTextField txtHargaBuku) {
        this.txtHargaBuku = txtHargaBuku;
    }

    /**
     * @return the txtHargaBukuUp
     */
    public javax.swing.JTextField getTxtHargaBukuUp() {
        return txtHargaBukuUp;
    }

    /**
     * @param txtHargaBukuUp the txtHargaBukuUp to set
     */
    public void setTxtHargaBukuUp(javax.swing.JTextField txtHargaBukuUp) {
        this.txtHargaBukuUp = txtHargaBukuUp;
    }

    /**
     * @return the txtHargaUp
     */
    public javax.swing.JTextField getTxtHargaUp() {
        return txtHargaUp;
    }

    /**
     * @param txtHargaUp the txtHargaUp to set
     */
    public void setTxtHargaUp(javax.swing.JTextField txtHargaUp) {
        this.txtHargaUp = txtHargaUp;
    }

    /**
     * @return the txtJudulBuku
     */
    public javax.swing.JTextField getTxtJudulBuku() {
        return txtJudulBuku;
    }

    /**
     * @param txtJudulBuku the txtJudulBuku to set
     */
    public void setTxtJudulBuku(javax.swing.JTextField txtJudulBuku) {
        this.txtJudulBuku = txtJudulBuku;
    }

    /**
     * @return the txtJudulBukuUp
     */
    public javax.swing.JTextField getTxtJudulBukuUp() {
        return txtJudulBukuUp;
    }

    /**
     * @param txtJudulBukuUp the txtJudulBukuUp to set
     */
    public void setTxtJudulBukuUp(javax.swing.JTextField txtJudulBukuUp) {
        this.txtJudulBukuUp = txtJudulBukuUp;
    }

    /**
     * @return the txtKodeBrg
     */
    public javax.swing.JTextField getTxtKodeBrg() {
        return txtKodeBrg;
    }

    /**
     * @param txtKodeBrg the txtKodeBrg to set
     */
    public void setTxtKodeBrg(javax.swing.JTextField txtKodeBrg) {
        this.txtKodeBrg = txtKodeBrg;
    }

    /**
     * @return the txtKodeBrgUp
     */
    public javax.swing.JTextField getTxtKodeBrgUp() {
        return txtKodeBrgUp;
    }

    /**
     * @param txtKodeBrgUp the txtKodeBrgUp to set
     */
    public void setTxtKodeBrgUp(javax.swing.JTextField txtKodeBrgUp) {
        this.txtKodeBrgUp = txtKodeBrgUp;
    }

    /**
     * @return the txtKodeBuku
     */
    public javax.swing.JTextField getTxtKodeBuku() {
        return txtKodeBuku;
    }

    /**
     * @param txtKodeBuku the txtKodeBuku to set
     */
    public void setTxtKodeBuku(javax.swing.JTextField txtKodeBuku) {
        this.txtKodeBuku = txtKodeBuku;
    }

    /**
     * @return the txtKodebukuUp
     */
    public javax.swing.JTextField getTxtKodebukuUp() {
        return txtKodebukuUp;
    }

    /**
     * @param txtKodebukuUp the txtKodebukuUp to set
     */
    public void setTxtKodebukuUp(javax.swing.JTextField txtKodebukuUp) {
        this.txtKodebukuUp = txtKodebukuUp;
    }

    /**
     * @return the txtNIPUp
     */
    public javax.swing.JTextField getTxtNIPUp() {
        return txtNIPUp;
    }

    /**
     * @param txtNIPUp the txtNIPUp to set
     */
    public void setTxtNIPUp(javax.swing.JTextField txtNIPUp) {
        this.txtNIPUp = txtNIPUp;
    }

    /**
     * @return the txtNamaBrg
     */
    public javax.swing.JTextField getTxtNamaBrg() {
        return txtNamaBrg;
    }

    /**
     * @param txtNamaBrg the txtNamaBrg to set
     */
    public void setTxtNamaBrg(javax.swing.JTextField txtNamaBrg) {
        this.txtNamaBrg = txtNamaBrg;
    }

    /**
     * @return the txtNamaBrgUp
     */
    public javax.swing.JTextField getTxtNamaBrgUp() {
        return txtNamaBrgUp;
    }

    /**
     * @param txtNamaBrgUp the txtNamaBrgUp to set
     */
    public void setTxtNamaBrgUp(javax.swing.JTextField txtNamaBrgUp) {
        this.txtNamaBrgUp = txtNamaBrgUp;
    }

    /**
     * @return the txtNamaOperator
     */
    public javax.swing.JTextField getTxtNamaOperator() {
        return txtNamaOperator;
    }

    /**
     * @param txtNamaOperator the txtNamaOperator to set
     */
    public void setTxtNamaOperator(javax.swing.JTextField txtNamaOperator) {
        this.txtNamaOperator = txtNamaOperator;
    }

    /**
     * @return the txtNamaOperatorUp
     */
    public javax.swing.JTextField getTxtNamaOperatorUp() {
        return txtNamaOperatorUp;
    }

    /**
     * @param txtNamaOperatorUp the txtNamaOperatorUp to set
     */
    public void setTxtNamaOperatorUp(javax.swing.JTextField txtNamaOperatorUp) {
        this.txtNamaOperatorUp = txtNamaOperatorUp;
    }

    /**
     * @return the txtNip
     */
    public javax.swing.JTextField getTxtNip() {
        return getTxtKodeKasir();
    }

    /**
     * @param txtNip the txtNip to set
     */
    public void setTxtNip(javax.swing.JTextField txtNip) {
        this.setTxtKodeKasir(txtNip);
    }

    /**
     * @return the txtSimpanOperator
     */
    public javax.swing.JButton getTxtSimpanOperator() {
        return txtSimpanOperator;
    }

    /**
     * @param txtSimpanOperator the txtSimpanOperator to set
     */
    public void setTxtSimpanOperator(javax.swing.JButton txtSimpanOperator) {
        this.txtSimpanOperator = txtSimpanOperator;
    }

    /**
     * @return the txtStokBrg
     */
    public javax.swing.JTextField getTxtStokBrg() {
        return txtStokBrg;
    }

    /**
     * @param txtStokBrg the txtStokBrg to set
     */
    public void setTxtStokBrg(javax.swing.JTextField txtStokBrg) {
        this.txtStokBrg = txtStokBrg;
    }

    /**
     * @return the txtStokBuku
     */
    public javax.swing.JTextField getTxtStokBuku() {
        return txtStokBuku;
    }

    /**
     * @param txtStokBuku the txtStokBuku to set
     */
    public void setTxtStokBuku(javax.swing.JTextField txtStokBuku) {
        this.txtStokBuku = txtStokBuku;
    }

    /**
     * @return the txtStokBukuUp
     */
    public javax.swing.JTextField getTxtStokBukuUp() {
        return txtStokBukuUp;
    }

    /**
     * @param txtStokBukuUp the txtStokBukuUp to set
     */
    public void setTxtStokBukuUp(javax.swing.JTextField txtStokBukuUp) {
        this.txtStokBukuUp = txtStokBukuUp;
    }

    /**
     * @return the txtStokUp
     */
    public javax.swing.JTextField getTxtStokUp() {
        return txtStokUp;
    }

    /**
     * @param txtStokUp the txtStokUp to set
     */
    public void setTxtStokUp(javax.swing.JTextField txtStokUp) {
        this.txtStokUp = txtStokUp;
    }

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard(String admin) {
        initComponents();
        this.setTitle("Admin DashBoard");
        txtAdmin.setText(admin);
        cb = new controllerAdmin(this);
        cb.ShowBuku();
        cb.ShowBarang();
        cb.ShowKasir();
        cb.showLaporan();
         cb.tampiljam();
        cb.tampiltanggal();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelBuku = new javax.swing.JTable();
        txtCariBuku = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtGenreBukuUp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtJudulBukuUp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtKodebukuUp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHargaBukuUp = new javax.swing.JTextField();
        btnUodateBuku = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtStokBukuUp = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        TxtPenulisBukuUp = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        TxtPenerbitBukuUp = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtTahunTerbitBukuUp = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtHargaJualBukuUp = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        txtKodeBuku = new javax.swing.JTextField();
        txtHargaBuku = new javax.swing.JTextField();
        txtStokBuku = new javax.swing.JTextField();
        btnSimpanBuku = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtGenreBuku = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtHargaJualBuku = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        TxtPenulisBuku = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        TxtPenerbitBuku = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtTahunTerbitBuku = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        BtnHapusBuku = new javax.swing.JButton();
        TxtHapus = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCariItem = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtStokUp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNamaBrgUp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtKodeBrgUp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHargaUp = new javax.swing.JTextField();
        btnSimpanBrgUp = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtHargaBrgJualUp = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNamaBrg = new javax.swing.JTextField();
        txtKodeBrg = new javax.swing.JTextField();
        txtHargaBrg = new javax.swing.JTextField();
        txtStokBrg = new javax.swing.JTextField();
        btnSimpanBrg = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtHargaBrgJual = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        TxtHapusBarang = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        BtnHapusBarang = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelOperator = new javax.swing.JTable();
        txtCariKasir = new javax.swing.JTextField();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNamaOperator = new javax.swing.JTextField();
        txtKodeKasir = new javax.swing.JTextField();
        txtSimpanOperator = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        SelectShift = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        txtKodeUnik = new javax.swing.JTextField();
        btnRandom = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNamaOperatorUp = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtNIPUp = new javax.swing.JTextField();
        btnUpdateOperator = new javax.swing.JButton();
        SelectShiftUp = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        TxtHapusKasir = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        BtnHapusKasir = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelLapor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        btnLogoutAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        TimeAdmin = new javax.swing.JLabel();
        tglAdmin = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(158, 158, 158));

        TabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelBuku);

        txtCariBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariBukuKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Kode");

        txtGenreBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Judul");

        txtJudulBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Genre");

        txtKodebukuUp.setEditable(false);
        txtKodebukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Harga");

        txtHargaBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnUodateBuku.setBackground(new java.awt.Color(0, 0, 204));
        btnUodateBuku.setForeground(new java.awt.Color(255, 255, 255));
        btnUodateBuku.setText("Update");
        btnUodateBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUodateBukuActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Stok");

        txtStokBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Penulis");

        TxtPenulisBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Penerbit");

        TxtPenerbitBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Tahun");

        txtTahunTerbitBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Harga Jual");

        txtHargaJualBukuUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnUodateBuku)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJudulBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGenreBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPenulisBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKodebukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPenerbitBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTahunTerbitBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHargaBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHargaJualBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStokBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtKodebukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudulBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenreBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPenulisBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPenerbitBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahunTerbitBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaJualBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokBukuUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUodateBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jTabbedPane3.addTab("Update Buku", jPanel9);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Kode");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Judul");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Harga Jual");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Stok");

        txtJudulBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKodeBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHargaBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtStokBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSimpanBuku.setBackground(new java.awt.Color(51, 255, 102));
        btnSimpanBuku.setText("Simpan");
        btnSimpanBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanBukuActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Genre");

        txtGenreBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Harga");

        txtHargaJualBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Penulis");

        TxtPenulisBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Penerbit");

        TxtPenerbitBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Tahun");

        txtTahunTerbitBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGenreBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStokBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHargaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTahunTerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPenerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPenulisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnSimpanBuku))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHargaJualBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenreBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPenulisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPenerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahunTerbitBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaJualBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpanBuku)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Tambah Buku", jPanel8);

        BtnHapusBuku.setBackground(new java.awt.Color(255, 0, 0));
        BtnHapusBuku.setText("HAPUS");
        BtnHapusBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusBukuActionPerformed(evt);
            }
        });

        TxtHapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel42.setText("Masukan Kode Buku");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtHapus)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(BtnHapusBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHapusBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Hapus Buku", jPanel13);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("LIST BUKU");

        jLabel43.setText("Search");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane3))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(553, 553, 553)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buku", jPanel4);

        jPanel2.setBackground(new java.awt.Color(158, 158, 158));

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelBarang.setGridColor(new java.awt.Color(102, 102, 102));
        tabelBarang.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tabelBarang.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("LIST BARANG");

        txtCariItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariItemKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Kode");

        txtStokUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Nama barang");

        txtNamaBrgUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Stok");

        txtKodeBrgUp.setEditable(false);
        txtKodeBrgUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Harga");

        txtHargaUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSimpanBrgUp.setBackground(new java.awt.Color(0, 0, 204));
        btnSimpanBrgUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanBrgUp.setText("Update");
        btnSimpanBrgUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanBrgUpActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Harga Jual");

        txtHargaBrgJualUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNamaBrgUp, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStokUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHargaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSimpanBrgUp)
                                .addComponent(txtHargaBrgJualUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(177, 177, 177)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtKodeBrgUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodeBrgUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBrgUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBrgJualUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSimpanBrgUp)
                .addGap(78, 78, 78))
        );

        jTabbedPane2.addTab("Update Barang", jPanel7);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Kode");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nama Barang");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Harga");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Stok");

        txtNamaBrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKodeBrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHargaBrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtStokBrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSimpanBrg.setBackground(new java.awt.Color(51, 255, 102));
        btnSimpanBrg.setText("Simpan");
        btnSimpanBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanBrgActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Harga Jual");

        txtHargaBrgJual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtHargaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSimpanBrg)
                                    .addComponent(txtHargaBrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodeBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpanBrg)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tambah Barang", jPanel6);

        TxtHapusBarang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel44.setText("Masukan Kode Barang");

        BtnHapusBarang.setBackground(new java.awt.Color(255, 0, 0));
        BtnHapusBarang.setText("HAPUS");
        BtnHapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtHapusBarang)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(BtnHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Hapus Barang", jPanel14);

        jLabel48.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCariItem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jTabbedPane2)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCariItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Item", jPanel2);

        jPanel5.setBackground(new java.awt.Color(155, 155, 155));

        TabelOperator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelOperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelOperatorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelOperator);

        txtCariKasir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKasirKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("KODE");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("NAMA");

        txtNamaOperator.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKodeKasir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSimpanOperator.setBackground(new java.awt.Color(51, 255, 102));
        txtSimpanOperator.setText("Simpan");
        txtSimpanOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimpanOperatorActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("SHIFT");

        SelectShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi", "Siang", "Malam" }));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("KODE UNIK");

        txtKodeUnik.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnRandom.setText("Random");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SelectShift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(357, 357, 357))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNamaOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKodeKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKodeUnik, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRandom)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(txtSimpanOperator)))
                .addGap(205, 205, 205))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKodeKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(SelectShift)
                        .addGap(21, 21, 21))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtKodeUnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRandom))
                .addGap(21, 21, 21)
                .addComponent(txtSimpanOperator)
                .addGap(139, 139, 139))
        );

        jTabbedPane4.addTab("Tambah Kasir", jPanel10);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Kode");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Nama");

        txtNamaOperatorUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Shift");

        txtNIPUp.setEditable(false);
        txtNIPUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnUpdateOperator.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdateOperator.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateOperator.setText("Update");
        btnUpdateOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOperatorActionPerformed(evt);
            }
        });

        SelectShiftUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi", "Siang", "Malam" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnUpdateOperator))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNIPUp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaOperatorUp, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectShiftUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIPUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaOperatorUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectShiftUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnUpdateOperator)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Update Kasir", jPanel11);

        TxtHapusKasir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel45.setText("Masukan Kode Kasir");

        BtnHapusKasir.setBackground(new java.awt.Color(255, 0, 0));
        BtnHapusKasir.setText("HAPUS");
        BtnHapusKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusKasirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtHapusKasir)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(BtnHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtHapusKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Hapus Kasir", jPanel15);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("KASIR");

        jLabel47.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(txtCariKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane4)
                .addGap(35, 35, 35))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(573, 573, 573)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34)
                        .addGap(45, 45, 45)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCariKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kasir", jPanel5);

        tabelLapor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabelLapor);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("List Laporan Penjualan");

        btnExport.setBackground(new java.awt.Color(102, 102, 0));
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export Laporan to PDF");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel41.setText("List Penjualan");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExport)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(571, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Laporan Penjualan", jPanel12);

        jPanel1.setBackground(new java.awt.Color(155, 155, 155));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang,");

        txtAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnLogoutAdmin.setBackground(new java.awt.Color(255, 0, 0));
        btnLogoutAdmin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogoutAdmin.setText("logout");
        btnLogoutAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutAdminActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel3.setText("ADMIN DASHBOARD");

        jLabel49.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel49.setText("Jam");

        TimeAdmin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        tglAdmin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel50.setText("Tanggal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogoutAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(TimeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(tglAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogoutAdmin)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(TimeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(tglAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutAdminActionPerformed
        cb.logout();
    }//GEN-LAST:event_btnLogoutAdminActionPerformed

    private void TabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBukuMouseClicked
        int row = TabelBuku.getSelectedRow();
        if (getTxtCariBuku().getText().length() == 0) {
            cb.selectRowBuku(row);
        }
        cb.selectFilterBuku(row);
    }//GEN-LAST:event_TabelBukuMouseClicked

    private void txtCariBukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBukuKeyPressed

        if (getTxtCariBuku().getText().length() == 0) {
            cb.caridataBuku();
        }
        else {
            cb.ShowBuku();
        }

    }//GEN-LAST:event_txtCariBukuKeyPressed

    private void btnSimpanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanBukuActionPerformed
        cb.insertBuku();
        cb.reset();
        cb.ShowBuku();
    }//GEN-LAST:event_btnSimpanBukuActionPerformed

    private void btnUodateBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUodateBukuActionPerformed
        cb.updateBuku();
        cb.ShowBuku();
        cb.reset();
    }//GEN-LAST:event_btnUodateBukuActionPerformed

    private void BtnHapusBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusBukuActionPerformed
        cb.deleteBuku();
        cb.reset();
        cb.ShowBuku();

    }//GEN-LAST:event_BtnHapusBukuActionPerformed

    private void BtnHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusBarangActionPerformed
        cb.deleteBarang();

        cb.reset();
        cb.ShowBarang();
    }//GEN-LAST:event_BtnHapusBarangActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int row = tabelBarang.getSelectedRow();
        if (txtCariItem.getText().length() == 0) {
            cb.selectRowItem(row);
        }
        else {
            cb.selectFilterBarang(row);
        }


    }//GEN-LAST:event_tabelBarangMouseClicked

    private void txtCariItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariItemKeyPressed
        if (txtCariItem.getText().length() == 0) {
            cb.caridataBarang();
        }
        else {
            cb.ShowBarang();
        }
    }//GEN-LAST:event_txtCariItemKeyPressed

    private void btnSimpanBrgUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanBrgUpActionPerformed
        cb.updateBarang();
        cb.reset();
        cb.ShowBarang();


    }//GEN-LAST:event_btnSimpanBrgUpActionPerformed

    private void btnSimpanBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanBrgActionPerformed
        cb.insertBarang();
        cb.reset();
        cb.ShowBarang();

    }//GEN-LAST:event_btnSimpanBrgActionPerformed

    private void BtnHapusKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusKasirActionPerformed
        cb.deleteKasir();
        cb.reset();
        cb.ShowKasir();
    }//GEN-LAST:event_BtnHapusKasirActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        cb.Prosesrandom();
    }//GEN-LAST:event_btnRandomActionPerformed

    private void TabelOperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelOperatorMouseClicked
        int row = TabelOperator.getSelectedRow();
        if (txtCariKasir.getText().length() == 0) {
            cb.selectRowKasir(row);
        }
        else {
            cb.selectFilterKasir(row);
        }

    }//GEN-LAST:event_TabelOperatorMouseClicked

    private void txtSimpanOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimpanOperatorActionPerformed
        cb.insertKasir();
        cb.reset();
        cb.ShowKasir();

    }//GEN-LAST:event_txtSimpanOperatorActionPerformed

    private void txtCariKasirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKasirKeyPressed
        if (txtCariKasir.getText().length() == 0) {
            cb.caridataKasir();
        }
        else {
            cb.ShowKasir();
        }

    }//GEN-LAST:event_txtCariKasirKeyPressed

    private void btnUpdateOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOperatorActionPerformed
        cb.updateKasir();
        cb.reset();
        cb.ShowKasir();
    }//GEN-LAST:event_btnUpdateOperatorActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        cb.exportPDF();
        JOptionPane.showMessageDialog(rootPane, "File telah Di eksport");
    }//GEN-LAST:event_btnExportActionPerformed

    /**
     * @param args the command line arguments
     */
      public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
        //</editor-fold>

        /*
         * Create and display the form
         */
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapusBarang;
    private javax.swing.JButton BtnHapusBuku;
    private javax.swing.JButton BtnHapusKasir;
    private javax.swing.JComboBox<String> SelectShift;
    private javax.swing.JComboBox<String> SelectShiftUp;
    private javax.swing.JTable TabelBuku;
    private javax.swing.JTable TabelOperator;
    private javax.swing.JLabel TimeAdmin;
    private javax.swing.JTextField TxtHapus;
    private javax.swing.JTextField TxtHapusBarang;
    private javax.swing.JTextField TxtHapusKasir;
    private javax.swing.JTextField TxtPenerbitBuku;
    private javax.swing.JTextField TxtPenerbitBukuUp;
    private javax.swing.JTextField TxtPenulisBuku;
    private javax.swing.JTextField TxtPenulisBukuUp;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnLogoutAdmin;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnSimpanBrg;
    private javax.swing.JButton btnSimpanBrgUp;
    private javax.swing.JButton btnSimpanBuku;
    private javax.swing.JButton btnUodateBuku;
    private javax.swing.JButton btnUpdateOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTable tabelLapor;
    private javax.swing.JLabel tglAdmin;
    private javax.swing.JLabel txtAdmin;
    private javax.swing.JTextField txtCariBuku;
    private javax.swing.JTextField txtCariItem;
    private javax.swing.JTextField txtCariKasir;
    private javax.swing.JTextField txtGenreBuku;
    private javax.swing.JTextField txtGenreBukuUp;
    private javax.swing.JTextField txtHargaBrg;
    private javax.swing.JTextField txtHargaBrgJual;
    private javax.swing.JTextField txtHargaBrgJualUp;
    private javax.swing.JTextField txtHargaBuku;
    private javax.swing.JTextField txtHargaBukuUp;
    private javax.swing.JTextField txtHargaJualBuku;
    private javax.swing.JTextField txtHargaJualBukuUp;
    private javax.swing.JTextField txtHargaUp;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtJudulBukuUp;
    private javax.swing.JTextField txtKodeBrg;
    private javax.swing.JTextField txtKodeBrgUp;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtKodeKasir;
    private javax.swing.JTextField txtKodeUnik;
    private javax.swing.JTextField txtKodebukuUp;
    private javax.swing.JTextField txtNIPUp;
    private javax.swing.JTextField txtNamaBrg;
    private javax.swing.JTextField txtNamaBrgUp;
    private javax.swing.JTextField txtNamaOperator;
    private javax.swing.JTextField txtNamaOperatorUp;
    private javax.swing.JButton txtSimpanOperator;
    private javax.swing.JTextField txtStokBrg;
    private javax.swing.JTextField txtStokBuku;
    private javax.swing.JTextField txtStokBukuUp;
    private javax.swing.JTextField txtStokUp;
    private javax.swing.JTextField txtTahunTerbitBuku;
    private javax.swing.JTextField txtTahunTerbitBukuUp;
    // End of variables declaration//GEN-END:variables
    controllerAdmin cb;

    /**
     * @return the BtnHapusKasir
     */
    public javax.swing.JButton getBtnHapusKasir() {
        return BtnHapusKasir;
    }

    /**
     * @param BtnHapusKasir the BtnHapusKasir to set
     */
    public void setBtnHapusKasir(javax.swing.JButton BtnHapusKasir) {
        this.BtnHapusKasir = BtnHapusKasir;
    }

    /**
     * @return the TxtHapusKasir
     */
    public javax.swing.JTextField getTxtHapusKasir() {
        return TxtHapusKasir;
    }

    /**
     * @param TxtHapusKasir the TxtHapusKasir to set
     */
    public void setTxtHapusKasir(javax.swing.JTextField TxtHapusKasir) {
        this.TxtHapusKasir = TxtHapusKasir;
    }
}
