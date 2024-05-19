def BinarySearch(num,arr):

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
