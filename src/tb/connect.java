package tb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satelllite
 */
public class connect {
 
    Connection conn = null; 
    Statement st = null; 
    String url = "jdbc:mysql://localhost:3306/myproject"; 
    String user = "root"; 
    String pass = ""; 
 
    public connect() { 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection(url, user, pass); 
            st = conn.createStatement(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
 
    public List getsetget() { 
        ResultSet rs = null; 
        List setget = new ArrayList(); 
        try { 
            rs = st.executeQuery("select * from data"); 
            while (rs.next()) { 
                setget s = new setget(); 
                s.setNama_ruang(rs.getString("namaruang")); 
                s.setLokasi_ruang(rs.getString("lokasi")); 
                s.setFakultas(rs.getString("fakultas"));
                s.setPanjang_ruang(rs.getInt("panjangruang"));
                s.setLebar_ruang(rs.getInt("lebarruang"));
                s.setJumlah_kursi(rs.getInt("jumlahkursi"));
                s.setJumlah_pintu(rs.getInt("jumlahpintu"));
                s.setJumlah_jendela(rs.getInt("jumlahjendela"));
                s.setJumlah_steker(rs.getInt("jumlahsteker"));
                s.setJumlah_steker_baik(rs.getInt("jumlahstekerbaik"));
                s.setJumlah_posisi_steker(rs.getString("jumlahposisisteker"));
                s.setJumlah_kabel_LCD(rs.getInt("jumlahkabellcd"));
                s.setJumlah_kabel_LCD_baik(rs.getInt("jumlahkabellcdbaik"));
                s.setJumlah_posisi_kabel_LCD(rs.getString("jumlahposisikabellcd"));
                s.setJumlah_lampu(rs.getInt("jumlahlampu"));
                s.setJumlah_lampu_baik(rs.getInt("jumlahlampubaik"));
                s.setJumlah_posisi_lampu(rs.getString("jumlahposisilampu"));
                s.setJumlah_kipas_angin(rs.getInt("jumlahkipas"));
                s.setJumlah_kipas_angin_baik(rs.getInt("jumlahkipasbaik"));
                s.setJumlah_posisi_kipas_angin(rs.getString("jumlahposisikipas"));
//                s.setJumlah_AC(rs.getInt("jumlahac"));
//                s.setKondisi_AC(rs.getString("kondisiac"));
//                s.setPosisi_AC(rs.getString("posisiac"));
                s.setSSID(rs.getString("pilihSSID"));
                s.setBandwidth(rs.getString("inputbandwitch"));
                s.setJumlah_CCTV(rs.getInt("jumlahcctv"));
                s.setJumlah_CCTV_baik(rs.getInt("jumlahcctvbaik"));
                s.setJumlah_posisi_CCTV(rs.getString("jumlahposisicctv"));
                s.setKondisi_lantai(rs.getString("kondisilantai"));
                s.setKondisi_dinding(rs.getString("kondisidinding"));
                s.setKondisi_atap(rs.getString("kondisiatap"));
                s.setSirkulasi_udara(rs.getString("sirkulasiudara"));
                s.setPencahayaan(rs.getInt("pencahayaan"));
                s.setKelembapan(rs.getInt("kelembapan"));
                s.setSuhu(rs.getInt("suhu"));
                s.setKebisingan(rs.getString("kebisingan"));
                s.setBau(rs.getString("bau"));
                s.setKebocoran(rs.getString("kebocoran"));
                s.setKerusakan(rs.getString("kerusakan"));
                s.setKeausan(rs.getString("keausan"));
                s.setKekokohan(rs.getString("kekokohan"));
                s.setKuncipintujendela(rs.getString("kuncipintujendela"));
                s.setKondisiruang(rs.getString("kondisiruang"));
                
                
                setget.add(s); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return setget; 
    } 
 
    public int Insert(setget s) { 
        int result = 0; 
        try { 
            result = st.executeUpdate("insert into data values('" + s.getNama_ruang()
                    
                    + "','" + s.getLokasi_ruang()
                    + "','" + s.getFakultas()
                    + "','" + s.getPanjang_ruang()
                    + "','" + s.getLebar_ruang()
                    + "','" + s.getJumlah_kursi()
                    + "','" + s.getJumlah_pintu()
                    + "','" + s.getJumlah_jendela()
                    + "','" + s.getJumlah_steker()
                    + "','" + s.getJumlah_steker_baik()
                    
//                    + "','" + s.getPosisi_steker()
                    + "','" + s.getJumlah_posisi_steker()
                    + "','" + s.getJumlah_kabel_LCD()
                    + "','" + s.getJumlah_kabel_LCD_baik()
                    
//                    + "','" + s.getPosisi_kabel_LCD()
                    + "','" + s.getJumlah_posisi_kabel_LCD()
                    + "','" + s.getJumlah_lampu()
                    + "','" + s.getJumlah_lampu_baik()
                    
//                    + "','" + s.getPosisi_lampu()
                    + "','" + s.getJumlah_posisi_lampu()
                    + "','" + s.getJumlah_kipas_angin()
                    + "','" + s.getJumlah_kipas_angin_baik()
                    
//                    + "','" + s.getPosisi_kipas_angin()
                    + "','" + s.getJumlah_posisi_kipas_angin()
//                    + "','" + s.getJumlah_AC()
//                    + "','" + s.getKondisi_AC()
//                    + "','" + s.getPosisi_AC()
                    + "','" + s.getSSID()
                    + "','" + s.getBandwidth()
                    + "','" + s.getJumlah_CCTV()
                    + "','" + s.getJumlah_CCTV_baik()
                    
//                    + "','" + s.getPosisi_CCTV()
                    + "','" + s.getJumlah_posisi_CCTV()
                    + "','" + s.getKondisi_lantai()
                    + "','" + s.getKondisi_dinding()
                    + "','" + s.getKondisi_atap()
                    + "','" + s.getSirkulasi_udara()
                    + "','" + s.getPencahayaan()
                    + "','" + s.getKelembapan()
                    + "','" + s.getSuhu()
                    + "','" + s.getKebisingan()
                    + "','" + s.getBau()
                    + "','" + s.getKebocoran()
                    + "','" + s.getKerusakan()
                    + "','" + s.getKeausan()
                    + "','" + s.getKekokohan()
                    + "','" + s.getKuncipintujendela()
                    + "','" + s.getKondisiruang()+"')") ;
        
        
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return result; 
    }
    public int Delete(setget s) { 
        int result = 0; 
        try { 
            result = st.executeUpdate("delete from data where nama='" + s.getNama_ruang()+ "'"); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return result; 
    } 
 
    /*public int Update(setget s) {
    int result = 0;
    try {
    result = st.executeUpdate("update data set namaruang='"
    + s.getNama_ruang()+ "',lokasi='" + s.getLokasi_ruang()
    + "',fakultas='" +s.getFakultas()+ "',email='" +
    s.getEmail()+ "' where nim='" + s.getNim() + "'");
    } catch (Exception e) {
    e.printStackTrace();
    }
    return result;
    }*/ 
 
    public void closeConnection() { 
        try { 
            conn.close(); 
            st.close(); 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
    

