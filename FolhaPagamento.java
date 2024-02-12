import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float valoHora = scan.nextFloat();
        int quantidadeHora = scan.nextInt();

        float salarioBruto = valoHora * (float)quantidadeHora;

        float ir = (salarioBruto*11)/100;

        float inss = (salarioBruto*8)/100;

        float descontos = ir+inss;

        float liquido = salarioBruto - descontos;

        System.out.printf("Salario bruto: R$%.2f\nIR: R$%.2f\nINSS: R$%.2f\nTotal de descontos: R$%.2f\nSalario liquido: R$%.2f\n", 
        salarioBruto, ir, inss, descontos, liquido);

        scan.close();
    }
}
