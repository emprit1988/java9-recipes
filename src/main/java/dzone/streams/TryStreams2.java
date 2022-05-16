package dzone.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStreams2 {

    private static TryStreams2.Employee[] arrayOfEmps = { new TryStreams2.Employee(1,"Jeff Bezos",100000.0),
            new TryStreams2.Employee(2, "Bill Gates", 200000.0),
            new TryStreams2.Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static Employee findById(Integer id){
        return Stream.of(arrayOfEmps).filter(e -> e.id.equals(id)).findFirst().orElse(null);
    }

    public static void main(String[] args) {

        //forEach
        List<Employee> employeeList = Arrays.asList(arrayOfEmps);
        employeeList.stream().forEach(e -> e.salaryIncrement(30.0));
        employeeList.stream().forEach(System.out::println);
        //foreach is a terminal operation, which means after the stream operation is performed,
        // the stream pipeline is considered as consumed and no longer be used


        //map
        Integer [] empIds = {1,2,3};
        List<Employee> employees = Stream.of(empIds)
                                        .map(TryStreams2::findById)
                                        .collect(Collectors.toList());

        System.out.println(employees.size());
        //map produces new stream after applying the function to each element
        //collect performs mutable fold operation(repacking elements to some data structures and applying
        // some additional logic, concatenating them etc) on data elements held in stream instance


        //filter
        Integer empIds2 [] = {1,2,3,4,5,6};
        List <Employee> employees1 = Stream.of(empIds2)
                                            .map(TryStreams2::findById)
                                            .filter(e -> e!= null) //filter out nulls
                                            .filter(e -> e.getSalary() > 200000)
                                            .collect(Collectors.toList());
        System.out.println(employees1);
        //filter creates a new stream after applying the given expression

        //toArray
        Employee[] employeeArr = Stream.of(empIds2)
                                    .map(TryStreams2::findById)
                                    .filter(e -> e!=null)
                                    .filter(e -> e.getSalary() > 20000)
                                    .toArray(Employee[]::new);
        Arrays.stream(employeeArr).forEach(System.out::println);


        //flatMap
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg")
        );

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());  

        //peek
        List<Employee> empList = Stream.of(arrayOfEmps).collect(Collectors.toList());
        empList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

        //System.out.println(empList);

        //peek is an intermediate operation.
        // when we need to perform multiple operations on each element use peek



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
