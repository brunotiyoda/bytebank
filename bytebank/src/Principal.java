import java.util.Scanner;

public class Principal {

    static void numeroTriangular(Integer numero) {
        for (int i = 1; i * (i + 1) * (i + 2) <= numero; i++) {
            if (i * (i + 1) * (i + 2) == numero) {
                System.out.println(i + "*" + (i + 1) + "*" + (i + 2));
            }
        }
    }

    static Boolean parImpar(Integer numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par!");
            return true;
        } else {
            System.out.println("O número " + numero + " é impar!");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;

        System.out.print("Número do triângulo?: ");
        numero = lector.nextInt();

        numeroTriangular(numero);
        parImpar(numero);

    }
}
