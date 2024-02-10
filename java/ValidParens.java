public boolean matches(char a, char b) {
  return (a == '{' && b == '}') || (a == '(' && b == ')') || (a == '[' && b == ']');
}

public boolean isValid(String s) {
  Stack<Character> stack = new Stack<>();
  for (char c : s.toCharArray()) {
    if (c == '{' || c == '(' || c == '[') {
        stack.push(c);
    } else {
        if (stack.isEmpty()) return false;
        char last = stack.pop();
        if (!matches(last, c)) return false;
    }
  }
  return stack.isEmpty();
}
