package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @author mjfindler
 * @version 2.0
 * <p>
 * update to Java 8
 */

public class Solution {
    String theAuthor = "";
    String solutionFileName = "";
    Date theSubmitData = new Date();
    int theGrade;
    boolean reported = false;


    @Override
    public String toString() {
        String value;
        value = theAuthor + "  " + solutionFileName +
                " Grade=" + getGradeInt() + "  ";
        if (isReported())
            value += "reported";
        else
            value += "not reported";

        return (value);
    }

    String getGradeString() {
        if (isReported())
            return "" + theGrade;
        else
            return "-1";
    }

    int getGradeInt() {
        return theGrade;
    }

    public void setReported(boolean reported) {
        this.reported = reported;
    }

    public boolean isReported() {
        return reported;
    }
}