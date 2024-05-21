# BTree

# Type of Traversal (DFS):

#      1
  #  /  \
#   2     3
#  / \   / \
# 4   5 6   7

# Note: Also In subtree Should Follow Conditions

# Inorder Traversal:
# (Extreme Left Leaf -> Root -> Right Extreme Left Leaf)
# --> 4 2 5 1 6 3 7

# Pre-Order Travesal:
#(Root -> Left --> Right)
# --> 1 4 2 5 6 3 7   ❌
# --> 1 2 4 5 3 6 7   ✅ 

# Post Order Traversal:
# (Left -> Right -> Root )
# --> 4 5 2 6 7 3 1


# Another Example 
#       1
#     /  \
#    2    3
#   /\    /\
#  4   5  6  7
#     /     / \
#    8     9   10

# Inorder TraversaL:
# 8 4 2 5 1 9 7 10 6 3   ❌
# 4  2 8 5 1 6 3 9 7 10  ✅

# Mistake(Should be left most not the most leafest)

# Preorder Traversal (Root-Left-Right):
# -> 1 2 4 5 8 3 6 7 9 10

# Post Traversal (Left-Right-Root):
# -> 4 5 2 8 1 6 3 7 9 10  ❌
# -> 4 8 5 2 6 9 10 7 3 1  ✅


# BFS Travesal:

#  For First Tree

#      1
#    /  \
#   2     3
#  / \   / \
# 4   5 6   7

# BFS -> 1 2 3 4 5 6 7

# For Second Tree:

#       1
#     /  \
#    2    3
#   /\    /\
#  4   5  6  7
#     /     / \
#    8     9   10

# BFS -> 1 2 3 4 5 6 7 8 9 10
