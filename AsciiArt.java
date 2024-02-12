import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String matriz [][] = new String[x][2*x];

        for(int i=0; i<x; i++){
            int limit = ((x-i)*2)/2;
            for(int j=0; j<limit; j++){
                matriz[i][j] = "*";
            }

            int z = x*2;
            for(int j=z-1;j>(z-limit)-1;j--){
                matriz[i][j] = "*";
            }

            int k = limit;
            while(k!=(z-limit)){
                matriz[i][k] = " ";
                k++;
            }
        }
        for(int i=0; i<x; i++){
            for(int j=0; j<x*2; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        scan.close();

    }
}
