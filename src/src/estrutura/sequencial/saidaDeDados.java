package src.estrutura.sequencial;

import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        String product1 = "Computer", product2 = "Office desk";
        int age = 30, code = 5290;
        char gender = 'F';
        double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f", product1, price1);
        System.out.printf("%s, which price is $ %.2f", product2, price2);
        System.out.println("");
        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
        System.out.println("");
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
