/*
 * This class tests the degree grader by creating an object of the "DegreeGrader" class and
 * calling the startDegreeGrading method.
 * 
 * This project was written as a University project.
 * 
 * @author	********
 * @version 1.3  (12 July 2020)
 * 
 */

public class TestDegreeGrader{
    public static void main(String[] args)
    {
        //create a DegreeGrader object for testing
        DegreeGrader test = new DegreeGrader();
        
        //test each method individually

        //test gradeDegree()
        //expecting return String "Distinction"
        System.out.println(test.gradeDegree(100, 100, 0, 0));
        System.out.println(test.gradeDegree(69.5, 69.5, 0, 0));
        
        //expecting return String "Merit"
        System.out.println(test.gradeDegree(69.4, 69.4, 15, 0));
        System.out.println(test.gradeDegree(59.5, 59.5, 0, 0));
        
        //expecting return String "Pass"
        System.out.println(test.gradeDegree(59.4, 59.4, 30, 0));
        System.out.println(test.gradeDegree(55, 55, 15, 0));
        System.out.println(test.gradeDegree(49.5, 49.5, 0, 0));
        
        //expecting return String "Fail"
        System.out.println(test.gradeDegree(49.4, 49.4, 30, 0));
        System.out.println(test.gradeDegree(70, 70, 45, 0));
        System.out.println(test.gradeDegree(0, 0, 0, 0));

        //test getValidModuleAvg()
        System.out.println(test.getValidModuleAvg());
        //input 101 - expect error message and revalidation
        //input -1 - expect error message and revalidation
        //input 100 - expect success and return of double 100
        //note: we only have to call the method once, as it revalidates until a valid input is given
        System.out.println(test.getValidModuleAvg());
        //input 0 - expect success and return of double 0
        
        //test getValidIsmAvg()
        System.out.println(test.getValidIsmAvg());
        //input 101 - expect error message and revalidation
        //input -1 - expect error message and revalidation
        //input 100 - expect success and return of double 100
        //note: we only have to call the method once, as it revalidates until a valid input is given
        System.out.println(test.getValidIsmAvg());
        //input 0 - expect success and return of double 0

        //test getValidCompFailCreds()
        System.out.println(test.getValidCompFailCreds());
        //input 181 - expect error message and revalidation
        //input -1 - expect error message and revalidation
        //input 31 - not multiple of 15, expect error message and revalidation
        //input 15 - expect return of double 15
        System.out.println(test.getValidCompFailCreds());
        //input 165 - expect return of double 165

        //test getValidFailModules()
        System.out.println(test.getValidFailModules());
        //input 12 - expect error message and revalidation
        //input -1 - expect error message and revalidation
        //input 1 - expect return of double 1
        System.out.println(test.getValidFailModules());
        //input 11 - expect return of double 11

        //test startDegreeGrading
        test.startDegreeGrading();
        /* Use the following test cases:
         * 
         * Note: We do not re-test all the methods called here, as we have already
         * individually tested them.
         * 
         * Testing of menu functionality 
         * #1: 100, 100, 0, 0, "yes" - expect return "Distinction" and program to execute loop
         * #2: 69.5, 69.5, 0, 0, "YES", ("yes") - expect return "Distinction" and program to throw yes/no error
         * #2: 69.4, 69.4, 0, 0, "12345", ("yes") - expect return "Merit" and program to throw yes/no error
         * #3: 100, 100, 0, 1, "no" - expect return "Fail" and program to end
         */    
    }
}