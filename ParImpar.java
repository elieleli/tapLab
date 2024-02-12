import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int matriz[] = new int[15];

        int x = scan.nextInt();
        int j = 0;
        matriz[j] = x;
        j++;
        while(x!=-1){
            x = scan.nextInt();
            matriz[j] = x;
            j++;
        }

        int z = matriz[0];
        j = 0;
        while(z != -1){
            z = matriz [j];
            if(z % 2 == 0){
                System.out.println("PAR");
            }
            else{System.out.println("IMPAR");}
            j++;
            z = matriz[j];
        }

        scan.close();
    }
}
