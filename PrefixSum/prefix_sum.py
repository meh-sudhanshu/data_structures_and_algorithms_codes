
def prefix_sum(arr):
    sum=0
    ans=[]
    for i in range(len(arr)):
        sum+=arr[i]
        ans.append(sum)
    

    return ans






def main():
    arr=[1,2,3,4,5,6,-2,-4,3,2,1]
    ans = prefix_sum(arr)
    print(ans)


main()