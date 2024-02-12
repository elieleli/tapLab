import java.util.Scanner;

public class NumeroNarcisista {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int resto = num;
        int n = 0;

        while (resto!=0) {
            resto = resto/10;
            n++;
        }
        int narciso = 0;
        resto = num;
        int i =n;
        while(i!=0){
            int x = resto%10;
            resto = resto/10;
            

            narciso += Math.pow(x, n);
            i--;
        }
        if(narciso == num){
            System.out.println("SIM");
        }
        else{System.out.println("NAO");}

        scan.close();
    }
}