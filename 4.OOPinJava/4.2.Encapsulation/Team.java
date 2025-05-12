// Task 2:
// Create a class `Team` with an inner class `Player`.
// `Team` should manage a list of `Player` objects with methods to add, remove, and list players.

import java.util.ArrayList;
import java.util.List;

class Team {
    private List<Player> roster = new ArrayList<>();

    // TODO: implement addPlayer(String name, int number)
    // TODO: implement removePlayer(String name)
    // TODO: implement displayPlayers()

    public class Player {
        private String name;
        private int number;
        public Player(String name, int number) {
            this.name = name;
            this.number = number;
        }
        // getters...
    }
}

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.addPlayer("Alice", 10);
        team.addPlayer("Bob", 23);

        System.out.println("Roster:");
        team.displayPlayers();
        // Expected:
        // Name: Alice, Number: 10
        // Name: Bob, Number: 23

        team.removePlayer("Alice");
        System.out.println("\nAfter removal:");
        team.displayPlayers();
        // Expected:
        // Name: Bob, Number: 23
    }
}
