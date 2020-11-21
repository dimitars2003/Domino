package Domino;

public class DominoTable {
	private DominoTile [] dominos;
	private int count;

	public DominoTable () {
		dominos = new DominoTile[28];
		count = 0;
	}
	
	public boolean addRight(DominoTile newDominoTile) {
		if(newDominoTile == null) {
			System.out.println("Error");
			return false;
		}
		else if(count == 28) {
			System.out.println("Full");
			return false;
		}
		else {
			if(count == 0) {
				dominos[0]=newDominoTile;
				count++;
				System.out.println("First tile");
				return false;
			
			}
			else {
				if(dominos[count-1].getRight()==newDominoTile.getLeft()) {
					dominos[count]=newDominoTile;
					count++;
					return true;
				}
				else if(count==1 && dominos[count-1].getLeft()==newDominoTile.getLeft()) {
					dominos[count-1].swapLeftAndRight();
					dominos[count]=newDominoTile;
					count++;
					return true;
				}
				else if(dominos[count-1].getRight()==newDominoTile.getRight()) {
					newDominoTile.swapLeftAndRight();
					dominos[count]=newDominoTile;
					count++;
					return true;
				}
				else if(count==1 && dominos[count-1].getLeft()==newDominoTile.getRight()) {
					dominos[count-1].swapLeftAndRight();
					newDominoTile.swapLeftAndRight();
					dominos[count]=newDominoTile;
					count++;
					return true;
				}
				else return false;
			}
		}
	}
	
	public boolean addLeft(DominoTile newDominoTile) {
		if(newDominoTile == null) {
			System.out.println("Error");
			return false;
		}
		else if(count == 28) {
			System.out.println("Full");
			return false;
		}
		else {
			if(count == 0) {
				dominos[0]=newDominoTile;
				count++;
				System.out.println("First tile");
				return false;
				
			}

			else {
				if(dominos[0].getLeft()==newDominoTile.getRight()) {
					dominos=moveTiles(dominos);
					dominos[0]=newDominoTile;
					count++;
					return true;
				}
				else if(count==1 && dominos[0].getRight()==newDominoTile.getRight()) {
					dominos[0].swapLeftAndRight();
					dominos=moveTiles(dominos);
					dominos[0]=newDominoTile;
					count++;
					return true;
				}
				else if(dominos[0].getLeft()==newDominoTile.getLeft()) {
					newDominoTile.swapLeftAndRight();
					dominos=moveTiles(dominos);
					dominos[0]=newDominoTile;
					count++;
					return true;
				}
				else if(count==1 && dominos[0].getRight()==newDominoTile.getLeft()) {
					dominos[0].swapLeftAndRight();
					newDominoTile.swapLeftAndRight();
					dominos=moveTiles(dominos);
					dominos[0]=newDominoTile;
					count++;
					return true;
				}
				else return false;
				
			}
		}
	}
	public void print () {
		for(int i = 0; i <count; i++) {
			System.out.println(dominos[i].toString());
			
		}
		
	}
	
	public DominoTile[] moveTiles(DominoTile[] dominos) {
		DominoTile [] temp = new DominoTile[28];
		for(int i = 1; i <=count; i++) {
			temp[i]=dominos[i-1];
		}
		return temp;
	}
}