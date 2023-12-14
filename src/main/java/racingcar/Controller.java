package racingcar;

import racingcar.domain.Car;
import racingcar.service.InputService;
import racingcar.service.OutputService;
import racingcar.service.RacingService;
import racingcar.utils.ParseUtil;
import racingcar.utils.Validator;

import java.util.List;

public class Controller {

    private final InputService inputService = new InputService();
    private final OutputService outputService = new OutputService();
    private final RacingService racingService = new RacingService();
    private final Validator validator = new Validator();

    public void gameStart() {
        setCars();
        setRacingRound();
        showRacingResult();
        showWinners();
    }

    private void setCars() {
        while (true) {
            try {
                String inputCarNames = inputService.inputCarNames();
                List<String> carNames = ParseUtil.stringToStringList(inputCarNames);
                validator.validateCarNames(carNames);
                List<Car> cars = ParseUtil.stringListToCarList(carNames);

                racingService.setCars(cars);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void setRacingRound() {
        while (true) {
            try {
                String inputRacingRound = inputService.inputRacingRound();
                int racingRound = ParseUtil.stringToInt(inputRacingRound);
                validator.validateRacingRoundRange(racingRound);

                racingService.setRacingRound(racingRound);
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showRacingResult() {
        List<String> racingResult = racingService.getRacingResult();
        outputService.printRacingResult(racingResult);
    }



    private void showWinners() {
        List<String> winners = racingService.getWinnerNameList();
        outputService.printWinnerNames(winners);
    }


}
