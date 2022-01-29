package wk04_Lab;
import java.util.Scanner;

public class BMI_Human {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double calculateBMI;
    
        System.out.print("Enter weight in pounds: ");   
        weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();   

        BMI humanBMI = new BMI(weight, height);
        calculateBMI = humanBMI.calculateBMI();

        System.out.println("BMI is "+calculateBMI);  
        humanBMI.interpreteBMI(calculateBMI);  
    }
}
