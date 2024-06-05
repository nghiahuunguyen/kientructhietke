package Structural.Decorator.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenDecorator{
    List<String> stopWord;
    public RemoveStopword(Tokenize tokenize) {
        super(tokenize);
        stopWord = new ArrayList<String>(Arrays.asList("thì", "mà","là","nhưng","bị","cái","được","và"));

    }

    @Override
    public List<String> tokenize() {
       List<String> result = tokenize.tokenize();
       result.removeAll(stopWord);
        return result;
    }
}
