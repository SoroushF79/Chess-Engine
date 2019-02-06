public class King extends Piece{
	private static int tag = 2;
	private String url;
	
	public King(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WK.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BK.png";
	}
	
	public static int getTag() {
		return(tag);
	}


	public String getUrl() {
		return url;
	}
}
