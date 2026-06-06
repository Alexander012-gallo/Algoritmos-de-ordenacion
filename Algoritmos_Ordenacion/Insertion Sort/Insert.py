def ordenar(lista):
    # Recorremos desde la posición 1 hasta el final
    for i in range(1, len(lista)):
        while i > 0 and lista[i] < lista[i-1]:
            lista[i], lista[i-1] = lista[i-1], lista[i] # Los intercambiamos
            i = i - 1
    return lista

# SIm
numeros = [45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
           -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
           15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
           51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
           100, -99, 88, -77, 66, -55, 44, -33, 22, -1]
result = ordenar(numeros)
print(result)