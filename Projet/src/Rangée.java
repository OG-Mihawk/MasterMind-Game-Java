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

    @Override
    public String toString() {
        return Arrays.toString(this.jetons);
    }
}
