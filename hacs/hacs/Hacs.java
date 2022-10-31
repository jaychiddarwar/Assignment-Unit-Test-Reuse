package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @author mjfindler
 * @version 2.0
 * <p>
 * Update to Java 8
 */

public class Hacs {
    static Facade theFacade = new Facade();

    public static void main(String[] args) {
        UserInfoItem userInfoItem = new UserInfoItem();
        theFacade.createCourseList();
        while (true) {
            boolean bExit = false;
            bExit = Facade.Login(userInfoItem);
            if (bExit) {
                break;
            }
            theFacade.createUser(userInfoItem);
            theFacade.attachCourseToUser();
            if (userInfoItem.UserType == UserInfoItem.USER_TYPE.Student) theFacade.remind();
            boolean bLogout = false;
            while (!bLogout) {
                bLogout = theFacade.selectCourse();
                if (bLogout) break;
                bLogout = theFacade.courseOperation();
            }
        }
    }
}