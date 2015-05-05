/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Satelllite
 */
public abstract class kenyamanan_rk extends ruang {
    private String bau;
    private String kebocoran;
    private String kerusakan;
    private String keausan;

    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }
    private String kebisingan;

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }
    @Override
    public void kenyamanan_rk() {
		System.out.println("masukan kebisingan");
		setKebisingan(in.next());
		;
		System.out.println("masukan bau");
		setBau(in.nextLine());
		
		System.out.println("masukan kebocoran");
		setKebocoran(in.nextLine());
		
		System.out.println("masukan kerusakan");
		setKerusakan(in.nextLine());
		
		System.out.println("masukan keausan");
		setKeausan(in.nextLine());
		
	}
        

	public String kebisingan() {
		if ("tidak bising".equals(getKebisingan())) {
			hasil1="Sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_bau() {
		if ("tidak bau".equals(getBau())) {
			hasil1="Sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_kebocoran() {
		if ("tidak bocor".equals(getKebocoran())) {
			hasil1="Sesuai";
	} else {  		
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_kerusakan() {
		if ("tidak rusak".equals(getKerusakan())) {
			hasil1="sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}

	public String analisis_keausan() {
		if ("tidak aus".equals(getKeausan())) {
			hasil1="Sesuai";
		} else {
			hasil1="tidak sesuai";
		}return hasil1;
	}
	}

