package com.luck.picture.lib.interfaces;

import java.util.ArrayList;

/* loaded from: classes17.dex */
public interface OnResultCallbackListener<T> {
    void onCancel();

    void onResult(ArrayList<T> arrayList);
}
