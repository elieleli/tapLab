import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vet[] = new double[10];
        int x; int cont = 0; x=cont;

        while(x!=-1){
            x = scan.nextInt();
            int y=x;
            int vety [] = new int [10];
            int conty = 0;
            while(y!=-1){
                vety[conty] = y;
                conty++;
            }
            double z=0;
            for(int i=0; i<conty-1; i++){
                z += vet[i];
            }
            z = z/(conty-1);

            vet[cont] = z;
            cont++;
        }

        double z = 0;
        for(int i=0; i<cont-1;i++){
            z = vet[i];
            System.out.printf("%.2f\n", z);
        }

        scan.close();

    }
}
