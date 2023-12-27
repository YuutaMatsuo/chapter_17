package test;

public class InputIndexOutOfBoundsException extends RuntimeException{

    public String getMessage() {
        return "入力された値が誤っています";
    }
}
