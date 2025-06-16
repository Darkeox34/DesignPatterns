package creationalpatterns.prototype;

import kotlin.Pair;

public class Rectangle extends Shape {

    public int width, height;

    public Rectangle(Rectangle source) {
        super(source);

        this.width = source.width;
        this.height = source.height;
    }

    public Rectangle(){

    }

    public Pair<Integer, Integer> getSize(){
        return new Pair<>(width, height);
    }

    public Rectangle clone(){
        return new Rectangle(this);
    }
}
