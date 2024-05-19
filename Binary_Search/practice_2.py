arr = [2,3,3,3,3,3,3,3,3,3,3,39]
num = 27

def binaryFirstOcc(num,arr):

    start = 0
    end = len(arr)-1
    mid = (start + end)//2
    ans = -1

    while (start<=end):
        if arr[mid] == num:
            ans = mid
            end = mid - 1
        
        if (arr[mid] > num):
            end = mid - 1
        
        elif (arr[mid] < num):
            start = mid + 1

        mid = (start+end)//2
    return ans

def binaryLastOcc(num,arr):

    start = 0
    end = len(arr)-1
    mid = (start + end)//2
    ans = -1

    while (start<=end):
        if arr[mid] == num:
            ans = mid
            start = mid + 1
        
        if (arr[mid] > num):
            end = mid - 1
        
        elif (arr[mid] < num):
            start = mid + 1

        mid = (start+end)//2
    return ans

print(binaryFirstOcc(3,arr))
print(binaryLastOcc(3,arr))