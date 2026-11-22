package com.wakeup.commponent.module.device.work;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranBarrageBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u00020&H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t¨\u00062"}, d2 = {"Lcom/wakeup/commponent/module/device/work/TranBarrageBean;", "", "<init>", "()V", "num", "", "getNum", "()I", "setNum", "(I)V", "r", "getR", "setR", "g", "getG", "setG", "b", "getB", "setB", "font_r", "getFont_r", "setFont_r", "font_g", "getFont_g", "setFont_g", "font_b", "getFont_b", "setFont_b", "fontSize", "getFontSize", "setFontSize", "speed", "getSpeed", "setSpeed", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "getDirection", "setDirection", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "filePath", "getFilePath", "setFilePath", "type", "getType", "setType", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranBarrageBean {
    private int b;
    private int direction;
    private int fontSize;
    private int font_b;
    private int font_g;
    private int font_r;
    private int g;
    private int num;
    private int r;
    private int speed;
    private int type;
    private String content = "";
    private String filePath = "";

    public final int getNum() {
        return this.num;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final int getR() {
        return this.r;
    }

    public final void setR(int i) {
        this.r = i;
    }

    public final int getG() {
        return this.g;
    }

    public final void setG(int i) {
        this.g = i;
    }

    public final int getB() {
        return this.b;
    }

    public final void setB(int i) {
        this.b = i;
    }

    public final int getFont_r() {
        return this.font_r;
    }

    public final void setFont_r(int i) {
        this.font_r = i;
    }

    public final int getFont_g() {
        return this.font_g;
    }

    public final void setFont_g(int i) {
        this.font_g = i;
    }

    public final int getFont_b() {
        return this.font_b;
    }

    public final void setFont_b(int i) {
        this.font_b = i;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final void setSpeed(int i) {
        this.speed = i;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final void setDirection(int i) {
        this.direction = i;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "TranBarrageBean(num=" + this.num + ", r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", font_r=" + this.font_r + ", font_g=" + this.font_g + ", font_b=" + this.font_b + ", fontSize=" + this.fontSize + ", speed=" + this.speed + ", direction=" + this.direction + ", content='" + this.content + "', filePath='" + this.filePath + "', type=" + this.type + Separators.RPAREN;
    }
}
