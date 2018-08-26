package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    Double a;
    Double h;

    public Triangle(Double a, Double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getField() {
        return a * h / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) &&
                Objects.equals(h, triangle.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h);
    }
}