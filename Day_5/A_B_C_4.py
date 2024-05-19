# ABC Pattern
# D 
# C D 
# B C D 
# A B C D

# for i in range():
#     for j in range():
#         print()
start = 65
end = 91

# for i in range(65,91):
#     print(chr(i),end=" ")
# for i in reversed(range()):
#     print(i)

# print(chr(68))

r = int(input("Enter the no. of rows: "))

for i in range(r):
    for j in range(i+1):
        # print(chr(start+r-j-1),end=" ")
        print(chr(start+r-1-i+j),end=" ")
    print()