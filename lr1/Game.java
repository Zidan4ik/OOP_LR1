public class Game {

    String UserName1;
    String UserName2;
    double CurrentRating1;
    double CurrentRating2;
    double rating;
    String result;
    int Countgame = 0;

    public Game(int Countgame, String UserName1, String UserName2, String result, double rating, double CurrentRating1, double CurrentRating2) {
        this.UserName1 = UserName1;
        this.UserName2 = UserName2;
        this.CurrentRating1 = CurrentRating1;
        this.CurrentRating2 = CurrentRating2;
        this.rating = rating;
        this.result = result;
        this.Countgame = Countgame;
    }

    @Override
    public String toString() {
        return
                "CountGame = " + Countgame + "\nYourName :" + UserName1 +
                        "\nOpponentName : " + UserName2 +
                        "\n" + result +
                        "\nRating : " + rating +
                        "\nCurrentRating" + UserName2 + " : " + CurrentRating2 +
                        "\nCurrentRating" + UserName1 + " : " + CurrentRating1 +
                        "\n";
    }
}
