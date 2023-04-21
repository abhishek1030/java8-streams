package org.anand;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

    public static void main(String[] args){
    	Employee e1=new Employee(1,1000,"A",21,"Fin","M");
    	Employee e2=new Employee(2,2000,"B",30,"Eng","F");
    	Employee e3=new Employee(3,2000,"C",20,"HR","F");
    	Employee e4=new Employee(4,4000,"D",25,"Fin","F");
    	Employee e5=new Employee(5,15000,"E",35,"RND","M");
    	Employee e6=new Employee(6,8000,"F",46,"Fin","M");
    	Employee e7=new Employee(7,21000,"G",24,"Sales","M");
    	Employee e8=new Employee(8,11000,"A",23,"RND","F");
    	Employee e9=new Employee(9,3000,"D",25,"Sales","F");
    	Employee e10=new Employee(10,3000,"G",21,"HR","M");
    	Employee e11=new Employee(11,11000,"H",31,"Sales","M");
    	Employee e12=new Employee(12,21000,"D",56,"HR","F");
    	Employee e13=new Employee(13,21000,"M",56,"HR","M");
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
        listEmp.add(e5);
        listEmp.add(e6);
        listEmp.add(e7);
        listEmp.add(e8);
        listEmp.add(e9);
        listEmp.add(e10);
        listEmp.add(e11);
        listEmp.add(e13);
        listEmp.add(e13);
        


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
        listInt.add(16);
        listInt.add(4);

        List<Integer> listDup = new ArrayList<>();
        listDup.add(1);
        listDup.add(1);
        listDup.add(1);
        listDup.add(1);
        listDup.add(2);
        listDup.add(3);
        listDup.add(3);
        listDup.add(5);
        listDup.add(6);
        listDup.add(6);

        String s = "The green lonely frog went up the hill and hill was passed over by a hilarious green lonely frog";
        //--------------------List-----------------------

        //Find all the elements which occur more than once
        //listInt.stream().collect(Collectors.groupingBy(a->a,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.println(e.getKey()));
        //listInt.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(e-> System.out.println(e.getKey()));

        //Find third-highest (unique) salary
        /*int salary = listInt.stream().distinct().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
        System.out.println(salary);
        int ss = listEmp.stream().map(i->i.getSalary()).distinct().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
        System.out.println(ss);
        int aa = listEmp.stream().sorted((a,b)->b.getSalary()-a.getSalary()).mapToInt(a->a.getSalary()).distinct().skip(2).findFirst().getAsInt();
        System.out.println(aa);*/

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
        System.out.println(max);
        int max1 = listInt.stream().reduce((a,b)->Math.max(a,b)).get();
        System.out.println(max1);*/

        //Print 9 random numbers
        //new Random().ints().limit(9).forEach(System.out::println);

        //Print 9 random numbers between 11 & 100 (11->Inclusive & 100->Exclusive)
        //new Random().ints(11,100).limit(9).forEach(System.out::println);

        //Check if a number n is prime or not
        /*int n = 19;
        System.out.println(n>1 && IntStream.range(2, (int) Math.sqrt(n)+1).noneMatch(x->n%x==0)); // here 2nd param in range is exclusive*/

        //Find avg salary of male and female employees
        //listEmp.stream().collect(Collectors.groupingBy(e->e.getGender())).entrySet().stream().forEach(k-> System.out.println(k.getKey()+","+k.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()));
        //listEmp.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(a->a.getSalary()))).entrySet().stream().forEach(System.out::println);

        //find if a number is perfect square or not
        //listInt.stream().distinct().filter(n->IntStream.range(2,n/2+1).anyMatch(x->x*x==n)).forEach(System.out::println);

        //Given arr[String], Change all the elements to uppercase and create a string joining them by ","
        /*String str = Arrays.asList(s.split(" ")).stream().map(a->a.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(str);*/


        //Find duplicate elements
        /*Set<Integer> set = listDup.stream().collect(Collectors.toSet());
        Set<Integer> sett = new HashSet<>();
        Set<Integer> uniqueSet = listDup.stream().filter(a->!sett.add(a)).collect(Collectors.toSet());//not solution
        System.out.println(set);
        System.out.println(uniqueSet);*/

        //--------------------End of List-----------------------
        //--------------------Map------------------------



        //--------------------End of Map------------------------

        //Search in a map on the basis of value
        //Sort an array
    }
}
