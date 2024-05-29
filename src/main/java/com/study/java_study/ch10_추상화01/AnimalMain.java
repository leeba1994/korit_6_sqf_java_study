package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        //Tiger tiger = new Tiger("옹이", 5, 100);
        //System.out.println(dog);
        //System.out.println(tiger);

        Dog dog = new Dog("콩이", 11, "말티즈");            //Animal객체가 만들지고 자식객체생성됨
        Tiger tiger = new Tiger("옹이", 5, 100);
        Animal tiger2 = new Tiger("옹이", 5, 100);        //업캐스팅
        Animal dog2 = new Dog("콩이2", 52, "포메리안");        //업캐스팅
        //Dog dog3 = new Animal("콩이2", 52); 오류

        // Tiger tiger3 = (Tiger)animal;

       /*
        Animal animal = new Tiger("옹이2", 5, 100);       //업캐스팅 Tiger객체부분만 비활성화
        Tiger t2 = (Tiger)animal;                        //다운캐스팅

        Animal[] animals2 = new Animal[3];
        animals2[0] = new Animal();
        animals2[1] = new Tiger();      //
        animals2[2] = new Dog();

        */

        dog.move();
        tiger.move();
        tiger2.move();      //업캐스팅해도 자식의 메소드 사용 하지만 자식객체에 super.move(); 추가해서       //부모의 move() 메소드 사용한다
        System.out.println( dog2.toString());
        ((Tiger)tiger2).hunt();     //다운캐스팅은 ((Tiger)tiger2)먼저해서 참조해서 .hunt() 실행
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        for(Animal animal : animals) {
            
            if(animal instanceof  Tiger) {      //Tiger가 animal 업캐스팅이 된적있나? 비교
                Tiger t = (Tiger) animal;       //다운캐스팅
                t.hunt();
            }else if (animal instanceof  Dog) {
                Dog d = (Dog) animal;
                d.bark();

            }

        }

        System.out.println();

        for(Animal animal : animals) {      //자바 JDK 최신버전에서 사용가능
            String s = "test";
            s.getClass();
            int a = 10;     //기본타입은


            if(animal.getClass() ==  Tiger.class) {      //animal클래스와 Tiger클래스 비교
                System.out.println(animal.getClass());
                Tiger t = (Tiger) animal;       //다운캐스팅
                t.hunt();
            }else if (animal.getClass() ==  Dog.class) {
                System.out.println(animal.getClass());
                Dog d = (Dog) animal;
                d.bark();

            }

        }


        //System.out.println(dog.toString());
        //System.out.println(tiger.toString());
      //  System.out.println(animal.toString());
      //  System.out.println(animal);
    }
}
