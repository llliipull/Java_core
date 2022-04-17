package HW2;

import java.util.Arrays;

public class Main {

    static int arraySum = 0;

    public static MyArraySizeException arraySizeException = new MyArraySizeException("Массив не может быть больше 4х4");
    public static MyArrayDataException arrayDataException;



    public static void main(String[] args) {

        String[][] oversizeArray = {{"2", "7", "4", "7", "2"}, {"2", "7", "4", "7"},{"2", "7", "4", "7"}};
        String[][] arrayForSum = {{"2", "7", "4", "7"}, {"2", "7", "4", "7"}, {"2", "7", "4", "7"}, {"2", "7", "4", "test"}};
        try {
            oversizedArray(oversizeArray);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }finally {
            sumOfArray(arrayForSum);
        }


    }

    public static void oversizedArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                    if (i != arraySizeException.getArraySize() || j != arraySizeException.getArraySize()){
                        throw new MyArraySizeException("Массив не может быть больше 4х4");
                    }
            }

        }
    }

    public static void sumOfArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try{
                    arraySum = arraySum + Integer.parseInt(array[i][j]);
                } catch(NumberFormatException e) {
                    System.out.println("Сумма элементов массива "+ arraySum);
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }

}



