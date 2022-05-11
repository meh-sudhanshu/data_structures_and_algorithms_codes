
def printLexicographically(start,n):
    if start > n :
        return
    print(start)
    for i in range(0,10):
        printLexicographically(10*start+i,n)

    


def main():
    n=30
    for i in range(1,10):
        printLexicographically(i,n)
main()
