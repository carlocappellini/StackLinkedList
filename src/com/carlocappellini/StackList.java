package com.carlocappellini;

import java.util.Stack;

public interface StackList {
    Stack getRoot();
    boolean addListToStack(LinkedLists<Node> linkedLists);
    boolean removeLastListFromStack();
    void traverseStacks(LinkedLists root);
}
