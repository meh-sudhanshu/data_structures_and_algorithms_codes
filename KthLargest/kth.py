def main():
    arr = [1,1,3,2,4,5,6,4,4,5,46,5,332,4]
    k = 3
    arr.sort()
    arr_ = set(arr)
    arr = []
    for e in arr_:
        arr.append(e)
    
    print(arr[2])
main()
