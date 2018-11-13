package skill.common.reactor;

import reactor.core.publisher.Flux;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
* Reactor – How to convert Flux into List, Map
* https://grokonez.com/reactive-programming/reactor/reactor-convert-flux-into-list-map-reactive-programming
*
    We will use Flux methods such as:
    – collectList(): accumulate sequence into a Mono<List>.
    – collectSortedList(): accumulate sequence and sort into a Mono<List>.
    – collectMap(): convert sequence into a Mono<Map>.
    – collectMultimap(): convert sequence into a Mono<Map> that each Map’s key can be paired with multi-value (in a Collection).

    Then the Mono result above will be converted into a real List/Map using block() method.*/
public class ConvertFluxIntoListOrMap {
    private static final Flux<String> flux = Flux.just("Site_0:grokonez.com",
            "Description_0:Java Technology",
            "Description_1:Spring Framework");

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    // Flux.collectList
    private static void test1() {
        System.out.println("===========================================test Flux.collectList");
        List<String> list = flux.collectList().block();
        list.forEach(System.out::println);
    }

    // Flux.collectSortedList
    private static void test2() {
        System.out.println("===========================================test Flux.collectSortedList");
        List<String> list = flux.collectSortedList().block();
        list.forEach(System.out::println);
    }

    // Flux.collectMap
    private static void test3() {
        System.out.println("===========================================test Flux.collectMap");
        Map<String, String> map = flux.collectMap(item -> {
                    return item.split(":")[0];
                },
                item -> {
                    return item.split(":")[1];
                })
                .block();
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    // Flux.collectMultimap
    private static void test4() {
        System.out.println("===========================================test Flux.collectMultimap");
        Map<String, Collection<String>> map = flux.collectMultimap(item -> {
                    return item.split("_[0-9]+:]")[0];
                },
                item -> {
                    return item.split(":")[1];
                }).block();
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
