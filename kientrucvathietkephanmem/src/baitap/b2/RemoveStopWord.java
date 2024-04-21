package baitap.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends TokenDecorator {
    List<String> stopwords;

    public RemoveStopWord(Tokenize tokenize) {
        super(tokenize);
        stopwords = new ArrayList<String>(Arrays.asList("thì","mà","là","nhưng","bị","cái","được","và"));

    }

    @Override
    public List<String> tokenize() {
        List<String> result = tokenize.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}