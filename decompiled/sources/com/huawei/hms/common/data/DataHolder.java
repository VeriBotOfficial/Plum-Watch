package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String[] f10290a;
        private final ArrayList<HashMap<String, Object>> b;
        private final String c;
        private final HashMap<Object, Integer> d;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.huawei.hms.common.data.DataHolder.Builder setDataForContentValuesHashMap(java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "contentValuesHashMap cannot be null"
                com.huawei.hms.common.internal.Preconditions.checkNotNull(r4, r0)
                java.lang.String r0 = r3.c
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r4.get(r0)
                if (r0 == 0) goto L2e
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.d
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L1f
                int r0 = r1.intValue()
                r1 = 1
                goto L30
            L1f:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r3.b
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.put(r0, r2)
            L2e:
                r0 = 0
                r1 = r0
            L30:
                if (r1 == 0) goto L3d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.b
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.b
                r1.add(r0, r4)
                return r3
            L3d:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r3.b
                r0.add(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.Builder.setDataForContentValuesHashMap(java.util.HashMap):com.huawei.hms.common.data.DataHolder$Builder");
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f10290a = strArr;
            this.b = new ArrayList<>();
            this.c = str;
            this.d = new HashMap<>();
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1);
        }

        Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(BUILDER, i, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i, List list) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow = new CursorWindow((String) null);
        cursorWindow.setNumColumns(builder.f10290a.length);
        arrayList.add(cursorWindow);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                if (!cursorWindow.allocRow()) {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.f10290a.length);
                    if (!cursorWindow.allocRow()) {
                        HMSLog.e(TAG, "Failed to retry to allocate a row");
                        return arrayList;
                    }
                    arrayList.add(cursorWindow);
                }
                HashMap hashMap = (HashMap) list.get(i2);
                boolean z = true;
                for (int i3 = 0; i3 < builder.f10290a.length && (z = putValue(cursorWindow, hashMap.get(builder.f10290a[i3]), i2, i3)); i3++) {
                }
                if (!z) {
                    HMSLog.d(TAG, "fail to put data for row " + i2);
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow2 = new CursorWindow((String) null);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(builder.f10290a.length);
                    arrayList.add(cursorWindow2);
                    return arrayList;
                }
            } catch (RuntimeException e) {
                Iterator<CursorWindow> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                throw e;
            }
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i, int i2) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i < i2 && hMSCursorWrapper.moveToPosition(i)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i);
                hMSCursorWrapper.fillWindow(i, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i, int i2) throws IllegalArgumentException {
        if (obj == null) {
            return cursorWindow.putNull(i, i2);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i, i2);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i, i2);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i, i2);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i, i2);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.mClosed) {
            for (CursorWindow cursorWindow : this.cursorWindows) {
                cursorWindow.close();
            }
            this.mClosed = true;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] strArr = this.columns;
        int i = 0;
        if (strArr == null || strArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.columns;
            if (i2 >= strArr2.length) {
                break;
            }
            this.columnsBundle.putInt(strArr2[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr = this.cursorWindows;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        this.perCursorCounts = new int[cursorWindowArr.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.cursorWindows;
            if (i >= cursorWindowArr2.length) {
                this.dataCount = i3;
                return;
            } else {
                this.perCursorCounts[i] = i3;
                i3 = cursorWindowArr2[i].getStartPosition() + this.cursorWindows[i].getNumRows();
                i++;
            }
        }
    }

    public final void copyToBuffer(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i);
        this.cursorWindows[i2].copyStringToBuffer(i, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i, int i2, String str2) {
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i);
                return Float.valueOf(this.cursorWindows[i2].getFloat(i, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i);
                return Boolean.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i);
                return Integer.valueOf(this.cursorWindows[i2].getInt(i, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i);
                return Double.valueOf(this.cursorWindows[i2].getDouble(i, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i);
                return Long.valueOf(this.cursorWindows[i2].getLong(i, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i);
                return this.cursorWindows[i2].getString(i, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i);
                return this.cursorWindows[i2].getBlob(i, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i) {
        int[] iArr;
        int i2 = 0;
        Preconditions.checkArgument(i >= 0 || i < this.dataCount, "rowIndex is out of index:" + i);
        while (true) {
            iArr = this.perCursorCounts;
            if (i2 >= iArr.length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == iArr.length ? i2 - 1 : i2;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i, int i2) {
        checkAvailable(str, i);
        return this.cursorWindows[i2].getType(i, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    private void checkAvailable(String str, int i) {
        Bundle bundle = this.columnsBundle;
        String str2 = (bundle == null || !bundle.containsKey(str)) ? "cannot find column: " + str : isClosed() ? "buffer has been closed" : (i < 0 || i >= this.dataCount) ? "row is out of index:" + i : "";
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i2;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i, bundle);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.f10290a, getCursorWindows(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.f10290a, getCursorWindows(builder, -1), i, bundle);
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i) {
        if (builder.f10290a.length != 0) {
            if (i < 0 || i >= builder.b.size()) {
                i = builder.b.size();
            }
            ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder, i, builder.b.subList(0, i));
            return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
        }
        return new CursorWindow[0];
    }
}
