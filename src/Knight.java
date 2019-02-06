public class Knight extends Piece{
	private static int tag = 3;
	private String url;
	
	public Knight(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WN.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BN.png";
	}

	public static int getTag() {
		return(tag);
	}


	public String getUrl() {
		return url;
	}
}
