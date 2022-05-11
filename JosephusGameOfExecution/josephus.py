
def game_of_execution(n,k):
    if n==1:
        return 0
    ans=game_of_execution(n-1,k)
    return (ans+k)%n


def main():
    n,k=7,3
    ans=game_of_execution(n,k)
    print(ans)

main()