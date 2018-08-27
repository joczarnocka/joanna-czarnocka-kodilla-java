package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    Double a;

    public Square(Double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public Double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(a, square.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
