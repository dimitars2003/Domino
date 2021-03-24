package Domino;

public class DominoTile {
	private int left;
	private int right;
	
	public DominoTile() {
		left=0;
		right=0;
	}
	public DominoTile(int left, int right) {
		if(left>=0&&left<=6)
		this.left=left;
		if(right>=0&&right<=6)
		this.right=right;
		
	}
	
	public int getLeft() {
		return(left);
	}
	public int getRight() {
		return(right);
	}
	
	public void swapLeftAndRight() {
		int temp;
		temp = right;
		right=left;
		left=temp;
	}
	
	
	
	public String toString() {
		return Row1() + "\n" + Row2() + "\n" + Row3();
	}
	public String Row1() {
		String temp = new String();
		if((left == 0 ||left == 1)&& (right == 0||right==1)) {
			temp = "   |    ";
		}
		if((left==2||left == 3)&&(right == 0||right==1)) {
			temp = "*  |    ";
		}
		if((left == 4 || left == 5||left == 6) && (right == 1 || right == 0) ){
			temp = "* *|    ";
		}
		if((left == 0 || left == 1)&&(right == 2 || right == 3)) {
			temp = "   |*   ";
		}
		if((left == 2 || left == 3)&&(right == 2 || right == 3)) {
			temp = "*  |*   ";
		}
		if((left == 4 || left == 5 || left == 6)&&(right == 2 || right == 3)) {
			temp = "* *|*   ";
		}
		if((left == 0 || left == 1)&&(right == 5 || right == 4 || right == 6)) {
			temp = "   |* * ";
		}
		if((left == 2 || left == 3)&&(right == 5 || right == 4 || right == 6)) {
			temp = "*  |* * ";
		}
		if((left == 4 || left == 5 || left == 6)&&(right == 5 || right == 4 || right == 6)) {
			temp = "* *|* * ";
		}
		return temp;
	}
	public String Row2() {
		String temp = new String ();
		if((left == 0 || left == 2||left == 4)&&(right == 0||right == 2||right == 4)) {
			temp = "   |    ";
		}
		if((left == 1 || left == 3|| left == 5)&&(right == 0||right == 2||right == 4)) {
			temp = " * |    ";
		}
		if (left == 6 && (right == 0||right == 2||right == 4)) {
			temp = "* *|    ";
		}
		if((left == 0 || left == 2||left == 4)&&(right == 1 || right == 3|| right == 5)) {
			temp = "   | *  ";
		}
		if((left == 1 || left == 3|| left == 5)&&(right == 1 || right == 3|| right == 5)) {
			temp = " * | *  ";
		}
		if (left == 6 && (right == 1 || right == 3|| right == 5)) {
			temp = "* *| *  ";
		}
		if((left == 0 || left == 2||left == 4)&&(right == 6)) {
			temp = "   |* * ";
		}
		if((left == 1 || left == 3|| left == 5)&&(right == 6)) {
			temp = " * |* * ";
		}
		if (left == 6 && (right == 6)) {
			temp = "* *|* * ";
		}
		return temp;
	}
	public String Row3() {
		String temp = new String();
		if((left == 0 ||left == 1)&& (right == 0||right==1)) {
			temp = "   |    ";
		}
		if((left==2||left == 3)&&(right == 0||right==1)) {
			temp = "  *|    ";
		}
		if((left == 4 || left == 5||left == 6) && (right == 1 || right == 0) ){
			temp = "* *|    ";
		}
		if((left == 0 || left == 1)&&(right == 2 || right == 3)) {
			temp = "   |  * ";
		}
		if((left == 2 || left == 3)&&(right == 2 || right == 3)) {
			temp = "  *|  * ";
		}
		if((left == 4 || left == 5 || left == 6)&&(right == 2 || right == 3)) {
			temp = "* *|  * ";
		}
		if((left == 0 || left == 1)&&(right == 5 || right == 4 || right == 6)) {
			temp = "   |* * ";
		}
		if((left == 2 || left == 3)&&(right == 5 || right == 4 || right == 6)) {
			temp = "  *|* * ";
		}
		if((left == 4 || left == 5 || left == 6)&&(right == 5 || right == 4 || right == 6)) {
			temp = "* *|* * ";
		}
		return temp;
	}
	public boolean equals(DominoTile d1) {
			if(d1.left==left&&d1.right==right) {
				return true;
			}
			d1.swapLeftAndRight();
			if(d1.left==left&&d1.right==right) {
				return true;	
			}
			
			else return false;
		}
}
