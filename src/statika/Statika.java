
package statika;

public class Statika {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pradzia");
        Studentas jonas = new Studentas("Jonas", "Jonaitis");
        System.out.println("Sukurem Jona");
        Studentas petras = new Studentas("Petras", "Petraitis");
        System.out.println("sukurem Petra");
        Studentas antanas = new Studentas("Antanas", "Antanaitis");
        System.out.println("sukurem Antana");
        
        System.out.println(jonas.vardasDidziosiomRaidem(jonas));
        
        System.out.println(jonas);
        System.out.println(petras);
        System.out.println(antanas);
    }
    
}
