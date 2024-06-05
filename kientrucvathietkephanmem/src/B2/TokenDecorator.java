package Structural.Decorator.B2;

import java.util.List;

public abstract class TokenDecorator implements Tokenize{
    Tokenize tokenize;

    public TokenDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }



}
