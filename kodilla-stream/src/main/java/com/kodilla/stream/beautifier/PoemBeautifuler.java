package com.kodilla.stream.beautifier;

public class PoemBeautifuler {
    public String beautify(String text, PoemDecorator poemDecorator){
        return poemDecorator.decorate(text);
    }
}
