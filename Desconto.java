import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        if(x >= 200){
            x = x - ((5*x)/100);
            System.out.printf("%.2f\n", x);
        }
        scan.close();

    }
}
