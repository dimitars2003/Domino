package Domino;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JComponent;

public class DominoTableView extends JComponent{
	private DominoTable table;
	public DominoTableView () {
		table = new DominoTable();
	}
	public DominoTableView(DominoTable table)
	{	
		if(table != null)
		{
			this.table = table;
		}
	}
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D g =  (Graphics2D) graphics;
		g.setColor(Color.GREEN);
		g.fill(new Rectangle2D.Double(10,10,900,900));
		g.draw(new Rectangle2D.Double(10, 10, 700, 700));
		
		int x = 20;
		int y = 20;
		DominoTile [] tiles = new DominoTile [table.getCount()];
		tiles = table.getTiles();
		
		
		for(int i = 0; i < table.getCount();i++) {
			System.out.println("ok");
			g.setColor(Color.black);
			g.drawRect(x, y, 80, 40);
			g.drawLine(x+80-40, 20, x+80-40, 60);
			
			drawDotsLeft(tiles[i].getLeft(),x,y,g,40, 40);
			drawDotsLeft(tiles[i].getRight(),x+40,y,g,40, 40);
			x += 100;
		}
		
		
	}
	private void drawDotsLeft(int dots, int x, int y,Graphics2D g, int lenght, int width) {
		int r = 5;
		if(dots == 1) {
			
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
		}
		if(dots == 2) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 3) {
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 4) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 5) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
		}
		if(dots == 6) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/2, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/2, r, r);
		}
	}
	
	private void drawDotsRight(int dots, int x, int y,Graphics2D g, int lenght, int width) {
		int r = 5;
		if(dots == 1) {
			
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
		}
		if(dots == 2) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 3) {
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 4) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
		}
		if(dots == 5) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/2, y-(r/2)+width/2, r, r);
		}
		if(dots == 6) {
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/4*3, r, r);
			g.drawOval(x-(r/2)+lenght/4, y-(r/2)+width/2, r, r);
			g.drawOval(x-(r/2)+lenght/4*3, y-(r/2)+width/2, r, r);
		}
	}
}
