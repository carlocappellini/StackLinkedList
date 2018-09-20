package com.carlocappellini;


import java.util.Stack;

public class Stacks<T> implements StackList {

    ListItem root = null;
    private int size;

    private String stackName;

    private Stack<LinkedLists> stack;

    private LinkedLists currentList;
    ListItem listItem;


    public String getStackName() {
        return stackName;
    }

    public Stacks(String stackName) {
        this.stackName = stackName;
        this.stack = new Stack<>();
    }

    public int getSize() {
        return size;
    }


    @Override
    public Stack getRoot() {
        return this.stack;
    }

    @Override
    public boolean addListToStack(LinkedLists linkedLists) {
        if (!stack.contains(linkedLists)) {
            this.stack.push(linkedLists);
            size++;
            System.out.println(linkedLists.getName() + " was added to stack");
            return true;

        } else {
            System.out.println(linkedLists.getName() + " already exist, cannot add");
            return false;

        }
    }

    @Override
    public boolean removeLastListFromStack() {
        System.out.println(stack.pop().getName() + " was deleted");
        size--;

        return true;
    }


    @Override
    public String toString() {
        return "Stacks{" +
                "size=" + size +
                ", stackName='" + stackName + '\'' +
                ", ListName=" + this.stack.peek().getName() +
                '}';
    }

}
