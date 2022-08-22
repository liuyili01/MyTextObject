package ObjectDemoo;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +   //重写父类（Object）的方法 打印对象的属性
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }//该方法使用equals来判断值是否相等 并非判断地址

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
