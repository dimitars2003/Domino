package Domino;

public class DominoPlayer {
	private String nickname; 
	private DominoTile[] tiles; 
	private int tilesInHands;
	private DominoTable table;
	
	public DominoPlayer(String nickname, DominoTile[] tiles, int tilesInHands, DominoTable table) {
		setNickname(nickname);
		this.tiles=tiles;
		this.tilesInHands=tilesInHands;
		this.table=table;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		if(nickname!=null&&nickname.isEmpty()==false)
		this.nickname = nickname;
	}
	
	public DominoTile[] getTiles() {
		return tiles;
	}
	
	public int getTilesInHands() {
		return tilesInHands;
	}
	
	public DominoTable getTable() {
		return table;
	}
	private int getTileIndex(DominoTile t) {
		
		for(int i = 0; i < tilesInHands;i++) {
			
			if(t.equals(tiles[i])) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	public void addTileAtLeft(DominoTile t) {
		if(getTileIndex(t)==-1) {
			System.out.println("Invalid Tile");
		}
		else {
			if(table.addLeft(tiles[getTileIndex(t)])) {
				for(int i = getTileIndex(t);i<tilesInHands-1;i++) {
					tiles[i]=tiles[i+1];
				}
				tilesInHands--;
			}
		}
	}
	
	public void addTileAtRight(DominoTile t) {
		if(getTileIndex(t)==-1) {
			System.out.println("Invalid Tile");
		}
		else {
			if(table.addRight(tiles[getTileIndex(t)])) {
				for(int i = getTileIndex(t);i<tilesInHands-1;i++) {
					tiles[i]=tiles[i+1];
				}
				tilesInHands--;
			}
		}
	}
}
