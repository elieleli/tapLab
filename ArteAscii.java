import java.util.Scanner;

public class ArteAscii {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String matriz[][] = new String[2*x][x];

        for(int i=0; i<x; i++){
            int limit = x-i;
            for(int j=0; j<limit; j++){
                matriz[i][j] = "*";
            }
            int k = limit;
            while (k!=x) {
                matriz[i][k] = " ";
                k++;
            }
        }
        for(int i=x; i<x*2; i++){
            int limit = (i-x)+1;
            for(int j=0; j<limit; j++){
                matriz[i][j] = "*";
            }
            int k = limit;
            while(k!=x){
                matriz[i][k] = " ";
                k++;
            }

        }
        for(int i=0; i<2*x; i++){
            for(int j=0; j<x; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        scan.close();
    }
}
