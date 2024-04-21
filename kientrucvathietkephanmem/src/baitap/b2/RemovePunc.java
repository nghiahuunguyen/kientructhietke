package baitap.b2;


import java.util.List;

public class RemovePunc extends TokenDecorator{
    public RemovePunc(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> list=tokenize.tokenize();
        list.replaceAll(s -> s.replaceAll("\\p{Punct}", ""));
        return list;
    }
}
