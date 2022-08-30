def main(n, i):
    

    mask = (1<<i)

    n = n & mask

    if n > 0:
        return 1
    return 0



n = int(input())

i = int(input())

print(main(n,i))