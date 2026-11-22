package com.otaliastudios.cameraview.filter;

/* loaded from: classes17.dex */
public interface Filter {
    Filter copy();

    void draw(long j, float[] fArr);

    String getFragmentShader();

    String getVertexShader();

    void onCreate(int i);

    void onDestroy();

    void setSize(int i, int i2);
}
