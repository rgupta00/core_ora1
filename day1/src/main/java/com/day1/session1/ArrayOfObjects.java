package com.day1.session1;

class Dog {

    private String color;

    public Dog(String c) {
        color = c;
    }

    public void print() {
        System.out.println("dog color is : " + color);
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Dog dog=new Dog("red");
        
        
//       // Dog dogs[] = new Dog[5];
//         Dog dogs[] = new Dog[5];
//        dogs[0] = new Dog("black");
//        dogs[1] = new Dog("black");
//        dogs[2] = new Dog("white");
//        dogs[3] = new Dog("black");
//        dogs[4] = new Dog("black");
        // dogs[5] = new Dog("black");
        // Dog dogs[] = new Dog[5];
        Dog dogs[] = {new Dog("black"), new Dog("black"), new Dog("white"), new Dog("black")};

        for (Dog dog : dogs) {
            dog.print();
        }

        //Dog dog=new Dog("black");
    }

}
