package Abbreviations;

class Abbreviatons{
    public static void main(String[] args){
        Abbreviatons.printAbbreviations("cat","",0,0);
    }

    private static void printAbbreviations(String ques, String ans, int count, int index) {

        if(index==ques.length()){
            if(count==0)
                System.out.println(ans);
            else{
                System.out.println(ans+count);
            
            }
            return;
        }
        if(count > 0)
            printAbbreviations(ques,ans+count+ques.charAt(index),0,index+1);
        else{
            printAbbreviations(ques,ans+ques.charAt(index),count,index+1);
        }
            
        printAbbreviations(ques,ans,count+1,index+1);
    }
}