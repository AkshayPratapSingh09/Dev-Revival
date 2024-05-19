# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

arr = [1,3,3,3,3,3,3,3,3,5]
num = 3    #-> No. to find

def BinarySearch(num,arr):

    start = 0
    end = len(arr)-1
    first = -1
    last = -1

    mid  = (start + end)//2

    while (start <= end):

        if arr[mid] == num:
            first = mid
            end = mid - 1

        if (num> arr[mid]):
            start = mid + 1
        else:
            end = mid - 1

        mid = (start + end)//2
    
    start = 0
    end = len(arr)-1
    mid  = (start + end)//2

    while (start <= end):

        if arr[mid] == num:
            last = mid
            start = mid + 1

        if (num> arr[mid]):
            start = mid + 1
        else:
            end = mid - 1

        mid = (start + end)//2
    
    return first,last

print("The number {num} is at",BinarySearch(num,arr))

