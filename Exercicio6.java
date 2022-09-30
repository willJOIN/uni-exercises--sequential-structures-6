import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        float raioCirculo, areaCirculo = 0;
        final float pi = 3.1416f;

        try {
            System.out.println("Digite o raio do circulo:\n");
            Scanner scanner1 = new Scanner(System.in);
            raioCirculo = scanner1.nextFloat();

            scanner1.close();

            areaCirculo = (float) (pi * (Math.pow(raioCirculo, 2)));
        } catch (Exception ex) {
            System.out.println("Erro ao pegar raioCirculo e/ou areaCirculo no Exercicio5:\n" + ex);
        }
        System.out.println("A area do circulo eh:\n" + areaCirculo + "m²");
    }
}
