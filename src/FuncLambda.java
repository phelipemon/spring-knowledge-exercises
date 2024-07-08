import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FuncLambda {

    public void testaLista() {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer i : lista) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //com o uso de funções lambda, podemos simplificar esse código:
        lista.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }

    public void testaStream(){

        List<String> nomes = Arrays.asList("Joao", "Maria", "Paulo", "Iasmin", "Arrascaeta");

        //operações encadeadas dentro de um fluxo
        nomes.stream()
                .sorted() //ordena a lista em ordem alfabética
                .limit(3) //apos a ordenação está limitando a lista apenas aos 3 primeiros
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println); // imprimindo a lista, neste caso irá sair apenas os 3 nomes que foram limitados e ordenados anteriormente

        //Operações intermediáris (neste caso acima - .sorted() e .limit())
        //Operações finais (neste caso acima - .forEach())
        //Algumas operações finais comuns são o forEach, collect e count.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)//Filter: permite filtrar os elementos da stream com base em uma condição.
                .collect(Collectors.toList());

        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]

        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

        List<Integer> tamanhos = palavras.stream()
                .map(s -> s.length())
                //Map: permite transformar cada elemento da stream em outro tipo de dado.
                .collect(Collectors.toList());

        System.out.println(tamanhos); // Output: [4, 6, 11, 17]

        //Vamos ver alguns exemplos de operações finais:

        List<String> nomes2 = Arrays.asList("João", "Maria", "Pedro", "Ana");
        nomes2.stream()
                .forEach(nome -> System.out.println("Olá, " + nome + "!"));
        //ForEach: permite executar uma ação em cada elemento da stream.

            // Output:
            // Olá, João!
            // Olá, Maria!
            // Olá, Pedro!
            // Olá, Ana!

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Collect: permite coletar os elementos da stream em uma coleção ou em outro tipo de dado.

        Set<Integer> numerosPares2 = numeros2.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numerosPares2); // Output: [2, 4, 6, 8, 10]
    }

    //Além das operações intermediárias e finais mencionadas, existem muitas outras disponíveis,
    // como distinct (que remove elementos duplicados),
    // limit (que limita o número de elementos da stream),
    // skip (que pula os primeiros elementos da stream),
    // reduce (que combina os elementos da stream em um único resultado) e muitas outras.

}
