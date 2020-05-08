interface Resizable {

    void resize(float scale);

    
}

abstract class GraphicObject {
    int xPos, yPos;

    abstract void draw();
}

class Rectangle extends GraphicObject {

    // fields and methods

    @Override
    void draw() {

    }

    @Override
    public void resize(float scale) { /* do something */ }
}

class Circle extends GraphicObject  implements Resizable{

    // fields and methods


    @Override
    void draw() {

    }

    @Override
    public void resize(float scale) { /* do something */ }
}
 