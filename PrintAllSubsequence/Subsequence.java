package PrintAllSubsequence;

class Subsequence{
    public static void main(String[] args) {
        String que = "abc";

        printAllSubsequence(que,"",0);
    }

    private static void printAllSubsequence(String que, String ans, int index) {
        if(index==que.length()){
            System.out.println(ans);
            return;
        }
        printAllSubsequence(que, ans, index+1);
        printAllSubsequence(que, ans+que.charAt(index), index+1);
    }
}