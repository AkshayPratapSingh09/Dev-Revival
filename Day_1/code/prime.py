num = int(input("Enter the number:"))

def isPrime(num):
    for i in range(2,num//2):
        # print(num/i)
        if (num%i==0):
            return("Not Prime")
            break

    else:
        return("A Prime")
    
print(isPrime(num))