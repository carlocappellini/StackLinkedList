package com.carlocappellini;

public class Node extends ListItem {


    public Node(Object value) {
        super(value);
    }

    @Override
    Node next() {
        return this.nextLink;

    }

    @Override
    Node setNext(Node item) {
        this.nextLink = item;
        return null;
    }

    @Override
    Node previous() {
        return this.previousLink;

    }

    @Override
    Node setPrevious(Node item) {

        this.previousLink = item;
        return this.previousLink;
    }

    @Override
    int compareTo(Node item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }
}
