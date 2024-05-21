class Node:
    def __init__(self,data,left=None,right=None):
        self.data = data
        self.left = left
        self.right = right

    def getAll(self):
        print(self.data)
        print(self.left.data)
        print(self.right.data)

a = Node(10)
b = Node(20)
c = Node(30)

a.left = b
a.right = c

print(a.getAll())