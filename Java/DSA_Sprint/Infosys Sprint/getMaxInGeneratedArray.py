# //     You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
#     // nums[0] = 0
#     // nums[1] = 1
#     // nums[2 * i] = nums[i] when 2 <= 2 * i <= n
#     // nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
#     // Return the maximum integer in the array nums​​​.

n = 7

arr = [0]*(n+1)
print(arr)

if(n==0) return 0

arr[0] = 0
arr[1] = 1

# Range -> 1, 4  
for i in range( 1, (n//2+1) ):
     if 2 * i <= n:
        arr[i*2] = arr[i]
    arr[(i*2)+1] = arr[i] + arr[i+1]

print(max(arr))