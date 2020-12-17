package fr.perreaux;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Facture {

    private int id;
    private LocalDate date;
    private List<LigneFacture> ligneProduits = new ArrayList<>();

    public Facture(int id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public int calculerPrixTotalTTC() {
        int prixTotauxTTC = 0;
        for (LigneFacture produit : ligneProduits) {
            prixTotauxTTC += produit.prixTTCParQuantite();
        }
        return prixTotauxTTC;
    }

    public int calculerPrixTotalHT() {
        int prixTotauxHT = 0;
        for (LigneFacture produit : ligneProduits) {
            prixTotauxHT += produit.prixHTParQuantite();
        }
        return prixTotauxHT;
    }

    public void ajouterProduit(LigneFacture produit) {
        ligneProduits.add(produit);
    }

    public void supprimerProduit(LigneFacture produit) {
        ligneProduits.remove(produit);
    }

    public void afficherFacture() {
        for (LigneFacture produit : ligneProduits) {
            produit.afficherLigneProduit();
            System.out.print("     ");
            System.out.println("\n");
        }
        System.out.println();
        System.out.print(calculerPrixTotalHT());
        System.out.print("     ");
        System.out.print(calculerPrixTotalTTC());
    }

    public int getNbLigneProduits() {
        int compteur = 0;
        for (LigneFacture ligneproduit : ligneProduits) {
            compteur++;
        }
        return compteur;

    }

    public int getNbProduitTotal() {
        int produitTotal = 0;
        for (LigneFacture ligneProduit : ligneProduits) {
            produitTotal += ligneProduit.getQuantiteProduit();
        }
        return produitTotal;
    }
}