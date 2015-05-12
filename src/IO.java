

import java.util.Scanner;
public abstract class IO extends supersuperclass {
    Scanner in = new Scanner(System.in);
    setget d;
    int i;
    int r;
    int LCD=0;
    int AC=0;
    int lampu=0; 
    int kipas=0;
    int steker=0;
    int CCTV=0;
    
    
    public void input_kondisi_ruang_kelas(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela) {
		super.input_identitas_ruang_kelas();
                System.out.println("masukan panjang");
		panjang_ruang = in.nextInt();
		System.out.println("masukan lebar");
		lebar_ruang = in.nextInt();
		System.out.println("masukan jumlah kursi");
		jumlah_kursi = in.nextInt();
		System.out.println("masukan jumlah pintu");
		pintu = in.nextInt();
		System.out.println("masukan jumlah jendela");
		jendela = in.nextInt();
	}
    
    void setdata(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela){
    setdata(panjang_ruang, lebar_ruang, jumlah_kursi, pintu, jendela);
    }
    public void kondisi_dan_posisi_sarana(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
                String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
                String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
           
                                            
                int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV) {
		System.out.println("masukan jumlah steker atau stop kontak");
		jumlah_steker = in.nextInt();
                for(i=0;i<d.getJumlah_steker();i++){
                    r=i+1;
                    System.out.println("Kondisi steker baik/buruk ke  : "+r);
                    kondisi_steker = in.next();
                    if (d.getKondisi_steker().equalsIgnoreCase("baik")){
                        steker++;
                    }
                }
                
		System.out.println("posisi steker \n1. Di pojok Ruang dan di dekat dosen n\2. Di pojok ruang n\3. dekat dosen  ");
		posisi_steker = in.next();
		System.out.println("input jumlah kabel LCD");
		jumlah_kabel_LCD = in.nextInt();
                
                for(i=0;i>d.getJumlah_kabel_LCD();i++){
                    r=i+1;
		System.out.println("kondisi kabel LCD baik/ buruk");
		d.setKondisi_kabel_LCD(in.next());
                if (d.getKondisi_steker().equalsIgnoreCase("baik")){
                        LCD++;
                    }
                }
		System.out.println("posisi kabel LCD n\1. dekat dosen n\2. tidak dekat dosen");
		System.out.println("jumlah lampu");
		jumlah_lampu = in.nextInt();
                for(i=0;i>d.getJumlah_lampu();i++){
                    r=i+1;
		System.out.println("kondisi lampu baik/buruk");
		kondisi_lampu = in.next();
                if (d.getKondisi_lampu().equalsIgnoreCase("baik")){
                        lampu++;
                    }
                }
                System.out.println("posisi :n\1. atap ruang n\2. bukan di atap ruang");
                posisi_lampu = in.next();
		System.out.println("jumlah kipas angin");
		jumlah_kipas_angin=in.nextInt();
                for(i=0;i>d.getJumlah_kipas_angin();i++){
                    r=i+1;
		System.out.println("kondisi kipas angin ");
		kondisi_kipas_angin = in.next();
		if(d.getKondisi_kipas_angin().equalsIgnoreCase("baik")){
                    kipas++;
                }
                }
                System.out.println("posisi kipas n\1. atap ruang n\2. bukan atap ruang ");
                posisi_kipas_angin = in.next();
		System.out.println("jumlah AC");
		jumlah_AC = in.nextInt();
                for(i=0;i>d.getJumlah_AC();i++){
                    r=i+1;
		System.out.println("kondisi AC");
		kondisi_AC = in.next();
                if(d.getKondisi_AC().equalsIgnoreCase("baik")){
                    AC++;
                }}
		System.out.println("posisi AC n\1. dibelakang atau di samping n/2. bukan dibelakang ataupun bukan disamping");
		posisi_AC = in.next();
		System.out.println("pilih SSID");
		SSID = in.next();
		System.out.println("bandwidth");
		bandwidth = in.next();
		System.out.println("jumlah cctv");
		jumlah_CCTV = in.nextInt();
                 for(i=0;i>d.getJumlah_CCTV();i++){
                    r=i+1;
		System.out.println("kondisi baik cctv");
		kondisi_CCTV = in.next();
                if(d.getKondisi_CCTV().equalsIgnoreCase("baik")){
                    CCTV++;
                }
                }
                System.out.println("posisi cctv n\1. depan dan belakang n\2.belakang n\3. depan n\4. bukan depan dan belakang");
		kondisi_CCTV=in.next();
		
    }
    void setdata(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV){
            setdata(jumlah_steker, kondisi_steker, posisi_steker, jumlah_kabel_LCD, kondisi_kabel_LCD, posisi_kabel_LCD, jumlah_lampu, kondisi_lampu, posisi_lampu, jumlah_kipas_angin, kondisi_kipas_angin, posisi_kipas_angin, jumlah_AC, kondisi_AC, posisi_AC, SSID, bandwidth, jumlah_CCTV, kondisi_CCTV, posisi_CCTV);
            }
    public void input_lingkungan_ruang_kelas(String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela) {
		super.input_identitas_ruang_kelas();
                System.out.println("kondisi lantai");
		kondisi_lantai = in.next();
		System.out.println("kondisi dinding");
		kondisi_dinding = in.next();
		System.out.println("kondisi atap");
		kondisi_atap = in.next();
		System.out.println("kondisi pintu");
		kondisi_pintu = in.next();
		System.out.println("kondisi jendela");
		kondisi_jendela = in.next();
	}
    
