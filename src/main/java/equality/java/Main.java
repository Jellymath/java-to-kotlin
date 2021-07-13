package equality.java;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    record Foo(int i, String s) {
    }

    public static void main(String[] args) {
        System.out.println("-- Primitives --");
        int i = 2;
        Integer nullI = null;
        Integer nullableI = 2;
        System.out.println(i == 2);
        System.out.println(i == nullableI); // note - unboxing will happen
//        System.out.println(i == nullI); // will fail due to attempt to unbox nullI
        System.out.println(nullableI == nullI);
        System.out.println(Integer.valueOf(0) == Integer.valueOf(0)); // inside of integer cache by default, will return true
        System.out.println(Integer.valueOf(10000) == Integer.valueOf(10000)); // outside of integer cache by default, will return false
        System.out.println(Objects.equals(i, nullableI)); // note - boxing will happen
        System.out.println(Objects.equals(i, nullI)); // note - boxing will happen

        System.out.println("-- Objects --");
        Foo nullFoo = null;
        Foo nullableFoo = new Foo(2, "abc");
        System.out.println(nullableFoo == new Foo(2, "abc"));
        System.out.println(nullableFoo.equals(new Foo(2, "abc")));
//        System.out.println(nullFoo.equals(new Foo(2, "abc"))); // will fail due to NPE (cannot use equals for null value)
        System.out.println(new Foo(2, "abc").equals(nullFoo));
        System.out.println(Objects.equals(nullableFoo, new Foo(2, "abc")));
        System.out.println(Objects.equals(nullFoo, new Foo(2, "abc")));

        System.out.println("-- Arrays --");
        int[] arr = {1, 2, 3};
        System.out.println(arr.equals(new int[]{1, 2, 3}));
        System.out.println(Arrays.equals(arr, new int[]{1, 2, 3}));

        System.out.println("-- Nested arrays --");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrix.equals(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(Arrays.equals(matrix, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(Arrays.deepEquals(matrix, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
