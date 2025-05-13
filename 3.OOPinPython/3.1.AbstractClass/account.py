"""
Task 1:
Define an abstract class `Account` with fields account_number and balance,
plus an abstract method compute_interest().
Implement concrete subclasses `SavingsAccount` (4% interest) and `CheckingAccount` (1% interest).
"""


class Account:
    # TODO: add fields and constructor

    def compute_interest(self) -> float:
        pass

    def print_details(self):
        print(f"Account: {self.account_number}, Balance: {self.balance:.2f}, Interest: {self.compute_interest():.2f}")

class SavingsAccount(Account):
    # TODO: implement constructor and compute_interest()
    pass

class CheckingAccount(Account):
    # TODO: implement constructor and compute_interest()
    pass


def main():
    sa = SavingsAccount("SA123", 1000.0)
    ca = CheckingAccount("CA456", 2000.0)

    sa.print_details()  # Expected: Account: SA123, Balance: 1000.00, Interest: 40.00
    ca.print_details()  # Expected: Account: CA456, Balance: 2000.00, Interest: 20.00

if __name__ == "__main__":
    main() 