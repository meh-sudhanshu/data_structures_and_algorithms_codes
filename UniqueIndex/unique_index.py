def main():
    s="sssuddu"
    map={}
    for i in range(len(s)):
        try:
            map[s[i]]+=1
        except:
            map[s[i]]=1
    for i in range(len(s)):
        if map[s[i]]==1:
            print(i,s[i])
            break
        if i == len(s)-1:
            print(-1)
main()