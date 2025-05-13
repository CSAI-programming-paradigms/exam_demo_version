"""
Task 4:
Create a Singleton class `Logger` ensuring only one instance exists.
Provide a `log(message)` method that prefixes messages with a timestamp.
"""

from datetime import datetime

class Logger:
    # TODO: add class variable for instance

    # implement constructor

    def log(self, message: str) -> None:
        # TODO: implement log method
        pass

def main():
    log1 = Logger()
    log2 = Logger()

    log1.log("First message")
    log2.log("Second message")
    print(log1 is log2)  # Expected: True

if __name__ == "__main__":
    main() 