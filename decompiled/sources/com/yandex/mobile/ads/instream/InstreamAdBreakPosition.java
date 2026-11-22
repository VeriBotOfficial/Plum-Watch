package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition;", "", "Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition$Type;", "a", "Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition$Type;", "getPositionType", "()Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition$Type;", "positionType", "", "b", "J", "getValue", "()J", "value", "<init>", "(Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition$Type;J)V", "Type", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InstreamAdBreakPosition {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Type positionType;

    /* renamed from: b, reason: from kotlin metadata */
    private final long value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/instream/InstreamAdBreakPosition$Type;", "", "PERCENTS", "MILLISECONDS", "POSITION", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Type {
        public static final Type MILLISECONDS;
        public static final Type PERCENTS;
        public static final Type POSITION;
        private static final /* synthetic */ Type[] b;

        static {
            Type type = new Type(0, "PERCENTS");
            PERCENTS = type;
            Type type2 = new Type(1, "MILLISECONDS");
            MILLISECONDS = type2;
            Type type3 = new Type(2, "POSITION");
            POSITION = type3;
            Type[] typeArr = {type, type2, type3};
            b = typeArr;
            EnumEntriesKt.enumEntries(typeArr);
        }

        private Type(int i, String str) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) b.clone();
        }
    }

    public InstreamAdBreakPosition(Type positionType, long j) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.positionType = positionType;
        this.value = j;
    }

    public final Type getPositionType() {
        return this.positionType;
    }

    public final long getValue() {
        return this.value;
    }
}
