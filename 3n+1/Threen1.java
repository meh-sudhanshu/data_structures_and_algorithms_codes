import java.lang.Math;
public class Threen1 {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,2,4,4,4,13,13,13,101,6,6,6,8,8,8};

        int[] bitSum = new int[32];

        for(int i = 0 ; i<arr.length;i++){
            int num = arr[i];
            for(int j=0;j<32;j++){
                int currBit = getCurrentBit(num,j);
                bitSum[j]+=currBit;
            }
        }
        int ans = 0;
        for(int i =0;i<32;i++){
            //System.out.print(bitSum[i]+" ");
            int currValue = (int)Math.pow(2,i)*(bitSum[i]%3);
            ans+=currValue;
        }
        //System.out.println();
        System.out.println(ans);
    }

    private static int getCurrentBit(int num, int j) {
        num = num>>j;
        if(num%2==0){
            return 0;
        }
        return 1;
    }
}
