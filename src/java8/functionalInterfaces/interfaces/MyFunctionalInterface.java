package java8.functionalInterfaces.interfaces;

import java.util.List;
import java.util.Set;

@FunctionalInterface
public interface MyFunctionalInterface {

    Set<String> operate(List<String> input);
}
