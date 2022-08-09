package BubbleSort;

public class BS {
    public static void main(String[] args) {
        int[] arr = {3,4,7,2,9};

        for(int i = 0; i<arr.length-1;i++){
            boolean isSwapped = false;
            for(int j = 0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                break;
            }
        }

        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}