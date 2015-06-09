package tb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satelllite
 */
import tb.setget;
import tb.connect; 
import java.util.ArrayList; 
import java.util.List; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import tb.connect;
import tb.setget;

public class data extends javax.swing.JFrame {
   
//    String login = "";
    List<setget> inven = new ArrayList<setget>(); 
    int currentRow = 0; 
    /**
     * Creates new form MainWindow
     */
    
  
     private void atur(JTable lihat, int lebar[]) {
        try {
            lihat.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            int banyak = lihat.getColumnCount();
            for (int i = 0; i < banyak; i++) {
                TableColumn kolom = lihat.getColumnModel().getColumn(i);
                kolom.setPreferredWidth(lebar[i]);
                lihat.setRowHeight(20);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "salah" + e);
        }
    }

    //untuk membuat void colom yang sesuai kita inginkan
    private void tampilmodel() {
        try {
            String[] kolom = {"nama", "lokasi", "fakultas", "panjang", "lebar", "jumlahkursi", "jumlahpintu", "jumlahjendela", "jumlahsteker", "jumlahsterbaik", "jumlahposisisteker", "jumlahkabellcd", "jumlahkabellcdbaik", "jumlahposisikabellcd", "jumlahlampu", "jumlahlampubaik", "jumlahposisilampu", "jumlahkipas", "jumlahkipasbaik", "jumlahposisikipas", "pilihSSID","inputbandwitch","jumlahcctv", "jumlahcctvbaik", "jumlahposisicctv", "kondisilantai", "kondisidinding", "kondisiatap", "sirkulasiudara", "pencahayaan", "kelembapan", "suhu", "kebisingan", "bau", "kebocoran", "kerusakan", "keausan", "kekokohan", "kuncipintujendela", "kondisiruang"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom) {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };
            
            tabeldata.setModel(dtm);
            atur(tabeldata, new int []{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100});
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "salah" + e);
        }
    }
    public data() { 
        
        initComponents();
        tampilkandata();
        loadData();
        tampilmodel();
        
        slider1();
        slider2();
        slider3();
        slider4();
        slider5();
        
//        radiobutton();
       
        
        
        
        loadData();
        String lookAndFeel = 
                
javax.swing.UIManager.getSystemLookAndFeelClassName(); 
        try { 
            
javax.swing.UIManager.setLookAndFeel(lookAndFeel); 
        } catch (Exception e) { 
        }  
        loadData(); 
        bindData(); 
        this.setTitle("Data Mahasiswa"); 
        nama.setEnabled(false); 
        lokasi.setEnabled(false); 
        fakultas.setEnabled(false); 
//        p.setEditable(false); 
//        l.setEditable(false); 
//        jk.setEditable(false); 
//        jp.setEditable(false); 
//        jj.setEditable(false); 
        this.setLocationRelativeTo(this); 
        tampilkandata();
    }
    public void slider1(){
                p.setEditable(false);	
	        p.setText(null);	
	       jSlider1.setMinorTickSpacing(5);	
	        jSlider1.setMajorTickSpacing(20);	
	        jSlider1.setPaintTicks(true);	
	        jSlider1.setLabelTable(jSlider1.getLabelTable());	
	        jSlider1.setPaintLabels(true);
                jSlider1.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    p.setText ( String.valueOf(jSlider1.getValue()) );	
                        }	
	            }
	        );
    }
    public void slider2(){
                l.setEditable(false);	
	        l.setText(null);	
	       jSlider2.setMinorTickSpacing(5);	
	        jSlider2.setMajorTickSpacing(20);	
	        jSlider2.setPaintTicks(true);	
	        jSlider2.setLabelTable(jSlider2.getLabelTable());	
	        jSlider2.setPaintLabels(true);
                jSlider2.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    l.setText ( String.valueOf(jSlider2.getValue()) );	
                        }	
	            }
	        );
	        
     }
    public void slider3(){
                suhu.setEditable(false);	
	        suhu.setText(null);	
	       s3.setMinorTickSpacing(5);	
	        s3.setMajorTickSpacing(20);	
	        s3.setPaintTicks(true);	
	        s3.setLabelTable(s3.getLabelTable());	
	        s3.setPaintLabels(true);
                s3.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                   suhu.setText ( String.valueOf(s3.getValue()) );	
                        }	
	            }
	        );
	        
     }
    public void slider4(){
                lembap.setEditable(false);	
	        lembap.setText(null);	
	       s4.setMinorTickSpacing(5);	
	        s4.setMajorTickSpacing(20);	
	        s4.setPaintTicks(true);	
	        s4.setLabelTable(s4.getLabelTable());	
	        s4.setPaintLabels(true);
                s4.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    lembap.setText ( String.valueOf(s4.getValue()) );	
                        }	
	            }
	        );
	        
     }
    public void slider5(){
                cahaya.setEditable(false);	
	        cahaya.setText(null);	
	       s5.setMinorTickSpacing(5);	
	        s5.setMajorTickSpacing(20);	
	        s5.setPaintTicks(true);	
	        s5.setLabelTable(s5.getLabelTable());	
	        s5.setPaintLabels(true);
                s5.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    cahaya.setText ( String.valueOf(s5.getValue()) );	
                        }	
	            }
	        );
	        
     }
    public Connection conn;
    public void koneksi() throws SQLException{
        try{
            conn = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(setget.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(setget.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(setget.class.getName()).log(Level.SEVERE, null, es);
        
        }
    }
//    }private void previous_next(){
//        identitas.setVisible(false);
//        kondisiruang.setVisible(false);
//        steker.setVisible(false);
//        lcd.setVisible(false);
//        lampu.setVisible(false);
//        kipas.setVisible(false);
//        
//        ssidbandwitch.setVisible(false);
//        cctv.setVisible(false);
//        lingkungan.setVisible(false);
//        kebersihan.setVisible(false);
//        kenyamananruang.setVisible(false);
//    }

//    private void jml_posisi(){
//        if(steker.isShowing() && stekerbaik.isShowing()){
//            posisi_steker++;
//        }else if(lcd.isShowing() &&lcdbaik.isSelected()){
//            posisi_LCD++;
//        }else if(lampu.isShowing() &&lampubaik.isSelected()){
//            posisi_lampu++;
//        }else if(kipas.isShowing() &&kipasbaik.isSelected()){
//            posisi_kipas++;
//        }
////        else if(.isShowing() &&cbAC6.isSelected() || cbAC7.isSelected()){
////            posisi_AC++;
////        }
//        else if( cctv.isShowing() &&cctvbaik.isSelected()){
//            posisi_CCTV++;
//        }
//    }
//    
//    private void jml_baik(){
//        if(stekerbaik.isSelected()){
//            baik_steker++;
//        }else if(lcdbaik.isSelected()){
//            baik_LCD++;
//        }else if(lampubaik.isSelected() ){
//            baik_lampu++;
//        }else if(kipasbaik.isSelected()){
//            baik_kipas++;
//        }
////        else if(.isSelected()){
////            baik_AC++;
////        }
//        else if(cctvbaik.isSelected()){
//            baik_CCTV++;
//        }
//    }
//    
//    private void jml_plus(){
//        if(steker.isShowing() && isCursorSet()){
//            jml_steker++;
//        }else if(lcd.isShowing() && isCursorSet()){
//            jml_LCD++;
//        }else if(lampu.isShowing() && isCursorSet()){
//            jml_lampu++;
//        }else if(kipas.isShowing() && isCursorSet()){
//            jml_kipas++;
//        }
////        else if(AC_ruang.isShowing() && isCursorSet()){
////            jml_AC++;
////        }
//        else if(cctv.isShowing() && isCursorSet()){
//            jml_CCTV++;
//        }
//        
//        stekerbaik.setSelected(false);
//        stekerburuk.setSelected(false);
//        stekerdosen.setSelected(false);
//        stekerpojok.setSelected(false);
//        lcdbaik.setSelected(false);
//        lcdburuk.setSelected(false);
//        lcddosen.setSelected(false);
//        lcdlainnya.setSelected(false);
//        lampubaik.setSelected(false);
//        lampuburuk.setSelected(false);
//        lampuatap.setSelected(false);
//        lampulainnya.setSelected(false);
//        kipasbaik.setSelected(false);
//        kipasburuk.setSelected(false);
//        kipasdosen.setSelected(false);
//        kipaspojok.setSelected(false);
//        cctvbaik.setSelected(false);
//        cctvburuk.setSelected(false);
//        cctvsamping.setSelected(false);
//        cctvdosen.setSelected(false);
//       
//    }
    
    
    private void tampilkandata(){
        DefaultTableModel tabeldt = new DefaultTableModel();
        tabeldt.addColumn("nama");
        tabeldt.addColumn("lokasi");
        tabeldt.addColumn("fakultas");
        tabeldt.addColumn("p");
        tabeldt.addColumn("l");
        tabeldt.addColumn("jk");
        tabeldt.addColumn("jp");
        tabeldt.addColumn("jj");
        tabeldt.addColumn("Jumlah Steker");
        tabeldt.addColumn("Kondisi Baik Steker");
        tabeldt.addColumn("Posisi Sesuai Steker");
        tabeldt.addColumn("Jumlah Kabel LCD");
        tabeldt.addColumn("Kondisi Baik LCD");
        tabeldt.addColumn("Posisi Sesuai LCD");
        tabeldt.addColumn("Jumlah Lampu");
        tabeldt.addColumn("Kondisi Baik Lampu");
        tabeldt.addColumn("Posisi Sesuai Lampu");
        tabeldt.addColumn("Jumlah Kipas");
        tabeldt.addColumn("Kondisi Baik Kipas");
        tabeldt.addColumn("Posisi Sesuai Kipas");
        tabeldt.addColumn("SSID");
        tabeldt.addColumn("Bandwitch");
        tabeldt.addColumn("Jumlah CCTV");
        tabeldt.addColumn("Kondisi Baik CCTV");
        tabeldt.addColumn("Posisi Sesuai CCTV");
        tabeldt.addColumn("Kondisi Lantai");
        tabeldt.addColumn("Kondisi Dinding");
        tabeldt.addColumn("Kondisi Atap");
        //tabeldt.addColumn("Kondisi Kaca");
        tabeldt.addColumn("Sirkulasi Udara");
        tabeldt.addColumn("Nilai Pencahayaan");
        tabeldt.addColumn("Kelembapan");
        tabeldt.addColumn("Suhu");
        tabeldt.addColumn("Kebisingan Ruang");
        tabeldt.addColumn("Bau Ruang");
        tabeldt.addColumn("Kebocoran Ruang");
        tabeldt.addColumn("Kerusakan Ruang");
        tabeldt.addColumn("Keausan Ruang");
        tabeldt.addColumn("Kekokohan Ruang");
        tabeldt.addColumn("Jumlah Kunci Pintu jendela");  
        tabeldt.addColumn("kondisiruang");
        try {
            koneksi();
            String sql = "select * from data";
            Statement stat = conn.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tabeldt.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12),res.getString(13),res.getString(14),res.getString(15),res.getString(16),res.getString(17),res.getString(18),res.getString(19),res.getString(20),res.getString(21),res.getString(22),res.getString(23),res.getString(24),res.getString(25),res.getString(26),res.getString(27),res.getString(28),res.getString(29),res.getString(30),res.getString(31),res.getString(32),res.getString(33),res.getString(34),res.getString(35),res.getString(36),res.getString(37),res.getString(38),res.getString(39),res.getString(40)});
            }
           tabeldata.setModel(tabeldt);
        } catch (Exception e) {
    }
    }
    private void loadData() { 
        connect studentmgr = new connect(); 
        inven = studentmgr.getsetget();
        studentmgr.closeConnection(); 
    } 
 
    private void bindData() { 
        if (inven.size() > 0) { 
            setget s = inven.get(currentRow); 
            nama.setText(s.getNama_ruang()); 
            lokasi.setSelectedItem(s.getLokasi_ruang()); 
            fakultas.setSelectedItem(s.getFakultas()); 
            p.setSelectionEnd((int)s.getPanjang_ruang());
            l.setSelectionEnd((int)s.getLebar_ruang());
            jk.setSelectionEnd((int)s.getJumlah_kursi());
            jp.setSelectionEnd((int)s.getJumlah_pintu());
            jj.setSelectionEnd((int)s.getJumlah_jendela());
        } else { 
            currentRow = 0; 
            nama.setText(""); 
            lokasi.setSelectedItem(""); 
            fakultas.setSelectedItem(""); 
            p.setText(""); 
            l.setText(""); 
            jk.setText(""); 
            jp.setText(""); 
            jj.setText(""); 
               
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        identitas = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fakultas = new javax.swing.JComboBox();
        lokasi = new javax.swing.JComboBox();
        kondisiruang = new javax.swing.JPanel();
        l = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jj = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jp = new javax.swing.JTextField();
        jk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        steker = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stekerdosen = new javax.swing.JCheckBox();
        stekerpojok = new javax.swing.JCheckBox();
        knd = new javax.swing.JTextField();
        psi = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        js = new javax.swing.JTextField();
        lcd = new javax.swing.JPanel();
        lcdlainnya = new javax.swing.JCheckBox();
        lcddosen = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        kndlcd = new javax.swing.JTextField();
        psilcd = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lampu = new javax.swing.JPanel();
        lampuatap = new javax.swing.JCheckBox();
        lampulainnya = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        kndlp = new javax.swing.JTextField();
        psilp = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jlam = new javax.swing.JTextField();
        kipas = new javax.swing.JPanel();
        kipaspojok = new javax.swing.JCheckBox();
        kipasdosen = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kndkp = new javax.swing.JTextField();
        psikp = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jki = new javax.swing.JTextField();
        ssidbandwitch = new javax.swing.JPanel();
        ssidbisa = new javax.swing.JCheckBox();
        ssidtidak = new javax.swing.JCheckBox();
        combossid = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        cctv = new javax.swing.JPanel();
        cctvsamping = new javax.swing.JCheckBox();
        cctvdosen = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        kndcc = new javax.swing.JTextField();
        psicc = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jcctv = new javax.swing.JTextField();
        kebersihan = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lbersih = new javax.swing.JCheckBox();
        lkotor = new javax.swing.JCheckBox();
        abersih = new javax.swing.JCheckBox();
        akotor = new javax.swing.JCheckBox();
        dbersih = new javax.swing.JCheckBox();
        dkotor = new javax.swing.JCheckBox();
        la = new javax.swing.JTextField();
        at = new javax.swing.JTextField();
        di = new javax.swing.JTextField();
        lingkungan = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        s3 = new javax.swing.JSlider();
        s4 = new javax.swing.JSlider();
        s5 = new javax.swing.JSlider();
        lancar = new javax.swing.JCheckBox();
        tlancar = new javax.swing.JCheckBox();
        suhu = new javax.swing.JTextField();
        lembap = new javax.swing.JTextField();
        cahaya = new javax.swing.JTextField();
        udara = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        kenyamananruang = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        bising = new javax.swing.JCheckBox();
        tbising = new javax.swing.JCheckBox();
        bau = new javax.swing.JCheckBox();
        tbau = new javax.swing.JCheckBox();
        bocor = new javax.swing.JCheckBox();
        tbocor = new javax.swing.JCheckBox();
        rusak = new javax.swing.JCheckBox();
        trusak = new javax.swing.JCheckBox();
        aus = new javax.swing.JCheckBox();
        taus = new javax.swing.JCheckBox();
        bis = new javax.swing.JTextField();
        ba = new javax.swing.JTextField();
        boc = new javax.swing.JTextField();
        rus = new javax.swing.JTextField();
        au = new javax.swing.JTextField();
        keamananruang = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        kokoh = new javax.swing.JCheckBox();
        tkokoh = new javax.swing.JCheckBox();
        ada = new javax.swing.JCheckBox();
        tada = new javax.swing.JCheckBox();
        aman = new javax.swing.JCheckBox();
        bahaya = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        ko = new javax.swing.JTextField();
        ku = new javax.swing.JTextField();
        Kr = new javax.swing.JTextField();
        liat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        lihat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new java.awt.CardLayout());

        identitas.setBackground(new java.awt.Color(0, 204, 255));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Nama Ruang :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Fakultas        :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Lokasi           :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("IDENTITAS KELAS");

        fakultas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TEKNIK", "PSYCHOLOGI", "ILMU PENDIDIKAN", "KEDOKTERAN" }));

        lokasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GKB 1", "GKB 2", "GKB 3", "MASJID" }));

        javax.swing.GroupLayout identitasLayout = new javax.swing.GroupLayout(identitas);
        identitas.setLayout(identitasLayout);
        identitasLayout.setHorizontalGroup(
            identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, identitasLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(identitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(identitasLayout.createSequentialGroup()
                        .addGroup(identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nama))
                .addContainerGap())
        );
        identitasLayout.setVerticalGroup(
            identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(identitasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(identitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(identitasLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(identitasLayout.createSequentialGroup()
                        .addComponent(lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165))
        );

        jPanel1.add(identitas, "card2");

        kondisiruang.setBackground(new java.awt.Color(0, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Jumlah Jendela :");

        jj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjActionPerformed(evt);
            }
        });

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Lebar Ruang     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("KONDISI RUANG KELAS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Panjang Ruang :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Jumlah Pintu    :");

        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Jumlah Kursi     :");

        jLabel8.setText("M");

        jLabel9.setText("M");

        javax.swing.GroupLayout kondisiruangLayout = new javax.swing.GroupLayout(kondisiruang);
        kondisiruang.setLayout(kondisiruangLayout);
        kondisiruangLayout.setHorizontalGroup(
            kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kondisiruangLayout.createSequentialGroup()
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kondisiruangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kondisiruangLayout.createSequentialGroup()
                                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addGap(25, 25, 25)
                                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kondisiruangLayout.createSequentialGroup()
                                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kondisiruangLayout.createSequentialGroup()
                                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l))
                                    .addGroup(kondisiruangLayout.createSequentialGroup()
                                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))))
                    .addGroup(kondisiruangLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel6)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        kondisiruangLayout.setVerticalGroup(
            kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kondisiruangLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kondisiruangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(kondisiruangLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kondisiruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(kondisiruang, "card14");

        steker.setBackground(new java.awt.Color(0, 204, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("kondisi Steker               :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Posisi Steker ");

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Kondisi Sarana");

        stekerdosen.setText("Deket Dosen");
        stekerdosen.setToolTipText("");
        stekerdosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stekerdosenActionPerformed(evt);
            }
        });

        stekerpojok.setText("Pojok Ruang");
        stekerpojok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stekerpojokActionPerformed(evt);
            }
        });

        psi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psiActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 0));
        jLabel51.setText("Masukan Jumlah Steker :");

        javax.swing.GroupLayout stekerLayout = new javax.swing.GroupLayout(steker);
        steker.setLayout(stekerLayout);
        stekerLayout.setHorizontalGroup(
            stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stekerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(stekerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel51))
                .addGap(27, 27, 27)
                .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stekerLayout.createSequentialGroup()
                        .addComponent(stekerpojok)
                        .addGap(41, 41, 41)
                        .addComponent(stekerdosen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(psi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(stekerLayout.createSequentialGroup()
                        .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(js, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(knd))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        stekerLayout.setVerticalGroup(
            stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stekerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stekerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(js, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(knd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(stekerLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)))
                .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stekerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(stekerdosen)
                        .addComponent(psi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stekerpojok))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPanel1.add(steker, "card4");

        lcd.setBackground(new java.awt.Color(0, 204, 204));

        lcdlainnya.setText("lainnya");
        lcdlainnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcdlainnyaActionPerformed(evt);
            }
        });

        lcddosen.setText("Deket Dosen");
        lcddosen.setToolTipText("");
        lcddosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcddosenActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Kondisi Sarana");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("Posisi Kabel LCD");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("Kondisi Kabel LCD Baik   :");

        psilcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psilcdActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 0));
        jLabel52.setText("Jumlah Kabel LCD          :");

        javax.swing.GroupLayout lcdLayout = new javax.swing.GroupLayout(lcd);
        lcd.setLayout(lcdLayout);
        lcdLayout.setHorizontalGroup(
            lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lcdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lcdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel52)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lcdLayout.createSequentialGroup()
                        .addComponent(lcddosen)
                        .addGap(83, 83, 83)
                        .addComponent(lcdlainnya)
                        .addGap(64, 64, 64)
                        .addComponent(psilcd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kndlcd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        lcdLayout.setVerticalGroup(
            lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lcdLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(kndlcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(lcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lcdlainnya)
                    .addComponent(lcddosen)
                    .addComponent(psilcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel1.add(lcd, "card7");

        lampu.setBackground(new java.awt.Color(0, 204, 204));

        lampuatap.setText("Di atap");
        lampuatap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampuatapActionPerformed(evt);
            }
        });

        lampulainnya.setText("Lainnya");
        lampulainnya.setToolTipText("");
        lampulainnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampulainnyaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Kondisi Sarana");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("Posisi Lampu");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("Kondisi Lampu Baik        :");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 0));
        jLabel53.setText("Masukan Jumlah Lampu :");

        javax.swing.GroupLayout lampuLayout = new javax.swing.GroupLayout(lampu);
        lampu.setLayout(lampuLayout);
        lampuLayout.setHorizontalGroup(
            lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lampuLayout.createSequentialGroup()
                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lampuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lampuLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lampuLayout.createSequentialGroup()
                                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(61, 61, 61)
                                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lampuLayout.createSequentialGroup()
                                        .addComponent(lampuatap)
                                        .addGap(81, 81, 81)
                                        .addComponent(lampulainnya)
                                        .addGap(67, 67, 67)
                                        .addComponent(psilp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kndlp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(lampuLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(61, 61, 61)
                                .addComponent(jlam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lampuLayout.setVerticalGroup(
            lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lampuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jlam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(kndlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(lampuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lampuatap)
                    .addComponent(lampulainnya)
                    .addComponent(psilp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1.add(lampu, "card6");

        kipas.setBackground(new java.awt.Color(0, 153, 153));

        kipaspojok.setText("Pojok Ruang");
        kipaspojok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kipaspojokActionPerformed(evt);
            }
        });

        kipasdosen.setText("Deket Dosen");
        kipasdosen.setToolTipText("");
        kipasdosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kipasdosenActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Kondisi Sarana");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 0));
        jLabel27.setText("Posisi Kipas");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("Kondisi Kipas Baik        :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 0));
        jLabel54.setText("Masukan Jumlah Kipas :");

        javax.swing.GroupLayout kipasLayout = new javax.swing.GroupLayout(kipas);
        kipas.setLayout(kipasLayout);
        kipasLayout.setHorizontalGroup(
            kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kipasLayout.createSequentialGroup()
                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kipasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                    .addGroup(kipasLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kipasLayout.createSequentialGroup()
                                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kipasLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(kndkp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kipasLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(kipaspojok)
                                        .addGap(84, 84, 84)
                                        .addComponent(kipasdosen)
                                        .addGap(58, 58, 58)
                                        .addComponent(psikp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kipasLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(56, 56, 56)
                                .addComponent(jki, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kipasLayout.setVerticalGroup(
            kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kipasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(kndkp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(kipasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(kipaspojok)
                    .addComponent(kipasdosen)
                    .addComponent(psikp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel1.add(kipas, "card8");

        ssidbandwitch.setBackground(new java.awt.Color(0, 102, 102));

        ssidbisa.setText("connect");
        ssidbisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssidbisaActionPerformed(evt);
            }
        });

        ssidtidak.setText("not connect");
        ssidtidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssidtidakActionPerformed(evt);
            }
        });

        combossid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "umm hotspot", "hotspot teknik", "local hotspot" }));

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("INPUT BANDWITCH");

        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ssidbandwitchLayout = new javax.swing.GroupLayout(ssidbandwitch);
        ssidbandwitch.setLayout(ssidbandwitchLayout);
        ssidbandwitchLayout.setHorizontalGroup(
            ssidbandwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssidbandwitchLayout.createSequentialGroup()
                .addGroup(ssidbandwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ssidbandwitchLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(combossid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(ssidbisa)
                        .addGap(86, 86, 86)
                        .addComponent(ssidtidak)
                        .addGap(47, 47, 47)
                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ssidbandwitchLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel14)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        ssidbandwitchLayout.setVerticalGroup(
            ssidbandwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ssidbandwitchLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(69, 69, 69)
                .addGroup(ssidbandwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssidbisa)
                    .addComponent(ssidtidak)
                    .addComponent(combossid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jPanel1.add(ssidbandwitch, "card9");

        cctv.setBackground(new java.awt.Color(0, 204, 204));

        cctvsamping.setText("samping");
        cctvsamping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cctvsampingActionPerformed(evt);
            }
        });

        cctvdosen.setText("Deket Dosen");
        cctvdosen.setToolTipText("");
        cctvdosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cctvdosenActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Kondisi Sarana");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 0));
        jLabel31.setText("Posisi CCTV");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 0));
        jLabel32.setText("Kondisi CCTV Baik        :");

        psicc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psiccActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 0));
        jLabel55.setText("Masukan Jumlah CCTV : ");

        javax.swing.GroupLayout cctvLayout = new javax.swing.GroupLayout(cctv);
        cctv.setLayout(cctvLayout);
        cctvLayout.setHorizontalGroup(
            cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cctvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cctvLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cctvLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cctvLayout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(89, 89, 89)
                                .addComponent(jcctv, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cctvLayout.createSequentialGroup()
                                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cctvLayout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(kndcc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cctvLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(cctvsamping)
                                        .addGap(74, 74, 74)
                                        .addComponent(cctvdosen)
                                        .addGap(58, 58, 58)
                                        .addComponent(psicc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(106, 106, 106))))
        );
        cctvLayout.setVerticalGroup(
            cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cctvLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jcctv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(kndcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(cctvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cctvsamping)
                    .addComponent(cctvdosen)
                    .addComponent(psicc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 162, Short.MAX_VALUE))
        );

        jPanel1.add(cctv, "card10");

        kebersihan.setBackground(new java.awt.Color(0, 153, 153));

        jLabel39.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 153));
        jLabel39.setText("KEBERSIHAN RUANG");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 0));
        jLabel40.setText("Kebersihan Lantai     :");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 0));
        jLabel41.setText("Kebersihan Atap      :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 0));
        jLabel42.setText("Kebersihan Dinding :");

        lbersih.setText("Bersih");
        lbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbersihActionPerformed(evt);
            }
        });

        lkotor.setText("Kotor");
        lkotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lkotorActionPerformed(evt);
            }
        });

        abersih.setText("Bersih");
        abersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abersihActionPerformed(evt);
            }
        });

        akotor.setText("Kotor");
        akotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akotorActionPerformed(evt);
            }
        });

        dbersih.setText("Bersih");
        dbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbersihActionPerformed(evt);
            }
        });

        dkotor.setText("Kotor");
        dkotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dkotorActionPerformed(evt);
            }
        });

        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });

        di.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kebersihanLayout = new javax.swing.GroupLayout(kebersihan);
        kebersihan.setLayout(kebersihanLayout);
        kebersihanLayout.setHorizontalGroup(
            kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kebersihanLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(kebersihanLayout.createSequentialGroup()
                        .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kebersihanLayout.createSequentialGroup()
                                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kebersihanLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(lbersih))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kebersihanLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(abersih)))
                                .addGap(94, 94, 94)
                                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lkotor)
                                    .addComponent(akotor))
                                .addGap(72, 72, 72)
                                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(la, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(at, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kebersihanLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kebersihanLayout.createSequentialGroup()
                        .addComponent(dbersih)
                        .addGap(94, 94, 94)
                        .addComponent(dkotor)
                        .addGap(72, 72, 72)
                        .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        kebersihanLayout.setVerticalGroup(
            kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kebersihanLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel39)
                .addGap(43, 43, 43)
                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lkotor)
                    .addComponent(lbersih)
                    .addComponent(jLabel40)
                    .addComponent(la, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(abersih)
                    .addComponent(akotor)
                    .addComponent(at))
                .addGap(44, 44, 44)
                .addGroup(kebersihanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(dbersih)
                    .addComponent(dkotor)
                    .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        jPanel1.add(kebersihan, "card12");

        lingkungan.setBackground(new java.awt.Color(0, 153, 153));

        jLabel33.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 153));
        jLabel33.setText("LINGKUNGAN RUANG KELAS");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 0));
        jLabel34.setText("Suhu                     :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 0));
        jLabel35.setText("Kelembapan          :");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 0));
        jLabel36.setText("Intensitas Cahaya :");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 0));
        jLabel37.setText("Sirkulasi Udara      :");

        lancar.setText("Lancar");
        lancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancarActionPerformed(evt);
            }
        });

        tlancar.setText("Tidak Lancar");
        tlancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlancarActionPerformed(evt);
            }
        });

        suhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuActionPerformed(evt);
            }
        });

        lembap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lembapActionPerformed(evt);
            }
        });

        udara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udaraActionPerformed(evt);
            }
        });

        jLabel38.setText("c");

        jLabel43.setText("mb");

        jLabel50.setText("cd");

        javax.swing.GroupLayout lingkunganLayout = new javax.swing.GroupLayout(lingkungan);
        lingkungan.setLayout(lingkunganLayout);
        lingkunganLayout.setHorizontalGroup(
            lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lingkunganLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(lingkunganLayout.createSequentialGroup()
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel36)))
                        .addGap(55, 55, 55)
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lingkunganLayout.createSequentialGroup()
                                .addComponent(lancar)
                                .addGap(81, 81, 81)
                                .addComponent(tlancar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lingkunganLayout.createSequentialGroup()
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cahaya, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lembap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suhu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel43)
                            .addComponent(jLabel50)))
                    .addComponent(udara, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(lingkunganLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lingkunganLayout.setVerticalGroup(
            lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lingkunganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38))
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lingkunganLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lingkunganLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lembap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))))
                .addGap(27, 27, 27)
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cahaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50)))
                .addGap(35, 35, 35)
                .addGroup(lingkunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(lancar)
                    .addComponent(tlancar)
                    .addComponent(udara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel1.add(lingkungan, "card11");

        kenyamananruang.setBackground(new java.awt.Color(0, 153, 153));
        kenyamananruang.setForeground(new java.awt.Color(0, 153, 153));

        jLabel44.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 153));
        jLabel44.setText("KENYAMANAN RUANG");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 0));
        jLabel45.setText("Tingkat Kebisingan :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 0));
        jLabel46.setText("Tingkat Bau            :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 0));
        jLabel47.setText("Tingkat Kebocoran :");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 0));
        jLabel48.setText("Tingkat Kerusakan :");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 0));
        jLabel49.setText("Tingkat Keausan    :");

        bising.setText("Bising");
        bising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bisingActionPerformed(evt);
            }
        });

        tbising.setText("Tidak Bising");
        tbising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbisingActionPerformed(evt);
            }
        });

        bau.setText("Bau");
        bau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauActionPerformed(evt);
            }
        });

        tbau.setText("Tidak Bau");
        tbau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbauActionPerformed(evt);
            }
        });

        bocor.setText("Bocor");
        bocor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bocorActionPerformed(evt);
            }
        });

        tbocor.setText("Tidak Bocor");
        tbocor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbocorActionPerformed(evt);
            }
        });

        rusak.setText("Rusak ");
        rusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rusakActionPerformed(evt);
            }
        });

        trusak.setText("Tidak Rusak");
        trusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trusakActionPerformed(evt);
            }
        });

        aus.setText("Aus");
        aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ausActionPerformed(evt);
            }
        });

        taus.setText("Tidak Aus");
        taus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tausActionPerformed(evt);
            }
        });

        bis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bisActionPerformed(evt);
            }
        });

        boc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kenyamananruangLayout = new javax.swing.GroupLayout(kenyamananruang);
        kenyamananruang.setLayout(kenyamananruangLayout);
        kenyamananruangLayout.setHorizontalGroup(
            kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kenyamananruangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addGap(57, 57, 57)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kenyamananruangLayout.createSequentialGroup()
                        .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bau)
                            .addComponent(bising)
                            .addComponent(bocor))
                        .addGap(95, 95, 95)
                        .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbising)
                            .addComponent(tbau)
                            .addComponent(tbocor)))
                    .addGroup(kenyamananruangLayout.createSequentialGroup()
                        .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rusak)
                            .addComponent(aus))
                        .addGap(91, 91, 91)
                        .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trusak)
                            .addComponent(taus))))
                .addGap(50, 50, 50)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ba, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bis, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kenyamananruangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(196, 196, 196))
        );
        kenyamananruangLayout.setVerticalGroup(
            kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kenyamananruangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel44)
                .addGap(38, 38, 38)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(bising)
                    .addComponent(tbising)
                    .addComponent(bis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(bau)
                    .addComponent(tbau)
                    .addComponent(ba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(bocor)
                    .addComponent(tbocor)
                    .addComponent(boc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(rusak)
                    .addComponent(trusak)
                    .addComponent(rus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kenyamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(aus)
                    .addComponent(taus)
                    .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel1.add(kenyamananruang, "card13");

        keamananruang.setBackground(new java.awt.Color(0, 153, 153));

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("KEAMANAN RUANG");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("Kekokohan Bangunan    :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 0));
        jLabel26.setText("Kunci Jendela dan Pintu :");

        kokoh.setText("Kokoh");
        kokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kokohActionPerformed(evt);
            }
        });

        tkokoh.setText("Tidak Kokoh");
        tkokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkokohActionPerformed(evt);
            }
        });

        ada.setText("Ada");
        ada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaActionPerformed(evt);
            }
        });

        tada.setText("Tidak Ada");
        tada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tadaActionPerformed(evt);
            }
        });

        aman.setText("Aman");
        aman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amanActionPerformed(evt);
            }
        });

        bahaya.setText("Bahaya");
        bahaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bahayaActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 0));
        jLabel30.setText("Kondisi Ruang                :");

        ko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koActionPerformed(evt);
            }
        });

        ku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keamananruangLayout = new javax.swing.GroupLayout(keamananruang);
        keamananruang.setLayout(keamananruangLayout);
        keamananruangLayout.setHorizontalGroup(
            keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keamananruangLayout.createSequentialGroup()
                .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keamananruangLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel18))
                    .addGroup(keamananruangLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57)
                        .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ada)
                            .addComponent(kokoh)
                            .addComponent(aman))
                        .addGap(72, 72, 72)
                        .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tada)
                            .addComponent(tkokoh)
                            .addComponent(bahaya))
                        .addGap(28, 28, 28)
                        .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ko)
                            .addComponent(ku)
                            .addComponent(Kr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        keamananruangLayout.setVerticalGroup(
            keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keamananruangLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addGap(74, 74, 74)
                .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(kokoh)
                    .addComponent(tkokoh)
                    .addComponent(ko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ada)
                    .addComponent(tada)
                    .addComponent(ku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(keamananruangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aman)
                    .addComponent(bahaya)
                    .addComponent(jLabel30)
                    .addComponent(Kr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel1.add(keamananruang, "card14");

        liat.setBackground(new java.awt.Color(0, 153, 153));

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nama", "lokasi", "fakultas", "panjang", "lebar", "jumlahkursi", "jumlahpintu", "jumlahjendela", "jumlahsteker", "jumlahstekerbaik", "jumlahposisisteker", "jumlahkabellcd", "jumlahkabellcdbaik", "jumlahposisikabellcd", "jumlahlampu", "jumlahlampubaik", "jumlahposisilampu", "jumlahkipas", "jumlahkipasbaik", "jumlahposisikipas", "pilihSSID", "inputbandwitch", "jumlahcctv", "jumlahcctvbaik", "jumlahposisicctv", "kondisilantai", "kondisidinding", "kondisiatap", "sirkulasiudara", "pencahayaan", "kelembapan", "suhu", "kebisingan", "bau", "kebocoran", "kerusakan", "keausan", "kekokohan", "kuncipintujendela", "kondisiruang"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        jTextField2.setText("jTextField2");

        btnDelete.setText("hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout liatLayout = new javax.swing.GroupLayout(liat);
        liat.setLayout(liatLayout);
        liatLayout.setHorizontalGroup(
            liatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(liatLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        liatLayout.setVerticalGroup(
            liatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(liatLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(liatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(0, 151, Short.MAX_VALUE))
        );

        jPanel1.add(liat, "card5");

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));

        btn.setText("baru");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        next.setText(">>>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setText("<<<");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        lihat.setText("lihat");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lihat)
                .addGap(18, 18, 18)
                .addComponent(previous)
                .addGap(54, 54, 54)
                .addComponent(next)
                .addGap(18, 18, 18)
                .addComponent(btn)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(next)
                    .addComponent(previous)
                    .addComponent(lihat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
  // TODO add your handling code here:
      if(identitas.isShowing()&&!nama.getText().equalsIgnoreCase("")){
            identitas.setVisible(false);
            kondisiruang.setVisible(true);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(kondisiruang.isShowing()&&!p.getText().equals("")
                 && !l.getText().equals("") && !jk.getText().equals("") && !jp.getText().equals("") 
                 && !jj.getText().equals("")){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(true);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
            }
        else if(steker.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(true);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lcd.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(true);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lampu.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(true);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(kipas.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(true);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(ssidbandwitch.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(true);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(cctv.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(true);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lingkungan.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(true);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
              else if(kebersihan.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(true);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
              else    if(kenyamananruang.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(true);
            liat.setVisible(false);
          
        }
               else    if(keamananruang.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
                   
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Belum Lengkap!!");
        }            
    }//GEN-LAST:event_nextActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
         if(!next.isEnabled()){
            
        }
        
        if (btn.getText().equals("baru")) { 
            nama.setText(""); 
            lokasi.setSelectedItem(""); 
            fakultas.setSelectedItem(""); 
//            p.setText("");
//            l.setText("");
//            jk.setText("");
//            jp.setText("");
//            jj.setText(""); 
            nama.setEnabled(true); 
            lokasi.setEnabled(true); 
            fakultas.setEnabled(true); 
//            p.setEditable(true); 
//            l.setEditable(true);
//            jk.setEditable(true);
//            jp.setEditable(true);
//            jj.setEditable(true);
            nama.requestFocus(); 
            btn.setText("Simpan"); 
//            fakultas.setText("Batal"); 
//            p.setEnabled(false); 
//            l.setEnabled(false); 
//            jk.setEnabled(false); 
        } else { 
    if (!nama.getText().equals("") && !lokasi.getSelectedItem().equals("")&&!fakultas.getSelectedItem().equals("")
            &&!p.getText().equals("")&&!l.getText().equals("")
            &&!jk.getText().equals("")&&!jp.getText().equals("")&&!jj.getText().equals("")
            ) { 
                connect studentmgr = new connect(); //buka koneksi 
                setget s = new setget(); 
                s.setNama_ruang(nama.getText()); 
                s.setLokasi_ruang((String)lokasi.getSelectedItem());
                s.setFakultas((String)fakultas.getSelectedItem()); 
                s.setPanjang_ruang(Integer.parseInt(p.getText())); 
                s.setLebar_ruang(Integer.parseInt( l.getText()));
                s.setJumlah_kursi(Integer.parseInt(jk.getText()));
                s.setJumlah_pintu(Integer.parseInt(jp.getText()));
                s.setJumlah_jendela(Integer.parseInt(jj.getText()));
                s.setJumlah_steker(Integer.parseInt(js.getText()));
                s.setJumlah_steker(Integer.parseInt(knd.getText()));
                s.setJumlah_posisi_steker(psi.getText());
                s.setJumlah_kabel_LCD(Integer.parseInt(jTextField1.getText()));
                s.setJumlah_kabel_LCD_baik(Integer.parseInt(kndlcd.getText()));
                s.setJumlah_posisi_kabel_LCD(psilcd.getText());
                s.setJumlah_lampu(Integer.parseInt(jlam.getText()));
                s.setJumlah_lampu_baik(Integer.parseInt(kndlp.getText()));
                s.setJumlah_posisi_lampu(psilp.getText());
                s.setJumlah_kipas_angin(Integer.parseInt(jki.getText()));
                s.setJumlah_kipas_angin_baik(Integer.parseInt(kndkp.getText()));
                s.setJumlah_posisi_kipas_angin(psikp.getText());
//                s.setJumlah_AC(jml_AC);
//                s.setJumlah_AC_baik(baik_AC);
//                s.setJumlah_posisi_AC(posisi_AC);
                s.setSSID((String) combossid.getSelectedItem());
                s.setBandwidth(con.getText());
                s.setJumlah_CCTV(Integer.parseInt(jcctv.getText()));
                s.setJumlah_CCTV_baik(Integer.parseInt(kndcc.getText()));
                s.setJumlah_posisi_CCTV(psicc.getText());
//                s.setSSID((String) combossid.getSelectedItem());
//                s.setBandwidth(con.getText());
                s.setKondisi_lantai(la.getText());
                s.setKondisi_dinding(di.getText());
                s.setKondisi_atap(at.getText());
                s.setSirkulasi_udara(udara.getText());//
                s.setPencahayaan(Integer.parseInt(cahaya.getText()));
                s.setKelembapan(Integer.parseInt(lembap.getText()));
                s.setSuhu(Integer.parseInt(suhu.getText()));
                s.setKebisingan(bis.getText());
                s.setBau(ba.getText());
                s.setKebocoran(boc.getText());
                s.setKerusakan(rus.getText());
                s.setKeausan(au.getText());
                s.setKekokohan(ko.getText());
                s.setKuncipintujendela(ku.getText());
//                s.setKondisiruang(kon.getText());
                Sistem gue = new Sistem();
                if (studentmgr.Insert(s) > 0) { 
                    loadData(); 
                    currentRow = inven.size() - 1; 
                    bindData(); 
                    identitas.setVisible(false);
                    liat.setVisible(true);
                    tabeldata.setVisible(true);
              JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE); 
                } else { 
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE); 
                } 
//                JOptionPane.showMessageDialog(null,"kondisi sesai");
                
//                JOptionPane.showMessageDialog(rootPane, "");
                int test =0;
                int test1 =gue.CheckKondisiRuang(test);
                if(test==4){
                s.setK("kondisi tidak sesuai");
                }else{
                JOptionPane.showMessageDialog(null,"kondisi Tidak sesuai");
                }
                
                int testt=0;
                int test2= gue.CheckKondisiSarana(testt);
                if(testt==1){
                s.setL("kondisi tidak sesuai");
                }else{
                JOptionPane.showMessageDialog(null,"kondisi Tidak sesuai");
                }
               
                
               
               
                
                
//                     
                
                
                nama.setEditable(false); 
                lokasi.setEditable(false); 
                fakultas.setEditable(false); 
                p.setEditable(false); 
                l.setEditable(false); 
                jk.setEditable(false); 
                jp.setEditable(false);
                jj.setEditable(false);
                btn.setText("Baru"); 
//                btnDelete.setText("Hapus"); 
//                btnEdit.setEnabled(true); 
//                btnPrev.setEnabled(true); 
//                btnNext.setEnabled(true); 
                studentmgr.closeConnection(); //tutup koneksi 
            } else { 
                JOptionPane.showMessageDialog(this, "Mohon isi data dengan benar", "Informasi", JOptionPane.INFORMATION_MESSAGE); 
            } 
        }
        tampilkandata();
    }//GEN-LAST:event_btnActionPerformed

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        liat.setVisible(true);
        next.setEnabled(true);
        previous.setEnabled(true);
        identitas.setVisible(false);
        kondisiruang.setVisible(false);
        steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
    }//GEN-LAST:event_lihatActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
 if(identitas.isShowing()&&!nama.getText().equalsIgnoreCase("")){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(kondisiruang.isShowing()&&!p.getText().equals("")
                 && !l.getText().equals("") && !jk.getText().equals("") && !jp.getText().equals("") 
                 && !jj.getText().equals("")){
            identitas.setVisible(true);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
            }
        else if(steker.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(true);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lcd.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(true);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lampu.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(true);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(kipas.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(true);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(ssidbandwitch.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(true);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(cctv.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(true);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
        else if(lingkungan.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(true);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
              else if(kebersihan.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(true);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
              else    if(kenyamananruang.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(true);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }
               else    if(keamananruang.isShowing()){
            identitas.setVisible(false);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(true);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }   
 if(liat.isShowing()){
            identitas.setVisible(true);
            kondisiruang.setVisible(false);
            steker.setVisible(false);
            lcd.setVisible(false);
            lampu.setVisible(false);
            kipas.setVisible(false);
            ssidbandwitch.setVisible(false);
            cctv.setVisible(false);
            lingkungan.setVisible(false);
            kebersihan.setVisible(false);
            kenyamananruang.setVisible(false);
            keamananruang.setVisible(false);
            liat.setVisible(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_previousActionPerformed

    private void stekerdosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stekerdosenActionPerformed
        psi.setText("Dekat Dosen");
        stekerpojok.setSelected(false);
    }//GEN-LAST:event_stekerdosenActionPerformed

    private void lcdlainnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcdlainnyaActionPerformed
    psilcd.setText("Lainnya");        // TODO add your handling code here:
    }//GEN-LAST:event_lcdlainnyaActionPerformed

    private void lcddosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcddosenActionPerformed
    psilcd.setText("Dekat Dosen");        // TODO add your handling code here:
    }//GEN-LAST:event_lcddosenActionPerformed

    private void lampuatapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampuatapActionPerformed
    lampulainnya.setSelected(false);
    psilp.setText("Dekat Dosen");// TODO add your handling code here:
    }//GEN-LAST:event_lampuatapActionPerformed

    private void lampulainnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampulainnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lampulainnyaActionPerformed

    private void kipaspojokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kipaspojokActionPerformed
    psikp.setText("Pojok Ruang");
    kipasdosen.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_kipaspojokActionPerformed

    private void kipasdosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kipasdosenActionPerformed
    psikp.setText("Dekat Dosen");
    kipaspojok.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_kipasdosenActionPerformed

    private void cctvsampingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cctvsampingActionPerformed
    psicc.setText("Samping");
    cctvsamping.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_cctvsampingActionPerformed

    private void cctvdosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cctvdosenActionPerformed
    psicc.setText("Dekat Dosen");
    cctvdosen.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_cctvdosenActionPerformed

    private void stekerpojokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stekerpojokActionPerformed
    psi.setText("Pojok Ruang");
    stekerdosen.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_stekerpojokActionPerformed

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed

    }//GEN-LAST:event_pActionPerformed

    private void jjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jjActionPerformed

    private void psilcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psilcdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psilcdActionPerformed

    private void ssidbisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssidbisaActionPerformed
    con.setText("Connect"); 
    ssidtidak.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_ssidbisaActionPerformed

    private void ssidtidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssidtidakActionPerformed
    con.setText("Not Connect");
    ssidbisa.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_ssidtidakActionPerformed

    private void rusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rusakActionPerformed
    rus.setText("Rusak");
    trusak.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_rusakActionPerformed

    private void bisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bisingActionPerformed
    bis.setText("Bising");
    tbising.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_bisingActionPerformed

    private void tbisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbisingActionPerformed
    bis.setText("Tidak Bising");
    bising.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tbisingActionPerformed

    private void bauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauActionPerformed
    ba.setText("Bau");
    tbau.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_bauActionPerformed

    private void tbauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbauActionPerformed
    ba.setText("Tidak Bau");
    bau.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tbauActionPerformed

    private void bocorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bocorActionPerformed
    boc.setText("Bocor");
    tbocor.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_bocorActionPerformed

    private void tbocorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbocorActionPerformed
    boc.setText("Tidak Bocor");
    bocor.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tbocorActionPerformed

    private void trusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trusakActionPerformed
    rus.setText("Tidak Rusak");
    rusak.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_trusakActionPerformed

    private void ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ausActionPerformed
    au.setText("Aus");
    taus.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_ausActionPerformed

    private void tausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tausActionPerformed
    au.setText("Tidak Aus");
    aus.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tausActionPerformed

    private void adaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaActionPerformed
    ku.setText("Ada");
    tada.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_adaActionPerformed

    private void tadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tadaActionPerformed
    ku.setText("Tidak Ada");
    ada.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tadaActionPerformed

    private void kuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuActionPerformed

    private void kokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kokohActionPerformed
    ko.setText("Kokoh"); 
    tkokoh.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_kokohActionPerformed

    private void tkokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkokohActionPerformed
    ko.setText("Tidak Kokoh");
    kokoh.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tkokohActionPerformed

    private void amanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amanActionPerformed
    Kr.setText("Aman");
    bahaya.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_amanActionPerformed

    private void bahayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bahayaActionPerformed
    Kr.setText("Bahaya");
    aman.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_bahayaActionPerformed

    private void psiccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psiccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psiccActionPerformed

    private void bocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bocActionPerformed

    private void psiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psiActionPerformed

    private void koActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_koActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conActionPerformed

    private void bisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bisActionPerformed

    private void lancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancarActionPerformed
        udara.setText("Sirkulasi Lancar");
        tlancar.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_lancarActionPerformed

    private void tlancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlancarActionPerformed
        udara.setText("Sirkulasi Tidak Lancar");
        lancar.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_tlancarActionPerformed

    private void suhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhuActionPerformed

    private void lembapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lembapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lembapActionPerformed

    private void udaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_udaraActionPerformed

    private void lbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbersihActionPerformed
        la.setText("Bersih");
        lkotor.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_lbersihActionPerformed

    private void lkotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lkotorActionPerformed
        la.setText("Kotor");
        lbersih.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_lkotorActionPerformed

    private void abersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abersihActionPerformed
        at.setText("Bersih");
        akotor.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_abersihActionPerformed

    private void akotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akotorActionPerformed
        at.setText("Kotor");
        abersih.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_akotorActionPerformed

    private void dbersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbersihActionPerformed
        di.setText("Bersih");
        dkotor.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_dbersihActionPerformed

    private void dkotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dkotorActionPerformed
        di.setText("Kotor");
        dbersih.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_dkotorActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atActionPerformed

    private void diActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//if(btnDelete.getText().equals("hapus")){
//    int dialog = JOptionPane.showConfirmDialog(this,
//            "Apakah anda yakin akan mengaapus data ini?",
//            "Konfirmasi", JOptionPane.YES_NO_OPTION);
//    connect c = new connect ();
////    setget s = .get(currentRow);
//    if(dialog == JOptionPane.YES_OPTION){
////    if (c.Delete(s)> 0){
//        loadData();
//        currentRow = currentRow - 1;
//        tampilkandata();
//        
//        JOptionPane.showMessageDialog(this,"Data berhasil di hapus","informasi",JOptionPane.INFORMATION_MESSAGE);
//    }else{
//        JOptionPane.showMessageDialog(this,"Data gagal dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
//    }
//    }
//    c.closeConnection();
//}
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Kr;
    private javax.swing.JCheckBox abersih;
    private javax.swing.JCheckBox ada;
    private javax.swing.JCheckBox akotor;
    private javax.swing.JCheckBox aman;
    private javax.swing.JTextField at;
    private javax.swing.JTextField au;
    private javax.swing.JCheckBox aus;
    private javax.swing.JTextField ba;
    private javax.swing.JCheckBox bahaya;
    private javax.swing.JCheckBox bau;
    private javax.swing.JTextField bis;
    private javax.swing.JCheckBox bising;
    private javax.swing.JTextField boc;
    private javax.swing.JCheckBox bocor;
    private javax.swing.JButton btn;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JTextField cahaya;
    private javax.swing.JPanel cctv;
    private javax.swing.JCheckBox cctvdosen;
    private javax.swing.JCheckBox cctvsamping;
    private javax.swing.JComboBox combossid;
    private javax.swing.JTextField con;
    private javax.swing.JCheckBox dbersih;
    private javax.swing.JTextField di;
    private javax.swing.JCheckBox dkotor;
    private javax.swing.JComboBox fakultas;
    private javax.swing.JPanel identitas;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jcctv;
    private javax.swing.JTextField jj;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField jki;
    private javax.swing.JTextField jlam;
    private javax.swing.JTextField jp;
    private javax.swing.JTextField js;
    private javax.swing.JPanel keamananruang;
    private javax.swing.JPanel kebersihan;
    private javax.swing.JPanel kenyamananruang;
    private javax.swing.JPanel kipas;
    private javax.swing.JCheckBox kipasdosen;
    private javax.swing.JCheckBox kipaspojok;
    private javax.swing.JTextField knd;
    private javax.swing.JTextField kndcc;
    private javax.swing.JTextField kndkp;
    private javax.swing.JTextField kndlcd;
    private javax.swing.JTextField kndlp;
    private javax.swing.JTextField ko;
    private javax.swing.JCheckBox kokoh;
    private javax.swing.JPanel kondisiruang;
    private javax.swing.JTextField ku;
    private javax.swing.JTextField l;
    private javax.swing.JTextField la;
    private javax.swing.JPanel lampu;
    private javax.swing.JCheckBox lampuatap;
    private javax.swing.JCheckBox lampulainnya;
    private javax.swing.JCheckBox lancar;
    private javax.swing.JCheckBox lbersih;
    private javax.swing.JPanel lcd;
    private javax.swing.JCheckBox lcddosen;
    private javax.swing.JCheckBox lcdlainnya;
    private javax.swing.JTextField lembap;
    private javax.swing.JPanel liat;
    private javax.swing.JButton lihat;
    private javax.swing.JPanel lingkungan;
    private javax.swing.JCheckBox lkotor;
    private javax.swing.JComboBox lokasi;
    private javax.swing.JTextField nama;
    private javax.swing.JButton next;
    private javax.swing.JTextField p;
    private javax.swing.JButton previous;
    private javax.swing.JTextField psi;
    private javax.swing.JTextField psicc;
    private javax.swing.JTextField psikp;
    private javax.swing.JTextField psilcd;
    private javax.swing.JTextField psilp;
    private javax.swing.JTextField rus;
    private javax.swing.JCheckBox rusak;
    private javax.swing.JSlider s3;
    private javax.swing.JSlider s4;
    private javax.swing.JSlider s5;
    private javax.swing.JPanel ssidbandwitch;
    private javax.swing.JCheckBox ssidbisa;
    private javax.swing.JCheckBox ssidtidak;
    private javax.swing.JPanel steker;
    private javax.swing.JCheckBox stekerdosen;
    private javax.swing.JCheckBox stekerpojok;
    private javax.swing.JTextField suhu;
    private javax.swing.JTable tabeldata;
    private javax.swing.JCheckBox tada;
    private javax.swing.JCheckBox taus;
    private javax.swing.JCheckBox tbau;
    private javax.swing.JCheckBox tbising;
    private javax.swing.JCheckBox tbocor;
    private javax.swing.JCheckBox tkokoh;
    private javax.swing.JCheckBox tlancar;
    private javax.swing.JCheckBox trusak;
    private javax.swing.JTextField udara;
    // End of variables declaration//GEN-END:variables
}
