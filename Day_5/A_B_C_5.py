# Star Pattern
#    *
#   **
#  ***
# ****

r = int(input("Enter the rows: "))
for i in range(r):
    print((" ")*(r-i-1),("*")*(i+1))
