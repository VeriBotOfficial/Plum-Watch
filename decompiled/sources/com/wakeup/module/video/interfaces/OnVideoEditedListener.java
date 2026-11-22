package com.wakeup.module.video.interfaces;

import android.net.Uri;
import kotlin.Metadata;

/* compiled from: OnVideoEditedListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/video/interfaces/OnVideoEditedListener;", "", "onTrimStarted", "", "getResult", "uri", "Landroid/net/Uri;", "cancelAction", "onError", "message", "", "onProgress", "percentage", "", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnVideoEditedListener {
    void cancelAction();

    void getResult(Uri uri);

    void onError(String message);

    void onProgress(int percentage);

    void onTrimStarted();
}
