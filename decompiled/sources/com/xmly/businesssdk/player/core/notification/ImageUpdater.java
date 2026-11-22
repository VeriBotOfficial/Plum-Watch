package com.xmly.businesssdk.player.core.notification;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xmly.businesssdk.R;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.Logger;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ImageUpdater {
    private static final String TAG = "ImageUpdater";
    private final Context mContext;
    private Bitmap mDefaultBitmap;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService mExecutor = Executors.newSingleThreadExecutor();

    public interface OnImageCallback {
        void onUpdate(Bitmap bitmap);
    }

    public ImageUpdater(Context context) {
        this.mContext = context;
        this.mDefaultBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.xm_ic_launcher);
    }

    private Bitmap getDefaultBitmap() {
        return this.mDefaultBitmap;
    }

    /* renamed from: lambda$updateImage$0$com-xmly-businesssdk-player-core-notification-ImageUpdater, reason: not valid java name */
    /* synthetic */ void m12515x8f227bdf(Bitmap bitmap, OnImageCallback onImageCallback) {
        if (bitmap != null) {
            onImageCallback.onUpdate(bitmap);
        } else {
            onImageCallback.onUpdate(getDefaultBitmap());
        }
    }

    /* renamed from: lambda$updateImage$1$com-xmly-businesssdk-player-core-notification-ImageUpdater, reason: not valid java name */
    /* synthetic */ void m12516x9526473e(OnImageCallback onImageCallback) {
        onImageCallback.onUpdate(getDefaultBitmap());
    }

    /* renamed from: lambda$updateImage$2$com-xmly-businesssdk-player-core-notification-ImageUpdater, reason: not valid java name */
    /* synthetic */ void m12517x9b2a129d(String str, final OnImageCallback onImageCallback) {
        try {
            final Bitmap decodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
            this.mHandler.post(new Runnable() { // from class: com.xmly.businesssdk.player.core.notification.ImageUpdater$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageUpdater.this.m12515x8f227bdf(decodeStream, onImageCallback);
                }
            });
        } catch (IOException e) {
            Logger.e(TAG, c.a("Failed to load image: ").append(e.getMessage()).toString());
            this.mHandler.post(new Runnable() { // from class: com.xmly.businesssdk.player.core.notification.ImageUpdater$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageUpdater.this.m12516x9526473e(onImageCallback);
                }
            });
        }
    }

    public void updateImage(final String str, final OnImageCallback onImageCallback) {
        if (TextUtils.isEmpty(str)) {
            onImageCallback.onUpdate(getDefaultBitmap());
        } else {
            this.mExecutor.execute(new Runnable() { // from class: com.xmly.businesssdk.player.core.notification.ImageUpdater$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageUpdater.this.m12517x9b2a129d(str, onImageCallback);
                }
            });
        }
    }
}
