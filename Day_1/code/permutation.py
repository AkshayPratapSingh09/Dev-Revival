# def recur(ds,nums,ans,freq):
#     if len(ds)== len(nums):
#         ans.append(ds)
#         return
    
#     for i in range(len(nums)):
#         if not (freq[i]):
#             freq[i]= True
#             ds.append(nums[i])
#             recur(nums,ds,ans,freq)
#             ds.pop(len(ds)-1)
#             freq[i]=False

#     ans = []
#     ds = []
#     freq = []
#     recur(nums,ds,ans,freq)
#     return ans

def helper(nums, i):
    # print("With nums :",nums,"and i :",i)
    if i == len(nums):
        ans.append(nums.copy())  # Assuming 'ans' is a global list

    for j in range(i, len(nums)):
        print("i:",i,"j:",j)
        nums[i], nums[j] = nums[j], nums[i]
        helper(nums, i + 1)
        nums[i], nums[j] = nums[j], nums[i]  # Backtrack

# Usage:
ans = []  # Global list to store permutations
input_array = [1, 2, 3]
helper(input_array, 0)

# Print all permutations
# for perm in ans:
#     print(perm)

