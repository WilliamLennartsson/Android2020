package com.devCakeAB;

// Class with a generic type. In this case we call it T
// Whatever type is specified when creating a new box. T becomes that type
// Box<String> box = new Box<>();
// T is now the type String
public class Box<T> {
    // A variable to hold a value of type T
    private T t;
    // Getter. Whatever type T is, the getter will return a value of that type
    public T getT() {
        return t;
    }
    // Setter. Whatever type T is, the setter will take that type as an argument
    public void setT(T t) {
        this.t = t;
    }
}
