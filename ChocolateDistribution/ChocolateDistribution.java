package ChocolateDistribution;

import java.util.Arrays;
import java.util.Scanner;

class ChocolateDistribution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of your array");

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of students");

        int m = sc.nextInt();

        System.out.println(solve(n,arr,m));
        
        sc.close();;

    }

    private static int solve(int n, int[] arr,int m) {


        Arrays.sort(arr);

        int i = 0 , j =m-1;

        int ans = Integer.MAX_VALUE;

        while(j < n){
            if (arr[j]-arr[i] < ans) ans = arr[j]-arr[i];

            j+=1;
            i+=1;
        }

       return ans;
        

    }
}