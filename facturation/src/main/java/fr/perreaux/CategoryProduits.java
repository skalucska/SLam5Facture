package fr.perreaux;

public class CategoryProduits {

    private double tva;
    private String nomCategory;

    public CategoryProduits(String nomCategory, double tva) {
        this.nomCategory = nomCategory;
        this.tva = tva;

    }

    public String getNomCategory() {
        return nomCategory;
    }

    public double getTva() {
        return tva;
    }
}
