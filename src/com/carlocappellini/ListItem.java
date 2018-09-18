package com.carlocappellini;

public abstract class ListItem {


     Node nextLink = null;
     Node previousLink = null;

    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    abstract Node next();

    abstract Node setNext(Node item);

    abstract Node previous();

    abstract Node setPrevious(Node item);

    abstract int compareTo(Node item);


}
