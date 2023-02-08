import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Modele {
    public static Color[] COULEURS = {Color.YELLOW, Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.WHITE,Color.BLACK};
    int N_TENTATIVES;
    public static  int DIFFICULTE;

    enum Etat {
        EN_COURS,GAGNÉ,PERDU
    };
    Etat état;
    Rangée combinaison;
    ArrayList<Rangée> proposition;
    int tentatives;
    public void historique_des_propositions(Rangée proposer)

    {
        proposition.add(proposer);

    }
    public void evaluer_propositions()
    {
    }
    public void completer_propositions()
    {

    }
    public void demarrer_propositions()
    {

    }
    public void combinaison()
    {
        Color[] couleurs = new Color[DIFFICULTE];
        Random randomizer = new Random();
        for (int i =0;i<DIFFICULTE;i++)
        {
            couleurs[i] = this.COULEURS[randomizer.nextInt(this.COULEURS.length)];
        }
        combinaison = new Rangée(couleurs);
    }
    public void archiver_proposition()
    {

    }
    Modele(int difficulté)
    {
        this.DIFFICULTE = difficulté;
    }
    public static void main(String[] args) {
        Modele a = new Modele(5);
        a.combinaison();
        System.out.println(a.combinaison);
    }



}
