package JosephusGameOfExecution;

class Josephus{
    public static void main(String[] args) {
        int n=7;
        int k=4;
        System.out.println(startGame(n,k));
    }

    private static int startGame(int n, int k) {
        
        if(n==1) return 0;

        int ans = startGame(n-1, k);


        return (ans+k)%n;
    }
}