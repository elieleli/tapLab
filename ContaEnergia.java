import java.util.Scanner;


public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        if(x<0){
            System.err.println("-1.00");
            System.exit(0);
        }
        char tipo = scan.next().charAt(0);

        String stipo = Character.toString(tipo);
        double valor = 0;

        if (stipo.equals("R")) {
            if(x>500){
                valor =  x*0.65;
                System.out.printf("%.2f\n", valor);
            }
            else{
                valor = x*0.40;
                System.out.printf("%.2f\n", valor);
            }
        }
        else if (stipo.equals("I")) {
            if(x>5000){
                valor =  x*0.60;
                System.out.printf("%.2f\n", valor);
            }
            else{
                valor = x*0.55;
                System.out.printf("%.2f\n", valor);
            }
        }
        else if (stipo.equals("C")) {
            if(x>1000){
                valor =  x*0.60;
                System.out.printf("%.2f\n", valor);
            }
            else{
                valor = x*0.55;
                System.out.printf("%.2f\n", valor);
            }
        }
        else{
            System.err.println("-1.00");
        }

        scan.close();
    }
}
