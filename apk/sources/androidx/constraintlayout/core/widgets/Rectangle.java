package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes8.dex */
public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public void setBounds(int r1, int r2, int r3, int r4) {
        this.x = r1;
        this.y = r2;
        this.width = r3;
        this.height = r4;
    }

    void grow(int r2, int r3) {
        this.x -= r2;
        this.y -= r3;
        this.width += r2 * 2;
        this.height += r3 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int r0;
        int r1;
        int r2 = this.x;
        int r3 = rectangle.x;
        return r2 >= r3 && r2 < r3 + rectangle.width && (r0 = this.y) >= (r1 = rectangle.y) && r0 < r1 + rectangle.height;
    }

    public boolean contains(int r3, int r4) {
        int r5;
        int r0 = this.x;
        return r3 >= r0 && r3 < r0 + this.width && r4 >= (r5 = this.y) && r4 < r5 + this.height;
    }

    public int getCenterX() {
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.y + this.height) / 2;
    }
}
