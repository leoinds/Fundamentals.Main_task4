import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println ("Введите аргументы");
            Scanner scanner = new Scanner (System.in);
            for (int i=0; true; i++) {
            int summa = scanner.nextInt();
            int ymnoz = scanner.nextInt();

          System.out.println ("Сумма чисел: " + (summa+ymnoz));
          System.out.println ("Произведение чисел: " + (ymnoz*summa));

        }
    }

}