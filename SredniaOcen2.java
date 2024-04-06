import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SredniaOcen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> ocenyList = new ArrayList<>();        
        System.out.println("Dodawanie ocen. Aby zakończyć, wpisz 'koniec'.");       
        while (true) {
            System.out.print("Podaj ocenę: ");
            String input = scanner.nextLine();           
            if (input.equalsIgnoreCase("koniec")) {
                break;
            }            
            try {
                double ocena = Double.parseDouble(input);
                ocenyList.add(ocena);
            } catch (NumberFormatException e) {
                System.out.println("Błąd: Wprowadzona wartość nie jest liczbą. Spróbuj ponownie.");
            }
        }
        double sumaOcen = 0;
        int liczbaOcen = ocenyList.size();
        for (double ocena : ocenyList) {
            sumaOcen += ocena;
        }       
        double srednia = 0;
        if (liczbaOcen > 0) {
            srednia = sumaOcen / liczbaOcen;
        }
        System.out.println("Średnia ocen: " + srednia);
        scanner.close();
    }
}