def Quick(arr):
    n = len(arr)
    if n <= 1:
        return arr

    # Elegimos el ultimo elemento como pivote
    pivot_index = n - 1
    pivot = arr[pivot_index]

    # Separamos los elementos menores y mayores que el pivote
    remaining_elements = arr[:pivot_index] + arr[pivot_index + 1:]

    less = [x for x in remaining_elements if x < pivot]
    greater = [x for x in remaining_elements if x >= pivot]
    return Quick (less) + [pivot] + Quick (greater)

# Sim
n = [45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
     -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
     15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
     51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
     100, -99, 88, -77, 66, -55, 44, -33, 22, -1]
result = Quick (n)
print(result)

