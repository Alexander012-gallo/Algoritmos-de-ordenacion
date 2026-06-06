def Merge (arr):
    if len(arr) <= 1:
        return arr
    left = Merge (arr[:len(arr)//2])
    right = Merge(arr[len(arr)//2:])
    result = []
    i = j = 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result
# Sim
numeros = [45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
           -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
           15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
           51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
           100, -99, 88, -77, 66, -55, 44, -33, 22, -1]
result = Merge(numeros)
print(result)