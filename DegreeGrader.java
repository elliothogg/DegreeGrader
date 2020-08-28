/*
 * This class represents a degree grading system, which outputs a final degree classification.
 * The classification is based on 4 criteria - Module average, ISM average, compensatable failed credits, and failed modules.
 * The Degree grader works by calling the startDegreeGrading method, which is done so in the "TestDegreeGrader" class.
 * 
 * This project was written as a University project.
 * 
 * @author	********
 * @version 1.3  (12 July 2020)
 * 
 */
import java.util.*;

public class DegreeGrader 
{   
    //method that takes information about a students performance and returns a "degree grade"
    public String gradeDegree(double moduleAvg, double ismAvg, double compFailCreds, double failModules)
    {
        //String to hold the "degree grade" that will be returned
        String degreeGrade;

        //set of if statements determining the "degree grade"
        if (moduleAvg >= 69.5 && ismAvg >= 69.5 && compFailCreds == 0 && failModules <= 0)
        {
            degreeGrade = "Distinction";
        }
        else if (moduleAvg >= 59.5 && ismAvg >= 59.5 && compFailCreds <= 15 && failModules <= 0)
        {
            degreeGrade = "Merit";
        }
        else if (moduleAvg >= 49.5 && ismAvg >= 49.5 && compFailCreds <= 30 && failModules <= 0)
        {
            degreeGrade = "Pass";
        }
        else
        {
            degreeGrade = "Fail";
        }
        return degreeGrade;
    }
    //method that receives, validates, and returns the "moduleAvg"
    public double getValidModuleAvg()
    {
        //create scanner and variable for module average
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your module average: ");
        double moduleAvg = sc.nextDouble();
        
        //check input is between 0 - 100. Continuous input prompt until conditions are met
        while (moduleAvg < 0 || moduleAvg > 100)
        {
            System.out.println("Error. Your module average must be between 0 and 100.");
            System.out.print("Please enter your module average: ");
            moduleAvg = sc.nextDouble();
        }
        return moduleAvg;
    }
    
    //method that receives, validates, and returns "ISM average"
    public double getValidIsmAvg()
    {
        //create scanner and variable for "ISM average"
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your ISM module average: ");
        double ismAvg = sc.nextDouble();
        
        //check input is between 0 - 100. Continuous input prompt until conditions are met
        while (ismAvg < 0 || ismAvg > 100)
        {
            System.out.println("Error. Your ISM module average must be between 0 and 100.");
            System.out.print("Please enter your ISM module average: ");
            ismAvg = sc.nextDouble();
        }
        return ismAvg;
    }

    //method that receives, validates, and returns number of "compensatable failed credits"
    public double getValidCompFailCreds()
    {
        //create scanner and variable for "comp failed credits"
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your compensatable failed credits : ");
        double compFailCreds = sc.nextDouble();

        //while loop that ensures value is between 0 - 180 and a multiple of 15
        while (compFailCreds < 0 || compFailCreds > 180 || compFailCreds % 15 != 0)
        {
            System.out.println("Error. Your compensatable failed credits must be between 0 and 180, and be a multiple of 15.");
            System.out.print("Please enter your compensatable failed credits: ");
            compFailCreds = sc.nextDouble();
        }
        return compFailCreds;
    }
    
    //method that receives, validates, and returns number of "failed modules"
    public double getValidFailModules()
    {
        //create scanner and variable for "failed modules"
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number of failed modules : ");
        double failModules = sc.nextDouble();

        //while loop that ensures value is between 0 - 11
        while (failModules < 0 || failModules > 11)
        {
            System.out.println("Error. Your number of failed modules must be between 0 and 11.");
            System.out.print("Please enter your number of failed modules: ");
            failModules = sc.nextDouble();
        }
        return failModules;
    }

    //method that runs the program
    public void startDegreeGrading()
    {
        //create scanner and String for menu interaction
        Scanner sc = new Scanner(System.in);
        String continueGrading;
        
        System.out.println("*********** Degree Classification Program *********");
        
        //outer do-while loop that repeats the program if continueGrading = yes
        do
        {
            //all 5 above methods are called to calculate a "degree classification"
            System.out.println("Your degree classification: " + gradeDegree(getValidModuleAvg(), getValidIsmAvg(), getValidCompFailCreds(), getValidFailModules() ) );
            System.out.print("Would you like to continue grading? (yes/no)  ");
            continueGrading = sc.next();

            //inner while loop that validates yes/no input for menu
            while ( !continueGrading.equals("yes") && !continueGrading.equals("no") )
            {
                System.out.println("Please enter either yes or no (all lowercase)");
                System.out.print("Would you like to continue grading? (yes/no)  ");
                continueGrading = sc.next();
            } 
        }
        while ( continueGrading.equals("yes") );
        System.out.println("************ Thanks For Using ************");   
    }
}