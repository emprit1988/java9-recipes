package dzone.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStreams3 {
    
    private static TryStreams3.Employee[] arrayOfEmps = { new TryStreams3.Employee(1,"Jeff Bezos",100000.0),
            new TryStreams3.Employee(2, "Bill Gates", 200000.0),
            new TryStreams3.Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static TryStreams3.Employee findById(Integer id){
        return Stream.of(arrayOfEmps).filter(e -> e.id.equals(id)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        //counting
        Long salCount = Arrays.asList(arrayOfEmps).stream().filter(e -> e.getSalary() > 200000).count();
        System.out.println(salCount);

        //short circuit operations allow computations on infinite streams to complete in finite time
        Stream<Integer> infiniteStream = Stream.iterate(2,i -> i*2);

        List<Integer> integerM = infiniteStream.skip(3).limit(5).collect(Collectors.toList());
        System.out.println(integerM);


        //lazy evaluation
        //computation on the source data is only performed when the terminal operation is initiated and
        // source elements are consumed as needed.
        //All intermediate operations are lazy, so they're not executed until a result of processing is needed

        Integer [] empIds = {1,2,3,4};
        Employee employee = Stream.of(empIds).map(TryStreams3::findById).filter(e -> e!=null)
                .filter(e -> e.getSalary() > 100000)
                .findFirst()
                .orElse(null);

        System.out.println(employee);

    }

    static class Employee {
        private Integer id;
        private String name;
        private Double salary;

        public Employee(int id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public Double salaryIncrement(Double increment){
            this.salary += increment;
            return this.salary;
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
