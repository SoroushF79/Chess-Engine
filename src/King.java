public class King extends Piece{
	private static int tag = 2;
	
	public King(int x, int y, boolean color) {
		super(x, y, color);
	}
	
	public static int getTag() {
		return(tag);
	}
}
