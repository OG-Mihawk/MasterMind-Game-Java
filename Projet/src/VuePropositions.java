import java.awt.*;

public class VuePropositions extends Canvas {

    int nb = 4;
    public VuePropositions() {
        super();
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 30;
        super.paint(g);
        if (nb >= 1) {
            for (int i=nb;i>=1;i--) {
                g.drawOval(x, y, 50, 50);
                x +=60;
            }
        }
    }
}
