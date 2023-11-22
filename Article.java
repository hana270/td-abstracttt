package td5;

public abstract class Article {
protected long reference;
protected String libelle ;
protected float prixht;
protected double qtestock=0;
protected final float tva=0.1f;

public Article(long ref, String lib, float p, int q) {
	this.reference=ref;
	this.libelle=lib;
	this.prixht=p;
	this.qtestock=q;
}
public void approvisionner(int nb) {
	this.qtestock+=nb;
}
@Override
public String toString() {
	return "Reference :"+this.reference+" L'intitulé : "+this.libelle;
}

public void decrire() {
	System.out.println(this.toString());
}
abstract public float calculPrixTTC();

public boolean appartientPromo() {
	Article a = null;
	if((a instanceof Vetement)|| (a instanceof ProduitElec)){
		return true;
	}
    return false; 
    }

public boolean estDispo(int qteAchat) {
	if(this.qtestock>=qteAchat) {
		return true;
	}
	return false;
}

}

