package com.amap.api.maps.model;

/* JADX INFO: loaded from: classes7.dex */
public class ImageOptions {
    public int color;
    public String content;
    public int fontSize;
    public float radius;
    public double[] rgba;
    public int type;

    public enum ShapeType {
        DEFAULT(0),
        CIRCLE(1),
        TEXT(2);

        private int index;

        ShapeType(int r3) {
            this.index = r3;
        }

        public int value() {
            return this.index;
        }
    }
}
