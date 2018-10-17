package com.roma.rpn;

import java.util.Arrays;
import java.util.LinkedList;

public class Cell {

    private String expression;

    public Cell() {
        expression = "";
    }

    public Cell(String cell_expression) {
        expression = cell_expression;
    }

    public String computeCell() {
        String result = "";

        // String[] rawElements = this.expression.split("\\+");
        // String[] rawOps = this.expression.split(rawElements);

        String[] rawElements = this.expression.split("[\\+-\\*/]");

        // LinkedList<char> ops = new LinkedList<char>();
        // LinkedList<String> elems = new LinkedList<String>();


        result = java.util.Arrays.toString(rawElements);

        return result;
    }

    public String toString() {
        return expression;
    }

    public boolean is_op (char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // public String calculate(LinkedList<String> operands, LinkedList<char> operations) {
    //
    // }

}
