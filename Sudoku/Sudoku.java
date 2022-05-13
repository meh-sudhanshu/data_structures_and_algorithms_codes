package Sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sudoku{
    public static void main(String[] args) {
        List<List<Integer>> board = new ArrayList<List<Integer>>();
        board.add(Arrays.asList(3,0, 6, 5, 0, 8, 4 ,0 ,0));
        board.add(Arrays.asList(5 ,2 ,0, 0, 0, 0 ,0 ,0 ,0));
        board.add(Arrays.asList(0 ,8 ,7, 0 ,0 ,0 ,0 ,3, 1));
        board.add(Arrays.asList(0 ,0 ,3 ,0 ,1 ,0 ,0 ,8 ,0));
        board.add(Arrays.asList(9 ,0 ,0 ,8, 6 ,3 ,0 ,0, 5));
        board.add(Arrays.asList(0 ,5 ,0 ,0, 9 ,0 ,6 ,0, 0));
        board.add(Arrays.asList(1 ,3 ,0 ,0 ,0 ,0 ,2 ,5, 0));
        board.add(Arrays.asList(0 ,0, 0, 0, 0, 0, 0 ,7, 4));
        board.add(Arrays.asList(0 ,0 ,5 ,2 ,0 ,6 ,3 ,0 ,0));
        solve(board,0,0);
        // System.out.println(board);
    }

    private static void solve(List<List<Integer>> board, int i, int j) {
        if(i==board.size()){
            for(List<Integer> list : board){
                for(int v : list){
                    System.out.print(v+" ");
                }
                System.out.println();
            }
            return;
        }

        int ni=-1 , nj=-1;

        if(j==board.get(0).size()-1){
            nj=0;
            ni=i+1;
        }else{
            ni=i;
            nj=j+1;
        }

        if(board.get(i).get(j)!=0) solve(board, ni, nj);

        else{
            for(int k=1;k<10;k++){
                if(isValid(board,i,j,k)){
                    board.get(i).set(j, k);
                    solve(board, ni, nj);
                    board.get(i).set(j, 0);
                }
            }
        }
    }

    private static boolean isValid(List<List<Integer>> board, int i, int j,int k) {

        for(int v : board.get(i)) if(v==k) return false;

        for(List<Integer> list : board){
            if(list.get(j)==k) return false;
        }

        int mi = i/3 *3;

        int mj = j/3 * 3;

        for(int l = mi ; l<mi+3;l++){
            for(int m = mj ; m < mj+3; m++){
                if(board.get(l).get(m)==k)
                    return false;
            }
        }

        return true;
        
    }
}