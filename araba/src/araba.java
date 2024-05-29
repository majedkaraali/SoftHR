public class araba {

    private String marka;
    private String model;
    private String price;

    private String motorTipi;
    private double motorHacmi;
    private int motorGucu;
    private int maksimumHiz;
    private String sanzimanTipi;
    private double yakitTuketimi;
    

    private double uzunluk;
    private double genislik;
    private double yukseklik;
    private double dingilMesafesi;
    private double bosAgirlik;
    private int maksimumTasimaKapasitesi;
    

    private double hizlanmaSuresi;
    private int frenMesafesi;
    private double virajAlmaKabiliyeti;
    

    private int havaYastiklariSayisi;
    private boolean absVarMi;
    private boolean espVarMi;
    private boolean otomatikAcilFrenSistemiVarMi;
    private boolean cocukKilidiVarMi;
    

    private boolean klimaVarMi;
    private boolean deriKoltuklarVarMi;
    

    public araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

        public String getMarka() {
            return marka;
        }
    
        public void setMarka(String marka) {
            this.marka = marka;
        }
    
        public String getModel() {
            return model;
        }
    
        public void setModel(String model) {
            this.model = model;
        }
    
        public String getMotorTipi() {
            return motorTipi;
        }
    
        public void setMotorTipi(String motorTipi) {
            this.motorTipi = motorTipi;
        }
    
        public double getMotorHacmi() {
            return motorHacmi;
        }
    
        public void setMotorHacmi(double motorHacmi) {
            this.motorHacmi = motorHacmi;
        }
    
        public int getMotorGucu() {
            return motorGucu;
        }
    
        public void setMotorGucu(int motorGucu) {
            this.motorGucu = motorGucu;
        }
    
        public int getMaksimumHiz() {
            return maksimumHiz;
        }
    
        public void setMaksimumHiz(int maksimumHiz) {
            this.maksimumHiz = maksimumHiz;
        }
    
        public String getSanzimanTipi() {
            return sanzimanTipi;
        }
    
        public void setSanzimanTipi(String sanzimanTipi) {
            this.sanzimanTipi = sanzimanTipi;
        }
    
        public double getYakitTuketimi() {
            return yakitTuketimi;
        }
    
        public void setYakitTuketimi(double yakitTuketimi) {
            this.yakitTuketimi = yakitTuketimi;
        }
    
        public double getUzunluk() {
            return uzunluk;
        }
    
        public void setUzunluk(double uzunluk) {
            this.uzunluk = uzunluk;
        }
    
        public double getGenislik() {
            return genislik;
        }
    
        public void setGenislik(double genislik) {
            this.genislik = genislik;
        }
    
        public double getYukseklik() {
            return yukseklik;
        }
    
        public void setYukseklik(double yukseklik) {
            this.yukseklik = yukseklik;
        }
    
        public double getDingilMesafesi() {
            return dingilMesafesi;
        }
    
        public void setDingilMesafesi(double dingilMesafesi) {
            this.dingilMesafesi = dingilMesafesi;
        }
    
        public double getBosAgirlik() {
            return bosAgirlik;
        }
    
        public void setBosAgirlik(double bosAgirlik) {
            this.bosAgirlik = bosAgirlik;
        }
    
        public int getMaksimumTasimaKapasitesi() {
            return maksimumTasimaKapasitesi;
        }
    
        public void setMaksimumTasimaKapasitesi(int maksimumTasimaKapasitesi) {
            this.maksimumTasimaKapasitesi = maksimumTasimaKapasitesi;
        }
    
        public double getVirajAlmaKabiliyeti() {
            return virajAlmaKabiliyeti;
        }
    
        public void setVirajAlmaKabiliyeti(double virajAlmaKabiliyeti) {
            this.virajAlmaKabiliyeti = virajAlmaKabiliyeti;
        }

        public int getHavaYastiklariSayisi() {
            return havaYastiklariSayisi;
        }
    
        public void setHavaYastiklariSayisi(int havaYastiklariSayisi) {
            this.havaYastiklariSayisi = havaYastiklariSayisi;
        }
    
        public boolean isAbsVarMi() {
            return absVarMi;
        }
    
        public void setAbsVarMi(boolean absVarMi) {
            this.absVarMi = absVarMi;
        }
    
        public boolean isEspVarMi() {
            return espVarMi;
        }
    
        public void setEspVarMi(boolean espVarMi) {
            this.espVarMi = espVarMi;
        }
    
        public boolean isOtomatikAcilFrenSistemiVarMi() {
            return otomatikAcilFrenSistemiVarMi;
        }
    
        public void setOtomatikAcilFrenSistemiVarMi(boolean otomatikAcilFrenSistemiVarMi) {
            this.otomatikAcilFrenSistemiVarMi = otomatikAcilFrenSistemiVarMi;
        }
    
        public boolean isCocukKilidiVarMi() {
            return cocukKilidiVarMi;
        }
    
        public void setCocukKilidiVarMi(boolean cocukKilidiVarMi) {
            this.cocukKilidiVarMi = cocukKilidiVarMi;
        }
    
        public boolean isKlimaVarMi() {
            return klimaVarMi;
        }
    
        public void setKlimaVarMi(boolean klimaVarMi) {
            this.klimaVarMi = klimaVarMi;
        }
    
        public boolean isDeriKoltuklarVarMi() {
            return deriKoltuklarVarMi;
        }
    
        public void setDeriKoltuklarVarMi(boolean deriKoltuklarVarMi) {
            this.deriKoltuklarVarMi = deriKoltuklarVarMi;
    }    
}
