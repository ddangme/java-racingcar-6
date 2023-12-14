package racingcar.service;

import racingcar.domain.Car;

import java.util.List;

public class RacingService {
    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
