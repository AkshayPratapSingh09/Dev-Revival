n = int(input("Enter the value of n: "))  # Assuming user inputs the value of n

for i in range(1, n + 1):
    for j in range(n,0,-1):
        print(j, end=" ")
    print()
