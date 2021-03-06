import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Danijela
 */

@Entity
public class Elever implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String surname;
	private String skola;
	private int klass;

	public Elever() {
	}

	/**
	 * @author danijela
	 * 
	 * @param firstName fornamn
	 * @param surname	efternamn
	 * @param skola	skola
	 * @param klass klass
	 */
	public Elever(String firstName, String surname, String skola, int klass) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.skola = skola;
		this.klass = klass;
	}

	/**
	 * @author danijela
	 */
	public String toString() {
		return "Elev: " + this.firstName + " " + this.surname + " " + this.skola + " " + this.klass;
	}
}
