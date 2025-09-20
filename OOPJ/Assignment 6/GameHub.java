import java.util.*;


public class GameHub {

    
    static abstract class Game implements Comparable<Game> {
        static int idCounter = 100; 
        static int totalGames = 0;

        int gameId;
        String name;
        String genre;
        int rating;
        String platform;
        boolean isBorrowed = false;

        public Game(String name, String genre, int rating, String platform) throws InvalidRatingException {
            if (rating < 1 || rating > 5) {
                throw new InvalidRatingException("Rating must be between 1 and 5.");
            }
            this.gameId = idCounter++;
            this.name = name;
            this.genre = genre;
            this.rating = rating;
            this.platform = platform;
            totalGames++;
        }

        public int getGameId() { return gameId; }
        public String getName() { return name; }
        public String getGenre() { return genre; }
        public int getRating() { return rating; }
        public boolean isBorrowed() { return isBorrowed; }
        public void setBorrowed(boolean borrowed) { isBorrowed = borrowed; }

        public static int getTotalGames() { return totalGames; }

        public abstract void displayDetails();

        @Override
        public int compareTo(Game other) {
            return Integer.compare(this.gameId, other.gameId);
        }

        @Override
        public String toString() {
            return "[ID: " + gameId + ", Name: " + name + ", Genre: " + genre + 
                   ", Rating: " + rating + ", Platform: " + platform + "]";
        }
    }

    
    static class ConsoleGame extends Game {
        private String consoleType;

        public ConsoleGame(String name, String genre, int rating, String consoleType) throws InvalidRatingException {
            super(name, genre, rating, "Console");
            this.consoleType = consoleType;
        }

        @Override
        public void displayDetails() {
            System.out.println(toString() + " ConsoleType: " + consoleType);
        }
    }

    
    static class PCGame extends Game {
        private String systemRequirements;

        public PCGame(String name, String genre, int rating, String systemRequirements) throws InvalidRatingException {
            super(name, genre, rating, "PC");
            this.systemRequirements = systemRequirements;
        }

        @Override
        public void displayDetails() {
            System.out.println(toString() + " Requirements: " + systemRequirements);
        }
    }

    
    static class User {
        private static int totalUsers = 0;
        private String username;
        private String email;
        private ArrayList<Game> borrowedGames = new ArrayList<>();

        public User(String username, String email) {
            this.username = username;
            this.email = email;
            totalUsers++;
        }

        public String getUsername() { return username; }
        public void addBorrowedGame(Game g) { borrowedGames.add(g); }
        public void removeBorrowedGame(Game g) { borrowedGames.remove(g); }
        public static int getTotalUsers() { return totalUsers; }

        @Override
        public String toString() {
            return "[Username: " + username + ", Email: " + email + ", Borrowed Games: " + borrowedGames.size() + "]";
        }
    }

    
    interface GameActions {
        void addGame(Game game);
        void removeGame(int gameId) throws GameNotFoundException;
        void viewGames(int sortOption);
        void searchGame(String keyword);
        void registerUser(User user);
        void viewUsers();
        void issueGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException;
        void returnGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException;
        void displayBorrowedQueue();
        void showStatistics();
    }

    
    static class GameHubManager implements GameActions {
        private ArrayList<Game> allGames = new ArrayList<>();
        private LinkedList<Game> borrowedQueue = new LinkedList<>();
        private HashSet<String> usernames = new HashSet<>();
        private HashMap<Integer, Game> gameMap = new HashMap<>();
        private HashMap<String, User> userMap = new HashMap<>();

        @Override
        public void addGame(Game game) {
            allGames.add(game);
            gameMap.put(game.getGameId(), game);
            System.out.println("Game added successfully! [Game ID: " + game.getGameId() + "]");
        }

        @Override
        public void removeGame(int gameId) throws GameNotFoundException {
            Game game = gameMap.get(gameId);
            if (game == null) {
                throw new GameNotFoundException("Game not found!");
            }
            if (game.isBorrowed()) {
                System.out.println("Cannot remove game. It is currently borrowed.");
                return;
            }
            allGames.remove(game);
            gameMap.remove(gameId);
            System.out.println("Game removed successfully!");
        }

        @Override
        public void viewGames(int sortOption) {
            if (allGames.isEmpty()) {
                System.out.println("No games available.");
                return;
            }
            List<Game> sortedGames = new ArrayList<>(allGames);
            if (sortOption == 1) {
                Collections.sort(sortedGames); // by ID
            } else if (sortOption == 2) {
                sortedGames.sort(new GameNameComparator());
            } else if (sortOption == 3) {
                sortedGames.sort(new GameRatingComparator());
            }
            for (Game g : sortedGames) {
                g.displayDetails();
            }
        }

        @Override
        public void searchGame(String keyword) {
            boolean found = false;
            for (Game g : allGames) {
                if (g.getName().equalsIgnoreCase(keyword) || g.getGenre().equalsIgnoreCase(keyword)) {
                    g.displayDetails();
                    found = true;
                }
            }
            if (!found) System.out.println("No matching game found.");
        }

        @Override
        public void registerUser(User user) {
            if (usernames.contains(user.getUsername())) {
                System.out.println("Username already exists!");
                return;
            }
            usernames.add(user.getUsername());
            userMap.put(user.getUsername(), user);
            System.out.println("User registered successfully!");
        }

