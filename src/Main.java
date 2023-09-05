import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = new Random().nextInt(100);
        //System.out.println(valor);
        Scanner ler = new Scanner(System.in);
        int contador =0;
        while(contador <5){
            System.out.println("Insira um valor entre 1 e 100");
            int tentativa = ler.nextInt();
            if (tentativa > valor){
                System.out.println("O valor é menor que " + tentativa);
            }
            if (tentativa < valor){
                System.out.println("O valor é maior que " + tentativa);
            }
            if (tentativa == valor){
                System.out.println("Parabens, você acertou o valor!!");
                break;
            }
            contador++;
        }
        if (contador == 5){
            System.out.println("Infelizmente você não conseguiu, tente novamente.");
            System.out.println("o valor era: " + valor);
        }
    }
}
