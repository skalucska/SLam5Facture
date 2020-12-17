package fr.perreaux;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestLigneFacture {

    @Test
    void testPrixTTCdunProduitAvecQuantite() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 20);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);
        LigneFacture produit = new LigneFacture(5, p);

        // acts

        int res = (int) produit.prixTTCParQuantite();

        // assert

        assertEquals(600, res, "bad methode");
    }

    @Test
    void testPrixHTdunProduitAvecQuantite() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 20);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);
        LigneFacture produit = new LigneFacture(5, p);

        // acts

        int res = (int) produit.prixHTParQuantite();

        // assert

        assertEquals(500, res, "probleme attention");
    }
}
