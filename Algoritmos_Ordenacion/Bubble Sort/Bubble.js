const Bubble = (arr) => {
    let swapped;

    do {
        swapped = false;
        for (let i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    } while (swapped);

    return arr;
};
console.log(Bubble([45, -23, 78, 12, -56, 89, 34, -11, 67, 90,
                    -78, 23, -45, 56, -89, -34, 11, -67, -90, 0,
                    15, -32, 47, -61, 83, -5, 92, -74, 28, -39,
                    51, -84, 63, -17, 76, -42, 95, -68, 7, -53,
                    100, -99, 88, -77, 66, -55, 44, -33, 22, -1]));