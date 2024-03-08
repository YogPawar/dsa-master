package com.dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class ValidParenthesis {

  public static void main(String[] args) {
    ValidParenthesis validParenthesis = new ValidParenthesis();
    System.out.println(validParenthesis.isValidParenthesis("{}{}{}{}"));
  }

  public boolean isValidParenthesis(String parenthesis) {
    HashMap<Character, Character> validatorMap = new HashMap<>();
    validatorMap.put('}', '{');
    validatorMap.put(']', '[');
    validatorMap.put(')', '(');
    validatorMap.put('>', '<');

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < parenthesis.length(); i++) {
      Character ch = parenthesis.charAt(i);
      if (validatorMap.containsKey(ch)) {
        char temp = !stack.isEmpty() ? stack.pop() : '#';
        if (temp != validatorMap.get(ch)) {
          return false;
        }

      } else {
        stack.push(ch);
      }
    }
    return Boolean.TRUE;
  }

}
