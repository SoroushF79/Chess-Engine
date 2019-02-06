public class Bishop extends Piece{
	private static int tag = 4;
	
	public Bishop(int x, int y, boolean color) {
		super(x, y, color);
	}
	
	public static int getTag() {
		return(tag);
	}

}
