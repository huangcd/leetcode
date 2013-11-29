package com.leetcode.huangcd;

import java.util.Stack;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 1:58 PM
 * <p/>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p/>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p/>
 * Some examples:
 * <p/>
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * <p/>
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 * @author chhuang at live dot cn
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int op1, op2;
        for (String token : tokens) {
            if (token.equals("+")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 + op2);

            } else if (token.equals("-")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 - op2);

            } else if (token.equals("*")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 * op2);

            } else if (token.equals("/")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 / op2);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
