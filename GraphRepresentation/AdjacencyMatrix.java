package GraphRepresentation;
class AdjacencyMatrix {    
    public static void main(String[] args) {
        int[][] graph = new int[9][9];

        graph[0][1] = 10;
        graph[1][0] = 10;

        graph[0][3] = 3;
        graph[0][3] = 3;

        graph[1][2] = 2;
        graph[2][1] = 2;

        graph[1][4] = 4;
        graph[4][1] = 4;

        graph[2][3] = 5;
        graph[3][2] = 5;

        graph[4][5] = 40;
        graph[5][4] = 40;

        graph[4][7] = 11;
        graph[4][7] = 11;

        graph[5][6] = 8;
        graph[6][5] = 8;

        graph[5][8] = 30;
        graph[8][5] = 30;

        graph[6][8] = 5;
        graph[8][6] = 5;

        graph[6][7] = 9;
        graph[7][6] = 9;



        for(int i=0;i<9;i++){
            for(int j = 0 ; j< 9; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}