        @Override
        public void viewUsers() {
            if (userMap.isEmpty()) {
                System.out.println("No users registered.");
                return;
            }
            userMap.values().forEach(System.out::println);
        }

        @Override
        public void issueGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
            Game game = gameMap.get(gameId);
            if (game == null) throw new GameNotFoundException("Game not found!");
            User user = userMap.get(username);
            if (user == null) throw new UserNotFoundException("User not found!");

            if (game.isBorrowed()) {
                System.out.println("Game is already borrowed.");
                return;
            }

            game.setBorrowed(true);
            borrowedQueue.add(game);
            user.addBorrowedGame(game);
            System.out.println("Game borrowed successfully by " + username + "!");
        }

        @Override
        public void returnGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
            Game game = gameMap.get(gameId);
            if (game == null) throw new GameNotFoundException("Game not found!");
            User user = userMap.get(username);
            if (user == null) throw new UserNotFoundException("User not found!");

            if (!user.borrowedGames.contains(game)) {
                System.out.println("Only the borrower can return this game.");
                return;
            }

            game.setBorrowed(false);
            borrowedQueue.remove(game);
            user.removeBorrowedGame(game);
            System.out.println("Game returned successfully!");
        }

        @Override
        public void displayBorrowedQueue() {
            if (borrowedQueue.isEmpty()) {
                System.out.println("No games currently borrowed.");
                return;
            }
            System.out.println("Borrowed Games Queue:");
            borrowedQueue.forEach(Game::displayDetails);
        }

        @Override
        public void showStatistics() {
            long borrowedCount = allGames.stream().filter(Game::isBorrowed).count();
            System.out.println("Total Games: " + Game.getTotalGames());
            System.out.println("Available Games: " + (Game.getTotalGames() - borrowedCount));
            System.out.println("Borrowed Games: " + borrowedCount);
            System.out.println("Total Registered Users: " + User.getTotalUsers());
        }
    }

    // ===================== COMPARATORS =====================
    static class GameNameComparator implements Comparator<Game> {
        public int compare(Game g1, Game g2) {
            return g1.getName().compareToIgnoreCase(g2.getName());
        }
    }

    static class GameRatingComparator implements Comparator<Game> {
        public int compare(Game g1, Game g2) {
            return Integer.compare(g2.getRating(), g1.getRating()); // Descending
        }
    }

    // ===================== CUSTOM EXCEPTIONS =====================
    static class GameNotFoundException extends Exception {
        public GameNotFoundException(String message) { super(message); }
    }

    static class UserNotFoundException extends Exception {
        public UserNotFoundException(String message) { super(message); }
    }

    static class InvalidRatingException extends Exception {
        public InvalidRatingException(String message) { super(message); }
    }

    // ===================== MAIN APP =====================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameHubManager manager = new GameHubManager();

        while (true) {
            System.out.println("\n====== Game Hub Menu ======");
            System.out.println("1. Add Game");
            System.out.println("2. Remove Game");
            System.out.println("3. View Games");
            System.out.println("4. Search Game");
            System.out.println("5. Register User");
            System.out.println("6. View Users");
            System.out.println("7. Issue Game");
            System.out.println("8. Return Game");
            System.out.println("9. Borrowed Queue Display");
            System.out.println("10. Show Statistics");
            System.out.println("0. Exit");
            System.out.println("===========================");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Game Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Enter Rating (1-5): ");
                        int rating = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Platform (Console/PC): ");
                        String platform = sc.nextLine();

                        if (platform.equalsIgnoreCase("Console")) {
                            System.out.print("Enter Console Type: ");
                            String consoleType = sc.nextLine();
                            manager.addGame(new ConsoleGame(name, genre, rating, consoleType));
                        } else {
                            System.out.print("Enter System Requirements: ");
                            String sysReq = sc.nextLine();
                            manager.addGame(new PCGame(name, genre, rating, sysReq));
                        }
                        break;

                    case 2:
                        System.out.print("Enter Game ID to remove: ");
                        int removeId = sc.nextInt();
                        manager.removeGame(removeId);
                        break;

                    case 3:
                        System.out.println("Sort by: 1.ID  2.Name  3.Rating");
                        int sortOpt = sc.nextInt();
                        manager.viewGames(sortOpt);
                        break;

                    case 4:
                        System.out.print("Enter Game Name or Genre to search: ");
                        String keyword = sc.nextLine();
                        manager.searchGame(keyword);
                        break;

                    case 5:
                        System.out.print("Enter Username: ");
                        String username = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();
                        manager.registerUser(new User(username, email));
                        break;

                    case 6:
                        manager.viewUsers();
                        break;

                    case 7:
                        System.out.print("Enter Game ID to borrow: ");
                        int borrowId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Username: ");
                        String borrowUser = sc.nextLine();
                        manager.issueGame(borrowId, borrowUser);
                        break;

                    case 8:
                        System.out.print("Enter Game ID to return: ");
                        int returnId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Username: ");
                        String returnUser = sc.nextLine();
                        manager.returnGame(returnId, returnUser);
                        break;

                    case 9:
                        manager.displayBorrowedQueue();
                        break;

                    case 10:
                        manager.showStatistics();
                        break;

                    case 0:
                        System.out.println("Exiting Game Hub. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
