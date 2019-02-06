public class Knight extends Piece{
	private static int tag = 3;
	
	public Knight(int x, int y, boolean color) {
		super(x, y, color);
	}

	public static int getTag() {
		return(tag);
	}
}
