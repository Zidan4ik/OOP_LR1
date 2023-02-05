public class Start {
    public static void main(String[] args) throws Exception {
        GameAccount player1 = new GameAccount("Roma", 100);
        GameAccount player2 = new GameAccount("Denys", 900);
        player1.WinGame(player2,30);
        player1.LoseGame(player2,34);
        player1.GetStats();
    }
}
