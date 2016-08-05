/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * suratKeteranganKelakuanBaik.java
 *
 * Created on Jul 23, 2012, 2:40:45 PM
 */
package fauzi.project.panelSurat;

import docgen.suratKtpSementara;
import fauzi.project.jenisSurat.suratNikah;
import fauzi.project.jenisSurat.suratdomisili;
import java.text.SimpleDateFormat;

/**
 *
 * @author fauzi
 */
public class PanelSuratPernahNikah extends javax.swing.JPanel {

    /** Creates new form suratKeteranganKelakuanBaik */
    public PanelSuratPernahNikah() {
        initComponents();
    }
    
    //public SimpleDa
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAtas = new javax.swing.JPanel();
        panelTengah = new javax.swing.JPanel();
        txttglsurat = new com.toedter.calendar.JDateChooser();
        flabel1 = new fauzi.project.swingResource.Flabel();
        flabel2 = new fauzi.project.swingResource.Flabel();
        txtkode = new fauzi.project.panelSurat.FtextBox();
        flabel11 = new fauzi.project.swingResource.Flabel();
        flabel12 = new fauzi.project.swingResource.Flabel();
        txtkades1 = new fauzi.project.panelSurat.FtextBox();
        jPanel1 = new javax.swing.JPanel();
        flabel3 = new fauzi.project.swingResource.Flabel();
        txtnamasak2 = new fauzi.project.panelSurat.FtextBox();
        flabel10 = new fauzi.project.swingResource.Flabel();
        txtpekerjaansak2 = new fauzi.project.panelSurat.FtextBox();
        flabel13 = new fauzi.project.swingResource.Flabel();
        txtumursak2 = new fauzi.project.panelSurat.FtextBox();
        flabel25 = new fauzi.project.swingResource.Flabel();
        txtalamatsak2 = new fauzi.project.panelSurat.FtextBox();
        flabel4 = new fauzi.project.swingResource.Flabel();
        cmbagamasak2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        flabel6 = new fauzi.project.swingResource.Flabel();
        txtnamasak1 = new fauzi.project.panelSurat.FtextBox();
        flabel7 = new fauzi.project.swingResource.Flabel();
        txtpekerjaansak1 = new fauzi.project.panelSurat.FtextBox();
        flabel14 = new fauzi.project.swingResource.Flabel();
        txtalamatsak1 = new fauzi.project.panelSurat.FtextBox();
        flabel15 = new fauzi.project.swingResource.Flabel();
        txtumursak1 = new fauzi.project.panelSurat.FtextBox();
        flabel8 = new fauzi.project.swingResource.Flabel();
        cmbagamasak1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        flabel9 = new fauzi.project.swingResource.Flabel();
        txtnamares1 = new fauzi.project.panelSurat.FtextBox();
        flabel16 = new fauzi.project.swingResource.Flabel();
        cmbjkelres1 = new javax.swing.JComboBox();
        flabel17 = new fauzi.project.swingResource.Flabel();
        txtalamatres1 = new fauzi.project.panelSurat.FtextBox();
        flabel18 = new fauzi.project.swingResource.Flabel();
        txtumurres1 = new fauzi.project.panelSurat.FtextBox();
        flabel19 = new fauzi.project.swingResource.Flabel();
        cmbagamares1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        flabel20 = new fauzi.project.swingResource.Flabel();
        cmbnamares2 = new fauzi.project.panelSurat.FtextBox();
        flabel21 = new fauzi.project.swingResource.Flabel();
        cmbjkelres2 = new javax.swing.JComboBox();
        flabel22 = new fauzi.project.swingResource.Flabel();
        txtalamatres2 = new fauzi.project.panelSurat.FtextBox();
        flabel23 = new fauzi.project.swingResource.Flabel();
        txtumurres2 = new fauzi.project.panelSurat.FtextBox();
        flabel24 = new fauzi.project.swingResource.Flabel();
        cmbagamares2 = new javax.swing.JComboBox();
        flabel26 = new fauzi.project.swingResource.Flabel();
        txttglNikah = new com.toedter.calendar.JDateChooser();
        txtsebab = new fauzi.project.panelSurat.FtextBox();
        flabel27 = new fauzi.project.swingResource.Flabel();
        panelBawah = new javax.swing.JPanel();
        btgenerate = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelAtas.setLayout(new java.awt.BorderLayout());
        add(panelAtas, java.awt.BorderLayout.PAGE_START);

