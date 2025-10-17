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

def InOrderTraversal(root):
    if root==None:
        return
    InOrderTraversal(root.left)
    print(root.data,end=" ")
    InOrderTraversal(root.right)

def PreOrderTraversal(root):
    if root==None:
        return
    print(root.data, end=' ')
    print(root.data, end=' ')
    print(root.data, end=' ')
    print(root.data, end=' ')
    print(root.data, end=' ')
    print(root.data, end=' ')

    PreOrderTraversal(root.left)
    PreOrderTraversal(root.right)

def PostOrderTraversal(root):
    if root==None:
        return
    PostOrderTraversal(root.left)
    PostOrderTraversal(root.right)
    print(root.data,end=" ")

