
def printSubsequence(s,ans,index):
    if index >=len(s):
        print(ans)
        return
    
    printSubsequence(s,ans,index+1)
    printSubsequence(s,ans+s[index],index+1)
    



def main():
    s = "abc"

    printSubsequence(s,'',0)

main()