package top.zibin.luban;

import java.io.File;

/* loaded from: classes9.dex */
public interface OnCompressListener {
    void onError(int i, Throwable th);

    void onStart();

    void onSuccess(int i, File file);
}
