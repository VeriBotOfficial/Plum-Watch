package io.agora.utils2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.text.TextUtils;
import io.agora.utils2.internal.Logging;
import java.io.File;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes6.dex */
class SqliteWrapper {
    private static final String TAG = "SQLITE";
    private final Object lock = new Object();
    private SQLiteDatabase db = null;

    static class StorageItem {
        long actualSize;
        byte[] data;
        long expired;
        String key;

        public StorageItem() {
            this.key = null;
            this.data = null;
            this.actualSize = 0L;
            this.expired = 0L;
        }

        public StorageItem(String key, byte[] data, long size, long exp) {
            this.key = key;
            this.data = data;
            this.actualSize = size;
            this.expired = exp;
        }

        public long getActualSize() {
            return this.actualSize;
        }

        public byte[] getData() {
            return this.data;
        }

        public long getExpired() {
            return this.expired;
        }

        public String getKey() {
            return this.key;
        }
    }

    private boolean executeCommandOnPath(String path, String cmd) {
        if (!isDatabaseValid() || !isPathValid(path)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    this.db.execSQL(cmd);
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    private boolean isDatabaseValid() {
        SQLiteDatabase sQLiteDatabase = this.db;
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.db.isReadOnly()) ? false : true;
    }

    private boolean isPathValid(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        for (int i = 0; i < path.length(); i++) {
            char charAt = path.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'' || charAt == ';') {
                return false;
            }
        }
        return !path.toLowerCase().contains("sqlite_master");
    }

    public void close() {
        if (isDatabaseValid()) {
            synchronized (this.lock) {
                this.db.close();
                this.db = null;
            }
        }
    }

