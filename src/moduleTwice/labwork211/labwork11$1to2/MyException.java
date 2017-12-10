package moduleTwice.labwork211.labwork11$1to2;

public class MyException extends Exception {
    private String thisIsString;

    public MyException(String thisIsString) {
        this.thisIsString = thisIsString;
    }

    public  void printText(){
        System.out.println(thisIsString);
    }

}
