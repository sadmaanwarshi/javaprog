import string

def remove_punctuation(input_string):
    # Create a translation table to remove punctuation
    translator = str.maketrans('', '', string.punctuation)
    return input_string.translate(translator)

# Input string
input_string = input("Enter a string: ")
result = remove_punctuation(input_string)
print("String without punctuation:", result)
