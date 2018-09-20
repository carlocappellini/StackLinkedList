package com.carlocappellini;

public abstract class ListItem {


     ListItem nextLink = null;
     ListItem previousLink = null;


    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);


    public void setValue(ListItem value) {
        this.value = value;
    }


}
