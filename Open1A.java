class class1 {
    int thing = 1;
}

class class2 {
    int thing = 1;
}


class Open1A {

    class1 obj = new class1();
    class2 obj2 = new class2();
    
}

/*
Tests defined in the class: Open1A:
---------------------------        
Open1A:
---------------
new Open1A:1(
 this.obj = new class1:2(
  this.thing = 1)
 this.obj2 = new class2:3(
  this.thing = 1))
---------------
No test methods found.
 */