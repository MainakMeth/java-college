/*
Q6
*/
class Parent {

  void show() {
    System.out.println("parent");
  }
} // end of Parent class

class Child1 extends Parent {

  void show() {
    System.out.println("parent1");
  }
}

class Child2 extends Parent {

  void show() {
    System.out.println("parent2");
  }
}

class Child3 extends Parent {

  void show() {
    System.out.println("parent3");
  }
}

class Dynamic {
  public static void main(String args[]) {

      Parent ob; // ref

      Child1 ob1 = new Child1();
      Child2 ob2 = new Child2();
      Child3 ob3 = new Child3();

      ob = ob1;
      ob.show();

      ob = ob2;
      ob.show();

      ob = ob3;
      ob.show();
  } // end of main()
}
