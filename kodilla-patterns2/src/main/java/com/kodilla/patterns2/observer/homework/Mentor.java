package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private int updateCount = 0;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Queue queue){
        System.out.println(name + ": New tasks in the queue " +
                queue.getName() + "\n" + queue.getTasks().size() +
                " tasks");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
