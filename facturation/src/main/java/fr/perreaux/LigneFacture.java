package fr.perreaux;

public class LigneFacture {

    private int quantiteProduit;
    private Produit produit;

    public LigneFacture(int quantite, Produit produit) {
        this.quantiteProduit = quantite;
        this.produit = produit;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public int prixTTCParQuantite() {
        int prixTTC = produit.getPrixTTC() * quantiteProduit;
        return prixTTC;
    }

    public int prixHTParQuantite() {
        int prixHT = produit.getPrixHT() * quantiteProduit;
        return prixHT;
    }

    public void afficherLigneProduit() {
        produit.afficherProduit();
        System.out.print(quantiteProduit);
        System.out.print("     ");
        System.out.print(prixHTParQuantite());
        System.out.print("     ");
    }

    public String getCodeLigneProduit() {
        return produit.getCode();
    }

}
