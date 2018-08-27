package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testNumber = 0;

    @BeforeClass
    public static void before(){
        System.out.println("ShapeCollector Tests - start");
    }

    @AfterClass
    public static void after(){
        System.out.println("ShapeCollector Tests - all test are finished");
    }

    @Before
    public void beforeTest(){
        testNumber++;
        System.out.println("Test number " + (testNumber) + " - start");
    }

    @After
    public void afterTest(){
        System.out.println("Test number " + (testNumber) + " - finished");
    }

    @Test
    public void testAddShape(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape triangle = new Triangle(10.0, 50.0);
        Shape square = new Square(10.0);
        Shape circle = new Circle(10.0);

        //When
        sc.addFigure(triangle);
        sc.addFigure(square);
        sc.addFigure(circle);
        Shape shape1 = sc.getFigure(0);
        Shape shape2 = sc.getFigure(1);
        Shape shape3 = sc.getFigure(2);
        int listSize = sc.getListSize();
        //Then
        Assert.assertEquals(3, listSize);
        Assert.assertEquals(triangle,shape1);
        Assert.assertEquals(square,shape2);
        Assert.assertEquals(circle,shape3);
    }

    @Test
    public void testRemoveExisitingFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square((double) 2);
        sc.addFigure(square);
        //When
        int listSizeBeforeRomove = sc.getListSize();
        boolean result = sc.removeFigure(square);
        int listSizeAfterRomove = sc.getListSize();
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(listSizeBeforeRomove-1,listSizeAfterRomove);
    }

    @Test
    public void testRemoveNonexisitingFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square((double) 2);
        sc.addFigure(square);
        Shape triangle = new Triangle((double)1,(double)1);
        //When
        int listSizeBeforeRomove = sc.getListSize();
        boolean result = sc.removeFigure(triangle);
        int listSizeAfterRomove = sc.getListSize();
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(listSizeBeforeRomove,listSizeAfterRomove);
    }

    @Test
    public void testGetExisitngIndex(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square((double)10);
        Shape triangle = new Triangle((double)10, (double) 5);
        Shape circle = new Circle((double)10);

        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        Shape result = sc.getFigure(1);
        //Then
        Assert.assertEquals("Triangle", result.getShapeName());
    }

    @Test
    public void testGetNonExisitngIndex(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square((double)10);
        Shape triangle = new Triangle((double)10, (double) 5);
        Shape circle = new Circle((double)10);

        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        Shape result = sc.getFigure(-2);
        //Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square((double)10);
        Shape triangle = new Triangle((double)10, (double) 5);
        Shape circle = new Circle((double)10);

        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        String result = sc.showFigures();
        //Then
        Assert.assertEquals("Square,Triangle,Circle", result);
    }

}
