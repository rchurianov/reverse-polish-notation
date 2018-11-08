package com.roma.rpn;

import java.util.Arrays;
import java.util.LinkedList;

public class Cell {

    private String expression;

    public Cell() {
        expression = "";
    }

    public Cell(String cellExpression) {
        expression = cellExpression;
    }

    public String computeCell() {
        String result = "";

        // String[] rawElements = this.expression.split("\\+");
        // String[] rawOps = this.expression.split(rawElements);

        //Stack of operands
        LinkedList<String> operands = new LinkedList<String>();
        //Stack of operations
        LinkedList<String> operations = new LinkedList<String>();

        // String[] rawElements = this.expression.split("[\\+-\\*/]");
        char[] exprArray = expression.toCharArray();

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < exprArray.length; i++) {
            if (isOp(exprArray[i]))  {
                // Push everything after the last operation
                // and before the current operation to the stack
                end_index = i;
                operands.push(expression.substring(startIndex, endIndex));
                startIndex = i + 1;

                // Push the operation to the opesrtions stack
                operations.push(expression.substring(i, i));
            }

            // Push the last operand to the stack
            if (i == exprArray.length - 1) {
                endIndex = i;
                operands.push(expression.substring(startIndex, endIndex));
            }
        }

        // All operands and operations are in the stacks

        while (opearions.size() != 0) {
            String op = operations.pop();
            result = calculate(operands, op);
        }
        // result = java.util.Arrays.toString(rawElements);

        return result;
    }

    public String toString() {
        return expression;
    }

    public boolean isOp (char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

     public String calculate(LinkedList<String> operands, String operation) {
        int firstArgument = Integer.parseInt(operands.pop());
        int secondArgument = Integer.parseInt(operands.pop());
        int result = 0;

        switch (operation) {
            case "+": result = firstArgument + secondArgument;
                        break;
            case "-": result = firstArgument - secondArgument;
                        break;
            case "*": result = firstArgument * secondArgument;
                        break;
            case "/": result = firstArgument / secondArgument;
        }

        operands.push(Integer.toString(result));

        return Integer.toString(result);
    }

}
