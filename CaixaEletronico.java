import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int resto = x;
    
        int nota50, nota2, nota10;

        nota50 = nota2 = nota10 = 0;
        if((resto >= 0) && (resto % 2 == 0)){
            while(resto != 0){
                while (resto >=50) {
                    nota50 ++;
                    resto = resto - 50;
                }
                while (resto >= 10) {
                    nota10 ++;
                    resto = resto - 10;
                }
                while (resto >= 2) {
                    nota2 ++; 
                    resto = resto - 2;
                }
            }
            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", nota50, nota10, nota2);
        }
        else{System.out.println("Valor Invalido");}
        scan.close();
    }

}
