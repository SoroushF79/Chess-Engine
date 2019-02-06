public class Queen extends Piece{
	private static int tag = 2;
	private String url;
	
	public Queen(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WQ.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BQ.png";
	}
	
	public static int getTag() {
		return(tag);
	}


	public String getUrl() {
		return url;
	}

}
