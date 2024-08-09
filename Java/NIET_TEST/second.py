
n = 53


def checkPrime(n):
    div = 0
    for i in range(2,n//2+1):
        if (n%i==0):
            div +=1
    return div<1
# print(checkPrime(n))

user_input = input()
x, y = map(int, user_input.split())
sum = 0
mod = 1000000007
for i in range(x,y):
    if checkPrime(i):
        sum = sum / 1000000007 + i
    
print(sum)