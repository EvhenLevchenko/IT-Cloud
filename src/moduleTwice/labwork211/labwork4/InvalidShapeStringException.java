package moduleTwice.labwork211.labwork4;

public class InvalidShapeStringException extends Exception {
    private String message;

    public InvalidShapeStringException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}