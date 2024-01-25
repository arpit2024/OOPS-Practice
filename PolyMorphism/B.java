package PolyMorphism;

interface B {

    default void run(){
        System.out.println("Hello from A");
    }
}
