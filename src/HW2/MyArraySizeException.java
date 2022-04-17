package HW2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public String displayText;
    private int arraySize = 4;

    public MyArraySizeException(String displayText){
        super(displayText);
    }

    public int getArraySize(){
        return arraySize;
    }

}
