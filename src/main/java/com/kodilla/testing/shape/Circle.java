package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    Double r;

    public Circle(Double r) {
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public Double getField() {
        return Math.PI * r * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}