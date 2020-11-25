public class InheritanceFlowDemo {


    public static void main(String args[]) {

        /**
        * You can never assign Parent Reference to a child class.Even if we cast it wont work.
         * But we can assign a child reference to a Parent class
         * Reference --> new Child()
        * */

        //ParentClass parentClass = new ParentClass();
        //System.out.println(parentClass.value);       //prints 20 from Parent
        //parentClass.getDetails();                    //prints getDetails method from Parent class

        //ChildClass childClass = new ChildClass();
        //System.out.println(childClass.value);        //prints 10 from Child class
        //childClass.getDetails();                    //prints getDetails method from Child class


        /**Important**/
        //ParentClass parentClass = new ChildClass();
        //System.out.println(parentClass.value);        //prints 20 from Parent class as data members are not over-ridden at run-time
                                                      //even though its a child reference, but the same is not true for methods.
        //parentClass.getDetails();                     //prints getDetails method from Child class



        //ChildClass childClass1 = new ParentClass();  //Not possible as you cannot assign parent references for child class


        //Exception in thread "main" java.lang.ClassCastException: ParentClass cannot be cast to ChildClass
        //ChildClass childClass1 = (ChildClass) new ParentClass(); //
        //childClass1.getDetails();

        //Exception in thread "main" java.lang.ClassCastException: ParentClass cannot be cast to ChildClass
        //ParentClass parentClass = (ChildClass) new ParentClass();  //ParentClass cannot be cast to ChildClass
        //parentClass.getDetails();

        ParentClass parentClass = (ParentClass) new ChildClass();      //Parent class casting has no effect.
        parentClass.getDetails();                                     //prints child class getDetails method (over-ridden)
        System.out.println(parentClass.value);                          //prints 20.data-members not over-ridden even with casting

    }
}
