def solve(board,i,j):
    if i==len(board):
        for row in board:
            for e in row:
                print(e,end=" ")
            print()
        return
    ni,nj=-1,-1
    if j==len(board[0])-1:
        ni=i+1
        nj=0
    else:
        ni=i
        nj=j+1
    

    if board[i][j]!=0:
        solve(board,ni,nj)
    else:
        for k in range(1,10):
            if isValid(board,k,i,j):
                board[i][j]=k
                solve(board,ni,nj)
                board[i][j]=0
    
def isValid(board,k,i,j):
    for col in range(0,len(board[0])):
        if board[i][col]==k:
            return False
    
    for row in range(0,len(board)):
        if board[row][j]==k:
            return False

    xm=int((i//3) * 3)
    ym=int((j//3)*3)
    for l in range(xm,xm+3):
        for m in range(ym,ym+3):
            if board[l][m]==k:
                return False

    return True

def main():
    board=[]
    board.append([3,0, 6, 5, 0, 8, 4 ,0 ,0])
    board.append([5 ,2 ,0, 0, 0, 0 ,0 ,0 ,0])
    board.append([0 ,8 ,7, 0 ,0 ,0 ,0 ,3, 1])
    board.append([0 ,0 ,3 ,0 ,1 ,0 ,0 ,8 ,0])
    board.append([9 ,0 ,0 ,8, 6 ,3 ,0 ,0, 5])
    board.append([0 ,5 ,0 ,0, 9 ,0 ,6 ,0, 0])
    board.append([1 ,3 ,0 ,0 ,0 ,0 ,2 ,5, 0])
    board.append([0 ,0, 0, 0, 0, 0, 0 ,7, 4])
    board.append([0 ,0 ,5 ,2 ,0 ,6 ,3 ,0 ,0])
    #print(board)
    solve(board,0,0)
main()