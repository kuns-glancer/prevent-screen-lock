
package preventScreenLock;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @date：2018年1月16日 @introduction： @author: kun
 * @version: 1.0
 */
public class Preventor {

    /* 设置鼠标每3分钟移动 */
    private static long SLEEP_TIME = 1000 * 60 * 3;

    public static void main(String[] args) {
        MouseMove mouseMove = new MouseMove();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                mouseMove.move(2, 2);
            }
        };

        timer.schedule(task, 1000, SLEEP_TIME);
    }

}
