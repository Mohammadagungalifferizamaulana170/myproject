/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Satelllite
 */
public abstract class kebersihan_rk extends ruang{
    private String sirkulasi_udara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;

    public String getSirkulasi_udara() {
        return sirkulasi_udara;
    }

    public void setSirkulasi_udara(String sirkulasi_udara) {
        this.sirkulasi_udara = sirkulasi_udara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    @Override
    public void kebersihan_rk() {
		System.out.println("masukan sirkulasi udara");
		setSirkulasi_udara(in.nextLine());
		analisis_sirkulasi_udara();
		System.out.println("masukan nilai pencahaan");
		setPencahayaan(in.nextInt());
		analisis_Pencahayaan();
		System.out.println("masukan kelembapan");
		setKelembapan(in.nextInt());
		System.out.println("Masukan suhu Celcius");
		setSuhu(in.nextInt());
		analisis_Suhu();

	}

	public String analisis_sirkulasi_udara() {
		if ("lancar".equals(getSirkulasi_udara())) {
			hasil1="Sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_Pencahayaan() {
		if ((getPencahayaan() >= 250) && getPencahayaan() <= 350) {
			hasil1="sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_Kelembapan() {
		if ((getKelembapan() >= 70) && getKelembapan() <= 80) {
			hasil1="Sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_Suhu() {
		if ((getSuhu() >= 25) && getSuhu() <= 35) {
			hasil1="sesuai";
		} else {
			hasil1="tidak sesuai";
		}
                return hasil1;
	}
}
