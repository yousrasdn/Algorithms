package algorithm.arrays.sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
    Write several programs that exemplify different sorting algorithms (provided by JDK) for arrays.
 */
public class SortingArray {

    public static void main(String[] args) {
        String[] unsortedArray = {"hello", "test", "march"};

    }

    // sorting an array of primitives
    private void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

    // sorting an array of objects using Comparable
    private void sortUsingComparable(Person[] persons) {
        Arrays.sort(persons);
    }

    // sorting an array of objects using Comparator
    private void sortUsingComparator(Company[] companies) {
        Arrays.sort(companies, Comparator.comparingInt((Company c) -> c.age));
    }

}

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (this.age == p.age) {
            return 0;
        } else if (this.age < p.age) {
            return -1;
        }
        return 1;
    }
}

class Company {
    String name;
    int age;

    Company(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
