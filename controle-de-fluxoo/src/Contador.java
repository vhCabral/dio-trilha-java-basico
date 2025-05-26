import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNum = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNum = scanner.nextInt();

        try {
            contar(primeiroNum, segundoNum);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número precisa ser maior que o primeiro");
        }
        scanner.close();
    }

    static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{
        int contagem = segundoNum - primeiroNum;
        for(int x = 1;x <= contagem; x++){
            System.out.println("Printando o número: "+ x);
        }
        if(primeiroNum > segundoNum){
            throw new ParametrosInvalidosException();
        }

    }
}
