n = int(input("Enter the number: "))

for i in range(n):
    row = i
    for j in  range(i+1):
        print(row+j+1,end=' ')
    print()

# without using extra integer
# for i in range(n):
#     for j in  range(i+1):
#         print(i+j+1,end=' ')
#     print()
