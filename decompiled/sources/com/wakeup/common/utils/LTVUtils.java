package com.wakeup.common.utils;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import com.wakeup.common.temp.BleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* compiled from: LTVUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/common/utils/LTVUtils;", "", "<init>", "()V", "parseAdvLTV", "", "Lcom/wakeup/common/utils/LTVUtils$LTV;", "data", "", "getDeviceType", "", Constants.MessagePayloadKeys.RAW_DATA, "LTV", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LTVUtils {
    public static final LTVUtils INSTANCE = new LTVUtils();

    private LTVUtils() {
    }

    private final List<LTV> parseAdvLTV(byte[] data) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < data.length) {
            int and = Util.and(data[i], 255);
            if (and > 0) {
                arrayList.add(new LTV(and, Util.and(data[i + 1], 255), ArraysKt.copyOfRange(data, i + 2, i + and + 1)));
            }
            i += and + 1;
        }
        return arrayList;
    }

    @JvmStatic
    public static final int getDeviceType(byte[] rawData) {
        Object obj;
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Iterator<T> it = INSTANCE.parseAdvLTV(rawData).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LTV) obj).getType() == 255) {
                break;
            }
        }
        LTV ltv = (LTV) obj;
        if (ltv == null) {
            return 0;
        }
        List<Integer> bytesToArrayList = BleUtil.bytesToArrayList(ltv.getValueArray());
        Integer num = bytesToArrayList.get(0);
        Integer num2 = bytesToArrayList.get(1);
        if (num2 != null && num2.intValue() == 192) {
            return (num != null && num.intValue() == 242) ? 2 : 0;
        }
        if (num2 == null || num2.intValue() != 255) {
            return 0;
        }
        if (num != null && num.intValue() == 241) {
            return 2;
        }
        if (num != null && num.intValue() == 242) {
            return 4;
        }
        if (num != null && num.intValue() == 243) {
            return 9;
        }
        if (num != null && num.intValue() == 244) {
            return 11;
        }
        if (num != null && num.intValue() == 245) {
            return 12;
        }
        if (num != null && num.intValue() == 247) {
            return 14;
        }
        if (num != null && num.intValue() == 250) {
            return 23;
        }
        return (num != null && num.intValue() == 251) ? 25 : 0;
    }

    /* compiled from: LTVUtils.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/utils/LTVUtils$LTV;", "", "length", "", "type", "valueArray", "", "<init>", "(II[B)V", "getLength", "()I", "getType", "getValueArray", "()[B", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LTV {
        private final int length;
        private final int type;
        private final byte[] valueArray;

        public static /* synthetic */ LTV copy$default(LTV ltv, int i, int i2, byte[] bArr, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = ltv.length;
            }
            if ((i3 & 2) != 0) {
                i2 = ltv.type;
            }
            if ((i3 & 4) != 0) {
                bArr = ltv.valueArray;
            }
            return ltv.copy(i, i2, bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        /* renamed from: component2, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getValueArray() {
            return this.valueArray;
        }

        public final LTV copy(int length, int type, byte[] valueArray) {
            Intrinsics.checkNotNullParameter(valueArray, "valueArray");
            return new LTV(length, type, valueArray);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LTV)) {
                return false;
            }
            LTV ltv = (LTV) other;
            return this.length == ltv.length && this.type == ltv.type && Intrinsics.areEqual(this.valueArray, ltv.valueArray);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.length) * 31) + Integer.hashCode(this.type)) * 31) + Arrays.hashCode(this.valueArray);
        }

        public String toString() {
            return "LTV(length=" + this.length + ", type=" + this.type + ", valueArray=" + Arrays.toString(this.valueArray) + Separators.RPAREN;
        }

        public LTV(int i, int i2, byte[] valueArray) {
            Intrinsics.checkNotNullParameter(valueArray, "valueArray");
            this.length = i;
            this.type = i2;
            this.valueArray = valueArray;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getType() {
            return this.type;
        }

        public final byte[] getValueArray() {
            return this.valueArray;
        }
    }
}
