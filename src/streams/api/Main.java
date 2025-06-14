package streams.api;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {

    record Car(String type, String make, String model, Integer engineCapacity) {}

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 1998),
                new Car("sedan", "Audi", "A5", 1998),
                new Car("sedan", "Mercedes", "E-Class", 2500),
                new Car("hatchback", "Skoda", "Octavia", 1600),
                new Car("hatchback", "Toyota", "TypeR", 1450)
        );

        /* Filtering elements */
        List<Car> sedanCars = cars.stream().filter(car -> car.type.equals("sedan")).toList();
        System.out.println("--- Filtering elements ---");
        System.out.println("sedanCars = " + sedanCars);

        /* The map function */
        List<String> carMakeList = cars.stream().map(car -> car.make).toList();
        System.out.println("carMakeList = " + carMakeList);

        /* The flat map function */
        // Audi, A5, Mercedes, E-Class
        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();
        System.out.println("carMakeModelList = " + carMakeModelList);

        /* Other stream functions */
        // Streams Lazy Evaluation
        Stream<Integer> integerStream = Stream.of(10, 11, 12, 13, 14);
        Stream<Integer> filteredIntegerStream = integerStream.filter(i -> {
            System.out.println("FilteredInteger values : " + i);
            return i % 2 == 0;
        });
        System.out.println("Count = " + filteredIntegerStream.count());

        /* Partitioning by Collector */
        Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(partitioningBy(car -> car.type.equals("sedan")));
        System.out.println("partitionedCars = " + partitionedCars);

        /*  Grouping by Collector */
        // (type, (make, engineCapacity))
        Map<String, Map<String, Integer>> groupedCars = cars.stream().collect(
                groupingBy(Car::type, toMap(Car::make, Car::engineCapacity))
        );
        System.out.println("groupedCars = " + groupedCars);

        /* Parallel Streams */
        // cars.parallelStream().forEach(System.out::println);
        cars.parallelStream()
                .sequential()
                .parallel()
                .forEach(e -> {
                    System.out.println("e = " + e);
                });

    }
}
