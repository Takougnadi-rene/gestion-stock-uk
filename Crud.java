public class Crud {

    // Attributs
    String nomProduit = "";
    int quantite = 0;
    double prix = 0.0;

    // Constructeur d'initialisation
    public Crud(String pNomProduit, int pQuantite, double pPrix) {
        nomProduit = pNomProduit;
        quantite = pQuantite;
        prix = pPrix;
    }
    public void supprimerProduit(){
        for(int i=0; i<nomProduit.length();i++){
            while (this.nomProduit.equals(nomProduit)) {
                    this.nomProduit.remove(i);
                    System.out.println("Le produit " + nomProduit + " a été supprimé.");
                }
        }
    }
    // 2- Modifier : une méthode ModifierProduit(String pNomProduit,int
    // pQuantite,double pPrix) qui ne retourne rien (void)



// Setters
public void ModifierProduit(String nomProduit,double prix,int quante) {
    this.nomProduit = nomProduit;
    this.quantite = quantite;
    this.prix = prix;
}


}


    

    // 3- Supprimer: une méthode supprimerProduit() qui ne retourne rien(void)

    // 4- Afficher: une méthode afficherProduit() qui ne retourne rien(void)

}
