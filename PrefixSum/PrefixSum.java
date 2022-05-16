package PrefixSum;

class PrefixSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-2,3,4};

        int[] ans;
        ans = prefixSum(arr);

        for(int e:ans){
            System.out.print(e+" ");
        }
        // System.out.println(ans);
    }

    private static int[] prefixSum(int[] arr) {

        int sum=0;
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans[i]=sum;
        }
        return ans;
    }
}