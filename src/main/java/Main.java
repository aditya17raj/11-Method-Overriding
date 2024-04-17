class A
  {
    void show()
    {
      System.out.println("Base Class");
    }
  }

class B extends A
  {
    void show()
    {
      System.out.println("Derived Class");
    }
  }

public class Main {
  public static void main(String[] args) {
    B bb = new B();;
    bb.show();
  }
}


//.......M E T H O D  O V E R R I D I N G........

// When there is a same name function in base as well as in derived class, then the derived class function is   called. This is called method overriding.
