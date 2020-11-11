package Domino;

public class TestDominoTile {

	public static void main(String[] args) {
		DominoTile d1 = new DominoTile (6,6);
		System.out.println(d1.toString());
		DominoTile d2 = new DominoTile(5,5);
		System.out.println(d1.equals(d2));

	}

}
