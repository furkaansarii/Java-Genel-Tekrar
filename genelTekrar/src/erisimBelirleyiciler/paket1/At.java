package erisimBelirleyiciler.paket1;

import erisimBelirleyiciler.paket2.Hayvan;

public class At extends Hayvan{
    public String ad;
    public At(String isim, String ad) {
        super(isim);
        this.ad = ad;
    }
    public void ismini_soyle() {
        
        System.out.println(ad);
        
    }
    
    
}
