# Num Pattern
# # 1 2 3 4 5 5 4 3 2 1
# # 1 2 3 4 * * 4 3 2 1
# # 1 2 3 * * * * 3 2 1
# # 1 2 * * * * * * 2 1
# # 1 * * * * * * * * 1

n = int(input("Enter the rows : "))


start = 1
while (start<n+1):
    # print(start)

    num = n - start +1

    s = 1
    while s<num+1:
        print(s,end="")
        s = s+1 

    stars = (start * 2) -2
    s2 = 1
    while s2<=stars:
        print("*",end="")
        s2 = s2+1

    while (num>0):
        print(num,end="")
        num = num-1
    print()

    # n = n - 1
    start = start + 1