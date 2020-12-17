package fr.perreaux;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
class TestFacture {

    @Test
    void testPrixtotauxTTC() {
        // average

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

        // acts

        int res = facture.calculerPrixTotalTTC();

        // assert

        assertEquals(182, res, "bad methode");
    }

    @Test
    void testPrixTotauxHT() {
        // average

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

        // acts

        int res = facture.calculerPrixTotalHT();

        // assert

        assertEquals(160, res, "probleme attention");
    }

    @Test
    void testPrixTotauxHTapresSuppresisonProduit() {
        // average

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
        facture.supprimerProduit(produit1);

        // acts

        int res = facture.calculerPrixTotalHT();

        // assert

        assertEquals(60, res, "probleme attention");
    }

    @Test
    void testSupprimerProduit() {
        // average

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

        // acts

        facture.supprimerProduit(produit1);
        int res = facture.getNbLigneProduits();

        // assert

        assertEquals(2, res, "probleme attention");
    }
}