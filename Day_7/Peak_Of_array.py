arr = [0,1,5,2]

def findPeakIndex(arr):
    s = 0
    e = len(arr) - 1

    mid = (s+e)//2

    while(s<e):
        if (arr[mid]<arr[mid+1]):
            s = mid + 1
        else:
            e = mid
        mid = (s+e)//2

    return s

print("Peak index is", findPeakIndex(arr))