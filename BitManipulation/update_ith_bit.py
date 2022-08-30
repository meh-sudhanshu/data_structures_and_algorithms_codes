def main(n , i , v):

    mask1 = ~(1<<i)

    n = n & mask1

    if v == 0:
        return n
    
    mask = (1<<i)

    n = n | mask

    return n


n = int(input())
i = int(input())
v = int(input())
print(main(n , i , v))
