package moduleTwice.labwork214.labwork4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }


    public static void shuffle(List<?> list, Random rnd) {
        Random r;
        if (rnd == null)
            r = rnd = new Random(); // harmless race.
        shuffle(list, rnd);
    }
}