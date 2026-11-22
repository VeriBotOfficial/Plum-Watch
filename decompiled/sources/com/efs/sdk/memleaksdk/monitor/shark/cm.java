package com.efs.sdk.memleaksdk.monitor.shark;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject;", "", "()V", "position", "", "getPosition", "()J", "recordSize", "getRecordSize", "IndexedClass", "IndexedInstance", "IndexedObjectArray", "IndexedPrimitiveArray", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedClass;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedInstance;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedObjectArray;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedPrimitiveArray;", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public abstract class cm {
    /* renamed from: a */
    public abstract long getB();

    /* renamed from: b */
    public abstract long getC();

    private cm() {
    }

    public /* synthetic */ cm(byte b2) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedClass;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject;", "position", "", "superclassId", "instanceSize", "", "recordSize", "fieldsIndex", "(JJIJI)V", "getFieldsIndex", "()I", "getInstanceSize", "getPosition", "()J", "getRecordSize", "getSuperclassId", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class a extends cm {

        /* renamed from: a, reason: collision with root package name */
        public final long f9870a;
        public final int b;
        final int c;
        private final long d;
        private final long e;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: a, reason: from getter */
        public long getB() {
            return this.d;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: b, reason: from getter */
        public long getC() {
            return this.e;
        }

        public a(long j, long j2, int i, long j3, int i2) {
            super((byte) 0);
            this.d = j;
            this.f9870a = j2;
            this.b = i;
            this.e = j3;
            this.c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedInstance;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject;", "position", "", "classId", "recordSize", "(JJJ)V", "getClassId", "()J", "getPosition", "getRecordSize", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class b extends cm {

        /* renamed from: a, reason: collision with root package name */
        public final long f9871a;
        private final long b;
        private final long c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: a, reason: from getter */
        public long getB() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: b, reason: from getter */
        public long getC() {
            return this.c;
        }

        public b(long j, long j2, long j3) {
            super((byte) 0);
            this.b = j;
            this.f9871a = j2;
            this.c = j3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedObjectArray;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject;", "position", "", "arrayClassId", "recordSize", "(JJJ)V", "getArrayClassId", "()J", "getPosition", "getRecordSize", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class c extends cm {

        /* renamed from: a, reason: collision with root package name */
        public final long f9872a;
        private final long b;
        private final long c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: a, reason: from getter */
        public long getB() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: b, reason: from getter */
        public long getC() {
            return this.c;
        }

        public c(long j, long j2, long j3) {
            super((byte) 0);
            this.b = j;
            this.f9872a = j2;
            this.c = j3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject$IndexedPrimitiveArray;", "Lcom/efs/sdk/memleaksdk/monitor/shark/internal/IndexedObject;", "position", "", "primitiveType", "Lcom/efs/sdk/memleaksdk/monitor/shark/PrimitiveType;", "recordSize", "(JLcom/efs/sdk/memleaksdk/monitor/shark/PrimitiveType;J)V", "getPosition", "()J", "getPrimitiveType", "()Lcom/efs/sdk/memleaksdk/monitor/shark/PrimitiveType;", "primitiveTypeOrdinal", "", "getRecordSize", "memleaksdk_release"}, k = 1, mv = {1, 4, 1})
    public static final class d extends cm {

        /* renamed from: a, reason: collision with root package name */
        private final byte f9873a;
        private final long b;
        private final long c;

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: a, reason: from getter */
        public long getB() {
            return this.b;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.shark.cm
        /* renamed from: b, reason: from getter */
        public long getC() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, PrimitiveType primitiveType, long j2) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            this.b = j;
            this.c = j2;
            this.f9873a = (byte) primitiveType.ordinal();
        }

        public final PrimitiveType c() {
            return PrimitiveType.values()[this.f9873a];
        }
    }
}
