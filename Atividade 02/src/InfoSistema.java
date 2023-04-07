import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;


public class InfoSistema {
    public static void main(String[] args) throws Exception {

        // 1 - CHAMAR A CLASSE DATEINFO, E DAR UM GET EM DATE RETORNANDO DATA     
        // 2 - CHAMAR A CLASSE LANGUAGE, DAR GET E RETORNAR O IDIOMA DO SISTEMA
        // 3 - CHAMAR A CLASSE RESOLUTION, DAR GET E RETORNAR A RESOLUCAO DO SISTEMA 

        //O desafio é buscar tres informações no sistema, hora, idioma e resolucao.
        //Tentei fazer utilizando POO, porem nao funciona, eu nao sei onde esta o erro
        //e tambem nao sei qual pergunta fazer para corrigir isso, sendo assim, sera realzado 
        //o desafio basico. No futuro tentarei POO novamente. 07/04/23.
              
        Date horaCerta = new Date();
        Locale infoSistema = Locale.getDefault();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = (int) tela.getWidth();
        int altura  = (int) tela.getHeight();
    
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Hora certa: " + horaCerta.toString());
        System.out.println("Idioma do sistema: " +infoSistema.getDisplayName());
        System.out.println("Resolução de tela: " +largura +"X" +altura);       
        System.out.println("-------------------------------------------------");
        System.out.println();
    }    
}
