/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * 
 */
public interface out {
    public void input_kondisi_ruang_kelas();
    public void kondisi_dan_posisi_sarana();
    public void input_lingkungan_ruang_kelas();
    public void kebersihan_ruang_kelas();
    public void kenyamanan_ruang_kelas();
    public void keamanan_ruang();
    
   public void setget(int panjang_ruang, int lebar_ruang, int jumlah_kursi, int pintu, int jendela);
   public void setget(int jumlah_steker, String kondisi_steker, String posisi_steker, int jumlah_kabel_LCD, 
            String kondisi_kabel_LCD, String posisi_kabel_LCD, int jumlah_lampu,String kondisi_lampu ,
            String posisi_lampu, int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin,
            int jumlah_AC, String kondisi_AC,String posisi_AC,String SSID, String bandwidth, int jumlah_CCTV, String kondisi_CCTV, String posisi_CCTV);
   public void setget (String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela);
   public void setget (String sirkulasi_udara, int pencahayaan, int kelembapan, int suhu);
   public void setget(int kebisingan, String bau, String kebocoran, String kerusakan, String keausan);
   public void setget(String kekokohan, int jumlah_kunci, int jumlah_jendela, String bahaya);
    }  

    
            
