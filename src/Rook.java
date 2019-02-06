public class Rook extends Piece{
	private static int tag = 5;
	
	public Rook(int x, int y, boolean color) {
		super(x, y, color);
	}
	
	public static int getTag() {
		return(tag);
	}

}
