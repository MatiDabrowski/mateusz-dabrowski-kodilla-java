package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String anyString, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(anyString);
        System.out.println("anyString + ozdobnik = " + result);
    }
}
