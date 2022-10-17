def merge_sort(arr):
    if len(arr) >1:
        mid = len(arr)//2

        left = arr[:mid]
        right = arr[mid:]

        merge_sort(left)
        merge_sort(right)

        

        i,j,k = 0,0,0

        while i<len(left) and j<len(right):
            if left[i]<=right[j]:
                arr[k]=left[i]
                i+=1
                k+=1
            else:
                arr[k]=right[j]
                j+=1
                k+=1

        while i<len(left):
            arr[k]=left[i]
            i+=1
            k+=1

        while j<len(right):
            arr[k]=right[j]
            k+=1
            j+=1


    




def main():
    arr = [3,2,6,2,-1,3,1,67,54,53,235,90]
    merge_sort(arr)
    for ele in arr:
        print(ele,end=" ")


main()


