import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args){
      Scanner numero= new Scanner(System.in);
      System.out.println("Ingresa un numero y te dire si es par o impar");
      int paridad=numero.nextInt();
      if(paridad%2==0){
          System.out.println("El numero es par");
      }else{
          System.out.println("El numero es impar");
      }
  }
}

