package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validator.InputValidator;

public class InputView {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public String inputCarNames() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
        String input = Console.readLine();

        InputValidator.validateInput(input);
        return input;
    }
}
