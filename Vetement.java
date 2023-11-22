package td5;

public class Vetement extends ProduitGC  implements Promotion {
private String Couleur;
private String taille;

public Vetement(long ref, String lib, float p, int q,String Couleur , String taille) {
	super(ref, lib, p, q);
	this.Couleur=Couleur;
	this.taille=taille;
	
}


@Override
public String toString() {
	return super.toString()+" ,Couleur : "+this.Couleur+" et de Taille = "+this.taille;
}
public void decrire() {
	System.out.println(toString());
}

@Override
public double prixDeVente(String dateStr) {
	 if (estPeriodePromo(dateStr)) {
         return super.calculPrixTTC()* 0.3;
         }else{
         return super.calculPrixTTC();
     }
 }

}
