import java.util.Scanner;


public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int colecao[] = new int [15];
        

        int x = 0;
        int cont = 0;
        while(x!=-1){
            x = scan.nextInt();
            int y = x;
            int soma = 0;
            int i = 0;
            int z = 0;
            int colecaoy[] = new int [15];
            while (y!=-1) {
                colecaoy[i] = y;
                i++;   
                y = scan.nextInt();
                z=i;
            }
            for(i=0; i<z; i++){
                soma += colecaoy[i];
            }

            colecao[cont] = soma;
            cont++;
        }
        for(int i=0; i<cont-1; i++){
            System.out.println(colecao[i]);
        }

        scan.close();

    }
}
