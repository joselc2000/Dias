import java.util.Scanner;
public class Dias {
    public static void main (String[] args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu numero");
        int numeroIngresado = almacenar.nextInt();
        if (numeroIngresado != 0){
            if(numeroIngresado==1){
                System.out.println("Tu dia es Domingo");
            }else if(numeroIngresado==2){
                System.out.println("Tu dia es Lunes");
            }else if(numeroIngresado==3){
                System.out.println("Tu dia es Martes");
            }else if(numeroIngresado==4){
                System.out.println("Tu dia es Miercoles");
            }else if(numeroIngresado==5){
                System.out.println("Tu dia es Jueves");
            }else if(numeroIngresado==6){
                System.out.println("Tu dia es Viernes");
            }else if(numeroIngresado==7){
                System.out.println("Tu dia es Sabado");
            }
        }else{
            System.out.println("Tu dia no es valido");
        }

        }
    }