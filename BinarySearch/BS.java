package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr ={1,4,7,8,12,16,17,180,345};

        System.out.println(binarySearch(0,arr.length-1,arr,12));


    }

    private static boolean binarySearch(int i, int j, int[] arr,int value) {
        if(i==j){
            if(arr[i] == value){
                return true;
            }
             return false;
        }
        if(i>j){
            return false;
        }

        int mid = (i+j)/2;

        if(arr[mid] == value) return true;;

        if(arr[mid] > value){
           return binarySearch(i, mid-1, arr, value);
        }
        else{
           return binarySearch(mid+1, j, arr, value);
        }
    }
}
