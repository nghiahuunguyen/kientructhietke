package baitap.b2;

public abstract class TokenDecorator implements Tokenize {
    Tokenize tokenize;

    public TokenDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }
}
