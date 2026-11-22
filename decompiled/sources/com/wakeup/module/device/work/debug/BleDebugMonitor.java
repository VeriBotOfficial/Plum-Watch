package com.wakeup.module.device.work.debug;

import android.gov.nist.core.Separators;
import com.anythink.expressad.foundation.g.g.a.b;
import com.phancy.mini.api.file.FileSystemManager;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.wakeup.common.temp.BleUtil;
import io.nats.client.support.ApiConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleDebugMonitor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000267B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J4\u0010\u001c\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0007J\u0012\u0010\"\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J$\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u0005H\u0007J\u001a\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0007J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120+J\u0006\u0010-\u001a\u00020\u0016J\u0006\u0010.\u001a\u00020\u0016J\u0014\u0010/\u001a\u00020\u00162\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0014\u00101\u001a\u00020\u00162\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0010\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0010H\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\u0012\u00105\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/wakeup/module/device/work/debug/BleDebugMonitor;", "", "<init>", "()V", "DIR_SEND", "", "DIR_RECEIVE", "LEVEL_INFO", "LEVEL_SUCCESS", "LEVEL_ERROR", "MAX_CMD", "MAX_CONN", "MAX_HEX_BYTES", "lock", "cmdRecords", "Lkotlin/collections/ArrayDeque;", "Lcom/wakeup/module/device/work/debug/BleDebugMonitor$CmdRecord;", "connRecords", "Lcom/wakeup/module/device/work/debug/BleDebugMonitor$ConnRecord;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "", "onSend", "order", "", ApiConstants.BYTES, "", "onSendResult", "success", "", "current", "total", "error", "onReceive", "onConnEvent", b.aX, BuryPointPageId.PAGE_ID_PLAN_DETAIL, "level", "onStateBroadcast", "code", "mac", "cmdSnapshot", "", "connSnapshot", "clearCmd", "clearConn", "addListener", "l", "removeListener", "addCmd", "record", "notifyChanged", "toHex", "CmdRecord", "ConnRecord", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BleDebugMonitor {
    public static final int DIR_RECEIVE = 1;
    public static final int DIR_SEND = 0;
    public static final int LEVEL_ERROR = 2;
    public static final int LEVEL_INFO = 0;
    public static final int LEVEL_SUCCESS = 1;
    private static final int MAX_CMD = 500;
    private static final int MAX_CONN = 300;
    private static final int MAX_HEX_BYTES = 300;
    public static final BleDebugMonitor INSTANCE = new BleDebugMonitor();
    private static final Object lock = new Object();
    private static final ArrayDeque<CmdRecord> cmdRecords = new ArrayDeque<>();
    private static final ArrayDeque<ConnRecord> connRecords = new ArrayDeque<>();
    private static final CopyOnWriteArrayList<Function0<Unit>> listeners = new CopyOnWriteArrayList<>();

    @JvmStatic
    public static final void onConnEvent(String stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        onConnEvent$default(stage, null, 0, 6, null);
    }

    @JvmStatic
    public static final void onConnEvent(String stage, String detail) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(detail, "detail");
        onConnEvent$default(stage, detail, 0, 4, null);
    }

    @JvmStatic
    public static final void onConnEvent(String stage, String detail, int level) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(detail, "detail");
    }

    @JvmStatic
    public static final void onReceive(byte[] bytes) {
    }

    @JvmStatic
    public static final void onSend(String order, byte[] bytes) {
    }

    @JvmStatic
    public static final void onSendResult(String order, boolean success, int current, int total, String error) {
    }

    @JvmStatic
    public static final void onStateBroadcast(int code, String mac) {
    }

    private BleDebugMonitor() {
    }

    /* compiled from: BleDebugMonitor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/wakeup/module/device/work/debug/BleDebugMonitor$CmdRecord;", "", "timeMs", "", "dir", "", "order", "", FileSystemManager.ENCODING_HEX, "size", "result", "<init>", "(JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getTimeMs", "()J", "getDir", "()I", "getOrder", "()Ljava/lang/String;", "getHex", "getSize", "getResult", "setResult", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CmdRecord {
        private final int dir;
        private final String hex;
        private final String order;
        private volatile String result;
        private final int size;
        private final long timeMs;

        public static /* synthetic */ CmdRecord copy$default(CmdRecord cmdRecord, long j, int i, String str, String str2, int i2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = cmdRecord.timeMs;
            }
            long j2 = j;
            if ((i3 & 2) != 0) {
                i = cmdRecord.dir;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                str = cmdRecord.order;
            }
            String str4 = str;
            if ((i3 & 8) != 0) {
                str2 = cmdRecord.hex;
            }
            String str5 = str2;
            if ((i3 & 16) != 0) {
                i2 = cmdRecord.size;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                str3 = cmdRecord.result;
            }
            return cmdRecord.copy(j2, i4, str4, str5, i5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDir() {
            return this.dir;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOrder() {
            return this.order;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHex() {
            return this.hex;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: component6, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        public final CmdRecord copy(long timeMs, int dir, String order, String hex, int size, String result) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(hex, "hex");
            return new CmdRecord(timeMs, dir, order, hex, size, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CmdRecord)) {
                return false;
            }
            CmdRecord cmdRecord = (CmdRecord) other;
            return this.timeMs == cmdRecord.timeMs && this.dir == cmdRecord.dir && Intrinsics.areEqual(this.order, cmdRecord.order) && Intrinsics.areEqual(this.hex, cmdRecord.hex) && this.size == cmdRecord.size && Intrinsics.areEqual(this.result, cmdRecord.result);
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.timeMs) * 31) + Integer.hashCode(this.dir)) * 31) + this.order.hashCode()) * 31) + this.hex.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + (this.result == null ? 0 : this.result.hashCode());
        }

        public String toString() {
            return "CmdRecord(timeMs=" + this.timeMs + ", dir=" + this.dir + ", order=" + this.order + ", hex=" + this.hex + ", size=" + this.size + ", result=" + this.result + Separators.RPAREN;
        }

        public CmdRecord(long j, int i, String order, String hex, int i2, String str) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(hex, "hex");
            this.timeMs = j;
            this.dir = i;
            this.order = order;
            this.hex = hex;
            this.size = i2;
            this.result = str;
        }

        public /* synthetic */ CmdRecord(long j, int i, String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, str, str2, i2, (i3 & 32) != 0 ? null : str3);
        }

        public final long getTimeMs() {
            return this.timeMs;
        }

        public final int getDir() {
            return this.dir;
        }

        public final String getOrder() {
            return this.order;
        }

        public final String getHex() {
            return this.hex;
        }

        public final int getSize() {
            return this.size;
        }

        public final String getResult() {
            return this.result;
        }

        public final void setResult(String str) {
            this.result = str;
        }
    }

    /* compiled from: BleDebugMonitor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/module/device/work/debug/BleDebugMonitor$ConnRecord;", "", "timeMs", "", b.aX, "", BuryPointPageId.PAGE_ID_PLAN_DETAIL, "level", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;I)V", "getTimeMs", "()J", "getStage", "()Ljava/lang/String;", "getDetail", "getLevel", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConnRecord {
        private final String detail;
        private final int level;
        private final String stage;
        private final long timeMs;

        public static /* synthetic */ ConnRecord copy$default(ConnRecord connRecord, long j, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = connRecord.timeMs;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                str = connRecord.stage;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = connRecord.detail;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                i = connRecord.level;
            }
            return connRecord.copy(j2, str3, str4, i);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStage() {
            return this.stage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLevel() {
            return this.level;
        }

        public final ConnRecord copy(long timeMs, String stage, String detail, int level) {
            Intrinsics.checkNotNullParameter(stage, "stage");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new ConnRecord(timeMs, stage, detail, level);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnRecord)) {
                return false;
            }
            ConnRecord connRecord = (ConnRecord) other;
            return this.timeMs == connRecord.timeMs && Intrinsics.areEqual(this.stage, connRecord.stage) && Intrinsics.areEqual(this.detail, connRecord.detail) && this.level == connRecord.level;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.timeMs) * 31) + this.stage.hashCode()) * 31) + this.detail.hashCode()) * 31) + Integer.hashCode(this.level);
        }

        public String toString() {
            return "ConnRecord(timeMs=" + this.timeMs + ", stage=" + this.stage + ", detail=" + this.detail + ", level=" + this.level + Separators.RPAREN;
        }

        public ConnRecord(long j, String stage, String detail, int i) {
            Intrinsics.checkNotNullParameter(stage, "stage");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.timeMs = j;
            this.stage = stage;
            this.detail = detail;
            this.level = i;
        }

        public final long getTimeMs() {
            return this.timeMs;
        }

        public final String getStage() {
            return this.stage;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    public static /* synthetic */ void onConnEvent$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        onConnEvent(str, str2, i);
    }

    public final List<CmdRecord> cmdSnapshot() {
        List<CmdRecord> list;
        synchronized (lock) {
            list = CollectionsKt.toList(cmdRecords);
        }
        return list;
    }

    public final List<ConnRecord> connSnapshot() {
        List<ConnRecord> list;
        synchronized (lock) {
            list = CollectionsKt.toList(connRecords);
        }
        return list;
    }

    public final void clearCmd() {
        synchronized (lock) {
            cmdRecords.clear();
            Unit unit = Unit.INSTANCE;
        }
        notifyChanged();
    }

    public final void clearConn() {
        synchronized (lock) {
            connRecords.clear();
            Unit unit = Unit.INSTANCE;
        }
        notifyChanged();
    }

    public final void addListener(Function0<Unit> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        listeners.add(l);
    }

    public final void removeListener(Function0<Unit> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        listeners.remove(l);
    }

    private final void addCmd(CmdRecord record) {
        synchronized (lock) {
            cmdRecords.addFirst(record);
            while (true) {
                ArrayDeque<CmdRecord> arrayDeque = cmdRecords;
                if (arrayDeque.size() > 500) {
                    arrayDeque.removeLast();
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        notifyChanged();
    }

    private final void notifyChanged() {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            Function0 function0 = (Function0) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                function0.invoke();
                Result.m14057constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    private final String toHex(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "";
        }
        if (bytes.length > 300) {
            byte[] copyOf = Arrays.copyOf(bytes, 300);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            String bytesToHexStr = BleUtil.bytesToHexStr(copyOf);
            return (bytesToHexStr != null ? bytesToHexStr : "") + " …(共" + bytes.length + "字节)";
        }
        String bytesToHexStr2 = BleUtil.bytesToHexStr(bytes);
        return bytesToHexStr2 == null ? "" : bytesToHexStr2;
    }
}
