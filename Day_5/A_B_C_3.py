# ABC PAttern
# A
# B C 
# C D E 
# D E F G


start = 65
end = 91

r = int(input("Enter the no. of rows: "))

for i in range(r):
    for j in range(i+1):
        print(chr(start+i+j),end=" ")
    print()