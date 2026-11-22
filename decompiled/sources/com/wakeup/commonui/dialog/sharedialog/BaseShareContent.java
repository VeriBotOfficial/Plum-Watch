package com.wakeup.commonui.dialog.sharedialog;

import android.graphics.Bitmap;
import com.tencent.connect.share.QzonePublish;
import kotlin.Metadata;

/* compiled from: BaseShareContent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/wakeup/commonui/dialog/sharedialog/BaseShareContent;", "", "type", "", "title", "", "description", "url", "imagePath", QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, "thumbBitmap", "Landroid/graphics/Bitmap;", "thumbUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getType", "()I", "getTitle", "()Ljava/lang/String;", "getDescription", "getUrl", "getImagePath", "getVideoPath", "getThumbBitmap", "()Landroid/graphics/Bitmap;", "getThumbUrl", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaseShareContent {
    private final String description;
    private final String imagePath;
    private final Bitmap thumbBitmap;
    private final String thumbUrl;
    private final String title;
    private final int type;
    private final String url;
    private final String videoPath;

    public BaseShareContent() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    public BaseShareContent(int i, String str, String str2, String str3, String str4, String str5, Bitmap bitmap, String str6) {
        this.type = i;
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.imagePath = str4;
        this.videoPath = str5;
        this.thumbBitmap = bitmap;
        this.thumbUrl = str6;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BaseShareContent(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.graphics.Bitmap r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 1
        L5:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r11 = r10 & 8
            if (r11 == 0) goto L15
            r5 = r0
        L15:
            r11 = r10 & 16
            if (r11 == 0) goto L1a
            r6 = r0
        L1a:
            r11 = r10 & 32
            if (r11 == 0) goto L1f
            r7 = r0
        L1f:
            r11 = r10 & 64
            if (r11 == 0) goto L24
            r8 = r0
        L24:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L32
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3b
        L32:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.dialog.sharedialog.BaseShareContent.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getType() {
        return this.type;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final Bitmap getThumbBitmap() {
        return this.thumbBitmap;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }
}
