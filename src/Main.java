import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hangi sayının basamak değerlerinin toplamını bulmak istersiniz : ");
        int number = sc.nextInt();
        int countOfDigits = 0,sumOfDigits = 0,number1 = number;
        while(number != 0){
            sumOfDigits += number % 10;
            number /= 10;
            countOfDigits++;
        }
        System.out.println(number1+" sayısı "+countOfDigits+" basamaklı bir sayıdır. Her bir basamağındaki değerlerin toplamı : " + sumOfDigits);

    }
}
