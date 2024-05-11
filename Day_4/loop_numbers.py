n = int(input("Enter the number: "))

start = 1
for i in range(n):
    for j in range(i + 1):
        print(start, end=" ")
        start += 1
    print()

# end = 0
# # for i in range(n):
# #     # print(i)
# #     for j in range(i+1):
# #         print(j,end=" ")
# #     print()
#     #     end = j+1
#     #     print(end,end=" ")
#     # print()
#     # end = j+1
# last = 0
# for i in range(n):
#     for j in range(i+1):
#         last = last + j+ 1
#         print(last, end=" ")
#     # last = last
#     print()