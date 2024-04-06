import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SredniaOcen3 {
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
        System.out.println("Oceny:");
        for (int i = 0; i < ocenyList.size(); i++) {
            double ocena = ocenyList.get(i);
            System.out.println((i + 1) + ". " + ocena);
        }
        int liczbaOcen = ocenyList.size();
        double sumaOcen = 0;
        for (double ocena : ocenyList) {
            sumaOcen += ocena;
        }        
        double srednia = 0;
        if (liczbaOcen > 0) {
            srednia = sumaOcen / liczbaOcen;
        }
        System.out.println("Liczba ocen: " + liczbaOcen);
        System.out.println("Średnia ocen: " + srednia);
        scanner.close();
    }
}