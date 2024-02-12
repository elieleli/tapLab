import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double notas[] = new double[15];
        int presenca[] = new int[15];
        int cargaHoraria;
        int i = 0;
        double x = scan.nextDouble();
        while(x!=-1){
            notas[i] = x;
            i++;
            x = scan.nextDouble();
        }
        i = 0;
        int y = scan.nextInt();
        while(y!=-1){
            presenca[i] = y;
            i++;
            y = scan.nextInt();
        }
        cargaHoraria = scan.nextInt();

        cargaHoraria = (cargaHoraria*75)/100;
        int ap = 0; int rn = 0; int rf = 0;

        for(int j=0; j<i;j++){
            if(presenca[j]<cargaHoraria){
                rf++;
            }
            else if(notas[j]<5){
                rn++;
            }
            else{ap++;}
        }

        System.out.printf("%d %d %d\n", ap, rn, rf);

        scan.close();
    }
}
