package td5;

import java.time.LocalDate;

public class Achat {
    public static void main(String[] args) {
    	 Article  supermarche[];	
    	 boolean[] trouve=new boolean[4];
       supermarche= new Article[4];
       LocalDate a = LocalDate.of(2023, 3, 21);
        supermarche[0] = new Vetement(123, "Jupe bleue", 39.000f, 2, "bleue", "S");
        
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir", 42.000f,5, "noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);

        System.out.println("Est ce que ilya 0 article de 'Jupe bleue taille s' ? ");
        System.out.println("--> "+supermarche[0].estDispo(0));
        trouve[0]=supermarche[0].estDispo(0);
        
        System.out.println("********************************************");
        System.out.println("Est ce que ilya 1 article de 'TV Led 80cm' ?");
        System.out.println("--> "+supermarche[1].estDispo(1));
        trouve[1]=supermarche[1].estDispo(1);
        
        System.out.println("********************************************");
        System.out.println("Est ce que ilya 1 article de 'Pantalon noir' ?");
        System.out.println("--> "+supermarche[2].estDispo(1));
        trouve[2]=supermarche[2].estDispo(1);
        
        System.out.println("********************************************");
        System.out.println("Est ce que ilya 3 articles de 'Pâtes' ?");
        System.out.println("--> "+supermarche[3].estDispo(3));
        trouve[3]=supermarche[3].estDispo(3);

        
     
        for(int i=0;i<supermarche.length;i++) {
        	if(trouve[i]==true) { 
        		System.out.println("********************************************");
                System.out.println("Affichage de produit : "+(i+1));
                System.out.println(supermarche[i].toString());
                System.out.print("Affichage de prixTTC = ");
                System.out.println(supermarche[i].calculPrixTTC());
        	}else {
        		System.out.println(" cet article est indisponible et approvisionnez-le");

        	}
        }
    	System.out.println("****************Le montant total********************************");
    	double a1=0.0; 
    	for(int i=0;i<supermarche.length;i++) {
    		 if(trouve[i]==true) {
    			 if(supermarche[i] instanceof Vetement) {
    				 a1+=((Vetement) supermarche[i]).prixDeVente("21/03/2023");
    			 }else if(supermarche[i] instanceof ProduitElec) {
    				 a1+=((ProduitElec) supermarche[i]).prixDeVente("21/03/2023");
    			 }else
    				 a1+=supermarche[i].calculPrixTTC();
    			  
    			
    		 }
    	 }
    	System.out.println("Montant total a paye = "+a1);
 
    	
    }

    }

