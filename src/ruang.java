/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.reflect.Array.set;
import java.util.Scanner;

/**
 *
 * @author Satelllite
 */
public abstract class ruang {
        int i;
        int r;
        int LCD=0;
        int AC=0;
        int lampu=0; 
        int kipas=0;
        int steker=0; 
        int CCTV=0;
        int hasil;
        String hasil1;
        
        
    Scanner in= new Scanner(System.in);
    private String nama_ruang;
    private String lokasi_ruang;
    private String fakultas;

    public String getNama_ruang() {
        return nama_ruang;
    }

    public void setNama_ruang(String nama_ruang) {
        this.nama_ruang = nama_ruang;
    }

    public String getLokasi_ruang() {
        return lokasi_ruang;
    }

    public void setLokasi_ruang(String lokasi_ruang) {
        this.lokasi_ruang = lokasi_ruang;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
   public void identitas_rk(){            
                System.out.println("input ruang kelas");
		setNama_ruang(in.next());
		System.out.println("input lokasi ruang kelas");
		setLokasi_ruang(in.next());
		System.out.println("pilih fakultas");
		setFakultas(in.next());
    }
    
    
    //abstract public void identitas_rk();
    abstract public void kondisi_rk();
    abstract public void j_k_p_sarana();
    abstract public void lingkungan_rk();
    abstract public void kebersihan_rk();
    abstract public void kenyamanan_rk();
    abstract public void keamanan_rk();
    
}

    
