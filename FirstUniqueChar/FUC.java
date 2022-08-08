package FirstUniqueChar;

public class FUC {
    public static void main(String[] args) {
        String s = "aabb";

        int[] arr = new int[26];
        int baseIndex = 97;
        for(int i = 0; i<s.length();i++){
            int ascii = s.charAt(i);
            int index = ascii - baseIndex;
            arr[index]+=1;
        }
        boolean flag = false;
       for(int i = 0;i<s.length();i++){
            int index = s.charAt(i) - baseIndex;
            if(arr[index] == 1){
                System.out.println(s.charAt(i));
                flag = true;
                break;
            }
       }

       if(!flag){
        System.out.println(-1);
       }

    }
}
