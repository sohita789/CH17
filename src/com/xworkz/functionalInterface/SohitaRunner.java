package com.xworkz.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class SohitaRunner
{
	
	
	    public static void main(String[] args) {
	        // 1. Predicate<T>
	        Predicate<Integer> isEven = (x) ->  x%2 == 0 ;boolean result= isEven.test(4);

	        // 2. Consumer<T>
	        Consumer<String> print = (s) -> System.out.println(s);
	        print.accept("hello");

	        // 3. Function<T, R>
	        Function<String, Integer> stringLength=(s)->s.length(); int length = stringLength.apply("Hello");

	        // 4. Supplier<T>
	        Supplier<Double> randomValue = () -> Math.random();
	        double value=randomValue.get();//returns  a random double value

	        // 5. UnaryOperator<T>
	        UnaryOperator<Integer> square = (x) -> x * x;
	        int squared = square.apply(4);

	        // 6. BinaryOperator<T>
	        BinaryOperator<Integer> add = (a, b) -> a + b;
	        int sum=add.apply(3, 4);

	        // 7. ToIntFunction<T>
	        ToIntFunction<String> stringlength = (s) -> s.length();
	        int length1 = stringLength.apply("hello");

	        // 8. ToDoubleFunction<T>
	        ToDoubleFunction<String> stringLengthAsDouble = (x) -> x.length();
	        double length2 = stringLengthAsDouble.applyAsDouble("hello");

	        // 9. ToLongFunction<T>
	        ToLongFunction<String> stringLengthAsLong = (s) ->(long) s.length();
	        long length11 = stringLengthAsLong.applyAsLong("hii");

	        // 10. IntFunction<R>
	        IntFunction<String> intToStringFunction = (x) -> "Number: " + x;
	        Function<String, Integer> intToString = null;
			Integer result1 = intToString.apply("hi");

	        // 11. LongFunction<R>
	        LongFunction<String> longToStringFunction =( x) -> "Long: " + x;
	        Function<String, Integer> longToString = null;
			Integer result11 = longToString.apply("hi");

	        // 12. DoubleFunction<R>
	        DoubleFunction<String> doubleToStringFunction = (x) -> "Double: " + x;
	        

	        // 13. IntConsumer
	        IntConsumer intPrinter = (x) -> System.out.println("Int: " + x);

	        // 14. LongConsumer
	        LongConsumer longPrinter = (x) -> System.out.println("Long: " + x);

	        // 15. DoubleConsumer
	        DoubleConsumer doublePrinter = (x) -> System.out.println("Double: " + x);

	        // 16. ObjIntConsumer<T>
	        ObjIntConsumer<String> objIntPrinter = (s, i) -> System.out.println(s + ": " + i);

	        // 17. ObjLongConsumer<T>
	        ObjLongConsumer<String> objLongPrinter = (s, l) -> System.out.println(s + ": " + l);

	        // 18. ObjDoubleConsumer<T>
	        ObjDoubleConsumer<String> objDoublePrinter = (s, d) -> System.out.println(s + ": " + d);

	        // 19. IntPredicate
	        IntPredicate isPositive = (x) -> x > 0;

	        // 20. LongPredicate
	        LongPredicate isPositiveLong = (x) -> x > 0;

	        // 21. DoublePredicate
	        DoublePredicate isPositiveDouble = (x) -> x > 0;

	        // 22. IntToDoubleFunction
	        IntToDoubleFunction intToDouble = (x) -> x * 1.5;

	        // 23. IntToLongFunction
	        IntToLongFunction intToLong = (x) -> (long) x;

	        // 24. LongToIntFunction
	        LongToIntFunction longToInt = (l) -> (int) l;

	        // 25. LongToDoubleFunction
	        LongToDoubleFunction longToDouble = (l) -> (double) l;

	        // 26. DoubleToIntFunction
	        DoubleToIntFunction doubleToInt = (d) -> (int) d;

	        // 27. DoubleToLongFunction
	        DoubleToLongFunction doubleToLong = (d) -> (long) d;

	        // 28. DoubleUnaryOperator
	        DoubleUnaryOperator doubleSquare = (x) -> x * x;

	        // 29. DoubleBinaryOperator
	        DoubleBinaryOperator doubleAdd = (a, b) -> a + b;

	        // 30. IntBinaryOperator
	        IntBinaryOperator intAdd = (a, b) -> a + b;

	        // 31. LongBinaryOperator
	        LongBinaryOperator longAdd = (a, b) -> a + b;

	        // 32. BiPredicate<T, U>
	        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

	        // 33. BiConsumer<T, U>
	        BiConsumer<String, Integer> printNameAge = (name, age) -> System.out.println(name + " is " + age + " years old.");

	        // 34. BiFunction<T, U, R>
	        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

	        // 35. BinaryOperator<T> 
            BinaryOperator<Integer>add1=(a,b)->a+b;
            int result4=add.apply(3, 5);
            
	        // 36. UnaryOperator<T> 
            UnaryOperator<Integer>square1 = (n)->n*n;
            int res = square.apply(5);

	        // 37. IntSupplier
	        IntSupplier randomInt = () -> (int) (Math.random() * 100);
	        

	        // 38. LongSupplier
	        LongSupplier randomLong = () -> (long) (Math.random() * 100);

	        // 39. DoubleSupplier
	        DoubleSupplier randomDouble = () -> Math.random();

	        
	    }
	}



