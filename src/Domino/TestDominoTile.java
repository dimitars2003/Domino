package Domino;

import javax.swing.JFrame;

public class TestDominoTile {

	public static void main(String[] args) {
		DominoTile d1 = new DominoTile (5,6);
		System.out.println(d1.toString());
		DominoTile d2 = new DominoTile(6,1);
		System.out.println(d1.equals(d2));
		System.out.println();
		DominoTile d3 = new DominoTile (5,4);
		DominoTile d4 = new DominoTile (2,4);
		DominoTile d5 = new DominoTile (1,3);
		DominoTable d = new DominoTable();
		d.addRight(d1);
		d.print();
		d.addRight(d2);
		d.print();
		d.addLeft(d3);
		d.print();
		d.addLeft(d4);
		d.addRight(d5);
		d.print();
		JFrame  f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,900,500);
		f.setVisible(true);
		f.setLayout(null);
		
		DominoTableView gui = new DominoTableView (d);
		
		gui.setBounds(20,20,600,300);
		gui.setVisible(true);
		f.add(gui);
		
	}

}
