package org.example.imperative;

import java.util.ArrayList;
import java.util.List;

import static org.example.imperative.Main.Gender.FEMALE;
import static org.example.imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> student = List.of(
                new Person("Jonathan",MALE),
                new Person("Sam", MALE),
                new Person("Kate",FEMALE),
                new Person("Cynthia", FEMALE),
                new Person("Oge", FEMALE)
                );

        //Imperative approach
        List<Person> female = new ArrayList<>();
        for(Person person : student){
            if(person.gender.equals(FEMALE)){
                female.add(person);
            }

        }

        for(Person females : female){
            System.out.println(females);
        }
    }

    public static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }
    }

    enum Gender{
        FEMALE,
        MALE
    }
}
