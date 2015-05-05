/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Satelllite
 */
public abstract class keamanan_rk extends ruang{
    
    private String kekokohan;
    private String bahaya;
    private int jumlah_kunci;
    private int jumlah_jendela;

    public int getJumlah_jendela() {
        return jumlah_jendela;
    }

    public void setJumlah_jendela(int jumlah_jendela) {
        this.jumlah_jendela = jumlah_jendela;
    }

    public String getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    public String getBahaya() {
        return bahaya;
    }

    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }

    public int getJumlah_kunci() {
        return jumlah_kunci;
    }

    public void setJumlah_kunci(int jumlah_kunci) {
        this.jumlah_kunci = jumlah_kunci;
    }
    @Override
    public void keamanan_rk() {
		System.out.println("input kekokohan");
		setKekokohan(in.next());
		System.out.println("jumlah kunci pintu");
		setJumlah_kunci(in.nextInt());
		System.out.println("jumlah jendela");
		setJumlah_jendela(in.nextInt());
		System.out.println("bahaya atau aman ?");
	}

	public void analisis_kekokohan() {
		if (getKekokohan() == "kokoh") {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public void analisis_kunci_pintu_jendela() {
		if (getJumlah_kunci() != 0 && getJumlah_jendela() != 0) {
			System.out.println("sesuai");
		} else {
			System.out.println("tidak sesuai");
		}
	}

	public String analisis_keamanan_ruang() {
		if (getBahaya() == "aman") {
			hasil1="sesuai";
		}return hasil1;
	}
}
