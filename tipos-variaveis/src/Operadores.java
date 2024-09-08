public class Operadores {
    public static void main(String[] args) {
        //operadoe de atribuicao é representado pelo sinal de =

        String nome = "Exemplo";
        int idade = 30;
        double peso = 60.05;
        char sexo = 'M';
        boolean isCarro = false;
        //Classe exem = new Classe(); -- criando um novo objeto

        //operadores aritimeticos -- +(adicao), /(divisao), *(multiplicao), -(subtracao)

        double soma = 5.0 + 5.50;
        int subtracao = 6 - 10;
        int multiplicao = 5 * 10;
        int divisao = 5 / 10;
        int modulo = 5 % 10; //restos de uma operacao

        //o sinal + quando é usado em um tipo texto ele fara uma (concatenacao)

        String exemploString = "LINGUAGEM " + "JAVA";
        System.out.println(exemploString);
        

        //concatenacao
        String concatenacao = "?";

        concatenacao = "1" + 1 + 1; //se tiver um tipo texto ele nao fara a soma e sim a concatenacao
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); //ele fara a operacao primeiro e depois vai concatenar
        System.out.println(concatenacao);

        




    }
}
