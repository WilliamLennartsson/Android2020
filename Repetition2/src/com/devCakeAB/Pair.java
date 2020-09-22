package com.devCakeAB;

// Class with generic types. Lets call them A & B
// A & B are specified when creating the instance

// If we were to instantiate a Pair object
// Pair<String, Integer> p1 = new Pair<>();
// The first generic type is replaced by the first argument (String)
// The second generic type is replaced by the second argument (Integer)
public class Pair<A, B> {
    // variable of type A
    private A first;
    // variable of type B
    private B second;

    // Constructor that takes to arguments. One of type A and one of type B
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    // Getter & setter for first variable
    // The return type will match the first generic type (A)
    public A getFirst(){ return first; }
    // The argument type will match the first generic type (A)
    public void setFirst(A first){ this.first = first; }

    // Getter & setter for second variable
    // The return type will match the second generic type (B)
    public B getSecond(){ return second; }
    // The argument type will match the second generic type (B)
    public void setSecond(B second){ this.second = second; }
}
