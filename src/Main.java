import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
        Calculos calculos=new Calculos();
        String opcion;
        boolean salir=false;
        String MENU= """                
               Menú Cálculos
               1. Introducir números
               2. Mostrar suma
               3. Mostrar media
               10. Salir
               """;


        do {
            System.out.println(MENU);
            opcion=leer.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Intoducir los 3 números");
                    int[] numeros=new int[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Numero "+(i+1));
                        numeros[i]= leer.nextInt();
                        leer.nextLine();
                    }
                    calculos.setNumeros(numeros);
                break;

                case "2":
                    if (calculos.getNumeros()==null){
                    System.out.println("Tiene que introducir los números en la opción 1");
                    break;
                    }
                    System.out.println("La suma es "+calculos.suma());
                    break;

                case "3":
                    if (calculos.getNumeros()==null) {
                        System.out.println("Tiene que introducir los números en la opción 1");
                        break;
                    }
                    System.out.println("la media es "+calculos.media());
                    break;

                case "10":
                    salir=true;
                break;

                default:
                    System.out.println("Opción no válida");
                    break;

            }

        }while(!salir);






    }

}