import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestaStreams {
    public static void main(String[] args) {

        infiniteStream();
        flatMap();
        reduce();

    }

    //Streams que não têm um tamanho definido. Eles são úteis quando queremos gerar uma sequência de números ou valores.
    //Stream infinito com o método iterate
    public static void infiniteStream(){
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    //O método flatMap é uma operação intermediária que é usada para transformar um Stream de coleções em um Stream de elementos
    //Neste exemplo, transformamos um Stream de List para um Stream de Strings.
    public static void flatMap(){

        List<List<String>> list = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );


        Stream<String> stream = list.stream()
                .flatMap(Collection::stream);

        stream.forEach(System.out::println);

    }

    //Stream.reduce() é uma operação terminal que é utilizada para reduzir o conteúdo de um Stream para um único valor.
    //No exemplo, somamos todos os números da lista usando o método reduce().
    public static void reduce(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.stream().reduce(Integer::sum);
        result.ifPresent(System.out::println); //prints 15
    }
}
