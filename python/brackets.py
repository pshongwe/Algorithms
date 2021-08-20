# takes a string and returns a boolean True or False indicating whether the bracket is paired or not
def bracketsPaired(sentence):
     sentence = sentence.strip(' ')
     stack = []
 
     for char in sentence:
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
 
 
 print(bracketsPaired("[] []"))
 print(bracketsPaired("[ []"))
