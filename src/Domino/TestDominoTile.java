package Domino;

public class TestDominoTile {

	public static void main(String[] args) {
		DominoTile d1 = new DominoTile (5,6);
		System.out.println(d1.toString());
		DominoTile d2 = new DominoTile(6,6);
		System.out.println(d1.equals(d2));
		System.out.println();
		DominoTile d3 = new DominoTile (5,4);
		DominoTile d4 = new DominoTile (1,4);
		DominoTable d = new DominoTable();
		d.addRight(d1);
		d.print();
		d.addRight(d2);
		d.print();
		d.addLeft(d3);
		d.print();
		d.addLeft(d4);
		
		d.print();
		
	}

}
