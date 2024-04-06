import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj oceny z poszczególnych przedmiotów (oddzielone spacją):");
        String input = scanner.nextLine();
        
        // Dzielimy wprowadzone oceny na osobne ciągi znaków
        String[] ocenyArray = input.split(" ");
        
        // Inicjalizujemy zmienne do przechowywania sumy ocen oraz liczby ocen
        double sumaOcen = 0;
        int liczbaOcen = 0;
        
        // Iterujemy przez każdy element tablicy ocen
        for (String ocenaStr : ocenyArray) {
            try {
                // Konwertujemy ocenę na liczbę zmiennoprzecinkową
                double ocena = Double.parseDouble(ocenaStr);
                
                // Dodajemy ocenę do sumy
                sumaOcen += ocena;
                
                // Zwiększamy liczbę ocen
                liczbaOcen++;
            } catch (NumberFormatException e) {
                // Jeżeli wprowadzona wartość nie jest liczbą, ignorujemy ją
                System.out.println("Błąd: " + ocenaStr + " nie jest liczbą. Ignoruję tę wartość.");
            }
        }
        
        // Obliczamy średnią arytmetyczną
        double srednia = sumaOcen / liczbaOcen;
        
        // Wyświetlamy wynik
        System.out.println("Średnia ocen: " + srednia);
        
        // Zamykamy scanner
        scanner.close();
    }
}