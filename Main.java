import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Maria");
        names.add("Juan");
        System.out.println("elemento de la posicion 1 es: " + names.get(1));
        names.set(1, "Ana");
        System.out.println("el tamaño de la lista es: " + names.size());
    }
}
