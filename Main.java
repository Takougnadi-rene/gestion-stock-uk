import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Crud> produit = new ArrayList<Crud>();
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("===___MENU PRINCIPAL___===");
            System.out.println("veuillez choisir l'action à exécuter :");
            System.out.println("choix 1: Ajouter un produit");
            System.out.println("choix 2: Modifier Produit");
            System.out.println("choix 3: Afficher Produit");
            System.out.println("choix 4: Supprimer Produit");
            System.out.println("choix 5: Rechercher Produit");
            System.out.println("choix 6: Quitter");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    // 1- Ajouter un Produit

                    break;

                default:
                    break;
            }
        } while (choix != 6);
    }
}
