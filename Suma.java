import java.util.List;

public class Suma {

    public static int sumar(List<Integer> lista) {
        int s = 0;
        for (int x : lista) {
            s += x;
        }
        return s;
    }


    public static int contarPares(List<Integer> lista) {
        int c = 0;
        for (int x : lista) {
            if (x % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public static boolean buscar(List<Integer> lista, int b) {
        boolean esta = false;
        for (int x : lista) {
            if (x == b) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public static void main(String[] args) {

        java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int suma = sumar(numeros);
        System.out.println("La suma de los elementos es: " + suma);


        int pares = contarPares(numeros);
        System.out.println("Cantidad de números pares: " + pares);


        int elementoBuscado = 5;
        boolean encontrado = buscar(numeros, elementoBuscado);
        System.out.println("¿El elemento " + elementoBuscado + " está en la lista? " + encontrado);

        elementoBuscado = 15;
        encontrado = buscar(numeros, elementoBuscado);
        System.out.println("¿El elemento " + elementoBuscado + " está en la lista? " + encontrado);
    }
}
