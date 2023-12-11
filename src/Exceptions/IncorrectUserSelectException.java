package Exceptions;

public class IncorrectUserSelectException extends RuntimeException{

    private String errorId;

    public IncorrectUserSelectException ( String errorId, String msg){
        super(msg);
        this.errorId= errorId;

    }

    public String getErrorId() {
        return errorId;
    }
}
