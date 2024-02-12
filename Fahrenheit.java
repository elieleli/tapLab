import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        float fahrenheit = x*9;
        fahrenheit = (fahrenheit/5)+32;

        System.out.println(fahrenheit);

        scan.close();
    }
}
