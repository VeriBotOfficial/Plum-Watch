package org.xmind.core.util;

import android.gov.nist.core.Separators;

/* loaded from: classes7.dex */
public class Point {
    public int x;
    public int y;

    public Point() {
        this(0, 0);
    }

    public Point(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    public int hashCode() {
        return this.x ^ this.y;
    }

    public String toString() {
        return Separators.LPAREN + this.x + "," + this.y + Separators.RPAREN;
    }
}
