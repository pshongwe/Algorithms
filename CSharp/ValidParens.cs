public bool IsValid(string s) {
        char[] chars = s.ToCharArray();
        var myStack = new Stack<char>();
        HashSet<char> openBrackets = new HashSet<char> { '{', '(', '[' };
        foreach(char c in chars)
        {
            if (openBrackets.Contains(c))
            {
                myStack.Push(c);
            }
            else
            {
                if (myStack.Count == 0)
                {
                    return false;
                }
                var current = (char)myStack.Pop();
                if (current == '{' && c != '}') return false;
                if (current == '(' && c != ')') return false;
                if (current == '[' && c != ']') return false;
            }
        }
        return myStack.Count == 0;
}
