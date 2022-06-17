package ChocolateDistribution;

import java.util.Arrays;
import java.util.Scanner;

class CD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];

        for(int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        Arrays.sort(arr);

        int i = 0 , j = m-1;
        int ans = Integer.MAX_VALUE;
        while(j<n){
            if(arr[j] - arr[i] < ans){
                ans = arr[j] - arr[i];
            }
            i+=1;
            j+=1;
        }

        System.out.println(ans);

        sc.close();
    }
}