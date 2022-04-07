package com.skillsoft.nestedclasseslambdas;

import java.util.Iterator;

public class StringContainer {

    private String [] strings;
    private int index=0;

    public StringContainer(String...strings){
        this.strings=strings;
    }

    public Iterator<String> iterator(){
        return new UpperCaseNamesIterator();
    }

    private class UpperCaseNamesIterator implements Iterator<String>{

        @Override
        public boolean hasNext() {
            return StringContainer.this.index<StringContainer.this.strings.length;
        }

        @Override
        public String next() {
            return StringContainer.this.strings[StringContainer.this.index++].toUpperCase();
        }
    }
}
