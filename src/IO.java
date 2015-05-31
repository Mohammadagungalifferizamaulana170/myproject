/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
import java.util.Scanner;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class IO extends supersuperclass implements out {

    Scanner in = new Scanner(System.in);
    setget ini = new setget();
    setget a;
    String[] hasil = new String[30];
//tess
    public setget getsetget() {
        return a;
    }

    int i;
    int r;
    int LCD = 0;
    int AC = 0;
    int lampu = 0;
    int kipas = 0;
    int steker = 0;
    int CCTV = 0;
    
    public IO(JTextField nama,JTextField lokasi,JTextField fakultas,JTextField jurusan){
        ini.setNama_ruang(nama.getText());
        ini.setLokasi_ruang(lokasi.getText());
        ini.setFakultas(fakultas.getText());
        
        a = new setget(ini.getNama_ruang(),ini.getLokasi_ruang(),ini.getFakultas()); 
    }
    public IO(JTextField panjang,JTextField lebar,JTextField kursi,JTextField pintu,JTextField jendela){
        ini.setPanjang_ruang(Integer.parseInt(panjang.getText()));
        ini.setLebar_ruang(Integer.parseInt(lebar.getText()));
        ini.setJumlah_pintu(Integer.parseInt(pintu.getText()));
        ini.setJumlah_kursi(Integer.parseInt(kursi.getText()));
        ini.setJumlah_jendela(Integer.parseInt(jendela.getText()));
        System.out.println(""+ini.getPanjang_ruang());
        a = new setget(ini.getPanjang_ruang(),ini.getLebar_ruang(),ini.getJumlah_kursi(),ini.getJumlah_pintu(),ini.getJumlah_jendela()); 
    }
    public IO(JCheckBox Kokoh,JCheckBox TKokoh,JCheckBox Adakunci,JCheckBox Tkunci,JCheckBox Aman,JCheckBox Bahaya){
        if(Kokoh.isSelected()){
            ini.setKekokohan("Kokoh");
        }
        else if(TKokoh.isSelected()){
            ini.setKekokohan("Rapuh");
        }
        if(Adakunci.isSelected()){
            ini.setKondisi_pintu("Terkunci");
        }
        else if(Tkunci.isSelected()){
            ini.setKondisi_pintu("Terbuka");
        }
        if(Aman.isSelected()){
            ini.setBahaya("Aman");
        }
        else if(Bahaya.isSelected()){
            ini.setBahaya("Berbahaya");
        }
        rk = new RuangKelas(kls.getKekokohan(),kls.getKunciPintuJendela(),kls.getBahaya()); 
    
    }
    public IO(JTextField Bising,JTextField PBising,JTextField Bau,JTextField PBau,JTextField Aus,JTextField PAus,JCheckBox BBanyak,JCheckBox BSedang,JCheckBox BSedikit,JCheckBox BNon,JCheckBox RBanyak,JCheckBox RSedang,JCheckBox RSedikit,JCheckBox RNon){
        if(BBanyak.isSelected()){
            kls.setKebocoran("Sangat Parah");
        }
        else if(BSedang.isSelected()){
            kls.setKebocoran("Parah");
        }
        else if(BSedikit.isSelected()){
            kls.setKebocoran("Tidak Begitu Parah");
        }
        else if(BNon.isSelected()){
            kls.setKebocoran("Keadaan Baik");
        }
            if(RBanyak.isSelected()){
                kls.setKerusakan("Sangat Parah");
            }
            else if(RSedang.isSelected()){
                kls.setKerusakan("Parah");
            }
            else if(RSedikit.isSelected()){
                kls.setKerusakan("Tidak Begitu Parah");
            }
            else if(RNon.isSelected()){
                kls.setKerusakan("Keadaan Baik");
            }
        kls.setKebisingan(Bising.getText());
        kls.setKeausan(Aus.getText());
        kls.setBau(Bau.getText());
        //String Kebisingan, String Bau, String Kebocoran, String Kerusakan, String Keausan, String x
        rk = new RuangKelas(kls.getKebisingan(),kls.getBau(),kls.getKebocoran(),kls.getKerusakan(),kls.getKeausan(),null); 
    }         
    public IO(){
        
    }
    public RuangKelas getRuangKelas(){
    return rk;
    }
    
    @Override
    public void input_identitas_ruang_kelas() {
        System.out.println("input ruang kelas");
        ini.setNama_ruang(in.nextLine());
        System.out.println("input lokasi ruang kelas");
        ini.setLokasi_ruang(in.nextLine());
        System.out.println("pilih fakultas");
        ini.setFakultas(in.nextLine());

    }

    @Override
    public void input_kondisi_ruang_kelas() {

        System.out.println("masukan panjang");
        ini.setPanjang_ruang(in.nextInt());
        System.out.println("masukan lebar");
        ini.setLebar_ruang(in.nextInt());
        System.out.println("masukan jumlah kursi");
        ini.setJumlah_kursi(in.nextInt());
        System.out.println("masukan jumlah pintu");
        ini.setJumlah_pintu(in.nextInt());
        System.out.println("masukan jumlah jendela");
        ini.setJumlah_jendela(in.nextInt());
        a = new setget(ini.getPanjang_ruang(), ini.getLebar_ruang(), ini.getJumlah_kursi(), ini.getJumlah_pintu(), ini.getJumlah_jendela());

    }

    @Override
    public void kondisi_dan_posisi_sarana() {
        System.out.println("masukan jumlah steker atau stop kontak");
        ini.setJumlah_steker(in.nextInt());
        System.out.println("Kondisi steker baik/buruk ke  : ");
        ini.setKondisi_steker(in.next());
        System.out.println("posisi steker \n1. Di pojok Ruang dan di dekat dosen n\2. Di pojok ruang n\3. dekat dosen  ");
        ini.setPosisi_steker(in.next());
        System.out.println("input jumlah kabel LCD");
        ini.setJumlah_kabel_LCD(in.nextInt());
        System.out.println("kondisi kabel LCD baik/ buruk");
        ini.setKondisi_kabel_LCD(in.next());
        System.out.println("posisi kabel LCD n\1. dekat dosen n\2. tidak dekat dosen");
        System.out.println("jumlah lampu");
        ini.setJumlah_lampu(in.nextInt());
        System.out.println("kondisi lampu baik/buruk");
        System.out.println("posisi :n\1. atap ruang n\2. bukan di atap ruang");
        ini.setPosisi_lampu(in.next());
        System.out.println("jumlah kipas angin");
        ini.setJumlah_kipas_angin(in.nextInt());
        System.out.println("kondisi kipas angin ");
        ini.setKondisi_kipas_angin(in.next());
        System.out.println("posisi kipas n\1. atap ruang n\2. bukan atap ruang ");
        ini.setPosisi_kipas_angin(in.next());
        System.out.println("jumlah AC");
        ini.setJumlah_AC(in.nextInt());
        System.out.println("kondisi AC");
        ini.setKondisi_AC(in.next());
        System.out.println("posisi AC n\1. dibelakang atau di samping n/2. bukan dibelakang ataupun bukan disamping");
        ini.setPosisi_AC(in.next());
        System.out.println("pilih SSID");
        ini.setSSID(in.next());
        System.out.println("bandwidth");
        ini.setBandwidth(in.next());;
        System.out.println("jumlah cctv");
        ini.setJumlah_CCTV(in.nextInt());
        System.out.println("kondisi baik cctv");
        ini.setKondisi_CCTV(in.next());
        System.out.println("posisi cctv n\1. depan dan belakang n\2.belakang n\3. depan n\4. bukan depan dan belakang");
        ini.setPosisi_CCTV(in.next());

    }

    @Override
    public void input_lingkungan_ruang_kelas() {

        System.out.println("kondisi lantai");
        ini.setKondisi_lantai(in.next());
        System.out.println("kondisi dinding");
        ini.setKondisi_dinding(in.next());
        System.out.println("kondisi atap");
        ini.setKondisi_atap(in.next());
        System.out.println("kondisi pintu");
        ini.setKondisi_pintu(in.next());
        System.out.println("kondisi jendela");
        ini.setKondisi_jendela(in.next());
        a = new setget(ini.getKondisi_lantai(), ini.getKondisi_dinding(), ini.getKondisi_atap(), ini.getKondisi_pintu(), ini.getKondisi_jendela());
    }

    @Override
    public void kebersihan_ruang_kelas() {

        System.out.println("masukan sirkulasi udara");
        ini.setSirkulasi_udara(in.nextLine());
        System.out.println("masukan nilai pencahaan");
        ini.setPencahayaan(in.nextInt());
        System.out.println("masukan kelembapan");
        ini.setKelembapan(in.nextInt());
        System.out.println("Masukan suhu Celcius");
        ini.setSuhu(in.nextInt());
        a = new setget(ini.getSirkulasi_udara(), ini.getPencahayaan(), ini.getKelembapan(), ini.getSuhu());
    }

    @Override
    public void kenyamanan_ruang_kelas() {

        System.out.println("masukan kebisingan");
        ini.setKebisingan(in.nextInt());
        System.out.println("masukan bau");
        ini.setBau(in.nextLine());
        System.out.println("masukan kebocoran");
        ini.setKebocoran(in.nextLine());
        System.out.println("masukan kerusakan");
        ini.setKerusakan(in.nextLine());
        System.out.println("masukan keausan");
        ini.setKeausan(in.nextLine());
        a = new setget(ini.getKebisingan(), ini.getBau(), ini.getKebocoran(), ini.getKerusakan(), ini.getKeausan());
    }

    @Override
    public void keamanan_ruang() {

        System.out.println("input kekokohan");
        ini.setKekokohan(in.next());
        System.out.println("jumlah kunci pintu");
        ini.setJumlah_kunci(in.nextInt());
        System.out.println("jumlah jendela");
        ini.setJumlah_jendela(in.nextInt());
        System.out.println("bahaya atau aman ?");
        ini.setBahaya(in.next());
        a = new setget(ini.getKekokohan(), ini.getJumlah_kunci(), ini.getJumlah_jendela(), ini.getBahaya());

    }
    
    @Override
    public void setget(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela){
        System.out.println("Panjang Ruang Anda :"+panjang_ruang);
        System.out.println("Lebar Ruang Anda :"+lebar_ruang);
        System.out.println("Jumlah Kursi Anda :"+jumlah_kursi);
        System.out.println("Jumlah Pintu Anda :"+pintu);
        System.out.println("Jumlah Jendela Anda :"+jendela);
    }
    @Override
    public void setget(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV){
        System.out.println("Jumlah Steker Ruang :"+jumlah_steker);
        System.out.println("Kondisi Steker Ruang :"+kondisi_steker);
        System.out.println("Posisi Steker Ruang :"+posisi_steker);
        System.out.println("Jumlah Kabel LCD Ruang :"+jumlah_kabel_LCD);
        System.out.println("Kondisi Kabel LCD Ruang :"+kondisi_kabel_LCD);
        System.out.println("Posisi Kabel LCD Ruang :"+posisi_kabel_LCD);
        System.out.println("Jumlah Lampu Ruang :"+jumlah_lampu);
        System.out.println("Kondisi Lampu Ruang :"+kondisi_lampu);
        System.out.println("Posisi Lampu Ruang :"+posisi_lampu);
        System.out.println("Jumlah Kipas Angin Ruang :"+jumlah_kipas_angin);
        System.out.println("Kondisi Kipas Angin Ruang :"+kondisi_kipas_angin);
        System.out.println("Posisi Kipas Angin Ruang :"+posisi_kipas_angin);
        System.out.println("Jumlah AC Ruang :"+jumlah_AC);
        System.out.println("Kondisi AC Ruang :"+kondisi_AC);
        System.out.println("Posisi AC Ruang :"+posisi_AC);
        System.out.println("Ruang Konek SSID :"+SSID);
        System.out.println("Ruang Konek WIFI :"+bandwidth);
        System.out.println("Jumlah CCTV Ruang :"+jumlah_CCTV);
        System.out.println("Kondisi CCTV Ruang :"+kondisi_CCTV);
        System.out.println("Posisi CCTV Ruang :"+posisi_CCTV);
    }
    
    @Override
    public void setget (String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela){
        System.out.println("Kondisi Lantai Ruang :"+kondisi_lantai);
        System.out.println("Kondisi Dinding Ruang :"+kondisi_dinding);
        System.out.println("Kondisi Atap Ruang :"+kondisi_atap);
        System.out.println("Kodisi Pintu Ruang :"+kondisi_pintu);
        System.out.println("Kondisi Jendela Ruang :"+kondisi_jendela);
        
    }
    @Override
    public void setget (String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu){
        System.out.println("Sirkulasi Udara Ruang :"+sirkulasi_udara);
        System.out.println("Pencahayaan Ruang :"+pencahayaan);
        System.out.println("Kelembapan Ruang :"+kelembapan);
        System.out.println("Suhu Ruang :"+suhu);
    }
    @Override
    public void setget(int kebisingan, String bau, String kebocoran, String kerusakan, String keausan){
        System.out.println("Kebisingan Ruang :"+kebisingan);
        System.out.println("Bau Ruang :"+bau);
        System.out.println("Kebocoran Ruang :"+kebocoran);
        System.out.println("Kerusakan Ruang :"+kerusakan);
        System.out.println("Keausan Ruang :"+keausan);
        
    }
    @Override
    public void setget(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya){
        System.out.println("Kekokohan Ruang :"+kekokohan);
        System.out.println("Jumlah Kunci Ruang :"+jumlah_kunci);
        System.out.println("Jumlah Jendela Ruang :"+jumlah_jendela);
        System.out.println("Bahaya Ruang :"+bahaya);
    }
    /*@Override
    public void hasil() {
        System.out.println("Hasil Analisis Ruang :" + hasil[0]);
        System.out.println("Hasil Analisis Rasio Luas :" + hasil[1]);
        System.out.println("Hasil Analisis Pintu dan Jendela :" + hasil[2]); 
        System.out.println("Hasil Analisis Kelistrikan :" + hasil[3]);
        System.out.println("Hasil Analisis LCD :" + hasil[4]);
        System.out.println("Hasil Analisis Lampu :" + hasil[5]);
        System.out.println("Hasil Analisis Kipas Angin :" + hasil[6]);
        System.out.println("Hasil Analisis AC :" + hasil[7]);
        System.out.println("Hasil Analisis Internet :" + hasil[8]);
        System.out.println("Hasil Analisis CCTV :" + hasil[9]);
        System.out.println("Hasil Analisis Kebersihan :" + hasil[10]);
        System.out.println("Hasil Analisis Sirkulasi Udara :" + hasil[11]);
        System.out.println("Hasil Analisis Pencahayaan :" + hasil[12]);
        System.out.println("Hasil Analisis Kelembapan :" + hasil[13]);
        System.out.println("Hasil Analisis Suhu :" + hasil[14]);
        System.out.println("Hasil Analisis Kebisingan :" + hasil[15]);
        System.out.println("Hasil Analisis Bau :" + hasil[16]);
        System.out.println("Hasil Analisis Kebocoran :" + hasil[17]);
        System.out.println("Hasil Analisis Kerusakan :" + hasil[18]);
        System.out.println("Hasil Analisis Keausan :" + hasil[19]);
        System.out.println("Hasil Analisis Kekokohan :" + hasil[20]);
        System.out.println("Hasil Analisis Kunci Pintu dan Jendela :" + hasil[21]);
        System.out.println("Hasil Analisis Keamanan Ruang :" + hasil[22]);
    }
    

    @Override
    public void tes() {
        System.out.println("ruang : " + ini.getNama_ruang());
        System.out.println("lokasi : " + ini.getLokasi_ruang());
        System.out.println("fakultas : " + ini.getFakultas());

        System.out.println("jumlah kursi di dalam ruang : " + ini.getJumlah_kursi());

        System.out.println("jumlah pintu : " + ini.getJumlah_pintu());
        System.out.println("jumlah jendela :" + ini.getJumlah_jendela());

    }*/

    public setget getruang() {
        return a;
    }

    @Override
    void persentaseKondisiRuang() {
     }

    @Override
    void persentaseKondisiSarana() {
    }

    @Override
    void persentaseKondisiLingkungan() {
      }

    @Override
    void persentaseKondisiKebersihan() {
     }

    @Override
    void persentaseKenyamanan() {
        }

    @Override
    void persentaseKeamanan() {
     }

    void hasil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   }




