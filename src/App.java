import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe um lado do quadrado em metros: ");
        double lado  = ler.nextDouble(); 

        ler.close(); 

        double area = Math.pow(lado , 2); 
        System.out.println("O dobro da area do quadrado é: " + area * 2 + " metros.");
    
    }
    }
