package inner_class;

// use inner (nested) class when it makes sense that we cannot have inner class without the outer class 
// or when its logical to use the group of classes in one place
class OuterClass {
  int x = 10;

  // if we dont want outside objects to access inner class make it private
  // but we will get error when trying to instantiate inner class

  // this inner class can be static, if we want to access it without creating an outer
  // but then this inner will not have access to outer class members
  class InnerClass {
    int y = 5;
  }
}

public class Main { 
  OuterClass myOuter = new OuterClass();
  // how to instantiate inner class?
  OuterClass.InnerClass myInner = myOuter.new InnerClass();

}
