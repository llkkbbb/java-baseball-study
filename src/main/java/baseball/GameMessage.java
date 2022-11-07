package baseball;

public class GameMessage {

    private final int strikeCount;
    private final int ballCount;

    public GameMessage(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean check() {
        if (strikeCount == 3) {
            View.end(strikeCount);
            return true;
        }

        if (strikeCount != 0 && ballCount != 0) {
            View.ballAndStrike(ballCount, strikeCount);
            return false;
        }

        if (strikeCount == 0 && ballCount != 0) {
            View.ball(ballCount);
            return false;
        }

        if (strikeCount != 0) {
            View.strike(strikeCount);
            return false;
        }

        View.nothing();
        return false;
    }
}
