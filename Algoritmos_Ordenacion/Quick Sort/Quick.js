const Quick = (arr) => {
    if (arr.length <= 1) {
        return arr;
    }

    let pivot = arr[0];
    let leftArr = [];
    let rightArr = [];

    for (let i = 1; i < arr.length; i++) {  //Recorremos el arreglo desde la segunda posición
        if (arr[i] < pivot) {               //Si es menor que el pivote, se guarda en el izquierdo
            leftArr.push(arr[i]);  
        } else {
            rightArr.push(arr[i]);  //Si es mayor en el derecho
        }
    }

    return [...Quick(leftArr), pivot, ...Quick(rightArr)];
};
console.log(Quick([ 45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                    100, -99, 88, -77, 66, -55, 44, -33, 22, -1]));