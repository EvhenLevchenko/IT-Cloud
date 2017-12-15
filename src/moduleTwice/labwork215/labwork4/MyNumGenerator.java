package moduleTwice.labwork215.labwork4;

import java.util.*;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }


    List generate() {
        List<Number> newList = new ArrayList<>(numOfElm);
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            newList.add(random.nextInt(maxNumb));
        }
        return newList;
    }
    Set generateDistinct(){
        Set<Number> newSet=new HashSet<>(numOfElm);
        Random random=new Random();
        for (int i = 0; i < numOfElm; i++) {
            newSet.add(random.nextInt(maxNumb));
        }
        return newSet;
    }

    public static void main(String[] args) {
        MyNumGenerator genOne=new MyNumGenerator(5,64);
        System.out.println(genOne.generate());
        System.out.println(genOne.generateDistinct());

    }
}

