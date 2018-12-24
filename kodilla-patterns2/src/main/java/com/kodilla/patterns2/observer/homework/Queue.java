package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Observable;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String name;

    public Queue(String name) {
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void
    addTask(String task)
    {
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
