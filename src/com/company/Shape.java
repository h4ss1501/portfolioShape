package com.company;

    abstract public class Shape {


        //may or may not be abstract methods, but abstract methods can only be in abstract class
        //methods cant be abstract and private, use protected.

        //variables
        protected int x = 0; //Y-axis
        protected int y = 0; //X-axis

        //constructor
        public Shape(int x,int y){
            this.x = x;
            this.y = y;
        }

        //getters & setters


        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        //methods
    abstract void AreaCalc();
    abstract double CircumCalc();

    //getCenter
    abstract int getCenter();

    //boolean
    abstract boolean isInsideShape();
}
