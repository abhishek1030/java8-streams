package org.anand;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

    public static void main(String[] args){
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee(1,1000,"A",21,"Fin","M"));
        listEmp.add(new Employee(2,2000,"B",30,"Eng","F"));
        listEmp.add(new Employee(3,2000,"C",20,"HR","F"));
        listEmp.add(new Employee(4,4000,"D",25,"Fin","F"));
        listEmp.add(new Employee(5,15000,"E",35,"RND","M"));
        listEmp.add(new Employee(6,8000,"F",46,"Fin","M"));
        listEmp.add(new Employee(7,21000,"G",24,"Sales","M"));
        listEmp.add(new Employee(8,11000,"A",23,"RND","F"));
        listEmp.add(new Employee(9,3000,"D",25,"Sales","F"));
        listEmp.add(new Employee(10,3000,"G",21,"HR","M"));
        listEmp.add(new Employee(11,11000,"H",31,"Sales","M"));
        listEmp.add(new Employee(12,21000,"D",56,"HR","F"));
        listEmp.add(new Employee(13,21000,"M",56,"HR","M"));


        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(6);
        listInt.add(2);
        listInt.add(5);
        listInt.add(3);
        listInt.add(20);
        listInt.add(4);
        listInt.add(22);
        listInt.add(5);
        listInt.add(22);
        listInt.add(6);
        listInt.add(15);
        listInt.add(4);

        String s = "The green lonely frog went up the hill and hill was passed over by a hilarious green lonely frog";
        //--------------------List-----------------------

        //Find all the elements which occur more than once
        //listInt.stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.println(e.getKey()));
        //listInt.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.println(e.getKey()));


        //Find third-highest (unique) salary
        /*int salary = listInt.stream().distinct().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
        System.out.println(salary);*/
        /*int s = listEmp.stream().map(i->i.getSalary()).distinct().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
        System.out.println(s);*/

        //First repetitive element ****
        /*int num = listInt.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream().
                filter(a->a.getValue()>1).findFirst().get().getKey();
        System.out.println(num);*/

        //Sort a list of employees based on salary and find top 3 salary category employees
        //listEmp.stream().collect(Collectors.groupingBy(a->a.getSalary())).entrySet().stream().sorted((b,a)->a.getKey()-b.getKey()).limit(3).forEach(System.out::println);

        //Find number of employees in every department
        //listEmp.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting())).entrySet().stream().forEach(System.out::println);

        //Find number of female employees in every department
        //listEmp.stream().filter(e->e.getGender().equals("F")).collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting())).entrySet().stream().forEach(System.out::println);

        //Find avg salary of all employees who are in finance department
        /*double avg1 = listEmp.stream().filter(e->e.getDepartment().equals("Fin")).mapToDouble(i->i.getSalary()).average().getAsDouble();
        double avg2 = listEmp.stream().filter(e->e.getDepartment().equals("Fin")).mapToInt(i->i.getSalary()).summaryStatistics().getAverage();
        System.out.println(avg1);
        System.out.println(avg2);*/

        //Find longest string from a list of strings
        /*String longest = Arrays.asList(s.split(" ")).stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(longest);*/

        //Find frequency of each word in a sentence
        //Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);

        //Find maximum from an array of integers
        /*int max = listInt.stream().reduce(0,(a,b)->Math.max(a,b));
        System.out.println(max);*/

        //Print 9 random numbers
        //new Random().ints().limit(9).forEach(System.out::println);

        //Print 9 random numbers between 11 & 100 (11->Inclusive & 100->Exclusive)
        //new Random().ints(11,100).limit(9).forEach(System.out::println);

        //Check if a number n is prime or not
        /*int n = 19;
        System.out.println(n>1 && IntStream.range(2, (int) Math.sqrt(n)+1).noneMatch(x->n%x==0)); // here 2nd param in range is exclusive*/

        //--------------------End of List-----------------------
        //--------------------Map------------------------



        //--------------------End of Map------------------------

    }
}
