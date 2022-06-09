package HasPath;

import java.util.Scanner;

public class HasPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices");

        int ver = sc.nextInt();

        int[][] graph = new int[ver][ver];

        System.out.println("Enter number of edges");

        int edg = sc.nextInt();

        System.out.println("Enter src->des->weight for all edges");

        for(int i = 0 ; i < edg ; i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            int weight = sc.nextInt();

            graph[src][des] = weight;
            graph[des][src] = weight;
        }

        System.out.println("Enter source and destibation for your path");

        int src = sc.nextInt();
        int des = sc.nextInt();
        
        int[] visited = new int[ver];

        boolean result = hasPath(graph ,  src , des , ver , visited);

        if(result == true){
            System.out.println("path exists");
        }else{
            System.out.println("no path exists , please take private flight");
        }

        sc.close();

    }

    private static boolean hasPath(int[][] graph, int src, int des , int ver , int[] visited) {
        boolean result = false;
        if(src == des){
            return true;
        }
        for(int i =0 ; i<ver ; i++){
            if(graph[src][i] != 0 && i!=src && visited[i]!=1){
                visited[i] = 1;
                result = hasPath(graph, i, des, ver , visited);
            }
            if(result == true){
                return true;
            }
        }
        return false;
    }
}
