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
        if (carNames.size() < Car.CAR_LIST_MIN_COUNT || carNames.size() > Car.CAR_LIST_MAX_COUNT) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 2개 이상 20개 미만으로 입력해주세요.");
        }
    }

    private void validateCarNameLength(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() == 0 || carName.length() > Car.CAR_NAME_MAX_LENGTH) {
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

}
