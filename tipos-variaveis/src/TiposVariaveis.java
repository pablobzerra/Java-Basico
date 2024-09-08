public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //contem 8 tipos primitivos
        //int, short, char, bytes, boolean, float, doubl e long. Nao sao considerado obijetos
        // o ponto siginifica virgula no formago americano
        byte n0 = 123;
        short n1 = 2024;
        int n2 = 12345678;
        long n3 = 12345678901L;
        float n4 = 1.0f;
        double n5 =  2500.05;


        //exemplo doq fazee e nao fazer

        short n6 = 1;
        int n7 = n6;
        short n8 = (short) n7; //esse metodo se chama casting

        //nao pode fazer short n8 = n7 por motivo de tipagem

        //Variaveis e contantes

        //tipo final = nao pode ser alterado
        //constantes tem que ser tudo em maiusculo

        final int exemplo = 0; 



        

    }
}
