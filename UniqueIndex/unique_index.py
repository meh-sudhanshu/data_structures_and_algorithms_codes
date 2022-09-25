def main():
    s="sssudd"
    arr = [0 for i in range(26)]
    for i in range(len(s)):
        index = int(ord(s[i]))-97
        arr[index]+=1
    for i in range(26):
        if arr[i]==1:
            print(chr(i+97))
            break
    #print(arr)
main()