package film;

public class TestFilm {

	public static void main(String[] args) {
		
		String[] attori = {"Keir Dullea", "Gary Lockwood","William Sylvester"};
		
		Film f = new Film("2001, odissea nello spazio", 139, 1968, "Fantascienza", "Stanley Kubrick", attori);
		
		System.out.println(f);
	}
}
