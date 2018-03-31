public class Teste {

    public static void main(String[] args) {
        int variavel_auxiliar = 0;
        int numero = 24;

        int n = (numero * (numero + 1)) / 2;

        int x = numero * ((numero + 1) * (numero + 2));

        System.out.println(x);

        System.out.println("O número triangular de lado " + numero + " é: " + n);

        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= (numero - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                contador++;
                System.out.print("   " + contador);
            }

            System.out.println("");
        }
    }

}
