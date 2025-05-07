package org.example.part4_generic.functional_interface.built_in;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/*
Consumer = e o I.F. care primeste un argument si  rezultatul metodei este void
o putem considera inversul lui Supplier care nu primea nimic si intorcea un rezultat non-void
 */
public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> printer = msg -> System.out.println("Message " + msg);
        printer.accept("Sunt un pinguin!");

        Consumer<List<String>> freqMap = list -> {
            Map<String, Integer> freq = new HashMap<>();
            for(String it: list) {
                freq.put(it, freq.getOrDefault(it, 0) + 1);
            }
            System.out.println(freq);
        };
        freqMap.accept(List.of("ana","are", " mere", "si","ana","are", " pere" ));
    }
}
