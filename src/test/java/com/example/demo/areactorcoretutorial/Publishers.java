package com.example.demo.areactorcoretutorial;

import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;

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
    public void zipping() {
        Flux<String> titles = Flux.just("Mr.", "Mrs.");
        Flux<String> firstNames = Flux.just("John", "Jane");
        Flux<String> lastNames = Flux.just("Doe", "Blake");

        Flux<String> names = Flux.zip(titles, firstNames, lastNames)
                .map(t -> t.getT1() + " " + t.getT2() + " " + t.getT3());

        StepVerifier.create(names).expectNext("Mr. John Doe", "Mrs. Jane Blake").verifyComplete();

        Flux<Long> delay = Flux.interval(Duration.ofMillis(5));
        Flux<String> firstNamesWithDelay = firstNames.zipWith(delay, (s, l) -> s);

        Flux<String> namesWithDelay = Flux.zip(titles, firstNamesWithDelay, lastNames)
                .map(t -> t.getT1() + " " + t.getT2() + " " + t.getT3());

        StepVerifier.create(namesWithDelay).expectNext("Mr. John Doe", "Mrs. Jane Blake").verifyComplete();
    }

    /*In the first example, we have 3 Fluxes emitting the title, first name, and the last name.
    Flux.zip is combining them in a strict sequence (when all Fluxes have emitted their nth item).
    We then concatenated them to create a Flux emitting the full names.

    In the second example, we created a Flux that generates a long value every 5 ms.
    We then combined it with the Flux firstNames. Hence, the resulting Flux will emit a value after every 5 ms.
    We used this Flux similarly as in the previous example and verified that the sequence of combination is maintained despite the delay.*/

    @Test
    public void interleave() {
        Flux<Long> delay = Flux.interval(Duration.ofMillis(5));
        Flux<String> alphabetsWithDelay = Flux.just("A", "B").zipWith(delay, (s, l) -> s);
        Flux<String> alphabetsWithoutDelay = Flux.just("C", "D");

        Flux<String> interleavedFlux = alphabetsWithDelay.mergeWith(alphabetsWithoutDelay);
        StepVerifier.create(interleavedFlux).expectNext("C", "D", "A", "B").verifyComplete();

        Flux<String> nonInterleavedFlux = alphabetsWithDelay.concatWith(alphabetsWithoutDelay);
        StepVerifier.create(nonInterleavedFlux).expectNext("A", "B", "C", "D").verifyComplete();
    }

    /*Interleaving is a concept in which data is written non-sequentially to improve performance.
    We have two Fluxes, one of them emitting values with a delay. Flux.mergeWith merges them into an interleaved sequence.
    Hence, we see that the sequence has changed.
    Flux.concatWith merges them into a non-interleaved sequence. Hence, we see that the sequence remains the same despite the delay.*/
    @Test
    public void block() {
        String name = Mono.just("Jesse").block();
        Assert.assertEquals("Jesse", name);

        Iterator<String> namesIterator = Flux.just("Tom", "Peter").toIterable().iterator();
        Assert.assertEquals("Tom", namesIterator.next());
        Assert.assertEquals("Peter", namesIterator.next());
        Assert.assertFalse(namesIterator.hasNext());
    }
    /*We can subscribe to a Publisher indefinitely and get the values in a blocking manner.
    Conclusion

    I have tried explaining, with simple examples, the very basics of reactor-core. You can read more about Project Reactor here.
    https://projectreactor.io/docs/core/release/reference/docs/index.html

    To learn how to create Reactive applications using Spring Boot And Reactor, you can see these tutorials.

        Spring Boot Reactive Tutorial
        https://dzone.com/articles/spring-boot-reactive-tutorial
        Spring Boot: Server-Sent Events
        https://dzone.com/articles/spring-boot-server-sent-events-tutorial

    You can find the complete example on GitHub.*/
}
