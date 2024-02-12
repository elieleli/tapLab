import java.util.Scanner;


public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vInicial = scan.nextInt();
        int angulo = scan.nextInt();

        float distancia = scan.nextFloat();

        double radians = Math.toRadians(angulo);

        double r = (Math.pow(vInicial, 2)* Math.sin(2*radians))/9.8;

        if(((r-distancia > 0) && (r-distancia < 1)) ||(distancia == r)){
            System.out.println(1);
        }
        else{System.out.println(0);}

        scan.close();
    }
}
