package racingcar.utils;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ParseUtil {

    public static List<String> stringToStringList(String input) {
        return List.of(input.split(","));
    }

    public static List<Car> stringListToCarList(List<String> inputs) {
        List<Car> cars = new ArrayList<>();

        for (String input : inputs) {
            cars.add(new Car(input));
        }

        return cars;
    }
}
