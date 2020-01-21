package algorithm.list;

import java.util.Stack;

/**
 * This class answers the following problem:
 * Given two numbers represented by two lists,
 * write a function that returns the sum list.
 * The sum list is list representation of the addition of two input numbers.
 *
 * Example:
 * Input: List1: 5->6->3  // represents number 365
 *        List2: 8->4->2 //  represents number 248
 * Output: Resultant list: 3->1->6  // represents number 613
 *
 * Input: List1: 7->5->9->4->6  // represents number 64957
 *        List2: 8->4           //  represents number 48
 * Output: Resultant list: 5->0->0->5->6  // represents number 65005
 */
public class SumOfTwoLists {

   public Stack sum(Stack s1, Stack s2) {
       Integer number1 = convertToInteger(s1);
       Integer number2 = convertToInteger(s2);

       Integer sum = number1 + number2;

       return convertToList(sum);
   }

   private Integer convertToInteger(Stack stackOfInteger) {
       StringBuilder builder = new StringBuilder();

       while (!stackOfInteger.isEmpty()) {
           builder.append(stackOfInteger.pop());
       }

       return Integer.parseInt(builder.toString());
   }

   private Stack convertToList(Integer value) {
       Stack result = new Stack();

       while (value > 0) {
           result.push(value % 10);
            value = value/10;
       }

       return result;
   }
}
