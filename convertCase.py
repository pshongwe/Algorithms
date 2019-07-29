def convertCaseNaive(input):
	result = ""
	sLength = len(input)
	if(isinstance(input, str)):
		for i in range(len(input)):
			current = input[i]

			if(current.isupper()):
				current = current.lower()
				result += current
			elif(current.islower()):
				current = current.upper()
				result += current			
			else:
				result += current
		return result

memo = []
def convertCaseRec(input, n):
	memo = list('')
	if input is None or n == 0:
		return ""
	if memo is not None:
		if len(memo) >  0 and memo[n - 1] == (input[n - 1]):
				return memo[n - 1] + ""
		else:
			fc = input[n-1]
			fc = flip(fc)
			memo.append(fc)
			return convertCaseRec(input[0:n - 1], n-1)+""+fc	
	return memo

def flip(c):
	res = c
	if c.isupper():
		res = c.lower()
	else:
		res = c.upper()
	return res

print(convertCaseRec("HolI_dAy.", len("HolI_dAy.")))