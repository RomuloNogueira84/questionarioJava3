package questionarioaula3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Questão 5 - Média de Valores Únicos:
//Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros,
// ou seja, excluindo os valores duplicados da média.
public class questao5 {
        public static void main(String[] args) {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Carneirinho 1");
            lista.add("Carneirinho 2");
            lista.add("Carneirinho 3");
            lista.add("Carneirinho 4");
            lista.add("Carneirinho 2");
            lista.add("Carneirinho 5");
            lista.add("Carneirinho 3");
            lista.add("Carneirinho 4");
            lista.add("Carneirinho 6");
            lista.add("Carneirinho 7");

            double media = calcularMediaUnicos(lista);

            System.out.println("Lista Original: " + lista);
            System.out.println("""
                    🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑
                    
                    Média dos valores únicos: 
                    
                    🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑🐏🐑
                     """  + media );
        }

        public static double calcularMediaUnicos(List<String> lista) {
            List<String> unicos = lista.stream().distinct().collect(Collectors.toList());

            if (unicos.isEmpty()) {
                return 0;
            }

            int soma = unicos.size();
            return (double) soma / unicos.size();
        }
    }


