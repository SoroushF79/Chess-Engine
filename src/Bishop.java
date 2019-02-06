public class Bishop extends Piece{
	private static int tag = 4;
	private String url;
	
	public Bishop(int x, int y, boolean color) {
		super(x, y, color);
		if(color) url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\WB.png";
		else url = "C:\\Users\\sorou\\Desktop\\ChessEngine\\src\\BB.png";
	}
	
	public static int getTag() {
		return(tag);
	}


	public String getUrl() {
		return url;
	}

}
