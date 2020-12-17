package fr.perreaux;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    void testProduitAvecTva_getprixTTC_renvoiPrixHt() {
        // average

        CategoryProduits tva = new CategoryProduits("electro", 20);
        int prixHT = 100;
        Produit p = new Produit("premierProduit", "produit", prixHT, tva);

        // acts

        int res = p.getPrixTTC();

        // assert

        assertEquals(120, res, "good methode");
    }

    @Test
    void testProduitSansTva_getprixTTC_renvoiPrixHt() {
        // average

        CategoryProduits pasDeTva = new CategoryProduits("livre", 0);
        int prixHT = 100;
        Produit p = new Produit("Deuxième Produit", "produit", prixHT, pasDeTva);

        // acts

        int res = p.getPrixTTC();

        // assert

        assertEquals(100, res, "good methode");
    }

}