    void setdata(String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela){
    setdata(kondisi_lantai, kondisi_dinding, kondisi_atap, kondisi_pintu, kondisi_jendela);
    }
    public void kebersihan_ruang_kelas(String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu) {
		super.input_identitas_ruang_kelas();
                System.out.println("masukan sirkulasi udara");
		sirkulasi_udara = in.nextLine();
		System.out.println("masukan nilai pencahaan");
		pencahayaan = in.nextInt();
		System.out.println("masukan kelembapan");
		kelembapan = in.nextInt();
		System.out.println("Masukan suhu Celcius");
		suhu = in.nextInt();
	}
    
    void setdata (String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu){
    setdata(sirkulasi_udara, pencahayaan, kelembapan, suhu);  
    }
    public void kenyamanan_ruang_kelas(int kebisingan, String bau, String kebocoran, String kerusakan, String keausan) {
		super.input_identitas_ruang_kelas();
                System.out.println("masukan kebisingan");
		kebisingan = in.nextInt();
		System.out.println("masukan bau");
		bau = in.nextLine();
		System.out.println("masukan kebocoran");
		kebocoran = in.nextLine();
		System.out.println("masukan kerusakan");
		kerusakan = in.nextLine();
		System.out.println("masukan keausan");
		keausan = in.nextLine();
	}
    
    
   
    void setdata (int kebisingan, String bau, String kebocoran, String kerusakan, String keausan){
    setdata(kebisingan, bau, kebocoran, kerusakan, keausan);
    }
    public void keamanan_ruang(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya) {
		super.input_identitas_ruang_kelas();
                System.out.println("input kekokohan");
		kekokohan=in.next();
		System.out.println("jumlah kunci pintu");
		jumlah_kunci=in.nextInt();
		System.out.println("jumlah jendela");
		jumlah_jendela= in.nextInt();
		System.out.println("bahaya atau aman ?");
                bahaya = in.next();
	}
    void setdata(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya){
    setdata(kekokohan, jumlah_kunci, jumlah_jendela, bahaya);
            }
    
    
    public void tampil (){
            
            System.out.println("ruang : "+d.getNama_ruang());
            System.out.println("lokasi : "+d.getLokasi_ruang());
            System.out.println("fakultas : "+d.getFakultas());
            
            System.out.println("jumlah kursi di dalam ruang : "+d.getJumlah_kursi());
           
            System.out.println("jumlah pintu : "+d.getJumlah_pintu());
            System.out.println("jumlah jendela :"+d.getJumlah_jendela());
        
        }
    public setget getruang(){
            return d;
        }
    
}
