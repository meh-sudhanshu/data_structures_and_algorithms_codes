package NQueens;

class Nqueens{
    public static void main(String[] args){
        int n=4;
        int[] col= new int[n];
        int[] diagonal = new int[2*n-1];
        int[] reverserDiagonal = new int[2*n-1];
        int[][] board = new int[n][n];
        PrintAllCombinations(board,col,diagonal,reverserDiagonal,0,"");
    }

    private static void PrintAllCombinations(int[][] board, int[] col, int[] diagonal, int[] reverserDiagonal, int row, String ans) {
        if(row==board.length){
            System.out.println(ans);
        }
        for(int j=0;j<board[0].length;j++){
            if(col[j]==0 && diagonal[row+j]==0 && reverserDiagonal[row-j+board.length-1]==0 ){
                col[j]=1;
                diagonal[row+j]=1;
                reverserDiagonal[row-j+board.length-1]=1;
                PrintAllCombinations(board, col, diagonal, reverserDiagonal, row+1, ans+"->"+row+"."+j);
                col[j]=0;
                diagonal[row+j]=0;
                reverserDiagonal[row-j+board.length-1]=0; 
            }
        }
    }
}