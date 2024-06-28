# arr = [3,7,0,-2,5,9]

# the array should be asc or desc

# arr = [4,8,16,22,34,56,78]
arr = [1,2,3,4,5,5,7,14,19,25]
num = 29    #-> No. to find

def find(num,arr):

    start = 0
    end = len(arr)-1

    mid  = (start + end)//2

    while (start <= end):
        print("Here",arr[start:end+1])
        print(arr[mid])

        if arr[mid] == num:
            return mid

        if (num> arr[mid]):
            start = mid + 1
        else:
            end = mid - 1

        mid = (start + end)//2
    
    return -1
    


print(find(num,arr))

0 + 9 // 2 == 4
4 + 9 // 2 == 6