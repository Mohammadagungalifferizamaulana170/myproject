/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Satelllite
 */
public abstract class lingkungan_rk extends ruang{
    private String kondisi_lantai;
    private String kondisi_dinding;
    private String kondisi_atap;
    private String kondisi_pintu;
    private String kondisi_jendela;

    public String getKondisi_lantai() {
        return kondisi_lantai;
    }

    public void setKondisi_lantai(String kondisi_lantai) {
        this.kondisi_lantai = kondisi_lantai;
    }

    public String getKondisi_dinding() {
        return kondisi_dinding;
    }

    public void setKondisi_dinding(String kondisi_dinding) {
        this.kondisi_dinding = kondisi_dinding;
    }

    public String getKondisi_atap() {
        return kondisi_atap;
    }

    public void setKondisi_atap(String kondisi_atap) {
        this.kondisi_atap = kondisi_atap;
    }

    public String getKondisi_pintu() {
        return kondisi_pintu;
    }

    public void setKondisi_pintu(String kondisi_pintu) {
        this.kondisi_pintu = kondisi_pintu;
    }

    public String getKondisi_jendela() {
        return kondisi_jendela;
    }

    public void setKondisi_jendela(String kondisi_jendela) {
        this.kondisi_jendela = kondisi_jendela;
    }
    
    @Override
    
    public void lingkungan_rk(){            
               
                super.identitas_rk();
    
		System.out.println("kondisi lantai");
		this.setKondisi_lantai(in.next());
		System.out.println("kondisi dinding");
		this.setKondisi_dinding(in.next());
		System.out.println("kondisi atap");
		this.setKondisi_atap(in.next());
		System.out.println("kondisi pintu");
		this.setKondisi_pintu(in.next());
		System.out.println("kondisi jendela");
		setKondisi_jendela(in.next());
		analisis_kebersihan();
	}

	public String analisis_kebersihan() {
		if (getKondisi_lantai() == "bersih"
				&& getKondisi_dinding() == "bersih"
				&& getKondisi_atap() == "bersih"
				&& getKondisi_pintu() == "baik"
				&& getKondisi_jendela() == "bersih") {
			hasil1="sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

}
