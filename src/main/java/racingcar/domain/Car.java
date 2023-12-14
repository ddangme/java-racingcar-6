package racingcar.domain;

public class Car {
    public static final int CAR_LIST_MIN_COUNT = 2;
    public static final int CAR_LIST_MAX_COUNT = 20;
    public static final int CAR_NAME_MAX_LENGTH = 5;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

}
