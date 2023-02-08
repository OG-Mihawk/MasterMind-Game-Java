import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vue extends JFrame implements WindowListener {

    public Vue(){
        VueClavier clavier = new VueClavier();
        this.setLayout(new BorderLayout());
        addWindowListener(this);
        this.add(clavier, BorderLayout.SOUTH);
        this.setTitle("MasterMind");
        this.setSize(300,600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Vue();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
