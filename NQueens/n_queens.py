def print_all_combinations(board,col,diagonal,reverse_diagonal,row,ans):
    if row == len(board):
        print(ans)
        return
    for j in range(len(board[row])):
        if col[j]==0 and diagonal[row+j]==0 and reverse_diagonal[row-j+len(board)-1]==0:
            col[j]=1
            diagonal[row+j]=1
            reverse_diagonal[row-j+len(board)-1]=1
            print_all_combinations(board,col,diagonal,reverse_diagonal,row+1,ans+"->"+str(row)+"."+str(j))
            col[j]=0
            diagonal[row+j]=0
            reverse_diagonal[row-j+len(board)-1]=0

def main():
    n=4
    board=[[0 for i in range(n)] for j in range(n)]
    col=[0 for i in range(n)]
    diagonal=[0 for i in range(2*n-1)]
    reverse_diagonal=[0 for i in range(2*n-1)]
    if n!=0:
        print_all_combinations(board,col,diagonal,reverse_diagonal,0,"")
    else:
        print("no combinations found for 0")
main()