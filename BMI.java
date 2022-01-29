package wk04_Lab;
import java.lang.Math;

public class BMI{ //public-can be called by another class
    private double weight; //private-protect well the internal data
    private double height; //private-protect well the internal data
    private double calculatedBMI; //private-protect well the internal data

    public BMI(double weight, double height){ //constructor to streamline the programming code
        this.height = height*0.0254;
        this.weight = weight*0.45359237;
    }

    public double getWeight(){ //open up certain methods for access
        return this.weight;
    }

    public double getHeight(){ //open up certain methods for access
        return this.height;
    }

    public void setHeight(double height){ //open up certain methods for access
        this.height = height*0.0254;
    }

    public void setWeight(double weight){ //open up certain methods for access 
        this.weight = weight*0.45359237;
    }

    public double calculateBMI(){ 
        calculatedBMI = this.weight/Math.pow(this.height,2);
        return calculatedBMI;
    }

    public void interpreteBMI(double calculatedBMI){ 
        if (calculatedBMI<18.5){
            System.out.println("Underweight");
        }
        else if(calculatedBMI>=18.5 && calculatedBMI < 25.0){
            System.out.println("Normal");
        }
        else if(calculatedBMI>=25.0 && calculatedBMI < 30.0){
            System.out.println("Overweight");
        }
        else if(calculatedBMI>=30.0){
            System.out.println("Obese");
        }
    }
}