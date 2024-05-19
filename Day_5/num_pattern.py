# Nums Pattern
# 1 1 1 1
#   2 2 2
#     3 3
#       4

r = int(input("Enter the rows : "))
for i in range(r):
    print(" "*(r-(r-i-1)),(str(i+1))*(r-i))