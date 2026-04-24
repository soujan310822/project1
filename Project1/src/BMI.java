import java.util.Scanner;
public class BMI {
    // static method
    private static void BMI_Rating(double bmi_index){
        if(bmi_index <=18.5)
            System.out.println("UnderWeight");
        else if(bmi_index>18.5 && bmi_index<24.9)
            System.out.println("Normal weight/healthy");
        else if(bmi_index>25.0 && bmi_index<29.9)
            System.out.println("over weight");
        else if (bmi_index>30.0 )
            System.out.println("obese");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int units;
        double weight;
        double height;
        double bmi_rating=0;
        System.out.print("Enter 1 for SI units,2 for U.S customary imperial units:  ");
        units=input.nextInt();
        switch (units) {
            case 1-> {
                    System.out.print("Enter height in meters(m): ");
                    height=input.nextDouble();
                    System.out.print("Enter weight in kilos(Kg): ");
                    weight=input.nextDouble();
                    bmi_rating=weight/Math.pow(height,2);

            }
            case 2-> {
                    System.out.print("Enter height in inches(in): ");
                    height=input.nextDouble();
                    System.out.print("Enter weight in pounds(lbs): ");
                    weight=input.nextDouble();
                    bmi_rating=weight/Math.pow(height,2);

            }


        }
        System.out.println("   ---BMI reading---  ");
        System.out.printf("your BMI rating: %.2f and according to BMI rating you are ",bmi_rating);
        BMI.BMI_Rating(bmi_rating);




    }

}
