import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int faltas[] = new int[50];
        int i = 0;
        int x = scan.nextInt();
        while(x!=-1){
            faltas[i] = x;
            i++;
            x = scan.nextInt();
        }
        double dias[] = new double[6];
        for(int j=0; j<i; j++){
            dias[(faltas[j]-2)]++;
        }
        int soma = 0;
        for(int j=0; j<6; j++){
            soma += dias[j];
        }
        for(int j=0; j<6; j++){
            dias[j] = (dias[j]*100)/soma;
        }
        for(int j=0; j<6; j++){
            System.out.printf("%.1f ", dias[j]);
        }
        System.out.println();
        scan.close();
    }
}
