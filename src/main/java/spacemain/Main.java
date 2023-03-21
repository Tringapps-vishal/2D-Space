package spacemain;

import java.util.*;
import java.util.function.Supplier;
import java.util.logging.Logger;

import spacepoint.Point;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Logger log= Logger.getLogger("Main");
        log.info(" ------1st point-------  \n");
        log.info("\n Enter X value : ");
        int x1 = sc.nextInt();
        log.info(" Enter Y value : ");
        int y1 = sc.nextInt();
        Point p = new Point(x1, y1);
        Point p1 = (Point) p.clone();
        log.info("\n --------2nd point------ \n");
        log.info("\n Enter X value: ");
        int x2 = sc.nextInt();
        log.info(" Enter Y value : ");
        int y2 = sc.nextInt();
        boolean ans = p1.equals(x2, y2);
        log.info("Both Points are " + ans);
    }
}
