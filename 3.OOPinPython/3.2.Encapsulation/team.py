"""
Task 2:
Create a class `Team` with an inner class `Player`.
`Team` should manage a list of `Player` objects with methods to add, remove, and list players.
Implement private class Player field `passport`.
"""

from typing import List

class Team:
    # TODO: add roster field and constructor

    def add_player(self, name: str, number: int) -> None:
        # TODO: implement add_player
        pass

    def remove_player(self, name: str) -> None:
        # TODO: implement remove_player
        pass

    def display_players(self) -> None:
        # TODO: implement display_players
        pass

    class Player:
        # TODO: implement Player class with passport class fieldname and number instance fields
        pass


def main():
    team = Team()
    team.add_player("Alice", 10)
    team.add_player("Bob", 23)

    print("Roster:")
    team.display_players()
    # Expected:
    # Name: Alice, Number: 10
    # Name: Bob, Number: 23

    team.remove_player("Alice")
    print("\nAfter removal:")
    team.display_players()
    # Expected:
    # Name: Bob, Number: 23

if __name__ == "__main__":
    main() 