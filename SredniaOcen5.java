import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SredniaOcen5 {
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
                if (ocena > 0 && ocena < 6) {
                    ocenyList.add(ocena);
                } else {
                    System.out.println("Błąd: Ocena musi być dodatnia i mniejsza od 6. Spróbuj ponownie.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Błąd: Wprowadzona wartość nie jest liczbą. Spróbuj ponownie.");
            }
        }
        
        // Wyświetlanie ocen
        System.out.println("Oceny:");
        for (int i = 0; i < ocenyList.size(); i++) {
            double ocena = ocenyList.get(i);
            System.out.println((i + 1) + ". " + ocena);
        }
        
        // Obliczanie ilości ocen
        int liczbaOcen = ocenyList.size();
        
        // Obliczanie średniej
        double sumaOcen = 0;
        for (double ocena : ocenyList) {
            sumaOcen += ocena;
        }
        
        double srednia = 0;
        if (liczbaOcen > 0) {
            srednia = sumaOcen / liczbaOcen;
        }
        
        // Obliczanie mediany
        Collections.sort(ocenyList);
        double mediana;
        if (liczbaOcen % 2 == 0) {
            mediana = (ocenyList.get(liczbaOcen / 2 - 1) + ocenyList.get(liczbaOcen / 2)) / 2.0;
        } else {
            mediana = ocenyList.get(liczbaOcen / 2);
        }
        
        // Wyświetlanie wyników
        System.out.println("Liczba ocen: " + liczbaOcen);
        System.out.println("Średnia ocen: " + srednia);
        System.out.println("Mediana ocen: " + mediana);
        
        // Zamykanie scanner
        scanner.close();
    }
}