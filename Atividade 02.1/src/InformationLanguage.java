import java.util.Locale;

public class InformationLanguage {

    public static void informationLanguage(){

        Locale informationLanguage = Locale.getDefault();
        System.out.println("Idioma Do Sistema: "+informationLanguage.getDisplayName());
    }
    
}
