package com.city;

/**
 * Created by soniiatm on 6/7/2017.
 */
public class UserInput {

    static  class TextInput {

        private String value = "";

        public void add(char c) {
            value += c;
        }

        public String getValue() {
            return value;
        }

    }

    static class  NumericInput extends TextInput {

        @Override
        public void add(char c) {
            if (Character.isDigit(c)) {
                super.add(c);
            }
        }

    }
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        //input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
