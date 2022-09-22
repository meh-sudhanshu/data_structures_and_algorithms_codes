public class TwonTwo {
    public static void main(String[] args) {
        int[] arr = {1,1,6,3,3,4,5,5,6,7};

        int mask1 = arr[0];

        for(int i=1;i<arr.length;i++){
            mask1 = mask1 ^ arr[i];
        }

        int firstSetBitPosition  = getFirstSetBit(mask1);
        int ans1 = 0 , ans2 = 0;
        for(int i =0;i<arr.length;i++){
            int currentSetBitPos = getFirstSetBit(arr[i]);
            if(currentSetBitPos == firstSetBitPosition){
                ans1 = ans1 ^ arr[i];
            }else{
                ans2 = ans2 ^ arr[i];
            }
        }
        System.out.println(ans1+" "+ans2);
    }

    private static int getFirstSetBit(int num) {
        int pos = 0;
        if(num%2 != 0){
            return pos;
        }
        for(int i=0; i<31;i++){
            num = num>>1;
            pos++;
            if(num%2 !=0){
                return pos;
            }
        }
        return 0;
    }
}
