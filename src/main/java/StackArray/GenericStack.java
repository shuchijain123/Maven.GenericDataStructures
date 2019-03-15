package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int size;
    E element;


    public GenericStack() {
        elements = (E[]) new Object[0];

    }

    public void push(E object) {
        E[] newElements = Arrays.copyOf(elements, elements.length + 1);
        newElements[newElements.length - 1] = object;
        this.elements = newElements;


    }

    public E pop() {



        if (elements==null) {


            throw new IndexOutOfBoundsException("Array Stack is Empty");

        } else if (elements.length > 0) {
            E[] newElements = Arrays.copyOf(elements, elements.length - 1);

            element = (E) elements[elements.length - 1];
            elements = newElements;

            return element;


        } else

            return elements[0];


    }






    public Boolean isEmpty(){


        if (elements.length == 0) {

            return true;
        }
        else
            return false;
    }




}



