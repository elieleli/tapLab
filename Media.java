import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x1 = scan.nextFloat();
        float x2 = scan.nextFloat();
        float x3 = scan.nextFloat();

        float media = (x1+x2+x3)/3;

        System.out.printf("%.2f \n", media);

        scan.close();
    }
}
