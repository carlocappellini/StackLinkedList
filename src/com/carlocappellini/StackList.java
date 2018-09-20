package com.carlocappellini;

import java.util.Stack;

public interface StackList {
    Stack getRoot();

    boolean addListToStack(LinkedLists linkedLists);

    boolean removeLastListFromStack();
//    void traverseStacks(StackList root);
}
