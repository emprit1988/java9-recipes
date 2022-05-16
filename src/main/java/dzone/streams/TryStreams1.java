package dzone.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TryStreams1 {

    private static Employee[] arrayOfEmps = { new Employee(1,"Jeff Bezos",100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static void main(String[] args) {
        //stream creation
        //1
        Stream.of(arrayOfEmps).forEach(System.out::println);

        //2
        List<Employee> employeeList = Arrays.asList(arrayOfEmps);
        employeeList.stream().forEach(System.out::println);

        //3
        Stream.of(arrayOfEmps[2],arrayOfEmps[1]).forEach(System.out::println);

        //4
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[2]);
        Stream<Employee> employeeStream2 = empStreamBuilder.build();
        employeeStream2.forEach(System.out::println);

    }

    static class Employee {
        private int id;
        private String name;
        private Double salary;

        public Employee(int id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
