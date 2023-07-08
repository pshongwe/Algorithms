function sym(...args) {
  const arrays = Array.from(args);

  const result = arrays.reduce((accumulator, currentArray) => {
    const diff = currentArray.filter(element => !accumulator.includes(element));
    const extra = accumulator.filter(element => !currentArray.includes(element));
    return [...diff, ...extra];
  }, []);

  return Array.from(new Set(result));

}
