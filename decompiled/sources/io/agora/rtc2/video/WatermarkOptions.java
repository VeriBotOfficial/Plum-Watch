package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class WatermarkOptions {
    public boolean visibleInPreview = true;
    public Rectangle positionInLandscapeMode = new Rectangle();
    public Rectangle positionInPortraitMode = new Rectangle();

    public static class Rectangle {
        public int height;
        public int width;
        public int x;
        public int y;

        public Rectangle() {
            this.x = 0;
            this.y = 0;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int x_, int y_, int width_, int height_) {
            this.x = x_;
            this.y = y_;
            this.width = width_;
            this.height = height_;
        }
    }
}
