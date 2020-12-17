package fr.perreaux;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class TestProduit {

    @Test
    void testPrixPrixTTCAvecTva() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 20);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);

        // acts

        int res = (int) p.getPrixTTC();

        // assert

        assertEquals(120, res, "bad methode");
    }

    @Test
    void testPrixPrixTTCSansTva() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 0);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);

        // acts

        int res = (int) p.getPrixTTC();

        // assert

        assertEquals(100, res, "bad methode");
    }

    @Test
    void testPrixPrixHT() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 20);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);

        // acts

        int res = (int) p.getPrixHT();

        // assert

        assertEquals(100, res, "bad methode");
    }
}
