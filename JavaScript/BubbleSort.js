function bubbleSort(array) {
  let n = array.length;
  do {
    let newn = 0;
    for (let i = 1; i < n; i++) {
      if (array[i - 1] > array[i]) {
        let temp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = temp;
        newn = i;
      }
    }
    n = newn;
  } while (n >= 1);
  return array; 
}
