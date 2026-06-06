function Merge(arr) {
    if (arr.length <= 1) 
        return arr;
    const mid = Math.floor(arr.length / 2); //Calculamos la posición central del arreglo
    const left = Merge(arr.slice(0, mid));
    const right = Merge(arr.slice(mid));
    return merge(left, right);
}

function merge(left, right) {
    const result = [];
    while (left.length && right.length) {
        result.push(left[0] < right[0] 
            ? left.shift()        // Extraer el primer elemento del left
            : right.shift());     // Extraer el primer elemento del right 
    }
    return [...result, ...left, ...right];
}

// Usarlo
console.log(Merge([45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
    100, -99, 88, -77, 66, -55, 44, -33, 22, -1]));