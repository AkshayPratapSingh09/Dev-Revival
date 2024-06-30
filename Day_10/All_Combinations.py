# Subsets:
# https://leetcode.com/problems/subsets/

arr = [1,2,3,4]
ans = []
def solve(nums,output,index,ans):
    if (index >= len(nums)):
        ans.append(output)
        # print(ans)
        return
    
    solve(nums,output,index+1,ans)

    element = nums[index]
    output.append(element)
    solve(nums,output,index+1,ans)

# print(solve([],[],0,ans))
# print(ans)
# print(ans)
    

# # def solve(nums,output,index,ans):
# #     if (index >= len(nums)):
# #         ans.append(output)
# #         # print(ans)
# #         return
    
# #     solve(nums,output,index+1,ans)

# #     element = nums[index]
# #     output.append(element)
# #     solve(nums,output,index+1,ans)

# # print(solve([],[],0,ans))