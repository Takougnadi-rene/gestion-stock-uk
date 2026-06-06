import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Crud> produits = new ArrayList<Crud>();
        Scanner sc = new Scanner(System.in);
        int choix,quantite;
        double prix;
        String nom = new String();
        String nouveauNom = new String();

        do {
            System.out.println("===___MENU PRINCIPAL___===");
            System.out.println("veuillez choisir l'action à exécuter :");
            System.out.println("choix 1: Ajouter un produit");
            System.out.println("choix 2: Modifier Produit");
            System.out.println("choix 3: Afficher les Produits");
            System.out.println("choix 4: Supprimer Produit");
            System.out.println("choix 5: Rechercher Produit");
            System.out.println("choix 6: Quitter");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    // 1- Ajouter un Produit

                    break;

                case 2:
                    System.out.println("Vous sohaitetez modifier un produit ? veuillez entrer le nom du produit :");
                    sc.nextLine();
                    nom = sc.next();
                    System.out.println("veuillez entrer le nouveau nom");
                    sc.nextLine();
                    nouveauNom = sc.next();
                    System.out.println(",veuillez entrer le nouveau prix");
                    prix = sc.nextDouble();
                    System.out.println("veuillez entrer la nouvelle quantité");
                    quantite = sc.nextInt();
                   
                    for (Crud produit : produits){
                        if (produit.nomProduit.equals(nom)) {
                            ModifierProduit(nouveauNom,prix,quantite)
                        }
                    }
                    break;
                case 3:
                    System.out.println("Voici les produits que l'on a :");
                    afficherProduit();
                    break;
                case 4:
                    System.out.println("Vous sohaitetez suprimer un produit ? veuillez entrer le nom du produit :");
                    sc.nextLine();
                    nom = sc.next();
                    for (Crud produit : produits){
                        if (produit.nomProduit.equals(nom)) {
                            supprimerProduit(nouveauNom);
                        }
                    }
                    break;
                case 5:
                    // fonctionnalite Rechercher
                    String produitAChercher = new String();
                    System.out.println("Entree produit a chercher");
                    sc nextLine();
                    produitAchercher = sc.next();
                    for (Crud produit:produits){
                        if(produit.nomProduit.equal(produitAChercher)){
                            system.out.println("Ce produit est disponible");
                        }
                        else{
                            system.out.println("Produit indisponible");
                        }
                    }
    
                    break;

                case 6:
                    System.out.println("AU Revoir");

            }
        } while (choix != 6);
    }
}
