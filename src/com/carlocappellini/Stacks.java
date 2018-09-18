package com.carlocappellini;

import java.util.LinkedList;
import java.util.Stack;

public class Stacks<T extends LinkedLists<Node>> implements StackList {

    public Stack getStack() {
        return stack;
    }

    Stack<LinkedLists<ListItem>> stack;

    public Stacks() {
        this.stack = new Stack<>();
    }



    @Override
    public Stack getRoot() {
        return null;
    }

    @Override
    public boolean addListToStack(LinkedLists linkedLists) {
        if (!stack.contains(linkedLists)) {
            this.stack.push(linkedLists);

            System.out.println(linkedLists + " was added to stack");
            return true;

        } else {
            System.out.println(linkedLists + " already exist, cannot add");
            return false;

        }
    }

    @Override
    public boolean removeLastListFromStack() {
        System.out.println(stack.pop().getListName() + " was deleted");
        return true;
    }



    @Override
    public void traverseStacks(LinkedLists root) {

    }
}
