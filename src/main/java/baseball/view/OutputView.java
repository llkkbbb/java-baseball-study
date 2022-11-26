package baseball.view;

public class OutputView {

    public static void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printSelectNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printRestartAndEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printBaseBallResult(int strikeCount, int ballCount) {
        if (strikeCount != 0 && ballCount == 0)  {
            printStrike(strikeCount);
        }

        if (strikeCount == 0 && ballCount != 0) {
            printBall(ballCount);
        }

        if (strikeCount != 0 && ballCount != 0) {
            printBallAndStrike(ballCount, strikeCount);
        }

        if (strikeCount == 0 && ballCount == 0) {
            printNothing();
        }
    }

    private static void printStrike(int strikeCount) {
        System.out.printf("%d스트라이크\n", strikeCount);
    }

    private static void printBall(int ballCount) {
        System.out.printf("%d볼\n", ballCount);
    }

    private static void printBallAndStrike(int ballCount, int strikeCount) {
        System.out.printf("%d볼 %d스트라이크\n", ballCount, strikeCount);
    }

    private static void printNothing() {
        System.out.println("낫싱");
    }
}
