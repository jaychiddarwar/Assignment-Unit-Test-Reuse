package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

abstract public class Person {
    int type = 0; // type=0 : student, type=1 instructor
    String userName;
    ClassCourseList classCourseList;
    CourseMenu theCourseMenu;
    Course currentCourse;
    Assignment currentAssignment;

    public Person() {
        classCourseList = new ClassCourseList();
    }

    abstract public CourseMenu createCourseMenu(Course theCourse, int theLevel);

    public void showAddButton() {
        theCourseMenu.showAddButtons();
    }

    public void showViewButtons() {
        theCourseMenu.showViewButtons();
    }

    public void showComboxes() {
        theCourseMenu.showComboxes();
    }

    public void showRadios() {
        theCourseMenu.showRadios();
    }

    public void show() {
        theCourseMenu.show();
    }

    public boolean ifLogout() {
        return theCourseMenu.ifLogout();
    }

    public boolean showMenu() {
        Iterator theIter = currentCourse.assignmentList.iterator();
        theCourseMenu.theCourse = currentCourse;
        Assignment theAssignment;
        while (theIter.hasNext()) {
            theAssignment = (Assignment) theIter.next();
            theCourseMenu.assignmentCombox.addItem(theAssignment);
        }
        return false;
    }

    public ClassCourseList getCourseList() {
        return classCourseList;
    }

    public void addCourse(Course theCourse) {
        classCourseList.add(theCourse);
    }
}