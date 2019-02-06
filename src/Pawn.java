public class Pawn extends Piece{
	
	private static int tag = 1;
	private String url;
	
	public Pawn(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WP.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BP.png";
	}
	
	public static int getTag() {
		return(tag);
	}

	public String getUrl() {
		return url;
	}

}
