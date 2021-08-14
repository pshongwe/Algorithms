"""Return the index of value, or -1 if the value
doesn't exist in the list."""

def binary_search(input_array, value):
    arrayLength = len(input_array)
    chop = input_array
    for i in range(arrayLength):
        if input_array[i] < value:
            chop = input_array[:i]
        elif input_array[i] > value:
            chop = input_array[i+1:]
        else:
            if input_array[i] == value:
                return i

    return -1

test_list = [1,3,9,11,15,19,29]
test_val1 = 25
test_val2 = 15
print(binary_search(test_list, test_val1))
print(binary_search(test_list, test_val2))
