package com.carlocappellini;

public interface NodeList {
    Node getRoot();
    boolean addItem(Node item);
    boolean removeItem(Node item);
    void traverse(Node root);
}
