package dominio;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import  java.util.ArrayList;
public class ej14_10 {
    public static List<String> transformarAMinusculas(List<String> al){
        return Stream.iterate(0,i->i+1).limit(al.size()).map(i->al.get(i).toLowerCase()).collect(Collectors.toCollection(ArrayList::new));
    }
}
