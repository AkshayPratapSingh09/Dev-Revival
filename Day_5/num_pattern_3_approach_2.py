# num Pattern
#    1
#   121
#  12321
# 1234321

n = int(input("Enter the row"))

#--> Approach

row = 1
while (row <=n):
    space = n-row
    while space:
        print(" ",end="")
        space = space -1
    
    j = 1
    while (j <= row):
        print(j,end="")
        j = j+1

    start = row - 1

    while(start):
        print(start,end="")
        start = start -1

    print()
    row = row + 1
# Print Spaces

# Print First Triangle

# Print Second Triangle