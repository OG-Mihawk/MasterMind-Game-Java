import java.awt.*;

public class VueClavier extends Panel {

    public VueClavier(){
        for (Color couleur : Modele.COULEURS) {
            Button button = new Button();
            button.setBackground(couleur);
            this.add(button);
        }
    }
}
