import java.awt.*;

public class VuePropositions extends Canvas {

    int nb = 4;
    public VuePropositions() {
        super();
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 30;
        for(int j=0; j<Modele.NBR_MAX_TENTATIVES;j++){
            for (int i=0;i<Modele.DIFFICULTE;i++) {
                x = i*50;
                y=j*50;
                g.drawOval(x, y, 50, 50);

            }
        }
    }
}
