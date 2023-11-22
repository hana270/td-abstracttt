package td5;

public class ProduitElec extends Article implements Promotion {
	private String categorie;

    public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        this.categorie = categorie;
    }
    @Override
    public String toString() {
    	return super.toString()+", Catégorie: " + categorie;
    }
    @Override
    public void decrire() {
        super.decrire();
        System.out.println(this.toString());
    }
    
@Override
	public float calculPrixTTC() {
		
		return (float) (super.prixht * (0.8*super.tva));
	}
    @Override
    public double prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return this.calculPrixTTC() *0.2; 
            } else {
            return calculPrixTTC();
        }
    }

	

}

