package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>  {
    private ArrayList elements;
    private E element;

    public Stack(){

        elements= new ArrayList();
    }

    public void push(E element){

        elements.add(element);
 }

        public E pop() {


            if (elements.isEmpty()) {


                throw new IndexOutOfBoundsException("List Stack is Empty");
            } else if (elements.size() > 0) {

                element = (E) elements.get(elements.size() - 1);

                elements.remove(elements.size() - 1);
                return element;
            }

            else

                return (E) elements.get(0);


        }


    public Boolean  isEmpty()
    {


        if (elements.isEmpty()) {

            return true;
        }
        else
            return false;
    }



    }







