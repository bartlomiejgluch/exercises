package pl.projects.bartek.exercises.wzorceProjektowe.FactoryPattern;

public class Circle implements  Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
