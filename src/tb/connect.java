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
                s.setJumlah_kursi(rs.getInt("jumlahjendela"));
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
            result = st.executeUpdate("insert into student values('" + s.getNama_ruang()+ "','" + s.getLokasi_ruang()+ "','" + s.getFakultas()+ "','" + s.getPanjang_ruang()+ "','" + s.getLebar_ruang()+ "','" + s.getJumlah_kursi()+ "','" + s.getJumlah_pintu()+ "','" + s.getJumlah_jendela()+ "')"); 
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
    

