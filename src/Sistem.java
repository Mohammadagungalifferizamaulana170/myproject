/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


public class Sistem extends supersuperclass{

    IO a = new IO();
    setget ini = new setget();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
    private double Luas, RasioLuas;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double Luas) {
        this.Luas = Luas;
    }

    public double getRasioLuas() {
        return RasioLuas;
    }

    public void setRasioLuas(double RasioLuas) {
        this.RasioLuas = RasioLuas;
    }

    double HitungLuas() {
        Luas = ini.getPanjang_ruang()* ini.getLebar_ruang();
        return Luas;
    }

    double HitungRasioLuas() {
        RasioLuas = Luas / ini.getJumlah_kursi();
        return RasioLuas;
    }

    double CheckKondisiRuang() {
        a.input_kondisi_ruang_kelas();
        ini = a.getruang();
        Luas = ini.getPanjang_ruang()* ini.getLebar_ruang();
        if (ini.getLebar_ruang()== ini.getPanjang_ruang()) {
            System.out.println("Luas = "+Luas);
            System.out.println("Luas Tidak s");
            ts++;
        } else {
            System.out.println("Luas = "+Luas);
            System.out.println("Luas s");
            s++;
        }
        RasioLuas = Luas / ini.getJumlah_kursi();
        System.out.println("Rasio : " + RasioLuas);
        if(RasioLuas<=0.5){
            System.out.println("Rasio Tidak s");
        }
        else{
            System.out.println("Rasio s");
            s++;
        }
        if (ini.getJumlah_pintu()>= 2) {
            System.out.println("Jumlah Pintu s");
            s++;
        } else {
            System.out.println("Jumlah Pintu Tidak s");
            ts++;
        }
        if (ini.getJumlah_jendela()>= 1) {
            System.out.println("Jumlah Jendela s");
            s++;
        } else {
            System.out.println("Jumlah Jendela Tidak s");
            ts++;
        }
        a.hasil();
        

        return s;
    }
    @Override
   void persentaseKondisiRuang(){
       int total = s*25;
        System.out.println("persentase KOndisi Ruang : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiSarana::");
       
    }

    double CheckKondisiSarana() {
        a.kondisi_dan_posisi_sarana();
        ini = a.getruang();
        
        if (ini.getJumlah_steker()>= 4) {
            System.out.println("Jumlah Stop Kontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesusai");
            ts++;
        }
        if (ini.getKondisi_steker().equalsIgnoreCase("baik")){
            System.out.println("KondisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (ini.getPosisi_steker().equalsIgnoreCase("DekatDosen") || ini.getPosisi_steker().equalsIgnoreCase("PojokKelas")) {
            System.out.println("PosisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getJumlah_kabel_LCD()>=1){
            System.out.println("JumlahKabelLCD : s");
            s++;

        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getKondisi_kabel_LCD().equalsIgnoreCase("baik")|| ini.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")){
            System.out.println("KondisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getPosisi_kabel_LCD().equalsIgnoreCase("dekatdosen")){
            System.out.println("PosisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getJumlah_lampu()>=18){
            System.out.println("JumlahLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getKondisi_lampu().equalsIgnoreCase("baik")){
            System.out.println("KondisiLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getPosisi_lampu().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiLampu : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getJumlah_kipas_angin()>=2){
            System.out.println("JumlahKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getPosisi_kipas_angin().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getKondisi_kipas_angin().equalsIgnoreCase("baik")){
            System.out.println("KondisiKipasAngin : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getJumlah_AC()>=1){
            System.out.println("JumlahAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getKondisi_AC().equalsIgnoreCase("baik")){
            System.out.println("KondisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            s++;
        }
        if(ini.getPosisi_AC().equalsIgnoreCase("belakang")|| ini.getPosisi_AC().equalsIgnoreCase("samping")){
            System.out.println("PosisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getSSID().equalsIgnoreCase("ummhotspot")){
            System.out.println("getSSID : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getBandwidth().equalsIgnoreCase("bisa")){
            System.out.println("Bandwidth : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (ini.getJumlah_CCTV()>=2){
            System.out.println("JumlahCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getKondisi_CCTV().equalsIgnoreCase("baik")){
            System.out.println("KondisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(ini.getPosisi_CCTV().equalsIgnoreCase("depanbelakang")){
            System.out.println("PosisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
       a.hasil();
     
        return s;
    }
    @Override
    void persentaseKondisiSarana(){
         int total = s*5;
        System.out.println("persentase KOndisi Sarana : "+total+"%");
        System.out.println("======================================");
        System.out.println("::Anda Masuk CheckKondisiLingkungan::");
       
    }
    int CheckKondisiLingkungan() {
        a.input_lingkungan_ruang_kelas();
        ini= a.getruang();
        int kon;
        if (ini.getKondisi_lantai().equalsIgnoreCase("bersih")) {
            System.out.println("getKondisiLantai : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (ini.getKondisi_dinding().equalsIgnoreCase("bersih")){
            System.out.println("KondisiDinding : s");
            s++;
        }else {
            ts++;
            System.out.println("Tidak s");
        }
        if (ini.getKondisi_atap().equalsIgnoreCase("bersih")){
            System.out.println("KondisiAtap : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if (ini.getKondisi_pintu().equalsIgnoreCase("bersih")){
            System.out.println("KondisiPintu : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if (ini.getKondisi_jendela().equalsIgnoreCase("bersih")){
            System.out.println("getKondisiJendela : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (s > ts) {
            System.out.println("Bersih");
            kon = 1;
        } else {
            System.out.println("Kotor");
            kon = 0;
        }
        return s;
    }
    @Override
    void persentaseKondisiLingkungan(){
        int total = s*20;
        System.out.println("persentase KOndisi Lingkungan : "+total+"%");
        System.out.println("::Anda Masuk CheckKondisiKebersihan::");
        
    }
    
    int CheckKondisiKebersihan() {
        int kon;
        if ("Lancar".equalsIgnoreCase(ini.getSirkulasi_udara())) {
            System.out.println("SirkulasiUdara : Lancar");
            s++;
        } else {
            System.out.println("Tidak Lancar");
            ts++;
        }
        if (ini.getPencahayaan()>= 250) {
            if (ini.getPencahayaan()<= 350) {
                System.out.println("NilaiPencahayaan : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (ini.getKelembapan()>= 70) {
            if (ini.getKelembapan() <= 80) {
                System.out.println("Kelembaban : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (ini.getSuhu() >= 25) {
            if (ini.getSuhu() <= 35) {
                System.out.println("Suhu : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s > ts) {
            kon = 1;
        } else {
            kon = 0;
        }
        return s;
    }
    @Override
    void persentaseKondisiKebersihan(){
    int total = s*25;
    System.out.println("persentase Kondisi Kebersihan : "+total+"%");
    System.out.println("::Anda Masuk CheckKondisiKenyamanan::");
    }
  
    int CheckKondisiKenyamanan() {
        int kon;
        /* if (!"s".equalsIgnoreCase(ini.getKebisingan())) {
        System.out.println("Tidak s");
        ts++;
        } else {
        System.out.println("kebisingan : s");
        s++;
        }*/
        if ("s".equalsIgnoreCase(ini.getBau())) {
            System.out.println("Bau : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(ini.getKerusakan())) {
            System.out.println("Kerusakan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(ini.getKeausan())) {
            System.out.println("Keausan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        return s;
    }
    @Override
    void persentaseKenyamanan(){
     int total = s*25;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
    System.out.println("::Anda Masuk CheckKondisiKeamanan::");
    }

    int CheckKondisiKeamanan() {
        int kon;
        if ("s".equalsIgnoreCase(ini.getKekokohan())) {
            System.out.println("Kekokohan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
       
        if ("s".equalsIgnoreCase(ini.getBahaya())) {
            System.out.println("Bahaya : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }  
        return s;
    }
    @Override
    void persentaseKeamanan(){
    double total = s*33.3;
    System.out.println("persentase Kondisi Kenyamanan : "+total+"%");
   
    }

    @Override
    void input_identitas_ruang_kelas() {
       
    }
    
}
