import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) {
        
        int numeroA;
        int numeroB; 

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los numeros");
        numeroA = leer.nextInt();
        numeroB = leer.nextInt();
        
        
        if ((numeroA > 0 && numeroB > 0) || (numeroA < 0 && numeroB < 0)){
            System.out.println("true");
        }


    }
}
