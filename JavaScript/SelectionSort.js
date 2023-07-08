function selectionSort(array) {
  let aLength = array.length; // initialise to a's length
  for (let i = 0; i < aLength-1; i++) {
      let jMin = i;
      for (let j = i+1; j < aLength; j++) {
          if (array[j] < array[jMin]) {
            jMin = j;
          }
      }
      if (jMin != i) 
      {
          let temp = array[i];
          array[i] = array[jMin];
          array[jMin] = temp;
      }
  }
  return array;
}
