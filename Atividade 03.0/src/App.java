import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Scanner entradaTeclado = new Scanner(System.in); //"escutando" o teclado ATIVIDADO

        System.out.print("Digite seu nome: ");
        String nome = entradaTeclado.nextLine(); // carrega a entrada em uma variavel nome

        System.out.print("Digite o ano de nascimento : ");
        int anoNascimento = entradaTeclado.nextInt();// carrega a entrada em uma varialvel anoNascimento

        entradaTeclado.close(); // correcao do aviso "variavel is never close" "escutando" o teclado DESATIVADO
                
        int anoAtual = DateInformation.dateInformation(); //chama o metodo dateinformation e salva o returno em ano       
        int idade = anoAtual - anoNascimento; //calculo basico



        System.out.println();
        System.out.println("------------------------------DADOS------------------------------");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();

        


    }
}
