import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateInformation {

    public static int dateInformation() {

        Calendar dateInformation = GregorianCalendar.getInstance(); // calendario
        int anoAtual = dateInformation.get(Calendar.YEAR); // extrair o ano do calendario em uma variavel ano
        return anoAtual; // retorna a varial para quem chamou
        

    }
}
