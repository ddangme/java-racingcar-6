package racingcar.service;

import java.util.List;

public class OutputService {

    public void printWinnerNames(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

    public void printRacingResult(List<String> racingResult) {
        System.out.println("실행 결과");
        for (String result : racingResult) {
            System.out.println(result);
        }
    }
}
