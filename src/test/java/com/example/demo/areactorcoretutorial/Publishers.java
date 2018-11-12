package com.example.demo.areactorcoretutorial;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;

/*Reactive programming is about building asynchronous, non-blocking, and event-driven applications that can easily scale.
Reactor is a Reactive library for building non-blocking applications. It is based on the Reactive Streams Specification.
Java 8 is required to use this library, and it is integrated into Java 9.
Reactive Streams are push-based. It is the Publisher that notifies the Subscriber of newly available values as they come,
and this push aspect is key to being reactive.*/
public class Publishers {
    /*Mono and Flux are implementations of the Publisher interface. A Flux will observe 0 to N items and eventually terminate successfully or not.
    A Mono will observe 0 or 1 item, with Mono<Void> hinting at most 0 items.
    Let's see with the help of tests how to use this library.*/
    @Test
    public void empty() {
        Mono<Object> emptyMono = Mono.empty();
        StepVerifier.create(emptyMono).verifyComplete();

        Flux<Object> emptyFlux = Flux.empty();
        StepVerifier.create(emptyFlux).verifyComplete();
    }

    /*In this example, we created an empty Mono and a Flux and used a StepVerifier to test them. The Publisher s completed without emitting any object.*/
    @Test
    public void initialized() {
        Mono<String> nonEmptyMono = Mono.just("Joel");
        StepVerifier.create(nonEmptyMono).expectNext("Joel").verifyComplete();

        Flux<String> nonEmptyFlux = Flux.just("Joel", "Mike", "Sarah");
        StepVerifier.create(nonEmptyFlux).expectNext("Joel", "Mike", "Sarah").verifyComplete();

        Flux<String> fluxFromIterable = Flux.fromIterable(Arrays.asList("Joel", "Mike", "Sarah"));
        StepVerifier.create(fluxFromIterable).expectNext("Joel", "Mike", "Sarah").verifyComplete();
    }

    /*We initialized the Mono and Flux in different ways and verified that they are emitting the expected objects.*/
    @Test
    public void operations() {
        Mono<String> monoMap = Mono.just("James").map(s -> s.toLowerCase());
        StepVerifier.create(monoMap).expectNext("james").verifyComplete();

        Flux<String> fluxMapFilter = Flux.just("Joel", "Kyle")
                .filter(s -> s.toUpperCase().startsWith("K"))
                .map(s -> s.toLowerCase());
        StepVerifier.create(fluxMapFilter).expectNext("kyle").verifyComplete();
    }

    /*We can use all the Java 8 Stream operations on Mono and Flux.
    In the first example, we mapped a Mono emitting a name to a Mono emitting the same name in lower-case.
    We verified that the resulting Mono emitted the same name in lower-case.
    In the second example, we mapped a Flux emitting names to a Flux emitting the names in lower-case after applying a
    filter that passed only names starting with 'k'. We verified that the resulting Flux emitted only names starting with 'k' in lower-case.*/
    @Test
    public void zipping(){

    }
}
