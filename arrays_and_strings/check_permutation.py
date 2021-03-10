# Here we can make use of the fact that you can iterate over strings as lists natively in Python
def check_permutation(str1, str2):
    if len(str1) != len(str2):
        return False
    
    for char in str2:
        if char not in str1:
            return False
    
    return True
    