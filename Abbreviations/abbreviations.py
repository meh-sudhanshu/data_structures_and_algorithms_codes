def printAbbreviations(ques,ans,count,index):
    if(index==len(ques)):
        if count==0:
            print(ans)
        else:
            print(ans+str(count))

        return

    if count>0:
        printAbbreviations(ques,ans+str(count)+ques[index],0,index+1)
    else:
        printAbbreviations(ques,ans+ques[index],count,index+1)

    printAbbreviations(ques,ans,count+1,index+1)


printAbbreviations("abcd","",0,0)