        panelTengah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelTengah.add(txttglsurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 360, 30));

        flabel1.setText("Surat Keterangan Pernah Nikah");
        panelTengah.add(flabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        flabel2.setText("Kode Surat :");
        panelTengah.add(flabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        panelTengah.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 380, -1));

        flabel11.setText("Tanggal Surat :");
        panelTengah.add(flabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        flabel12.setText("Kepala Desa :");
        panelTengah.add(flabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));
        panelTengah.add(txtkades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 360, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Saksi 2"));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2));

        flabel3.setText("Nama :");
        jPanel1.add(flabel3);
        jPanel1.add(txtnamasak2);

        flabel10.setText("Pekerjaan :");
        jPanel1.add(flabel10);
        jPanel1.add(txtpekerjaansak2);

        flabel13.setText("Umur :");
        jPanel1.add(flabel13);
        jPanel1.add(txtumursak2);

        flabel25.setText("Alamat :");
        jPanel1.add(flabel25);
        jPanel1.add(txtalamatsak2);

        flabel4.setText("Agama :");
        jPanel1.add(flabel4);

        cmbagamasak2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Kong Hu Chu" }));
        jPanel1.add(cmbagamasak2);

        panelTengah.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 240, 170));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Saksi 1"));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        flabel6.setText("Nama :");
        jPanel2.add(flabel6);
        jPanel2.add(txtnamasak1);

        flabel7.setText("Pekerjaan :");
        jPanel2.add(flabel7);
        jPanel2.add(txtpekerjaansak1);

        flabel14.setText("Alamat :");
        jPanel2.add(flabel14);
        jPanel2.add(txtalamatsak1);

        flabel15.setText("Umur :");
        jPanel2.add(flabel15);
        jPanel2.add(txtumursak1);

        flabel8.setText("Agama :");
        jPanel2.add(flabel8);

        cmbagamasak1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Kong Hu Chu" }));
        jPanel2.add(cmbagamasak1);

        panelTengah.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Responden 1"));
        jPanel3.setLayout(new java.awt.GridLayout(5, 2));

        flabel9.setText("Nama :");
        jPanel3.add(flabel9);
        jPanel3.add(txtnamares1);

        flabel16.setText("Jenis Kelamin");
        jPanel3.add(flabel16);

        cmbjkelres1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki- Laki", "Perempuan" }));
        jPanel3.add(cmbjkelres1);

        flabel17.setText("Alamat :");
        jPanel3.add(flabel17);
        jPanel3.add(txtalamatres1);

        flabel18.setText("Umur :");
        jPanel3.add(flabel18);
        jPanel3.add(txtumurres1);

        flabel19.setText("Agama :");
        jPanel3.add(flabel19);

        cmbagamares1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Kong Hu Chu" }));
        jPanel3.add(cmbagamares1);

        panelTengah.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Responden 2"));
        jPanel4.setLayout(new java.awt.GridLayout(5, 2));

        flabel20.setText("Nama :");
        jPanel4.add(flabel20);
        jPanel4.add(cmbnamares2);

        flabel21.setText("Jenis Kelamin");
        jPanel4.add(flabel21);

        cmbjkelres2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki- Laki", "Perempuan" }));
        jPanel4.add(cmbjkelres2);

        flabel22.setText("Alamat :");
        jPanel4.add(flabel22);
        jPanel4.add(txtalamatres2);

        flabel23.setText("Umur :");
        jPanel4.add(flabel23);
        jPanel4.add(txtumurres2);

        flabel24.setText("Agama :");
        jPanel4.add(flabel24);

        cmbagamares2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Kong Hu Chu" }));
        jPanel4.add(cmbagamares2);

        panelTengah.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 240, 160));

        flabel26.setText("Tanggal Nikah :");
        panelTengah.add(flabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));
        panelTengah.add(txttglNikah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 360, 30));
        panelTengah.add(txtsebab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 360, -1));

        flabel27.setText("Sebab :");
        panelTengah.add(flabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        add(panelTengah, java.awt.BorderLayout.CENTER);

        panelBawah.setLayout(new java.awt.BorderLayout());

        btgenerate.setText("Generate");
        btgenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgenerateActionPerformed(evt);
            }
        });
        panelBawah.add(btgenerate, java.awt.BorderLayout.CENTER);

        add(panelBawah, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    public String getKode(){
        return txtkode.getText();
    }
        
    public String getKades(){
        return txtkades1.getText();
    }
    
    public String getTanggalSurat(){
        String tgl = null;
        if(txttglsurat.getDate()!=null){
            SimpleDateFormat ganti=new SimpleDateFormat("dd-MM-yyyy");
            tgl=ganti.format(txttglsurat.getDate());
        }
    return tgl;        
    }
    
    public String getTanggalNikah(){
        String tgl = null;
        if(txttglNikah.getDate()!=null){
            SimpleDateFormat ganti=new SimpleDateFormat("dd-MM-yyyy");
            tgl=ganti.format(txttglNikah.getDate());
        }
    return tgl;        
    }    
    
    public String getNamaRes1(){
        return txtnamares1.getText();
    }
    
    public String getJkelRes1(){
        return cmbjkelres1.getSelectedItem().toString();
    }
    
    public String getAlamatRes1(){
        return txtalamatres1.getText();
    }
    
    public String getUmurRes1(){
        return txtumurres1.getText();
    }
    
    public String getAgamaRes1(){
        return cmbagamares1.getSelectedItem().toString();
    }
    
    public String getNamaRes2(){
        return txtnamares1.getText();
    }
    
    public String getJkelRes2(){
        return cmbjkelres2.getSelectedItem().toString();
    }
    
    public String getAlamatRes2(){
        return txtalamatres2.getText();        
    }
    
    public String getUmurRes2(){
        return txtumurres2.getText();
    }
    
    public String getAgamaRes2(){
        return cmbagamares2.getSelectedItem().toString();
    }
    
    //saksi 1
    
    public String getNamaSaksi1(){
        return txtnamasak1.getText();
    }
    
    public String getPekerjaanSaksi1(){
        return txtpekerjaansak1.getText();
    }
    
    public String getAlamatSaksi1(){
        return txtalamatsak1.getText();
    }
    
    public String getUmurSaksi1(){
        return txtumursak1.getText();
    }
    
    public String getAgamaSaksi1(){
        return cmbagamasak1.getSelectedItem().toString();
    }
    
     //saksi 2
    
    public String getNamaSaksi2(){
        return txtnamasak2.getText();
    }
    
    public String getPekerjaanSaksi2(){
        return txtpekerjaansak2.getText();
    }
    
    public String getAlamatSaksi2(){
        return txtalamatsak2.getText();
    }
    
    public String getUmurSaksi2(){
        return txtumursak2.getText();
    }
    
    public String getAgamaSaksi2(){
        return cmbagamasak2.getSelectedItem().toString();
    }
        
    public String getSebab(){
        return txtsebab.getText();
    }
    
    private void btgenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgenerateActionPerformed
        // TODO add your handling code here:
        suratNikah sn  = new suratNikah(getKode(), getNamaRes1(), getJkelRes1(), getAlamatRes1(), getUmurRes1(), getAgamaRes1(), getNamaRes2(), getJkelRes2(), getAlamatRes2(), getUmurRes2(), getAgamaRes2(), getKades(), getTanggalNikah(), getTanggalSurat(), getSebab(), getNamaSaksi1(), getPekerjaanSaksi1(), getAlamatSaksi1(), getUmurSaksi1(), getAgamaSaksi1(), getNamaSaksi2(), getPekerjaanSaksi2(), getAlamatSaksi2(), getUmurSaksi2(), getAgamaSaksi2());
    }//GEN-LAST:event_btgenerateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btgenerate;
    private javax.swing.JComboBox cmbagamares1;
    private javax.swing.JComboBox cmbagamares2;
    private javax.swing.JComboBox cmbagamasak1;
    private javax.swing.JComboBox cmbagamasak2;
    private javax.swing.JComboBox cmbjkelres1;
    private javax.swing.JComboBox cmbjkelres2;
    private fauzi.project.panelSurat.FtextBox cmbnamares2;
    private fauzi.project.swingResource.Flabel flabel1;
    private fauzi.project.swingResource.Flabel flabel10;
    private fauzi.project.swingResource.Flabel flabel11;
    private fauzi.project.swingResource.Flabel flabel12;
    private fauzi.project.swingResource.Flabel flabel13;
    private fauzi.project.swingResource.Flabel flabel14;
    private fauzi.project.swingResource.Flabel flabel15;
    private fauzi.project.swingResource.Flabel flabel16;
    private fauzi.project.swingResource.Flabel flabel17;
    private fauzi.project.swingResource.Flabel flabel18;
    private fauzi.project.swingResource.Flabel flabel19;
    private fauzi.project.swingResource.Flabel flabel2;
    private fauzi.project.swingResource.Flabel flabel20;
    private fauzi.project.swingResource.Flabel flabel21;
    private fauzi.project.swingResource.Flabel flabel22;
    private fauzi.project.swingResource.Flabel flabel23;
    private fauzi.project.swingResource.Flabel flabel24;
    private fauzi.project.swingResource.Flabel flabel25;
    private fauzi.project.swingResource.Flabel flabel26;
    private fauzi.project.swingResource.Flabel flabel27;
    private fauzi.project.swingResource.Flabel flabel3;
    private fauzi.project.swingResource.Flabel flabel4;
    private fauzi.project.swingResource.Flabel flabel6;
    private fauzi.project.swingResource.Flabel flabel7;
    private fauzi.project.swingResource.Flabel flabel8;
    private fauzi.project.swingResource.Flabel flabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JPanel panelBawah;
    private javax.swing.JPanel panelTengah;
    private fauzi.project.panelSurat.FtextBox txtalamatres1;
    private fauzi.project.panelSurat.FtextBox txtalamatres2;
    private fauzi.project.panelSurat.FtextBox txtalamatsak1;
    private fauzi.project.panelSurat.FtextBox txtalamatsak2;
    private fauzi.project.panelSurat.FtextBox txtkades1;
    private fauzi.project.panelSurat.FtextBox txtkode;
    private fauzi.project.panelSurat.FtextBox txtnamares1;
    private fauzi.project.panelSurat.FtextBox txtnamasak1;
    private fauzi.project.panelSurat.FtextBox txtnamasak2;
    private fauzi.project.panelSurat.FtextBox txtpekerjaansak1;
    private fauzi.project.panelSurat.FtextBox txtpekerjaansak2;
    private fauzi.project.panelSurat.FtextBox txtsebab;
    private com.toedter.calendar.JDateChooser txttglNikah;
    private com.toedter.calendar.JDateChooser txttglsurat;
    private fauzi.project.panelSurat.FtextBox txtumurres1;
    private fauzi.project.panelSurat.FtextBox txtumurres2;
    private fauzi.project.panelSurat.FtextBox txtumursak1;
    private fauzi.project.panelSurat.FtextBox txtumursak2;
    // End of variables declaration//GEN-END:variables
}
