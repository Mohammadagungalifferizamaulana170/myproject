
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satelllite
 */
public abstract class supersuperclass extends setget{
    
  Scanner in = new Scanner(System.in);
    
     void input_identitas_ruang_kelas() {
		System.out.println("input ruang kelas");
                String Nama_ruang = in.next();
		System.out.println("input lokasi ruang kelas");
                String lokasi_ruang=in.next();
		System.out.println("pilih fakultas");
		String fakultas=in.next();
    }
    
   /* @Override
    void setdata (String nama_ruang, String lokasi_ruang, String fakultas){
    super.setdata(nama_ruang, lokasi_ruang, fakultas);
    }*/
    
}
