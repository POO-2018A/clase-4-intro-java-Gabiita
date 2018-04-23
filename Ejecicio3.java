import java.util.Scanner;
public class Ejecicio3 {
    public static void main (String[] args) {
        Scanner edad = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int dato = edad.nextInt();
        if (dato>=0) {
            if (dato >= 18) {
                System.out.println("usted es mayor de edad");
            } else {
                System.out.println("usted es menor de edad");
            }
        }else{
            System.out.println("Ingrese un numero logico");
        }
    }
}
