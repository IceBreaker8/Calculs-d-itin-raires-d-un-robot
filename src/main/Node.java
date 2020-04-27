package main;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class Node  {
    public static List<Node> nodesList = new ArrayList<Node>() ;
    protected boolean isObsstacle ;
    protected double x,y,shapeSize ;
    protected Circle shape ;

    public Node(){
        shape=new Circle();
        shape.setCenterX(x);//réglage de la position, de la taille et de la couleur du cercle
        shape.setCenterY(y);
        shape.setRadius(shapeSize);
        nodesList.add(this);

    }
    public Node(double x,double y) {
        shape=new Circle();
        this.x=x;
        this.y=y;
        shape.setCenterX(x);
        shape.setCenterY(y);
        shape.setRadius(shapeSize);
        nodesList.add(this);

    }
    public Node(double x,double y,double radius) {
        shape=new Circle();
        this.x=x;
        this.y=y;
        shapeSize=radius;
        shape.setCenterX(x);
        shape.setCenterY(y);
        shape.setRadius(shapeSize);
        nodesList.add(this);
        shape.setRadius(shapeSize);

    }
    public Node(double x,double y,double radius,int red , int green , int blue) {
        shape=new Circle();
        this.x=x;
        this.y=y;
        shapeSize=radius;
        shape.setCenterX(x);
        shape.setCenterY(y);
        shape.setRadius(shapeSize);
        nodesList.add(this);
        shape.setRadius(shapeSize);
        shape.setFill(Color.rgb(red,green,blue));

    }
    public void setSize(double size) {
        shapeSize=size;
        shape.setRadius(shapeSize);
    }
    public void setColor(int red , int green , int blue) {
        shape.setFill(Color.rgb(red,green,blue));

    }
    public double getX(){
        return x ;
    }
    public void setX(int x){
        this.x=x;
        shape.setCenterX(x);
    }
    public double getY(){
        return y ;

    }
    public void setY(int y){
        this.y=y;
        shape.setCenterY(y);
    }
    public Circle getShape() {
        return shape ;
    }


}









