# ABC Pattern
# A B C
# B C D 
# C D E

start = 65
end = 91

# r = int(input("Enter how many alphabets : "))

# # for i in range(start, start+r):
# #   print(chr(i), end=" ")
# for i in range(start, start+r):
#     for j in range(i,start+r):
#         print(chr(j),end=" ")
#     print()

rows = int(input("Enter how many rows : "))

# for i in range(r):
#     # start = start + 0
#     for j in range(r):
#         print(chr(start+j),end=" ")
#         start = start + 1
#     print()


for i in range(rows):
  for j in range(i + start, i + start + rows):
    print(chr(j), end=" ")

  print()


