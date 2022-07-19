package _general;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(){
        this(0,0,0,0);
    }

    public Rectangle(int length,int width){
        this(0,0,length,width);

    }

    public Rectangle(int x, int y, int length,int width){
        super(x,y);
        this.length=length;
        this.width=width;
    }
}
