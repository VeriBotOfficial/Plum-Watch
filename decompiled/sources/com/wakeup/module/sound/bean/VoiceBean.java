package com.wakeup.module.sound.bean;

import com.wakeup.common.temp.BleUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoiceBean.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/sound/bean/VoiceBean;", "", "id", "", "fromTxt", "", "translateTxt", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getFromTxt", "()Ljava/lang/String;", "getTranslateTxt", "setTranslateTxt", "(Ljava/lang/String;)V", "Companion", "feature-sound_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceBean {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fromTxt;
    private final int id;
    private String translateTxt;

    @JvmStatic
    public static final int generateId() {
        return INSTANCE.generateId();
    }

    /* compiled from: VoiceBean.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/sound/bean/VoiceBean$Companion;", "", "<init>", "()V", "generateId", "", "feature-sound_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final int generateId() {
            return BleUtil.crcTable(BleUtil.longToBytes(System.currentTimeMillis() / 1000));
        }
    }

    public VoiceBean(int i, String fromTxt, String translateTxt) {
        Intrinsics.checkNotNullParameter(fromTxt, "fromTxt");
        Intrinsics.checkNotNullParameter(translateTxt, "translateTxt");
        this.id = i;
        this.fromTxt = fromTxt;
        this.translateTxt = translateTxt;
    }

    public final String getFromTxt() {
        return this.fromTxt;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTranslateTxt() {
        return this.translateTxt;
    }

    public final void setTranslateTxt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.translateTxt = str;
    }
}
