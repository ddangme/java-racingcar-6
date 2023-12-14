package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    public static final int MIN_CAR_LIST_SIZE = 2;
    public static final int MAX_CAR_LIST_SIZE = 20;
    public static final int MAX_CAR_NAME_LENGTH = 5;

    public static final int MIN_RACING_ROUND = 1;
    public static final int MAX_RACING_ROUND = 100;

    public static final int MIN_MOVEMENT = 4;

    public static int winnerPosition = 0;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void playRound() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if (randomNumber >= MIN_MOVEMENT) {
            move();
        }
    }

    private void move() {
        position++;
    }

    public String toString() {
        return name + " : " + "-".repeat(position);
    }

    public void calculateWinnerPosition() {
        if (winnerPosition < position) {
            winnerPosition = position;
        }
    }

    public String getWinnerName() {
        if (winnerPosition == position) {
            return name;
        }
        return null;
    }

}
