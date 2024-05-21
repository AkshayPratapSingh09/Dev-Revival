class Node:
    def __init__(self,data,left=None,right=None):
        self.data = data
        self.left = left
        self.right = right

    def getAll(self):
        print(self.data)
        print(self.left.data)
        print(self.right.data)

#      1
  #  /  \
#   2     3
#  / \   / \
# 4   5 6   7

a = Node(1)
b = Node(2)
c = Node(3)
d = Node(4)
e = Node(5)
f = Node(6)
g = Node(7)

a.left = b
a.right = c

b.left = d
b.right = e

c.left = f
c.right = g

# In -> (Left -> Root --> Right)
def InOrder(root):
    if root==None:
        return
    InOrder(root.left)
    print(root.data,end=" ")
    InOrder(root.right)

InOrder(a)
