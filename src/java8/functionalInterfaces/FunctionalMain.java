package java8.functionalInterfaces;

import java8.functionalInterfaces.interfaces.CustomInterface;
import java8.functionalInterfaces.interfaces.MyFunctionalInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionalMain {

    public static void main(String[] args) {
//        UniqueConvertor convertor = new UniqueConvertor();
//        Set<String> ans = convertor.operate(List.of("a", "c", "c"));
        MyFunctionalInterface ans = (input) -> new HashSet<>(input);
        Set<String> operate = ans.operate(List.of("a", "c", "c"));
        System.out.println(operate);


        customExecutor(() -> {
            System.out.println("Custom logic");
            throw new RuntimeException("Custom error");
//            System.out.println("Custom logic 2");
        });
    }


    static void customExecutor(CustomInterface customInterface) {
        try {
            customInterface.execute();
        } catch (Exception e) {
            System.out.println("Error occured : " + e);
        }
    }

    static class UniqueConvertor implements MyFunctionalInterface {

        @Override
        public Set<String> operate(List<String> input) {
            return new HashSet<>(input);
        }
    }

}
