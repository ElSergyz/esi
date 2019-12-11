package FInal;

public class Final {

	public static void main(String[] args) {
		
		
		
		int board1[][]= generateBoard(3,3);
		int board2[][]= generateBoard(3,3);
		boolean visual1[][]= generateBoolean(3,3);
		boolean visual2[][]= generateBoolean(3,3);

	}

	
	public static int[][]generateBoard(int a,int b){
		int array1[][]=new int[a][b];
				
		return array1;
	}
	public static boolean[][]generateBoolean(int a, int b) {
		boolean array2[][]=new boolean[a][b];
		for(int i=0; i<array2.length; i++) {
			for (int j=0; j<array2[0].length; j++) {
				array2[i][j]=true;
			}
		}
		
		return array2;
	}
	
	
	
	
	
	
}
