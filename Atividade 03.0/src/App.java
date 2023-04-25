import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Scanner entradaTeclado = new Scanner(System.in); //"escutando" o teclado 

        System.out.print("Digite seu nome: ");
        String nome = entradaTeclado.nextLine(); // carrega a entrada em variavel

        System.out.print("Digite o ano de nascimento : ");
        int anoNascimento = entradaTeclado.nextInt();
        entradaTeclado.close(); // correcao do avisao "variavel is never close"
        int idade = 2023 - anoNascimento;



        System.out.println();
        System.out.println("------------------------------DADOS------------------------------");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();

    }
}
