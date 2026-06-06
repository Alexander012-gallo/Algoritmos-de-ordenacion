def Bubble (arreglo):
    n = len(arreglo)

    for i in range(n-1):       # <-- bucle padre
        for j in range(n-1-i): # <-- bucle hijo
            if arreglo[j] > arreglo[j+1]:
                arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j]
    return arreglo

n = [45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
     -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
     15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
     51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
     100, -99, 88, -77, 66, -55, 44, -33, 22, -1]
result = Bubble(n)
print(result)