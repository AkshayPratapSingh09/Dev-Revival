def decimal_to_binary(decimal_num):
    binary_num = ""
    
    # Step 1: Divide and Remainder
    while decimal_num > 0:
        remainder = decimal_num % 2
        binary_num = str(remainder) + binary_num  # Step 4: Concatenate the remainders
        decimal_num = decimal_num // 2  # Step 2: Divide by 2
    
    # If the input number is 0, the binary representation is "0"
    if binary_num == "":
        binary_num = "0"
    
    # Step 5: Convert binary string to integer
    # binary_integer = int(binary_num)
    
    return binary_num

def decimal_to_Complement(decimal_num):
    binary_num = ""
    
    # Step 1: Divide and Remainder
    while decimal_num > 0:
        remainder = decimal_num % 2
        if int(remainder) == 1:
            binary_num = str(0) + binary_num  # Step 4: Concatenate the remainders
        else:
            binary_num = str(1) + binary_num  # Step 4: Concatenate the remainders
        decimal_num = decimal_num // 2  # Step 2: Divide by 2
    
    # If the input number is 0, the binary representation is "0"
    if binary_num == "":
        binary_num = "1"
    
    # Step 5: Convert binary string to integer
    # binary_integer = int(binary_num)
    
    return binary_num

def binary_to_decimal(binary_num):
    # Step 1: Reverse the binary string if necessary
    binary_num = binary_num[::-1]
    
    decimal_value = 0
    
    # Step 3: Process each bit
    for i in range(len(binary_num)):
        # Step 4: Calculate decimal value
        if binary_num[i] == '1':
            decimal_value += 2 ** i
    
    return decimal_value



# Example usage
decimal_num = 5
binary_representation = decimal_to_binary(decimal_num)
comple = decimal_to_Complement(decimal_num)
decim = binary_to_decimal(comple)
print("Binary representation of", decimal_num, "as an integer is:", binary_representation)
print("Complement representation of", decimal_num, "as an integer is:", comple)
print("Decimal representation of", comple, "is:", decim)
