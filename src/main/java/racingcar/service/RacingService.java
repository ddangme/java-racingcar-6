package racingcar.service;

import racingcar.domain.Car;

import java.util.List;

public class RacingService {
    private List<Car> cars;
    private int racingRound;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setRacingRound(int racingRound) {
        this.racingRound = racingRound;
    }
}
