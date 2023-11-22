package td5;

public class ProduitGC extends Article {

public ProduitGC(long ref, String lib, float p, int q) {
		super(ref, lib, p, q);
		
	}



@Override
public float calculPrixTTC() {
	float prixhtt=0.0f;
	return prixhtt=(super.prixht*(1+super.tva));
}


@Override
public String toString() {
	return super.toString();
}
/*
@Override
public String toString() {
	return super.toString()+"ProduitGC []";
}
*/


@Override
public void decrire() {
	System.out.println(this.toString());
}





	
	
}
