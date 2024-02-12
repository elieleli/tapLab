import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextDouble();
        double x = scan.nextDouble();
        int z = scan.nextInt();
    
        
        if (z == 1) {
            double volEsfera = (4.0/3.0)* Math.PI * Math.pow(r, 3);
            double calota = (Math.PI*Math.pow(x, 2)*(3 * r - x))/3;
            double volCmbs = volEsfera-calota;
            double volar = volEsfera - volCmbs;

            System.out.printf("%.4f\n", volar);
        } else if (z == 2) {
            double volEsfera = (4.0/3.0)* Math.PI * Math.pow(r, 3);
            double calota = (Math.PI*Math.pow(x, 2)*(3 * r - x))/3;
            double volCmbs = volEsfera-calota;
            System.out.printf("%.4f\n", volCmbs);
        }
        
        
        scan.close();
    }
}
