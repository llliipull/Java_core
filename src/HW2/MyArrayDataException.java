package HW2;

public class MyArrayDataException extends NumberFormatException{

    private String displayText;

    public MyArrayDataException (int i, int j){
        super(String.format("Некорректные данные в " + i + " " + j));

    }
}
