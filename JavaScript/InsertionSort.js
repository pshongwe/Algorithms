function insertionSort(array) {
  for (let i = 1; i < array.length; i++) {
    const x = array[i];
    let j = i - 1;
    while (j >= 0 && array[j] > x) {
      array[j + 1] = array[j];
      j--;
    }
    array[j + 1] = x;
  }
  return array;
}
