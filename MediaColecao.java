import java.util.Scanner;


public class MediaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vet[] = new int[10];
        int x = 0;
        int cont = 0;
        while(x!=-1){
            x = scan.nextInt();
            vet[cont] = x;
            cont++;
        }
        double z=0;
        for(int i=0; i<cont-1; i++){
            z += vet[i];
        }
        z = z/(cont-1);
        System.out.printf("%.2f\n", z);

        scan.close();
    }
}
