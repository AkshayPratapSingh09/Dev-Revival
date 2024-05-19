# num Pattern
#    1
#   121
#  12321
# 1234321

n = int(input("Enter the row"))

for i in range(n):
    # print("*"*(n-i-1),end="")
    # for j in range(i+1):
    #     print(str(j+1),end="")
        
    # print()
    first = [str(s+1) for s in range(i+1)]
    num = "".join(first)
    nums2 = num[::-1]
    if nums2[0]==num[-1]:
        nums2 = nums2[1:]

    print("*"*(n-i-1),num,nums2,"*"*(n-i-1),sep="")
    # print("*"*n-(n-i+1), "".join(first),"*"*n-(n-i+1))

