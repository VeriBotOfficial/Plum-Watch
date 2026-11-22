package com.wakeup.feature.user.order;

import com.wakeup.common.network.entity.PayModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/wakeup/feature/user/order/OrderType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", PayModel.PAYTYPE_DIAL, "WEAR_FIT_VIP", "ENERGY", "WARNING", "WALL_PAPER", "AI_VIP", "BLIND_BOX", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    private final int type;
    public static final OrderType DIAL = new OrderType(PayModel.PAYTYPE_DIAL, 0, 1);
    public static final OrderType WEAR_FIT_VIP = new OrderType("WEAR_FIT_VIP", 1, 2);
    public static final OrderType ENERGY = new OrderType("ENERGY", 2, 3);
    public static final OrderType WARNING = new OrderType("WARNING", 3, 4);
    public static final OrderType WALL_PAPER = new OrderType("WALL_PAPER", 4, 5);
    public static final OrderType AI_VIP = new OrderType("AI_VIP", 5, 6);
    public static final OrderType BLIND_BOX = new OrderType("BLIND_BOX", 6, 7);

    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{DIAL, WEAR_FIT_VIP, ENERGY, WARNING, WALL_PAPER, AI_VIP, BLIND_BOX};
    }

    public static EnumEntries<OrderType> getEntries() {
        return $ENTRIES;
    }

    private OrderType(String str, int i, int i2) {
        this.type = i2;
    }

    public final int getType() {
        return this.type;
    }

    static {
        OrderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
