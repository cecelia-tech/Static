/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statika;

/**
 *
 * @author vita
 */
public class Studentas {
    private static int eilNr = 0;
    
    static {
        System.out.println("sitas blokas atliekamas viena karta uzkraunant klase");
    }
    
    {
        System.out.println("sitas bus vykdomas pries konstruktoriu");
    }
    private String vardas;
    private String pavarde;
    private int eilesNumeris;
    
    public Studentas(String vardas, String pavarde){
    this.vardas = vardas;
    this.pavarde = pavarde;
    this.eilesNumeris = ++eilNr;
    }

    static {
        System.out.println("statik blokai gali buti keli");
    }
    public Studentas(String vardas, String pavarde, int eilesNumeris) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.eilesNumeris = eilesNumeris;
        this.eilesNumeris = ++eilNr;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getEilesNumeris() {
        return eilesNumeris;
    }

    public void setEilesNumeris(int eilesNumeris) {
        this.eilesNumeris = eilesNumeris;
    }

    @Override
    public String toString() {
        return "Studentas{" + "vardas=" + vardas + ", pavarde=" + pavarde + ", eilesNumeris=" + eilesNumeris + '}';
    }
    
    public static String vardasDidziosiomRaidem (Studentas st){
    return st.vardas.toUpperCase();
    }
}
