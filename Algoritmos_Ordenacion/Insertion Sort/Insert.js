const insertionSort = (array) => {
    for (let i = 1; i < array.length; i++) { //Recorremos el arreglo
        let currentElement = array[i];
        let lastIndex = i - 1;

        while (lastIndex >= 0 && array[lastIndex] > currentElement) {
            array[lastIndex + 1] = array[lastIndex];
            lastIndex--;
        }
        array[lastIndex + 1] = currentElement;  //Insertamos el elemento actual en su posición correcta
    }

    return array;
};
console.log(insertionSort([45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
    100, -99, 88, -77, 66, -55, 44, -33, 22, -1]));