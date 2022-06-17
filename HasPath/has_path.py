def has_path(graph , src , des , ver , visited):
    if src == des:
        return True
    for i in range(ver):
        if visited[i] != 1 and src != i and graph[src][i] !=0:
            visited[i] = 1
            result = has_path(graph , i , des , ver , visited)
            if result == True:
                return True
    return False


def main():
    print("Enter number of vertices")

    ver = int(input())

    graph = [[0 for i in range(ver)] for j in range(ver)]

    print("enter number of edges")

    edg = int(input())

    print("enter src->des->weight for all edges")

    for i in range(edg):
        src , des , weight = map(int , input().split())
        graph[src][des] = weight
        graph[des][src] = weight

    print("enter src and des for your path")

    src , des = map(int , input().split())

    visited = [0 for i in range(ver)]

    result = has_path(graph , src , des , ver , visited)

    if result == True:
        print("Path exists")
    else:
        print(" no path exists , please take your private jet there")

main()