package com.wakeup.commponent.module.pay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewPayWayEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/wakeup/commponent/module/pay/NewPayWayEnum;", "", "payType", "", "<init>", "(Ljava/lang/String;II)V", "getPayType", "()I", "setPayType", "(I)V", "ALI", "WECAHT", "PAYPAL", "STRIPE", "APPLE", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewPayWayEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NewPayWayEnum[] $VALUES;
    private int payType;
    public static final NewPayWayEnum ALI = new NewPayWayEnum("ALI", 0, 1);
    public static final NewPayWayEnum WECAHT = new NewPayWayEnum("WECAHT", 1, 2);
    public static final NewPayWayEnum PAYPAL = new NewPayWayEnum("PAYPAL", 2, 3);
    public static final NewPayWayEnum STRIPE = new NewPayWayEnum("STRIPE", 3, 4);
    public static final NewPayWayEnum APPLE = new NewPayWayEnum("APPLE", 4, 5);

    private static final /* synthetic */ NewPayWayEnum[] $values() {
        return new NewPayWayEnum[]{ALI, WECAHT, PAYPAL, STRIPE, APPLE};
    }

    public static EnumEntries<NewPayWayEnum> getEntries() {
        return $ENTRIES;
    }

    private NewPayWayEnum(String str, int i, int i2) {
        this.payType = i2;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final void setPayType(int i) {
        this.payType = i;
    }

    static {
        NewPayWayEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static NewPayWayEnum valueOf(String str) {
        return (NewPayWayEnum) Enum.valueOf(NewPayWayEnum.class, str);
    }

    public static NewPayWayEnum[] values() {
        return (NewPayWayEnum[]) $VALUES.clone();
    }
}
