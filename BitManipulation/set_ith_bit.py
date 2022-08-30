def main(n , i):
    mask = (1<<i)

    n = n | mask

    return n

n = int(input())

i = int(input())

print(main(n , i))