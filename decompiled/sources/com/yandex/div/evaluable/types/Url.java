package com.yandex.div.evaluable.types;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Url.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/evaluable/types/Url;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes5.dex */
public final class Url {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m12678boximpl(String str) {
        return new Url(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m12679constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12680equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m12684unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12681equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12682hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12683toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m12680equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m12682hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m12684unboximpl() {
        return this.value;
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return m12683toStringimpl(this.value);
    }

    /* compiled from: Url.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/evaluable/types/Url$Companion;", "", "()V", "from", "Lcom/yandex/div/evaluable/types/Url;", "urlString", "", "from-VcSV9u8", "(Ljava/lang/String;)Ljava/lang/String;", "isValid", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m12685fromVcSV9u8(String urlString) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            if (isValid(urlString)) {
                return Url.m12679constructorimpl(urlString);
            }
            throw new IllegalArgumentException("Invalid url " + urlString);
        }

        private final boolean isValid(String urlString) {
            try {
                new URL(urlString);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }
    }
}
