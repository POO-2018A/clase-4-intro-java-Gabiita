import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        boolean estaNevando=false;
        boolean estaLloviendo=true;

        Scanner dato= new Scanner(System.in);
        Scanner nieve=new Scanner(System.in);
        Scanner lluvia=new Scanner(System.in);
        System.out.println("Si esta Nevando ingresa False");
        estaNevando=nieve.nextBoolean();
        System.out.println("Si esta Lloviendo ingresa True");
        estaLloviendo=lluvia.nextBoolean();
        System.out.println("Ingresa la temperatura del dia de hoy");
        double temperatura=dato.nextInt();
        if(temperatura<10 || estaLloviendo==true || estaNevando == false ){
            System.out.println("Nos quedamos en casa!");
        }else{
            System.out.println("Vamos afuera!");
        }

    }
}
