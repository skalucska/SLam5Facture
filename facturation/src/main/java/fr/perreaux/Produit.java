package fr.perreaux;

public class Produit {

    private String code;
    private String nom;
    private double prixHT;
    private CategoryProduits type;

    public Produit(String code, String nom, int prixHT, CategoryProduits type) {
        this.code = code;
        this.nom = nom;
        this.prixHT = prixHT;
        this.type = type;

    }

    public int getPrixTTC() {
        double tva = type.getTva();
        double prixTTC = (prixHT + (prixHT * (tva / 100)));
        return (int) prixTTC;
    }

    public int getPrixHT() {
        return (int) prixHT;
    }

    public void afficherProduit() {
        System.out.print(code);
        System.out.print("     ");
        System.out.print(nom);
        System.out.print("     ");
    }

}
