package fr.perreaux;

import java.time.LocalDate;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        CategoryProduits tva = new CategoryProduits("electro", 20);
        CategoryProduits tva2 = new CategoryProduits("legumes", 2);
        CategoryProduits tva3 = new CategoryProduits("jeux-video", 5);
        int prixHT = 100;
        int prixHT2 = 2;
        int prixHT3 = 50;
        Produit p = new Produit("1machineLav1", "machine à laver", prixHT, tva);
        Produit p2 = new Produit("2tom2", "tomate", prixHT2, tva2);
        Produit p3 = new Produit("3cyb773", "cyber punk 2077", prixHT3, tva3);
        LigneFacture produit1 = new LigneFacture(1, p);
        LigneFacture produit2 = new LigneFacture(5, p2);
        LigneFacture produit3 = new LigneFacture(1, p3);
        Facture facture = new Facture(1, LocalDate.now());
        facture.ajouterProduit(produit1);
        facture.ajouterProduit(produit2);
        facture.ajouterProduit(produit3);

        facture.afficherFacture();
    }
}
