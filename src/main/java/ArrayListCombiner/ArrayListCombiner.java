package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {


    public static<E> void superCombiner(ArrayList<E> array1, ArrayList<? extends E> array2){

        array1.addAll(array2);

    } public static<E> void extendCombiner(ArrayList<? super E > array1, ArrayList<E>array2){

        array1.addAll(array2);
    }



}
