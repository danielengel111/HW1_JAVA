public class WarGame {
    private Player player1;
    private Player player2;

    public WarGame(String player1_name, String player2_name) {
        this.player1 = new Player(player1_name);
        this.player2 = new Player(player2_name);
    }

    void initializeGame() {

    }

    String start(){}
}
