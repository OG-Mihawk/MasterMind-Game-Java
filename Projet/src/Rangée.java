import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Rangée {
    Color[] jetons;
    int indiceJeton;
    int noirs;
    int blancs;
    Rangée(Color[] couleurs)
    {
        this.jetons = couleurs;
        this.indiceJeton = 0;
        this.noirs = 0;
        this.blancs = 0;

    }
    public Color couleurs_choisi(int indice)
    {
        return this.jetons[indice];
    }
    @Override
    public String toString() {
        return Arrays.toString(this.jetons);
    }
}
