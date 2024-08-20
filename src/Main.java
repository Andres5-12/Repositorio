import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        int alcancia = 0;
        int moneda1 = 20, moneda2 = 50, moneda3 = 100, moneda4 =
                200, moneda5 = 500;
        int contadorM = 0;
        int contadorV = 0;
        int opciones;
        int pregunta;
        System.out.println("presione 1 para agregar monedas \npresione 2 para contar cuantas monedas tiene de cada una");
        System.out.println("presione 3 para calcular el total del dinero ahorrado \npresione 4 para romper la alcancia");
        opciones = teclado.nextInt();

        do {
            switch (opciones) {
                case 1:
                    System.out.println("Seleccione el valor de la moneda");
                    pregunta = teclado2.nextInt();
                    if (pregunta == 20) {
                        System.out.println("usted metio una moneda de 20");
                        System.out.println("ya1");


                    }
                    else if (pregunta == 50) {
                        contadorM++;
                        contadorV += 50;
                    } else if (pregunta == 100) {
                        contadorM++;
                        contadorV += 100;
                    } else if (pregunta == 200) {
                        contadorM++;
                        contadorV += 200;
                    } else if (pregunta== 500) {
                        contadorM++;
                        contadorV += 500;
                    } else {
                        contadorM++;
                        contadorV += 0;
                    }
                    break;

                case 2:
                    System.out.println("tu numero de monedas es" + contadorV);
                    break;
                case 3:
                    System.out.println("tienes " + contadorM);
                    break;
                case 4:
                    System.out.println("Haz escogido romper la alcancia ");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }

        }while (opciones!=4);


    }
}

