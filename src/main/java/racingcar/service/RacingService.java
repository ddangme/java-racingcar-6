package racingcar.service;

import racingcar.domain.Car;

import java.util.ArrayList;
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

    public List<String> getRacingResult() {
        List<String> racingResult = new ArrayList<>();

        for (int i = 0; i < racingRound; i++) {
            getRacingRoundResult(racingResult);
            racingResult.add("");
        }

        return racingResult;
    }

    public void getRacingRoundResult(List<String> racingResult) {

        for (Car car : cars) {
            car.playRound();
            racingResult.add(car.toString());
        }
    }

    public List<String> getWinnerNameList() {
        calculateWinnerPosition();
        return findWinner();
    }

    private void calculateWinnerPosition() {
        for (Car car : cars) {
            car.calculateWinnerPosition();
        }
    }

    private List<String> findWinner() {
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            String winnerName = car.getWinnerName();
            if (winnerName != null) {
                winners.add(winnerName);
            }
        }

        return winners;
    }


}
