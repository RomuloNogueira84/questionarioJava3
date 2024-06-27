package questionarioaula3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Questão 4 - Remoção de elementos duplicados:
// Escreva um método que remova todos os elementos duplicados de uma lista,
// mantendo apenas a primeira ocorrência de cada elemento.
public class questao4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Atletismo");
        lista.add("Natação");
        lista.add("Esgrima");
        lista.add("Judô");
        lista.add("Ginástica Artística");
        lista.add("Vôlei de Praia");
        lista.add("Tênis de Mesa");
        lista.add("Canoagem de Velocidade");
        lista.add("Boxe");
        lista.add("Ciclismo BMX");

        System.out.println("""
        🤺⛷️🏇🏂🏌️‍♂️🏄‍♀️🏄‍♂️🏌️🚣‍♀️🏊‍♀️🤽‍♂️🤾⛹️🏋️🚴🚵🤸
        Lista Original: 
        
        """ + lista +  "\n 🤺⛷️🏇🏂🏌️‍♂️🏄‍♀️🏄‍♂️🏌️🚣‍♀️🏊‍♀️🤽‍♂️🤾⛹️🏋️🚴🚵🤸");

        List<String> listaSemDuplicados = removerDuplicados(lista);

        System.out.println("""
                🤺⛷️🏇🏂🏌️‍♂️🏄‍♀️🏄‍♂️🏌️🚣‍♀️🏊‍♀️🤽‍♂️🤾⛹️🏋️🚴🚵🤸
                
                Lista sem Duplicados: 
                
                """ + listaSemDuplicados + "\n 🤺⛷️🏇🏂🏌️‍♂️🏄‍♀️🏄‍♂️🏌️🚣‍♀️🏊‍♀️🤽‍♂️🤾⛹️🏋️🚴🚵🤸");
    }

    public static <T> List<T> removerDuplicados(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);
    }
}


