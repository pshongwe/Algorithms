function binarySearch(searchList, value) {
  let arrayPath = [];
  let startIndex = 0;
  let endIndex = searchList.length - 1;

  while (startIndex <= endIndex) {
    let middleIndex = Math.floor((startIndex + endIndex) / 2);
    arrayPath.push(searchList[middleIndex]);

    if (searchList[middleIndex] === value) {
      return arrayPath;
    } else if (searchList[middleIndex] < value) {
      startIndex = middleIndex + 1;
    } else {
      endIndex = middleIndex - 1;
    }
  }

  return "Value Not Found";
}
