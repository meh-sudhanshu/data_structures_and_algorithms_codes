class Twon{
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,5,5};
        // find the number which is not being repeated

        int ans = arr[0];

        for(int i = 1; i< arr.length;i++){
            ans = ans^arr[i];
        }

        System.out.println(ans);
    }
}