# num = int(input("Enter the number:"))

def fib(num, memo={}):
    if num <= 1:
        return num

    if num not in memo:
        memo[num] = fib(num - 1, memo) + fib(num - 2, memo)

    return memo[num]

print(fib(100))
