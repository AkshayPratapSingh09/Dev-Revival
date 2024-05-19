# num = -124563
num = 1534236469

# print(-pow(2,31))
# print(pow(2,31)-1)
# print((num > pow(2,31)-1))
# if  ((-pow(2,31) > num) or (num > pow(2,31)-1)):
#             print(0)
divisor = 10
ans = 0
flag = 1
if num <0:
    flag = 0
    num = num * -1
while num:
    digit = num % divisor
    # print("Digit Found",digit)
    num = (num-digit) / divisor
    # print("Num next",num)
    ans = ans * 10 + digit 
    # print("Ans this",ans)
    # divisor = divisor * 10
if flag==0:
    print(int(-ans))
else:
    print(int(ans))
    
if  ((-pow(2,31) > ans) or (ans > pow(2,31)-1)):
            print(0)