public class TestaCaixa {
    public static void main(String[] args) {

        Caixa<String> caixa = new Caixa<>();
        caixa.setConteudo("Controle");
        System.out.println(caixa.getConteudo());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.setConteudo(33);
        System.out.println(caixaDeNumero.getConteudo());
        var s =caixaDeNumero.somaConteudoNaCaixa("S");
        System.out.println(s);
    }
}