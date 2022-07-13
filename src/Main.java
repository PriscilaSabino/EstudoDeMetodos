public class Main {

    public static void main(String[] args) {
        //Chamando os métodos

        //Calculadora ex 01
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(1, 4);
        Calculadora.multiplicacao(5, 10);
        Calculadora.divisao(25, 3);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(6);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(4000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
