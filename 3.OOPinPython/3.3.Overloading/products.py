"""
Task 3:
Create a base class Product and its subclasses FoodProduct and HouseholdChemical.
Override comparison methods to compare products:
- If products are of the same type, compare them by price
- If products are of different types, raise an exception

Example:
food1 = FoodProduct("Apple", 2.5)
food2 = FoodProduct("Banana", 3.0)
chemical = HouseholdChemical("Soap", 4.3)

print(food1 < food2)  # Expected: True (2.5 < 3.0)
print(food1 > chemical)  # Expected: TypeError: Cannot compare different product types
"""

class Product:
    # TODO: implement base class with name and price fields
    pass


class FoodProduct(Product):
    # TODO: implement food product class
    pass


class HouseholdChemical(Product):
    # TODO: implement household chemical class
    pass


def main():
    food1 = FoodProduct("Apple", 2.5)
    food2 = FoodProduct("Banana", 3.0)
    chemical = HouseholdChemical("Soap", 4.0)

    print(food1 < food2)  # Expected: True (2.5 < 3.0)
    print(food1 > chemical)  # Expected: TypeError: Cannot compare different product types

if __name__ == "__main__":
    main()
