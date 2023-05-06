package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }


    /**
     * Реактивные методы
     **/

//    public void incrementIfMoreThenFive(Flux<Integer> flux) {
//        flux.subscribe(value -> {
//            if (value < 6) {
//                throw new IllegalArgumentException(value + "");
//            }
//            value++;
//            System.out.println(value);
//        }, error -> System.out.println("Error: " + error.getMessage()));
//    }
//
//    public void processFiveElements(Flux<Integer> flux) {
//        flux.subscribe(System.out::println, error -> System.err.println("Error " + error), () -> System.out.println("Done"), sub -> sub.request(10));
//    }
//
//    public void printOddNumbers(Flux<Integer> flux) {
//        flux.subscribe(value -> {
//            if (value % 2 == 0) {
//                System.out.println(value);
//            }
//        });
//    }
//
//    public void printNumbers(Flux<Integer> flux) {
//        flux.subscribe(System.out::println).dispose();
//    }

}
