import java.util.Scanner;
    public class Cedula {


        Cedula (){}
        private String cedula;
        //Getters

        public String getCedula(){
            return this.cedula;
        }

        // Setters
        public void SetCedula(String cedula){
            if(cedulaValida(cedula)){
                this.cedula=cedula;
            } else {
                System.out.println("Cedula no valida");
            }
        }

        private boolean cedulaValida(String cedula) {
            int num1;
            int op1 = 0;
            int num2;
            int op2 = 0;
            int num3;
            int op3 = 0;
            int num4;
            int op4 = 0;
            int num5;
            int op5 = 0;
            int num6;
            int op6 = 0;
            int num7;
            int op7 = 0;
            int num8;
            int op8 = 0;
            int num9;
            int op9 = 0;
            int suma = 0;
            int numverificacion;
            int sumatoria;


            char n;
            int contador = 0;
            boolean respuesta = false;

            System.out.println("Ingresa el numero de cedula");
            Scanner numero= new Scanner(System.in);


            if (cedula.length() == 10) {
                for (int i = 0; i < cedula.length(); i++) {
                    n = cedula.charAt(i);
                    if (Character.isDigit(n)) {
                        contador++;
                    }
                    if (contador == 10) {
                        num1 = Integer.valueOf(cedula.substring(0, 1));
                        num2 = Integer.valueOf(cedula.substring(1, 2));
                        num3 = Integer.valueOf(cedula.substring(2, 3));
                        num4 = Integer.valueOf(cedula.substring(3, 4));
                        num5 = Integer.valueOf(cedula.substring(4, 5));
                        num6 = Integer.valueOf(cedula.substring(5, 6));
                        num7 = Integer.valueOf(cedula.substring(6, 7));
                        num8 = Integer.valueOf(cedula.substring(7, 8));
                        num9 = Integer.valueOf(cedula.substring(8, 9));
                        numverificacion = Integer.valueOf(cedula.substring(8, 9));
                        if (num3 < 6) {
                            op1 = num1 * 2;
                            if (op1 >= 10) {
                                op1 -= 9;
                            }

                            op2 = num2 * 1;
                            if (op2 >= 10) {
                                op2 -= 9;
                            }

                            op3 = num3 * 2;
                            if (op3 >= 10) {
                                op3 -= 9;
                            }

                            op4 = num4 * 1;
                            if (op4 >= 10) {
                                op4 -= 9;
                            }
                            op5 = num5 * 1;
                            if (op5 >= 10) {
                                op5 -= 9;
                            }
                            op6 = num6 * 1;
                            if (op6 >= 10) {
                                op6 -= 9;
                            }
                            op7 = num7 * 1;
                            if (op7 >= 10) {
                                op7 -= 9;
                            }
                            op8 = num8 * 1;
                            if (op8 >= 10) {
                                op8 -= 9;
                            }
                            op9 = num9 * 1;
                            if (op9 >= 10) {
                                op9 -= 9;
                            }

                            suma = op1 + op2 + op3 + op4 + op5 + op6 + op7 + op8 + op9;
                            sumatoria = suma % 10;
                            if (sumatoria == 0) {
                                if (sumatoria == numverificacion) {
                                    respuesta = true;
                                } else {
                                    respuesta = false;
                                }
                            } else {
                                sumatoria = 10 - sumatoria;
                                if (sumatoria == numverificacion) {
                                    respuesta = true;
                                } else {
                                    respuesta = false;
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.print("ID incorrecto");
            }
             return respuesta;}

        public static void main(String[] args) {
            Cedula c = new Cedula();
            c.SetCedula("1726403536");
        }
    }


