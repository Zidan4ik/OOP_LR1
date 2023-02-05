import java.util.ArrayList;
import java.util.List;

public class GameAccount {
    private String UserName;
    private double CurrentRating;
    private int GamesCount;
    List<Game> game = new ArrayList<>();

    public GameAccount(String UserName, double CurrentRating) {
        this.UserName = UserName;
        this.CurrentRating = CurrentRating;
    }

    String result1 = "Winner";
    String result2 = "Defeat";

    public void WinGame(GameAccount opponentName, double rating) throws Exception {
        if (rating < 0) {
            throw new Exception("rating<0");
        }
        opponentName.CurrentRating -= rating;
        this.CurrentRating += rating;
        this.GamesCount++;
        opponentName.GamesCount++;
        if (rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        }
        else if (opponentName.CurrentRating < 1) {
            throw new Exception("Рейтинг противника досягнув мінімального значення!!!");
        }
        game.add(new Game(this.GamesCount, this.UserName, opponentName.UserName, result1, rating, this.CurrentRating, opponentName.CurrentRating));
    }

    public void LoseGame(GameAccount opponentName, double rating) throws Exception {
        if (rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        }
        else if(this.CurrentRating<1){
            throw new Exception("Ваш рейтинг досягнув мінімального значення!!!");
        }
        opponentName.CurrentRating += rating;
        this.CurrentRating -= rating;
        this.GamesCount++;
        opponentName.GamesCount++;
        if (this.CurrentRating < 1 || opponentName.CurrentRating < 1) {
            throw new Exception("Ваш рейтинг досягнув мінімального значення!!!");
        }
        game.add(new Game(this.GamesCount, this.UserName, opponentName.UserName, result2, rating, this.CurrentRating, opponentName.CurrentRating));
    }

    public void GetStats() {
        for (Game s : game) {
            System.out.println(s + " ");
        }
    }
}
