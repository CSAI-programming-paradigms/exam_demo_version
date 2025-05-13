"""
Task 5:
Create a class ExtendedStr, inheriting it from the standard class str.
Override its join method with the following behavior:
- If the argument has integer or real numbers, convert every number to a string
- String is processed in the same way as in the base class
- If the argument has a list, then join its elements in the same way
- If the argument has any other type (except string), it is skipped

Example:
a = ExtendedStr('+')
result = a.join([1, 2, ['a', ['b', 'c'], 4], 'qwerty', {'1':1}])
# Expected: '1+2+a+b+c+4+qwerty'
"""

class ExtendedStr(str):
    # TODO: implement join method 
    pass


def main():
    a = ExtendedStr('+')
    result = a.join([1, 2, ['a', ['b', 'c'], 4], 'qwerty', {'1':1}])
    print(result)  # Expected: 1+2+a+b+c+4+qwerty


if __name__ == "__main__":
    main() 