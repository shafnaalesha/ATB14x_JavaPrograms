package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_20_ArrayDeQueue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        deck.push(4);
        System.out.println(deck);
    }
}
