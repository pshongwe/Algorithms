function updateInventory(arr1, arr2) {
  // Iterate over each item in the new inventory
  for (let [quantity, item] of arr2) {
    // Check if the item exists in the current inventory
    const foundIndex = arr1.findIndex(([_, curItem]) => curItem === item);

    if (foundIndex !== -1) {
      // If the item exists, update its quantity
      arr1[foundIndex][0] += quantity;
    } else {
      // If the item doesn't exist, add it to the inventory
      arr1.push([quantity, item]);
    }
  }

  // Sort the inventory by item name in alphabetical order
  arr1.sort((a, b) => a[1].localeCompare(b[1]));

  return arr1;
}

// Example inventory lists
var curInv = [
  [21, "Bowling Ball"],
  [2, "Dirty Sock"],
  [1, "Hair Pin"],
  [5, "Microphone"]
];

var newInv = [
  [2, "Hair Pin"],
  [3, "Half-Eaten Apple"],
  [67, "Bowling Ball"],
  [7, "Toothpaste"]
];

updateInventory(curInv, newInv);
