# takes a string and returns a boolean True or False indicating whether the bracket is paired or not
def bracketsPaired(expression):
     expression = expression.strip(' ')
     stack = []
 
     for char in expression:
         if char in ["(","{","["]:
             stack.append(char)
         else:
             if not stack:
                 return False
             current = stack.pop()
             if current == '(':
                 if char != ')':
                     return False
             if current == '{':
                 if char != '}':
                     return False
             if current == '[':
                 if char != ']':
                     return False
     if stack:
         return False
     return True
 
 
 print(bracketsPaired("[][]"))
