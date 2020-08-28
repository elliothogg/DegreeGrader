/*
 * This class represents a module grading system.
 * The user inputs a grade (number), and the grading system outputs a module classification (Excellent, Good...etc).
 * The module grading system works by calling the startModuleGrading method, which is done so in the "TestModuleGrader" class.
 *
 * This project was written as a University project.
 *
 * @author	********
 * @version 1.3  (12 July 2020)
 *
 */

import java.util.*;

public class ModuleGrader
{
    //method that takes a numerical grade and returns a written "module classification"
    public String gradeModule(double gradeIn)
    {
        //String to hold the "module classification" that will be returned
        String moduleClassification;
        
        //set of if statements determining the "module classification"
        if (gradeIn < 39.5) 
        {
            moduleClassification = "Outright fail";
        }
        else if (gradeIn < 49.5)
        {
            moduleClassification = "Compensatable fail";
        }
        else if (gradeIn < 59.5)
        {
            moduleClassification = "Satisfactory";
        }
        else if (gradeIn < 69.5)
        {
            moduleClassification = "Good";
        }
        else 
        {
            moduleClassification = "Excellent";
        }
        return moduleClassification;
    }
    
    //method that validates user input, ensuring it is a double between 0 and 100
    public double getValidModuleMark()
    {
        //create a scanner and prompt for a module grade
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your module grade: ");
        double moduleMark = sc.nextDouble();

        //check input is between 0 - 100. Continuous input prompt until conditions met
        while (moduleMark < 0 || moduleMark > 100)
        {
            System.out.println("Error. Module grades must be between 0 and 100.");
            System.out.print("Please enter your module grade: ");
            moduleMark = sc.nextDouble();
        }
        return moduleMark;
    }

    //method that runs the program
    public void startModuleGrading()
    {
        //create scanner and String for menu interaction
        Scanner sc = new Scanner(System.in);
        String continueGrading;

        System.out.println("*********** Module Grading Program *********");

        //outer do-while loop that repeats the program if continueGrading = yes
        do
        {
            //the first two methods are called to validate and then classify a module mark
            System.out.println("Your grade classification: " + gradeModule(getValidModuleMark()));
            System.out.print("Would you like to continue grading? (yes/no)  ");
            continueGrading = sc.next();
            
            //inner while loop that validates yes/no input for menu
            while ( !continueGrading.equals("yes") && !continueGrading.equals("no"))
            {
                System.out.println("Please enter either yes or no (all lowercase)");
                System.out.print("Would you like to continue grading? (yes/no)  ");
                continueGrading = sc.next();
            }
        }
        while ( continueGrading.equals("yes"));
        System.out.println("************ Thanks For Using ************");
    }
}