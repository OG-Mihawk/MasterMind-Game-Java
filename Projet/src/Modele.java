import java.awt.*;
import java.util.ArrayList;
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
    ArrayList<Rangée> proposition =  new ArrayList<>();
    Rangée proposer;
    Color[] couleurs_choisi = new Color[DIFFICULTE];
    int indice_tableau_couleurs_choisi = 0;
    Random randomizer = new Random();
    int proposition_en_cours = 0;
    int tentatives;
    public ArrayList historique_des_propositions()

    {

        return this.proposition;
    }
    public String evaluer_propositions()
    {
        int bien_placé = 0;
        int mal_placé = 0;
        for (int i = 0;i<DIFFICULTE;i++)
        {
            if (this.proposer.couleurs_choisi(i) == this.combinaison.couleurs_choisi(i))
            {
                bien_placé++;
            }
            else
            {
                mal_placé++;
            }
        }
        return bien_placé +" "+ mal_placé;
    }
    public void completer_propositions(Color[] couleur)
    {
        this.couleurs_choisi = couleur;
        this.indice_tableau_couleurs_choisi++;
        if (indice_tableau_couleurs_choisi == DIFFICULTE)
        {
            this.proposer = new Rangée(this.couleurs_choisi);
            this.proposition.add(proposer);
            System.out.println(evaluer_propositions());
            demarrer_nouvelle_propositions();
        }
    }
    public void demarrer_nouvelle_propositions()
    {
            this.proposition_en_cours++;
            this.couleurs_choisi = new Color[DIFFICULTE];
            this.indice_tableau_couleurs_choisi = 0;
            this.proposer = null;
    }
    public void combinaison()
    {
        Color[] couleurs = new Color[DIFFICULTE];

        for (int i =0;i<DIFFICULTE;i++)
        {
            couleurs[i] = this.COULEURS[this.randomizer.nextInt(this.COULEURS.length)];
        }
        combinaison = new Rangée(couleurs);
    }
    public void archiver_proposition()
    {

    }
    Modele(int difficulté)
    {
        this.DIFFICULTE = difficulté;
        this.état = Etat.EN_COURS;
    }
    public static void main(String[] args) {
        Modele a = new Modele(5);
        a.combinaison();
        Color[] test = new Color[a.DIFFICULTE];
        for (int i = 0;i<a.DIFFICULTE;i++)
        {

            Color couleur = a.COULEURS[a.randomizer.nextInt(a.COULEURS.length)];
            test[i] = couleur;
            a.completer_propositions(test);

        }
        for (int i = 0;i<a.DIFFICULTE;i++)
        {

            Color couleur = a.COULEURS[a.randomizer.nextInt(a.COULEURS.length)];
            test[i] = couleur;
            a.completer_propositions(test);

        }
        System.out.println(a.proposition);
    }



}
