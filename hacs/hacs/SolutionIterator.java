package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class SolutionIterator implements Iterator {
    SolutionList solutionlist;
    int currentSolutionNumber = -1;

    public SolutionIterator() {
    }

    public SolutionIterator(SolutionList thesolutionlist) {
        solutionlist = thesolutionlist;
        moveToHead();
    }

    public void moveToHead() {
        currentSolutionNumber = -1;
    }

    public boolean hasNext() {
        /**@todo: Implement this java.util.Iterator method*/
        return currentSolutionNumber < solutionlist.size() - 1;
    }

    public Object next() {
        /**@todo: Implement this java.util.Iterator method*/
        if (hasNext()) {
            currentSolutionNumber++;
            return solutionlist.get(currentSolutionNumber);
        } else {
            return null;
        }
    }

    public Object next(String UserName) {
        Solution theSolution;
        theSolution = (Solution) next();
        while (theSolution != null) {
            if (UserName.compareTo(theSolution.theAuthor) == 0) {
                return theSolution;
            }
            theSolution = (Solution) next();
        }
        return null;
    }

    public void remove() {
        /**@todo: Implement this java.util.Iterator method*/
        solutionlist.remove(currentSolutionNumber);
    }
}