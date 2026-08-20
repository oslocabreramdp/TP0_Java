import java.util.Scanner;

public class TP0 {
    public static void main(String[] args) {
        int opcion;
        char continuar;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese el numero de ejercicio que quiere resolver");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    int numN;
                    double numA;
                    char numC;
                    String aux;

                    System.out.println("Ingrese un numero entero: ");
                    numN = input.nextInt();
                    System.out.println("Ingrese un numero real: ");
                    numA = input.nextDouble();
                    input.nextLine();
                    do {
                        System.out.println("Ingrese una letra o caracter: ");
                        aux = input.nextLine();
                    } while (aux.isBlank());

                    numC = aux.charAt(0);

                    System.out.println("El numero entero ingresado por teclado es: " + numN);

                    System.out.println("El numero real ingresado por teclado es: " + numA);

                    System.out.println("El caracter ingresado por teclado es: " + numC);

                    System.out.println("La suma entre los dos numeros ingresados es: " + (numA + numN));

                    System.out.println("La resta entre los dos numeros ingresados es: " + (numA - numN));

                    System.out.println("El numero asociado al caracter ingresado es: " + (int) numC);


                    break;

                case 2:
                    int numX = 6;
                    int numY = 35;
                    double numN2 = 12.5;
                    double numM = 31.75;

                    System.out.println("numX= " + numX);
                    System.out.println("numY= " + numY);
                    System.out.println("numN= " + numN2);
                    System.out.println("numM= " + numM);

                    System.out.println("La suma entre numX y numY: " + (numX + numY));
                    System.out.println("La resta entre numX y numY: " + (numX - numY));
                    System.out.println("La division entre numY y numX: " + (numY / numX));
                    System.out.println("La suma entre numX y numM: " + (numX + numM));
                    System.out.println("La resta entre numX y numN: " + (numX - numN2));

                    System.out.println("La division entre numN y numX: " + (numN2 / numX));
                    System.out.println("El producto entre numY y numN: " + (numY * numN2));
                    System.out.println("numY modulo numX: " + (numY % numX));


                    break;

                case 3:
                    int enteroN;
                    System.out.println("Ingrese un numero entero: ");
                    enteroN = input.nextInt();
                    System.out.println("N: " + enteroN);
                    enteroN = enteroN + 77;
                    System.out.println("N+77: " + enteroN);
                    enteroN = enteroN - 3;
                    System.out.println("N-3: " + enteroN);
                    enteroN = enteroN * 2;
                    System.out.println("N*2: " + enteroN);

                    break;

                case 4:

                    int numA4=10;
                    int numB4=20;
                    int numC4=30;
                    int numD4=40;
                    int aux4;

                    System.out.println("A=" + numA4);
                    System.out.println("B=" + numB4);
                    System.out.println("C=" + numC4);
                    System.out.println("D=" + numD4);

                    aux4=numB4;
                    numB4=numC4;
                    numC4 = numA4;
                    numA4=numD4;
                    numD4=aux4;

                    System.out.println("A=" + numA4);
                    System.out.println("B=" + numB4);
                    System.out.println("C=" + numC4);
                    System.out.println("D=" + numD4);



                    break;

                case 5:

                    int numA5;
                    numA5=44;

                    if (numA5%2==0)
                    {
                        System.out.println("El numero es par");
                    } else {  System.out.println("El numero es impar");}


                    break;

                case 6:

                    int numB6;

                    System.out.println("Ingrese un numero entero: ");
                    numB6 = input.nextInt();

                    if (numB6>0){
                        System.out.println("El numero es positivo");
                    }else if (numB6<0){
                        System.out.println("El numero es negativo");
                    }else{
                        System.out.println("El numero es 0");
                    }


                    break;

                case 7:

                    char caracter;
                    String aux7;

                    do {
                        System.out.println("Ingrese una letra o caracter: ");
                        aux7 = input.nextLine();
                    } while (aux7.isBlank());

                    caracter = aux7.charAt(0);

                    System.out.println("El numero ASCII asociado al caracter ingresado es: " + (int) caracter);

                    break;

                case 8:

                    int numC8;

                    System.out.println("Ingrese un numero entero: ");
                    numC8= input.nextInt();

                    if (numC8>0){
                        System.out.println("El numero es positivo");
                    }else if (numC8<0){
                        System.out.println("El numero es negativo");
                    }else{
                        System.out.println("El numero es 0");
                    }

                    String esPar= (numC8%2==0) ? "Es par" : "Es Impar";
                    String multiploDe5= (numC8%5==0) ? "Es multiplo de 5" : "No es multiplo de 5";
                    String multiploDe10= (numC8%10==0) ? "Es multiplo de 10" : "No es multiplo de 10";

                    System.out.println(esPar);
                    System.out.println(multiploDe5);
                    System.out.println(multiploDe10);

                    if (numC8>100){
                        System.out.println("El numero es mayor a 100");
                    }else if (numC8<100){
                        System.out.println("El numero es menor a 100");
                    }else{
                        System.out.println("El numero es 100");
                    }

                    break;

                case 9:
                    String nombre;

                    input.nextLine();

                    do {
                    System.out.println("Ingrese su nombre:");
                    nombre= input.nextLine();
                    }while (nombre.isBlank());

                    System.out.print("Buenos dias, "+nombre);

                    break;

                case 10:

                    double radio;

                    System.out.println("Ingrese el valor del radio:");
                    radio= input.nextDouble();

                    double longitudCircunferencia=radio*Math.PI*2;
                    double areaCirculo=Math.pow(radio,2)*Math.PI;

                    System.out.printf("La longitud de la circunferencia es: %.2f%n", longitudCircunferencia);
                    System.out.printf("El area del circulo es: %.2f%n", areaCirculo);

                    break;

                case 11:
                    double velocidad;

                    System.out.println("Ingrese la velocidad en KM/H: ");
                    velocidad=input.nextDouble();

                    velocidad= velocidad*1000/3600;

                    System.out.printf("La velocidad en m/seg es: %.2f%n", velocidad);

                    break;

                case 12:

                    double cateto1, cateto2;

                    System.out.println("Ingrese el valor del primer cateto: ");
                    cateto1= input.nextDouble();

                    System.out.println("Ingrese el valor del segundo cateto: ");
                    cateto2= input.nextDouble();

                    double hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));

                    System.out.println("El valor de la hipotenusa de un triangulo rectangulo de catetos " +cateto1+ " y " +cateto2+ " es: " +hipotenusa);

                    break;

                case 13:

                    double radio13;

                    System.out.println("Ingrese el valor del radio:");
                    radio13= input.nextDouble();

                    double volumen=Math.pow(radio13,3)*Math.PI*4/3;

                    System.out.println("El volumen de una espera de radio " +radio13+ " es:" +volumen);

                    break;

                case 14:

                    int num14, unidad, decena, centena;

                    do{
                        System.out.println("Ingrese un numero entero de 3 cifras");
                        num14=input.nextInt();
                    }while(Math.abs(num14)>999 || Math.abs(num14)<100);

                    unidad= num14%10;
                    num14=num14/10;
                    decena=num14%10;
                    num14=num14/10;
                    centena=num14;

                    System.out.println("Centena: "+centena);
                    System.out.println("Decena: "+decena);
                    System.out.println("Unidad: "+unidad);

                    break;

                case 15:

                    break;

                case 16:

                    break;

                case 17:

                    break;

                case 18:

                    break;

                case 19:

                    break;

                case 20:

                    break;

                case 21:

                    break;

                default:

                    break;

            }
            input.nextLine();
            String chequear;
            do {

                System.out.println("Desea continuar? (ingresos s o n)");
                chequear = input.nextLine();
            } while (chequear.isEmpty());
            continuar = chequear.charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Hasta la Proxima!");


    }



}
