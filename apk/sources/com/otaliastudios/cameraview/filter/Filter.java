package com.otaliastudios.cameraview.filter;

/* JADX INFO: loaded from: classes2.dex */
public interface Filter {
    Filter copy();

    void draw(long j, float[] fArr);

    String getFragmentShader();

    String getVertexShader();

    void onCreate(int r1);

    void onDestroy();

    void setSize(int r1, int r2);
}
