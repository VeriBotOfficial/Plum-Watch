package com.baidu.mapapi.map;

import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class Tile {
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int r1, int r2, byte[] bArr) {
        this.width = r1;
        this.height = r2;
        this.data = bArr;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("image_width", this.width);
        bundle.putInt("image_height", this.height);
        bundle.putByteArray("image_data", this.data);
        return bundle;
    }
}
