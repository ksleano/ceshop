package ceshop;

public class Castling {
	
	public static void main(String[] args) {
		// assuming there is only one king and one rook in a given board. 
		// Otherwise we will have to do a check for potential "checks" from opposing pieces
		// initialize the board
		char[][] board1 = new char[8][8];
		char[][] board2 = new char[8][8];
		char[][] board3 = new char[8][8];
		char[][] board4 = new char[8][8];
		char[][] board5 = new char[8][8];
		char[][] board6 = new char[8][8];

		// black castling queen side
		board1[0][4] = 'K';	
		board1[0][0] = 'R';
		System.out.println("board1 black castling queen side castleable = " + isCastleable(board1));
		
		// black castling king side
		board2[0][4] = 'K';
		board2[0][7] = 'R';
		System.out.println("board2 black castling king side castleable = " + isCastleable(board2));
		
		// white castling queen side
		board3[7][4] = 'K';
		board3[7][0] = 'R';
		System.out.println("board3 white castling queen side castleable = " + isCastleable(board3));

		// white castling king side
		board4[7][4] = 'K';
		board4[7][7] = 'R';
		System.out.println("board4 white castling king side castleable = " + isCastleable(board4));
		
		// neither
		board5[1][1] = 'K';
		board5[2][2] = 'R';
		System.out.println("board5 neither castleable = " + isCastleable(board5));
		
		// king moved
		board6[0][5] = 'K';
		board6[0][7] = 'R';
		System.out.println("board6 king moved castleable = " + isCastleable(board6));

	}
	
	/**
	 * Since it is already given that the king and root have yet to make their first moves and we are ONLY checking for the
	 * correct position for the king and rook, we don't have to worry about the other nuances of castling.
	 * <p>
	 * The valid positions for kings and rooks are as follows. Assuming [0][0] starts at the upper left corner of the board <p>
	 * kings = [0][4] [7][4] <br>
	 * rooks = [0][0] [0][7] [7][0] [7][7]
	 * @param board
	 * @return
	 */
	public static boolean isCastleable(char[][] board) {
		
		// check black
		if(board[0][4] == 'K' && (board [0][7] == 'R' || board[0][0] == 'R'))
			return true;
		// check white
		else if (board[7][4] == 'K' && (board [7][7] == 'R' || board[7][0] == 'R'))
			return true;
		else
			return false;

	}

}
