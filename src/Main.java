import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static int cantidadNumeros = 3;
    public static void main(String[] args) {

        if (args.length > 0) {
            Integer nuevoArreglo[] = new Integer[args.length - 1];

            for (int i = 0; i < nuevoArreglo.length; i += 1) {
                int numero = Integer.parseInt(args[i]);
                nuevoArreglo[i] = numero;
            }

            if (args[args.length - 1].equals("A"))
                Arrays.sort(nuevoArreglo);
            else
                Arrays.sort(nuevoArreglo, Collections.reverseOrder());

            for (Integer n : nuevoArreglo)
                System.out.println(n);
        }
        else {
            Scanner entrada = new Scanner(System.in);
            Integer nuevoArreglo[] = new Integer [cantidadNumeros];

            for (int i =0; i<cantidadNumeros;i++) {
                System.out.println("Ingrese cualquier numero:");
                String numero = entrada.nextLine();
                nuevoArreglo[i]= Integer.parseInt(numero);
            }
            System.out.println("Escriba una A si desea que el orden sea ascendente, o una D si desea que sea descendente:");
            String orden = entrada.nextLine();
            if (orden.equals("A"))
                Arrays.sort(nuevoArreglo);
            else
                Arrays.sort(nuevoArreglo,Collections.reverseOrder());

            for (Integer n : nuevoArreglo)
                System.out.println(n);
        }
    }
}
