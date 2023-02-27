package aplicacion;
import java.util.ArrayList;
import java.util.List;
import dominio.ej14_10;
public class Principal {
    public static void main(String[] args) {
        List <String> al = new ArrayList<>();
        al.add("Hola");
        al.add("Mundo");
        al.add("Java");
        System.out.println(dominio.ej14_10.transformarAMinusculas(al));
    }
}
