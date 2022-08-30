def main():
    n = int(input())

    n = n & 1

    if n > 0:
        return "odd"
    return "even"


print(main())