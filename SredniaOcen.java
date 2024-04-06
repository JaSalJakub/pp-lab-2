import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Podaj oceny z poszczególnych przedmiotów (oddzielone spacją):");
        String input = scanner.nextLine();  
        String[] ocenyArray = input.split(" ");        
        double sumaOcen = 0;
        int liczbaOcen = 0;        
        for (String ocenaStr : ocenyArray) {
            try {               
                double ocena = Double.parseDouble(ocenaStr);               
                sumaOcen += ocena;                                
                liczbaOcen++;
            } catch (NumberFormatException e) {                
                System.out.println("Błąd: " + ocenaStr + " nie jest liczbą.");
            }
        }
        double srednia = sumaOcen / liczbaOcen;       
        System.out.println("Średnia ocen: " + srednia);        
        scanner.close();
    }
}
