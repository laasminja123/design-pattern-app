package com.design.pattern.app.product.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class BeverageStates {

    final Deque<BeverageMemento> mementos = new ArrayDeque<>();

    public BeverageMemento getMemento() {
        BeverageMemento empMemento= mementos.pop();
        return empMemento;
    }

    public void addMemento(BeverageMemento memento) {
        mementos.push(memento);
    }
}
