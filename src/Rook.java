public class Rook extends Piece{
	private static int tag = 5;
	private String url;
	
	public Rook(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WR.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BR.png";
	}
	
	public static int getTag() {
		return(tag);
	}

	public String getUrl() {
		return url;
	}

}
