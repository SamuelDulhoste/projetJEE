package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestHibernate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager em = emf.createEntityManager();
		
		try {
			run(em);
		} finally {
			
			em.close();
			emf.close();
		}
	}

	private static void  run(EntityManager em) {
		//Produit p = em.find(Produit.class, 1);
	//	System.out.println(p.getCategorie().getLibelle());
		
		List<Produit> produitlist = null;
		//produitlist = em.createQuery("select p from Produit p where p.categorie.libelle = 'HDD'", Produit.class).getResultList();
		
		//for (Produit produit2 : produitlist) {
			//System.out.println(produit2.getReference());	
			
		//}
		
		produitlist = em.find(Categorie.class, 4).getProduits();
		
		for (Produit produit2 : produitlist) {
			System.out.println(produit2.getReference());	
			
		}
		
	}


}
