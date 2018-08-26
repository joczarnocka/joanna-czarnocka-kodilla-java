package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList;

    public ShapeCollector(){

        shapeList = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    };

    public boolean removeFigure(Shape shape){

        boolean res = shapeList.remove(shape);
        return res;
    }

    public Shape getFigure(int n){
        if (n >= 0 && n < shapeList.size())
            return shapeList.get(n);
        else
            return null;
    }

    public String showFigures(){
        String res = "";
        int cnt = 0;
        for (Shape s : shapeList){
            if (cnt>0)
                res += ",";
            res += s.getShapeName();
            cnt++;
        }
        return res;
    }

    public Integer getListSize(){
        return shapeList.size();
    }

}
