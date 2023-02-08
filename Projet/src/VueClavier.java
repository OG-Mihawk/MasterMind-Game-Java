import java.awt.*;

public class VueClavier extends Panel {

    public VueClavier(){
        this.setLayout(new FlowLayout());
        Button boutton = new Button("b");
        this.add(boutton);
    }
}
