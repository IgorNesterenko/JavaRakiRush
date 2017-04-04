package HomeTask04;

/**
 * Created by user on 31.03.2017.
 */
public class MainInfo {
    protected String rama;
    protected   String kolesa;
    protected boolean kabina;
    protected   int countOfKolesa;

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getKolesa() {
        return kolesa;
    }

    public void setKolesa(String kolesa) {
        this.kolesa = kolesa;
    }


    public void setKabina(boolean kabina) {
        this.kabina = kabina;
    }

    public int getCountOfKolesa() {
        return countOfKolesa;
    }

    public void setCountOfKolesa(int countOfKolesa) {
        this.countOfKolesa = countOfKolesa;
    }

    public double getObemDviga() {
        return obemDviga;
    }

    public void setObemDviga(double obemDviga) {
        this.obemDviga = obemDviga;
    }

    protected double obemDviga;

    public MainInfo(String rama, String kolesa, String kabina, int countOfKolesa, double obemDviga) {
        this.rama = rama;
        this.kolesa = kolesa;
        this.countOfKolesa = countOfKolesa;
        this.obemDviga = obemDviga;
    }

}
