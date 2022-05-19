input = "HoLi_DAy"

def convertCaseLamba(input):
	# Using map function
	out = map(lambda x: x.lower() if x.isupper() else x.upper(), input)
	  
	# Converting it into list 
	output = list(out)
	print(''.join(output))
	return output

convertCase(input)
