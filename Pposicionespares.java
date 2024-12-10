import java.util.Scanner;

public class Pposicionespares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0, countPares = 0;

          System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) { 
                System.out.print("Entrada no válida. Intente nuevamente: ");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();

            if (i % 2 == 0) { 
                sumaPares += numeros[i];
                countPares++;
            }
        }


       
    }
}    