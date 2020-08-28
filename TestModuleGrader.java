/*
 * This class tests the module grader by creating an object of the "ModuleGrader" class and
 * calling the startModuleGrading method.
 *
 * This project was written as a University project.
 *
 * @author	********
 * @version 1.3  (12 July 2020)
 *
 */

public class TestModuleGrader{
    public static void main(String[] args)
    {
        //create a ModuleGrader object for testing
        ModuleGrader test = new ModuleGrader();

        //test each method individually

        //test gradeModule()
        //expecting return String "Excellent" 
        System.out.println(test.gradeModule(100));
        System.out.println(test.gradeModule(69.5));
        
        //expecting "Good"
        System.out.println(test.gradeModule(69.4));
        System.out.println(test.gradeModule(59.5));
        
        //expecting "Satisfactory"
        System.out.println(test.gradeModule(59.4));
        System.out.println(test.gradeModule(49.5));
        
        //expecting "Compensatable fail"
        System.out.println(test.gradeModule(49.4));
        System.out.println(test.gradeModule(39.5));
        
        //expecting "Outright fail"
        System.out.println(test.gradeModule(39));
        System.out.println(test.gradeModule(0));
        
        //test getValidModuleMark
        System.out.println(test.getValidModuleMark());
        //input 101 - expect error message and revalidation
        //input -1 - expect error message and revalidation
        //input 100 - expect return of double 100
        //note: we only have to call the method once, as it revalidates until a valid input is given
        System.out.println(test.getValidModuleMark());
        //input 0 - expect return of double 0
        
        //test startModuleGrading()
        test.startModuleGrading();
        /* Use the following test cases:
         * 
         * Test that getValidModuleMark is functioning with startModuleGrading:
         * #1: 101  //expect error message and revalidation
         * #2: -1  //expect error message and revalidation
         * #3: 50, yes //expect module classification "Satisfactory" to be returned and a menu prompt
         * 
		 * test menu validation:
         * #4: 70, hello, (yes) //expect module classification "Excellent" followed by an error message requesting either yes/no
         * #5: 40, 2413, (yes) //expect "compensatable fail" and a yes/no validation error message
         * #6: 60, YES, (yes)  //expect "Good" followed by yes/no validation error message
         * #7: 50, no //expect "Satisfactory" and successful end to the program 
         * */
    }
}