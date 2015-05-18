/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
import java.util.Scanner;

public abstract class control extends IO implements out {
    
   
    setget ru = new setget() {};
    Scanner in = new Scanner(System.in);
    
    int i;
    int r;
    int LCD=0;
    int AC=0;
    int lampu=0; 
    int kipas=0;
    int steker=0;
    int CCTV=0;
    String [] hasil = new String [30];
   
    public  void analisis_hitung_ruang (){
    }
    double hitung_luas_ruang() {
		return ru.getPanjang_ruang() * ru.getLebar_ruang();
	}

	public String hitung_bentuk_ruang() {
		String bentuk = "persegi panjang";
		if (ru.getPanjang_ruang() != ru.getLebar_ruang()) {
			System.out.println(bentuk);
			if (bentuk == "persegi panjang") {
				hasil[0]="sesuai";
			}
		} else {
			hasil[0]="bentuk tidak sesuai";
		}
            return hasil[0];
	}

	public double hitung_rasio_luas() {
		double hsl;
		hsl = hitung_luas_ruang() / ru.getJumlah_kursi();
		if (hsl >= 0.5) {
			hasil[1] = "sesuai";
		} else {
			hasil[1] = "bentuk tidak sesuai";
			
		}
		return hsl;
	}

	public String analisis_pintu_dan_jendela() {
          
		if (ru.getJumlah_pintu() >= 2 && ru.getJumlah_jendela() >= 1) {
			hasil[2]="sesuai";
		} else {
			hasil[2]="tidak sesuai";
		}
            return hasil[2] ;
	}
      public String analisis_kelistrikan() {
            if (ru.getPosisi_steker().equalsIgnoreCase("1") && ru.getJumlah_steker() >=4 && steker ==4){
                hasil[3]="sesuai";
            }else{
                hasil[3]="tidak sesuai";
            }return hasil[3];
            
	}

	public String analisis_LCD() {
	if (ru.getPosisi_kabel_LCD().equalsIgnoreCase("1") && ru.getJumlah_steker() >=1 && LCD==1){
                hasil[4]="sesuai";
            }else{
                hasil[4]="tidak sesuai";
            }return hasil[4];
	}
	public String analisis_lampu() {
        if (ru.getPosisi_lampu().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=18 && lampu==18){
                hasil[5]="sesuai";
            }else{
                hasil[5]="tidak sesuai";
            }return hasil[5];
            
	}

	public String analisis_kipas_angin() {
	if (ru.getPosisi_kipas_angin().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=2 && kipas==2){
                hasil[6]="sesuai";
            }else{
                hasil[6]="tidak sesuai";
            }return hasil[6];
	}

	public String analisis_AC() {
	if (ru.getPosisi_kipas_angin().equalsIgnoreCase("1") && ru.getJumlah_lampu()>=2 && kipas==2){
                hasil[7]="sesuai";
            }else{
                hasil[7]="tidak sesuai";
            }
        return hasil[7];
	}

	public String analisis_internet() {
            
		if (ru.getSSID() == "UMM Hotspot") {
			hasil[8]="sesuai";
			if (ru.getBandwidth() == "bisa") {
				hasil[8]="sesuai";
			}
		} else {
			hasil[8]="tidak sesuai";
		}return hasil[8];

	}

	public String analisis_CCTV() {
	if (ru.getPosisi_CCTV().equalsIgnoreCase("1") && ru.getJumlah_CCTV()>=2 && CCTV==2){
                hasil[9]="sesuai";
            }else{
                hasil[9]="tidak sesuai";
            }
        return hasil[9];

	}

	public String analisis_kebersihan() {
		if (ru.getKondisi_lantai() == "bersih"
				&& ru.getKondisi_dinding() == "bersih"
				&& ru.getKondisi_atap() == "bersih"
				&& ru.getKondisi_pintu() == "baik"
				&& ru.getKondisi_jendela() == "bersih") {
			hasil[10]="sesuai";
		} else {
			hasil[10]="tidak sesuai";
		}return hasil[10];
	}
        public String analisis_sirkulasi_udara() {
		if ("lancar".equals(ru.getSirkulasi_udara())) {
			hasil[11]="Sesuai";
		} else {
			hasil[11]="tidak sesuai";
		}return hasil[11];
	}

	public String analisis_Pencahayaan() {
		if ((ru.getPencahayaan() >= 250) && ru.getPencahayaan() <= 350) {
			hasil[12]="sesuai";
		} else {
			hasil[12]="tidak sesuai";
		}return hasil[12];
	}

	public String analisis_Kelembapan() {
		if ((ru.getKelembapan() >= 70) && ru.getKelembapan() <= 80) {
			hasil[13]="Sesuai";
		} else {
			hasil[13]="tidak sesuai";
		}return hasil[13];
	}

	public String analisis_Suhu() {
		if ((ru.getSuhu() >= 25) && ru.getSuhu() <= 35) {
			hasil[14]="sesuai";
		} else {
			hasil[14]="tidak sesuai";
		}
                return hasil[14];
	}
        public String analisis_kebisingan() {
		if ("tidak bising".equals(ru.getKebisingan())) {
			hasil[15]="Sesuai";
		} else {
			hasil[15]="tidak sesuai";
		}return hasil[15];
	}

	public String analisis_bau() {
		if ("tidak bau".equals(ru.getBau())) {
			hasil[16]="Sesuai";
		} else {
			hasil[16]="tidak sesuai";
		}return hasil[16];
	}

	public String analisis_kebocoran() {
		if ("tidak bocor".equals(ru.getKebocoran())) {
			hasil[17]="Sesuai";
	} else {  		
			hasil[17]="tidak sesuai";
		}return hasil[17];
	}

	public String analisis_kerusakan() {
		if ("tidak rusak".equals(ru.getKerusakan())) {
			hasil[18]="sesuai";
		} else {
			hasil[18]="tidak sesuai";
		}return hasil[18];
	}

	public String analisis_keausan() {
		if ("tidak aus".equals(ru.getKeausan())) {
			hasil[19]="Sesuai";
		} else {
			hasil[19]="tidak sesuai";
		}return hasil[19];
	}

	
	public String analisis_kekokohan() {
		if (ru.getKekokohan() == "kokoh") {
			hasil[20]="Sesuai";
		} else {
			hasil[20]="tidak sesuai";
		}
                return hasil[20];
	}

	public String analisis_kunci_pintu_jendela() {
		if (ru.getJumlah_kunci() != 0 && ru.getJumlah_jendela() != 0) {
			hasil[21]="Sesuai";
		} else {
			hasil[21]="tidak sesuai";
		}
                return hasil[21];
	}

	public String analisis_keamanan_ruang() {
		if (ru.getBahaya() == "aman") {
			hasil[22]="sesuai";
		}else{
                    hasil[22]="tidak sesuai";
                }
                return hasil[22];
	}


        
}

  
 
  
  



    

