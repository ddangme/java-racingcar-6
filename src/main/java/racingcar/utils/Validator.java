package racingcar.utils;

import racingcar.domain.Car;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

    public void validateCarNames(List<String> carNames) {
        validateCarCount(carNames);
        validateCarNameLength(carNames);
        validateDuplicateForCarNAme(carNames);
    }

    private void validateCarCount(List<String> carNames) {
        if (carNames.size() < Car.MIN_CAR_LIST_SIZE || carNames.size() > Car.MAX_CAR_LIST_SIZE) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 2개 이상 20개 미만으로 입력해주세요.");
        }
    }

    private void validateCarNameLength(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() == 0 || carName.length() > Car.MAX_CAR_NAME_LENGTH) {
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 최대 5자까지 입력 가능합니다.");
            }
        }
    }

    private void validateDuplicateForCarNAme(List<String> carNames) {
        Set<String> noduplicateCarNames = new HashSet<>(carNames);

        if (noduplicateCarNames.size() != carNames.size()) {
            throw new IllegalArgumentException("[ERROR] 중복된 자동차 이름이 존재합니다.");
        }
    }

    public void validateRacingRoundRange(int racingRound) {
        if (racingRound < Car.MIN_RACING_ROUND || racingRound > Car.MAX_RACING_ROUND) {
            throw new IllegalArgumentException("[ERROR] 1 이상 100 이하로 입력해주세요.");
        }
    }

}
