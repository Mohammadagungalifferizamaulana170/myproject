/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
import java.util.Scanner;

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

    }

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

   }




