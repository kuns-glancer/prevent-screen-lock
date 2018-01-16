
package preventScreenLock;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date：2018年1月16日 @introduction:
 * @author: kun
 * @version: 1.0
 */
public class MouseMove {

    private Robot robot;// 自动化对象

    public MouseMove() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void move(int width, int heigh) { // 鼠标移动函数
        Date now = new Date();
        System.out.println("鼠标移动，时间：" + formatDate(now));
        Point mousepoint = MouseInfo.getPointerInfo().getLocation();
        int x = mousepoint.x;
        int y = mousepoint.y;
        robot.mouseMove(x + width, y + heigh);
        robot.mouseMove(x, y);
    }

    private String formatDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(date);
    }
}
