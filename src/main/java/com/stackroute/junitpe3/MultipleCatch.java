package com.stackroute.junitpe3;

public class MultipleCatch {
    public String handlingMultipleCatch(String input)
    {
        try{

            int index = input.indexOf('a');    //null input gives null pointer exception

            int array[] = new int[index];     //if index is -1 it generates negative array size exception

            for(int i=0; i < index ; i++)
            {
                if(input.contains("@"))
                {
                    array[index] = array[index+index];  //to generate index out of bound exception
                }
            }

            return null;

        }
        catch (NullPointerException nullpointerException)
        {
            return "Null pointer Exception";
        }
        catch (IndexOutOfBoundsException indexOutOfBoundException)
        {
            return "Index out of bound exception";
        }
        catch (NegativeArraySizeException negativeArraySizeException)
        {
            return "Negative Array Size Exception";
        }
    }
}
