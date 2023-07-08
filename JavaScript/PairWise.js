function pairwise(arr, arg) {
  let indicesSum = 0;
  const usedIndices = [];

  for (let i = 0; i < arr.length; i++) {
    if (!usedIndices.includes(i)) {
      for (let j = i + 1; j < arr.length; j++) {
        if (!usedIndices.includes(j) && arr[i] + arr[j] === arg) {
          indicesSum += i + j;
          usedIndices.push(i, j);
          break;
        }
      }
    }
  }

  return indicesSum;
}

pairwise([1, 4, 2, 3, 0, 5], 7);
