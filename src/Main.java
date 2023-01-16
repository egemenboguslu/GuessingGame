import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100); //0 - 100 arası rastgele sayı üretimi

        int selected;
        int right=0;
        int[] array = new int[5];

        System.out.println("Random sayı: " + number);

        while(right<5){
            System.out.print("Tahmin edilecek sayıyı giriniz: ");
            selected = input.nextInt();

            array[right++]=selected;

            if (selected == number) {
                System.out.println("Tebrikler doğru tahmin ettiniz. Tahmininiz: " + selected);
                break;
            } else {
                if (selected > number) {
                    System.out.println("Tahmininiz büyük tekrar deneyin.");
                    System.out.println("Kalan hakkınız: " + (5-right));
                } else {
                    System.out.println("Tahmininiz küçük tekrar deneyin.");
                    System.out.println("Kalan hakkınız: " + (5-right));
                }
            }
        }

        System.out.println("Tahminleriniz: > ");

        System.out.println(Arrays.toString(array));
    }
}