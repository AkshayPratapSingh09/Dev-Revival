def recur(ds,nums,ans,freq):
    if len(ds)== len(nums):
        ans.append(ds)
        return
    
    for i in range(len(nums)):
        if not (freq[i]):
            freq[i]= True
            ds.append(nums[i])
            recur(nums,ds,ans,freq)
            ds.pop(len(ds)-1)
            freq[i]=False

    ans = []
    ds = []
    freq = []
    recur(nums,ds,ans,freq)
    return ans