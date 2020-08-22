/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 8/22/2020
 *   Time: 7:12 PM
 *   File: Ractangle.java
 */

public class Rectangle {
private double width;
private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        if (width<0){
            this.width=0;
        }
        this.length = length;
        if (length<0){
            this.length=0;
        }

    }
}
