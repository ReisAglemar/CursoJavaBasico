import java.awt.Dimension;
import java.awt.Toolkit;

public class InformationScreen {

    public static void informationScreen() {

        Dimension informationScreen = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) informationScreen.getWidth();
        int height = (int) informationScreen.getHeight();

        System.out.println("Resolução Do Monitor: " + width + "x" + height);

    }

}
