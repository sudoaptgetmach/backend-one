package org.mach.src.exercises.warmup1;

public class sleepin {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
