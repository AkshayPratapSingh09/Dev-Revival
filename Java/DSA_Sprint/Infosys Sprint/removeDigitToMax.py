
    # You are given a string "number" representing a positive integer 
    # and a character digit. Return the resulting string after 
    # removing exactly one occurrence of digit from number such 
    # that the value of the resulting string in decimal form is 
    # maximized. The test cases are generated such that digit occurs 
    # at least once in the number.

    # I/P:
    # number = "1321"
    # digit = 1

    # O/P:
    # // 321

nums = "1321"
digit = "1"

l = len(nums)
ans = 0
for i in range(l-1):
    if(int(nums[i]) == int(digit)):
        curr = nums[:i] + nums[i+1:]
        print(curr)
        if( int(curr) > ans):
            ans = int(curr)