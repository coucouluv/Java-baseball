package baseball.domain;

import baseball.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User implements Player{

    private List<Integer> number;

    @Override
    public void createNumber() {
        String input = InputView.inputMessage();
        number = Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

    }
    public List<Integer> getNumber() {
        return number;
    }
}
