import java.util.Scanner;

public class AnimaisCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        if(x == 100){
            System.out.println("Garoupa");
        }
        else if( x == 50){
            System.out.println("Onça-pintada");
        }
        else if( x == 20){
            System.out.println("Mico-leão-dourado");
        }
        else if( x == 10){
            System.out.println("Arara");
        }
        else if( x == 5){
            System.out.println("Garça");
        }
        else if( x == 2){
            System.out.println("Tartaruga");
        }
        else{System.out.println("erro");}

        scan.close();
    }
}
