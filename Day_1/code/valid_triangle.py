
def isTriangle():
    side_1 = int(input("Enter any first side length : "))
    side_2 = int(input("Enter any 2nd side length : "))
    side_3 = int(input("Enter any 3rd side length : "))

    if (side_1+side_2>side_3):
        return ("Triangle")
    else:
        return ("Not a Triangle")

print(isTriangle())