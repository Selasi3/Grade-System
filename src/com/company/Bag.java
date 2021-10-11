package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bag<E> implements Iterable{

    private Map<E, Integer> elements = new HashMap<E, Integer>();

    public void add(E el) {
        if (elements.containsKey(el)) {
            elements.put(el, elements.get(el) + 1);
        } else {
            elements.put(el, 1);
        }
    }

    public void remove(E el) {
        if (elements.containsKey(el)) {
            int val = elements.get(el);
            if (val == 1) {
                elements.remove(el);
            } else {
                elements.put(el, val - 1);
            }
        }
    }

    @Override
    public String toString() {
        return "Bag{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
