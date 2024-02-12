import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((b+c>a) && (b+a>c) && (c+a>b)){
            double s = (a+b+c)/2;
            double area = s * (s-a) * (s-b) * (s-c);
            area = Math.sqrt(area);

            System.out.printf("%.2f\n", area);
        }
        else{System.out.println("Triangulo invalido");}

        scan.close();

    }
}
