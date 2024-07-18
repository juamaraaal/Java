import java.util.Scanner;
class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();

        System.out.println("Hello, " + nome + "sua idade é:" + idade);
    }

    
}