    boolean delete(String path, String key) {
        if (!isDatabaseValid() || !isPathValid(path) || !isPathValid(key)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                this.db.execSQL("delete from \"" + path + "\" where key = \"" + key + "\";");
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public void dispose() {
        synchronized (this.lock) {
            SQLiteDatabase sQLiteDatabase = this.db;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.db.close();
            }
            this.db = null;
        }
    }

    boolean drop(String path) {
        return executeCommandOnPath(path, "drop table if exists \"" + path + "\";");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        io.agora.utils2.internal.Logging.w(io.agora.utils2.SqliteWrapper.TAG, "cursor close exception");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x005a, TryCatch #3 {, blocks: (B:10:0x0015, B:25:0x0021, B:13:0x002b, B:21:0x0069, B:16:0x0076, B:17:0x0078, B:23:0x006d, B:28:0x002f, B:30:0x0035, B:33:0x003c, B:35:0x0041, B:37:0x004e, B:42:0x005d), top: B:9:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String[] findAllTableNames() {
        /*
            r8 = this;
            boolean r0 = r8.isDatabaseValid()
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = "SQLITE"
            java.lang.String r2 = "database is invalid"
            io.agora.utils2.internal.Logging.w(r0, r2)
            java.lang.String[] r0 = new java.lang.String[r1]
            return r0
        L11:
            java.lang.Object r0 = r8.lock
            monitor-enter(r0)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r8.db     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r4 = "select DISTINCT tbl_name from sqlite_master;"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            android.database.Cursor r3 = r3.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            if (r3 == 0) goto L51
            int r4 = r3.getCount()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            if (r4 != 0) goto L2f
            java.lang.String r4 = "SQLITE"
            java.lang.String r5 = "findAllTableNames table count is zero"
        L2b:
            io.agora.utils2.internal.Logging.w(r4, r5)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            goto L67
        L2f:
            boolean r5 = r3.isClosed()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            if (r5 != 0) goto L67
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            if (r5 != 0) goto L3c
            goto L67
        L3c:
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            r5 = r1
        L3f:
            if (r5 >= r4) goto L67
            java.lang.String r6 = r3.getString(r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            r2[r5] = r6     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L5a
            if (r6 != 0) goto L4e
            goto L67
        L4e:
            int r5 = r5 + 1
            goto L3f
        L51:
            java.lang.String r4 = "SQLITE"
            java.lang.String r5 = "findAllTableNames cursor is null"
            goto L2b
        L56:
            r7 = r3
            r3 = r2
            r2 = r7
            goto L5d
        L5a:
            r1 = move-exception
            goto L7a
        L5c:
            r3 = r2
        L5d:
            java.lang.String r4 = "SQLITE"
            java.lang.String r5 = "findAllTableNames exception"
            io.agora.utils2.internal.Logging.w(r4, r5)     // Catch: java.lang.Throwable -> L5a
            r7 = r3
            r3 = r2
            r2 = r7
        L67:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L6d
            goto L74
        L6d:
            java.lang.String r3 = "SQLITE"
            java.lang.String r4 = "cursor close exception"
            io.agora.utils2.internal.Logging.w(r3, r4)     // Catch: java.lang.Throwable -> L5a
        L74:
            if (r2 != 0) goto L78
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L5a
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return r2
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.findAllTableNames():java.lang.String[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[Catch: all -> 0x00a8, TryCatch #3 {, blocks: (B:18:0x003f, B:61:0x004b, B:64:0x0054, B:23:0x0060, B:38:0x00b4, B:28:0x00c3, B:31:0x00c7, B:32:0x00cc, B:34:0x00ce, B:35:0x00d3, B:40:0x00b8, B:41:0x006c, B:43:0x007a, B:45:0x0080, B:48:0x0087, B:50:0x008b, B:51:0x0094, B:55:0x009d), top: B:17:0x003f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    io.agora.utils2.SqliteWrapper.StorageItem load(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.load(java.lang.String, java.lang.String, boolean):io.agora.utils2.SqliteWrapper$StorageItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        io.agora.utils2.internal.Logging.w(io.agora.utils2.SqliteWrapper.TAG, "cursor close exception");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[Catch: all -> 0x006a, TryCatch #2 {, blocks: (B:14:0x0020, B:27:0x002a, B:29:0x0030, B:32:0x0037, B:34:0x0040, B:37:0x0059, B:41:0x0057, B:23:0x0070, B:18:0x007d, B:19:0x007f, B:25:0x0074), top: B:13:0x0020, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    io.agora.utils2.SqliteWrapper.StorageItem[] loadWholeTable(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = r12.isDatabaseValid()
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String r13 = "SQLITE"
            java.lang.String r0 = "database is invalid"
        Lb:
            io.agora.utils2.internal.Logging.w(r13, r0)
            io.agora.utils2.SqliteWrapper$StorageItem[] r13 = new io.agora.utils2.SqliteWrapper.StorageItem[r1]
            return r13
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L1c
            java.lang.String r13 = "SQLITE"
            java.lang.String r0 = "cmd is invalid"
            goto Lb
        L1c:
            java.lang.Object r2 = r12.lock
            monitor-enter(r2)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.db     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            android.database.Cursor r13 = r3.rawQuery(r13, r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            if (r13 == 0) goto L6e
            boolean r3 = r13.isClosed()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r3 != 0) goto L6e
            boolean r3 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r3 != 0) goto L37
            goto L6e
        L37:
            int r3 = r13.getCount()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            io.agora.utils2.SqliteWrapper$StorageItem[] r0 = new io.agora.utils2.SqliteWrapper.StorageItem[r3]     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r4 = r1
        L3e:
            if (r4 >= r3) goto L6e
            java.lang.String r6 = r13.getString(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r5 = 1
            byte[] r7 = r13.getBlob(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r5 = 2
            long r10 = r13.getLong(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            int r5 = r7.length     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r8 = 524288(0x80000, float:7.34684E-40)
            if (r5 <= r8) goto L57
            r8 = 524288(0x80000, double:2.590327E-318)
            goto L59
        L57:
            int r5 = r7.length     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            long r8 = (long) r5     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
        L59:
            io.agora.utils2.SqliteWrapper$StorageItem r5 = new io.agora.utils2.SqliteWrapper$StorageItem     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r0[r4] = r5     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            boolean r5 = r13.moveToNext()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            if (r5 != 0) goto L67
            goto L6e
        L67:
            int r4 = r4 + 1
            goto L3e
        L6a:
            r0 = move-exception
            r13 = r0
            goto L81
        L6d:
            r13 = r0
        L6e:
            if (r13 == 0) goto L7b
            r13.close()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L74
            goto L7b
        L74:
            java.lang.String r13 = "SQLITE"
            java.lang.String r3 = "cursor close exception"
            io.agora.utils2.internal.Logging.w(r13, r3)     // Catch: java.lang.Throwable -> L6a
        L7b:
            if (r0 != 0) goto L7f
            io.agora.utils2.SqliteWrapper$StorageItem[] r0 = new io.agora.utils2.SqliteWrapper.StorageItem[r1]     // Catch: java.lang.Throwable -> L6a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            return r0
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.SqliteWrapper.loadWholeTable(java.lang.String):io.agora.utils2.SqliteWrapper$StorageItem[]");
    }

    public boolean open(String path) {
        SQLiteDatabase openDatabase;
        if (!isPathValid(path)) {
            return false;
        }
        synchronized (this.lock) {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        SQLiteDatabase.OpenParams.Builder builder = new SQLiteDatabase.OpenParams.Builder();
                        builder.setOpenFlags(268435456);
                        builder.setJournalMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                        openDatabase = SQLiteDatabase.openDatabase(new File(path), builder.build());
                    } else {
                        openDatabase = SQLiteDatabase.openDatabase(path, null, 268435456);
                    }
                    this.db = openDatabase;
                    try {
                        this.db.execSQL("PRAGMA TEMP_STORE = MEMORY;");
                        this.db.execSQL("PRAGMA SYNCHRONOUS = OFF;");
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (this.db.isOpen()) {
                            this.db.close();
                        }
                        this.db = null;
                        Logging.d(TAG, "Can not open database: " + path);
                        return false;
                    }
                } catch (Exception unused) {
                    SQLiteDatabase sQLiteDatabase = this.db;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        this.db.close();
                    }
                    this.db = null;
                    Logging.d(TAG, "Can not open database: " + path);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    long save(String path, String key, byte[] buffer, long expired) {
        SQLiteStatement sQLiteStatement;
        long j = 0;
        if (!isPathValid(path) || !isPathValid(key) || buffer == null || buffer.length == 0 || buffer.length >= 524288 || !touch(path)) {
            return 0L;
        }
        synchronized (this.lock) {
            String str = "replace into \"" + path + "\" (key, value, expired) values (\"" + key + "\", ?, " + expired + ");";
            this.db.beginTransaction();
            try {
                sQLiteStatement = this.db.compileStatement(str);
                try {
                    sQLiteStatement.bindBlob(1, buffer);
                    sQLiteStatement.execute();
                    j = buffer.length;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                sQLiteStatement = null;
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        }
        return j;
    }

    boolean touch(String path) {
        return executeCommandOnPath(path, "create table if not exists \"" + path + "\" (key text primary key, value text, expired INTEGER);");
    }
}
