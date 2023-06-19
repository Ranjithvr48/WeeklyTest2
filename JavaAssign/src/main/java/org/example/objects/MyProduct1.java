package org.example.objects;

public class MyProduct1 {

    private MyProduct2 myProduct2;

    public MyProduct1(MyProduct2 myProduct2) {
        this.myProduct2 = myProduct2;
    }

    public MyProduct2 getObjectB() {
        return myProduct2;
    }

    public void performAction() {
        System.out.println("Performing action in ObjectA");
        myProduct2.performAction();
    }

    @Override
    public String toString() {
        return "Ducati Multistrada";
    }

    public void setObjectB(MyProduct2 myProduct2) {
        this.myProduct2 = myProduct2;
    }
}
