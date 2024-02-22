class Methods {

    int testMethod1(int a, int b) {
        return a+b;
    }

    boolean testMethod2(int a, int b) {
        return a < b;
    }

}

class Open1C {

Methods methodTest = new Methods();

int methodTest1 = methodTest.testMethod1(1, 2);
int methodTest2 = methodTest.testMethod1(3, 2);

boolean methodTest3 = methodTest.testMethod2(1, 2);
boolean methodTest4 = methodTest.testMethod2(5, 4);

}

/*
 ---------------------------        
Open1C:        
---------------
new Open1C:1(
 this.methodTest = new Methods:2()
 this.methodTest1 = 3
 this.methodTest2 = 5
 this.methodTest3 = true
 this.methodTest4 = false)
 */