function permAlone(str) {
  // Convert the string into an array of characters
  const chars = str.split('');

  // Store the count of permutations without repeated consecutive letters
  let count = 0;

  // Swap two characters at the specified indices in the array
  function swap(arr, i, j) {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // Generate permutations using backtracking
  function generatePermutations(n, arr) {
    if (n === 1) {
      // Check if the generated permutation has no repeated consecutive letters
      if (!arr.some((char, index) => char === arr[index + 1])) {
        count++;
      }
    } else {
      for (let i = 0; i < n; i++) {
        generatePermutations(n - 1, arr);
        if (n % 2 === 0) {
          swap(arr, i, n - 1);
        } else {
          swap(arr, 0, n - 1);
        }
      }
    }
  }

  // Call the permutation generation function
  generatePermutations(chars.length, chars);

  return count;
}

permAlone('aab');
