public class Pawn extends Piece{
	
	private static int tag = 1;
	
	public Pawn(int x, int y, boolean color) {
		super(x, y, color);
	}
	
	public static int getTag() {
		return(tag);
	}

}
