public class Piece {
	private int x;
	private int y;
	private boolean alive = true;
	private boolean color; // White = true, Black = false
	
	public Piece(int x, int y, boolean color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
}
