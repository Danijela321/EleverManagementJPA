import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Danijela
 */
public class TestJPA {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eleverDb");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		 Elever elever1 = new Elever("Frank35", "Andersson", "Teknikhogskolan", 2);
		 Elever elever2 = new Elever("Black35", "Andersson", "Folkhogskolan", 1);
		 em.persist(elever1);
		 em.persist(elever2);

		Query q = em.createQuery("select elever from Elever elever");

		List<Elever> results = q.getResultList();

		for (Elever eleverna : results) {
			System.out.println(eleverna);
		}
		tx.commit();
		em.close();

	}

}
