n = int(input("Enter the range: "))

end = 0
for i in range(n):
    for j in range(n):
        print(end+j+1,end=" ")
    end = end+j+1
    print()