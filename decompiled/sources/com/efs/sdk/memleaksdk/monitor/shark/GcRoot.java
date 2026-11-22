package com.efs.sdk.memleaksdk.monitor.shark;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0010\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "", "()V", "id", "", "getId", "()J", "Debugger", "Finalizing", "InternedString", "JavaFrame", "JniGlobal", "JniLocal", "JniMonitor", "MonitorUsed", "NativeStack", "ReferenceCleanup", "StickyClass", "ThreadBlock", "ThreadObject", "Unknown", "Unreachable", "VmInternal", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Unknown;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniGlobal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniLocal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JavaFrame;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$NativeStack;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$StickyClass;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ThreadBlock;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$MonitorUsed;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ThreadObject;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ReferenceCleanup;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$VmInternal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniMonitor;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$InternedString;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Finalizing;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Debugger;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Unreachable;", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap, reason: from Kotlin metadata */
/* loaded from: classes14.dex */
public abstract class GcRoot {
    /* renamed from: a */
    public abstract long getF9774a();

    private GcRoot() {
    }

    public /* synthetic */ GcRoot(byte b2) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Unknown;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$n */
    public static final class n extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9772a;

        public n(long j) {
            super((byte) 0);
            this.f9772a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9772a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniGlobal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "jniGlobalRefId", "(JJ)V", "getId", "()J", "getJniGlobalRefId", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$e */
    public static final class e extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9763a;
        private final long b;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9763a;
        }

        public e(long j, long j2) {
            super((byte) 0);
            this.f9763a = j;
            this.b = j2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniLocal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "threadSerialNumber", "", "frameNumber", "(JII)V", "getFrameNumber", "()I", "getId", "()J", "getThreadSerialNumber", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$f */
    public static final class f extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9764a;
        private final int b;
        private final int c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9764a;
        }

        public f(long j, int i, int i2) {
            super((byte) 0);
            this.f9764a = j;
            this.b = i;
            this.c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JavaFrame;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "threadSerialNumber", "", "frameNumber", "(JII)V", "getFrameNumber", "()I", "getId", "()J", "getThreadSerialNumber", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$d */
    public static final class d extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        public final int f9762a;
        private final long b;
        private final int c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.b;
        }

        public d(long j, int i, int i2) {
            super((byte) 0);
            this.b = j;
            this.f9762a = i;
            this.c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$NativeStack;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "threadSerialNumber", "", "(JI)V", "getId", "()J", "getThreadSerialNumber", "()I", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$i */
    public static final class i extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9767a;
        private final int b;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9767a;
        }

        public i(long j, int i) {
            super((byte) 0);
            this.f9767a = j;
            this.b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$StickyClass;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$k */
    public static final class k extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9769a;

        public k(long j) {
            super((byte) 0);
            this.f9769a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9769a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ThreadBlock;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "threadSerialNumber", "", "(JI)V", "getId", "()J", "getThreadSerialNumber", "()I", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$l */
    public static final class l extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9770a;
        private final int b;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9770a;
        }

        public l(long j, int i) {
            super((byte) 0);
            this.f9770a = j;
            this.b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$MonitorUsed;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$h */
    public static final class h extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9766a;

        public h(long j) {
            super((byte) 0);
            this.f9766a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9766a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ThreadObject;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "threadSerialNumber", "", "stackTraceSerialNumber", "(JII)V", "getId", "()J", "getStackTraceSerialNumber", "()I", "getThreadSerialNumber", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$m */
    public static final class m extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        public final int f9771a;
        private final long b;
        private final int c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.b;
        }

        public m(long j, int i, int i2) {
            super((byte) 0);
            this.b = j;
            this.f9771a = i;
            this.c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$ReferenceCleanup;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$j */
    public static final class j extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9768a;

        public j(long j) {
            super((byte) 0);
            this.f9768a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9768a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$VmInternal;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$p */
    public static final class p extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9774a;

        public p(long j) {
            super((byte) 0);
            this.f9774a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9774a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$JniMonitor;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "stackTraceSerialNumber", "", "stackDepth", "(JII)V", "getId", "()J", "getStackDepth", "()I", "getStackTraceSerialNumber", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$g */
    public static final class g extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9765a;
        private final int b;
        private final int c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9765a;
        }

        public g(long j, int i, int i2) {
            super((byte) 0);
            this.f9765a = j;
            this.b = i;
            this.c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$InternedString;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$c */
    public static final class c extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9761a;

        public c(long j) {
            super((byte) 0);
            this.f9761a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9761a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Finalizing;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$b */
    public static final class b extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9760a;

        public b(long j) {
            super((byte) 0);
            this.f9760a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9760a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Debugger;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$a */
    public static final class a extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9759a;

        public a(long j) {
            super((byte) 0);
            this.f9759a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9759a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot$Unreachable;", "Lcom/efs/sdk/memleaksdk/monitor/shark/GcRoot;", "id", "", "(J)V", "getId", "()J", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.efs.sdk.memleaksdk.monitor.internal.ap$o */
    public static final class o extends GcRoot {

        /* renamed from: a, reason: collision with root package name */
        private final long f9773a;

        public o(long j) {
            super((byte) 0);
            this.f9773a = j;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.GcRoot
        /* renamed from: a, reason: from getter */
        public long getF9774a() {
            return this.f9773a;
        }
    }
}
