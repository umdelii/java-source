package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        stack.push("0"); // add와 같은데 push라고 메소드를 만들어줌
        stack.push("1");
        stack.push("2");

        queue.offer("0"); // 얘도 add와 동일
        queue.offer("1");
        queue.offer("2");

        System.out.println("stack");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println("queue");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
