
def main():

    arr = [1,2,3,4,5]
    arr.sort()
    ans = 0

    while len(arr)>1:
        val = arr[0]+arr[1]
        ans+=val
        arr=arr[2:]+[val]
        arr.sort()

    return ans

print(main())



