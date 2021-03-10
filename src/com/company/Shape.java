package com.company;

    abstract public class Shape {


        //may or may not be abstract methods, but abstract methods can only be in abstract class
        //methods cant be abstract and private, use protected.

        //variables
        protected int height; //Y-axis
        protected int width; //X-axis

        //constructor
        public Shape(int height,int width){
            this.height = height;
            this.width = width;
        }


   //methods
    abstract float AreaCalc();

    //getCenter
    abstract int getCenter();

    //calc circumference
   abstract int CircumCalc();

    //boolean
    abstract boolean isInsideShape();
}
