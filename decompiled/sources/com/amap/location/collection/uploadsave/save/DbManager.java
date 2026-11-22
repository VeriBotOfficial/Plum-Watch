package com.amap.location.collection.uploadsave.save;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amap.location.collection.uploadsave.upload.UploadData;
import com.amap.location.support.log.ALLog;
import com.xmly.businesssdk.network.NetworkConfig;
import kotlin.time.DurationKt;

/* loaded from: classes11.dex */
public class DbManager {
    private static final String CREATE_COLLECTION_TABLE_SQL = "CREATE TABLE IF NOT EXISTS base (id INTEGER PRIMARY KEY AUTOINCREMENT , type SMALLINT, data BLOB, size INTEGER, time INTEGER);";
    private static final String DATABASE_NAME = "aloccoll.db";
    private static final int DATABASE_VERSION = 4;
    private static final int DELETE_OLD_DATA_SIZE = 204800;
    private static final int MAX_DATABASE_SIZE = 10485760;
    private static final String[] QUERY_COLUMNS = {"id", "type", "data", "size"};
    private static final String TABLE_COLLECTION = "base";
    private static final String TAG = "DbManager";
    private MySQLiteDBHelper mDbHelper;
    private long mTotalLocatorDataSize = getDataSize(true);
    private long mTotalOthersDataSize = getDataSize(false);

    private static class MySQLiteDBHelper extends SQLiteOpenHelper {
        MySQLiteDBHelper(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(DbManager.CREATE_COLLECTION_TABLE_SQL);
            } catch (Exception e) {
                ALLog.d(e);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS base");
                onCreate(sQLiteDatabase);
            } catch (Exception e) {
                ALLog.d(e);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS base");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS byte_base");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS extend");
                onCreate(sQLiteDatabase);
            } catch (Exception e) {
                ALLog.d(e);
            }
        }
    }

    public DbManager(Context context) {
        this.mDbHelper = new MySQLiteDBHelper(context, DATABASE_NAME, 4);
    }

    private long deleteData(boolean z, long j) {
        Throwable th;
        Cursor cursor;
        String str = z ? "type=0" : "type!=0";
        long j2 = -2147483648L;
        long j3 = 0;
        while (true) {
            if (j3 >= j) {
                break;
            }
            try {
                cursor = this.mDbHelper.getReadableDatabase().query("base", new String[]{"id", "type", "size"}, "id>? AND " + str, new String[]{String.valueOf(j2)}, null, null, "id ASC", "100");
                try {
                    boolean moveToNext = cursor.moveToNext();
                    if (moveToNext) {
                        while (moveToNext) {
                            j2 = cursor.getLong(0);
                            j3 += cursor.getInt(2);
                            if (j3 >= j) {
                                break;
                            }
                            moveToNext = cursor.moveToNext();
                        }
                        try {
                            cursor.close();
                        } catch (Throwable th2) {
                            ALLog.d(th2);
                        }
                    } else {
                        try {
                            cursor.close();
                            break;
                        } catch (Throwable th3) {
                            ALLog.d(th3);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cursor == null) {
                        throw th;
                    }
                    try {
                        cursor.close();
                        throw th;
                    } catch (Throwable th5) {
                        ALLog.d(th5);
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                cursor = null;
            }
        }
        if (j3 > 0 && this.mDbHelper.getWritableDatabase().delete("base", "id<=? AND ".concat(str), new String[]{String.valueOf(j2)}) > 0) {
            if (z) {
                long j4 = this.mTotalLocatorDataSize - j3;
                this.mTotalLocatorDataSize = j4;
                if (j4 < 0) {
                    this.mTotalLocatorDataSize = 0L;
                }
            } else {
                long j5 = this.mTotalOthersDataSize - j3;
                this.mTotalOthersDataSize = j5;
                if (j5 < 0) {
                    this.mTotalOthersDataSize = 0L;
                }
            }
        }
        return j3;
    }

    private long getDataSize(boolean z) {
        Cursor cursor = null;
        try {
            try {
                try {
                    cursor = this.mDbHelper.getReadableDatabase().query("base", new String[]{"SUM(size)"}, z ? "type=?" : "type!=?", new String[]{String.valueOf(0)}, null, null, null);
                    long j = cursor.moveToFirst() ? cursor.getLong(0) : 0L;
                    cursor.close();
                    return j;
                } catch (Exception e) {
                    ALLog.d(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return 0L;
                }
            } catch (Throwable th) {
                ALLog.d(th);
                return 0L;
            }
        } catch (Throwable th2) {
            if (cursor == null) {
                throw th2;
            }
            try {
                cursor.close();
                throw th2;
            } catch (Throwable th3) {
                ALLog.d(th3);
                throw th2;
            }
        }
    }

    void close() {
        try {
            MySQLiteDBHelper mySQLiteDBHelper = this.mDbHelper;
            if (mySQLiteDBHelper != null) {
                mySQLiteDBHelper.close();
                this.mDbHelper = null;
            }
        } catch (Exception e) {
            ALLog.d(e);
        }
    }

    boolean delete(UploadData uploadData) {
        if (uploadData == null || uploadData.mDataList.size() == 0) {
            return true;
        }
        try {
            boolean z = uploadData.mDataList.get(0).getType() == 0;
            if (this.mDbHelper.getWritableDatabase().delete("base", z ? "type=0 AND id<=?" : "type!=0 AND id<=?", new String[]{String.valueOf(uploadData.mMaxId)}) > 0) {
                if (z) {
                    long j = this.mTotalLocatorDataSize - uploadData.mTotalSize;
                    this.mTotalLocatorDataSize = j;
                    if (j < 0) {
                        this.mTotalLocatorDataSize = 0L;
                    }
                } else {
                    long j2 = this.mTotalOthersDataSize - uploadData.mTotalSize;
                    this.mTotalOthersDataSize = j2;
                    if (j2 < 0) {
                        this.mTotalOthersDataSize = 0L;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            ALLog.w(TAG, "delete failed", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00a8 -> B:38:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amap.location.collection.uploadsave.upload.UploadData get(boolean r12, int r13, long r14) {
        /*
            r11 = this;
            com.amap.location.collection.uploadsave.upload.UploadData r0 = new com.amap.location.collection.uploadsave.upload.UploadData
            r0.<init>()
            if (r12 == 0) goto La
            java.lang.String r1 = "type=0"
            goto Lc
        La:
            java.lang.String r1 = "type!=0"
        Lc:
            r5 = r1
            r1 = 0
            com.amap.location.collection.uploadsave.save.DbManager$MySQLiteDBHelper r2 = r11.mDbHelper     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            java.lang.String r3 = "base"
            java.lang.String[] r4 = com.amap.location.collection.uploadsave.save.DbManager.QUERY_COLUMNS     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            java.lang.String r9 = "id ASC"
            java.lang.String r10 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9b
            r3 = 0
            r4 = r3
        L27:
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            if (r5 == 0) goto L64
            r5 = 3
            int r5 = r2.getInt(r5)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r6 = r0.mTotalSize     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            long r7 = (long) r6     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 >= 0) goto L64
            int r6 = r6 + r5
            long r6 = (long) r6     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 > 0) goto L64
            if (r4 < r13) goto L42
            goto L64
        L42:
            long r6 = r2.getLong(r3)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            r0.mMaxId = r6     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.util.List<com.amap.location.collection.uploadsave.save.CollectDataItem> r6 = r0.mDataList     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            com.amap.location.collection.uploadsave.save.CollectDataItem r7 = new com.amap.location.collection.uploadsave.save.CollectDataItem     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            r8 = 1
            int r8 = r2.getInt(r8)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            r9 = 2
            byte[] r9 = r2.getBlob(r9)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            r7.<init>(r8, r9)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            r6.add(r7)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r6 = r0.mTotalSize     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r6 = r6 + r5
            r0.mTotalSize = r6     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r4 = r4 + 1
            goto L27
        L64:
            java.lang.String r13 = "DbManager"
            java.util.Locale r14 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.String r15 = "get col content： %b, %d，%d，%d"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            long r5 = r0.mMaxId     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r5 = r0.mTotalSize     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r3, r4, r5}     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            java.lang.String r12 = java.lang.String.format(r14, r15, r12)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            com.amap.location.support.log.ALLog.i(r13, r12)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            int r12 = r0.mTotalSize     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lad
            if (r12 != 0) goto L90
            goto L91
        L90:
            r1 = r0
        L91:
            r2.close()     // Catch: java.lang.Throwable -> La7
            return r1
        L95:
            r0 = move-exception
            r12 = r0
            goto L9e
        L98:
            r0 = move-exception
            r12 = r0
            goto Lb0
        L9b:
            r0 = move-exception
            r12 = r0
            r2 = r1
        L9e:
            com.amap.location.support.log.ALLog.d(r12)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto Lac
            r2.close()     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            r12 = r0
            com.amap.location.support.log.ALLog.d(r12)
        Lac:
            return r1
        Lad:
            r0 = move-exception
            r12 = r0
            r1 = r2
        Lb0:
            if (r1 == 0) goto Lbb
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lbb
        Lb6:
            r0 = move-exception
            r13 = r0
            com.amap.location.support.log.ALLog.d(r13)
        Lbb:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.location.collection.uploadsave.save.DbManager.get(boolean, int, long):com.amap.location.collection.uploadsave.upload.UploadData");
    }

    int getTotalLocatorDataSize() {
        return (int) this.mTotalLocatorDataSize;
    }

    int getTotalOthersDataSize() {
        return (int) this.mTotalOthersDataSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void insert(java.util.List<com.amap.location.collection.uploadsave.save.CollectDataItem> r15) {
        /*
            r14 = this;
            r0 = 0
            com.amap.location.collection.uploadsave.save.DbManager$MySQLiteDBHelper r1 = r14.mDbHelper     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb4
            r1.beginTransaction()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r2 = "INSERT INTO base(type,data,size,time) VALUES(?,?,?,?)"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r2)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.util.Iterator r4 = r15.iterator()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r5 = 0
            r7 = 0
            r9 = r7
            r7 = r5
        L1d:
            boolean r10 = r4.hasNext()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            if (r10 == 0) goto L55
            java.lang.Object r10 = r4.next()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            com.amap.location.collection.uploadsave.save.CollectDataItem r10 = (com.amap.location.collection.uploadsave.save.CollectDataItem) r10     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            int r11 = r10.getType()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r11 = (long) r11     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r13 = 1
            r0.bindLong(r13, r11)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            byte[] r11 = r10.getData()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r12 = 2
            r0.bindBlob(r12, r11)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r11 = r10.getDataSize()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r13 = 3
            r0.bindLong(r13, r11)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r13 = 4
            r0.bindLong(r13, r2)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r0.executeInsert()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            int r10 = r10.getType()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            if (r10 != 0) goto L53
            long r5 = r5 + r11
            int r9 = r9 + 1
            goto L1d
        L53:
            long r7 = r7 + r11
            goto L1d
        L55:
            r1.setTransactionSuccessful()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r10 = r14.mTotalLocatorDataSize     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r10 = r10 + r5
            r14.mTotalLocatorDataSize = r10     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r10 = r14.mTotalOthersDataSize     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            long r10 = r10 + r7
            r14.mTotalOthersDataSize = r10     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r4 = "DbManager"
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            r11.<init>()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r12 = "insert t:"
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.StringBuilder r2 = r11.append(r2)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r3 = "; net count:%d，%d; other: %d，%d"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            int r3 = r15.size()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            int r15 = r15.size()     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            int r15 = r15 - r9
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.Object[] r15 = new java.lang.Object[]{r3, r5, r6, r7, r15}     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            java.lang.String r15 = java.lang.String.format(r10, r2, r15)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            com.amap.location.support.log.ALLog.i(r4, r15)     // Catch: java.lang.Exception -> Laf java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lc0
            r0.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lc0
        Laf:
            r15 = move-exception
            goto Lb6
        Lb1:
            r15 = move-exception
            r1 = r0
            goto Lc5
        Lb4:
            r15 = move-exception
            r1 = r0
        Lb6:
            com.amap.location.support.log.ALLog.d(r15)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lbe
            r0.close()     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            if (r1 == 0) goto Lc3
        Lc0:
            r1.endTransaction()     // Catch: java.lang.Exception -> Lc3
        Lc3:
            return
        Lc4:
            r15 = move-exception
        Lc5:
            if (r0 == 0) goto Lca
            r0.close()     // Catch: java.lang.Throwable -> Lca
        Lca:
            if (r1 == 0) goto Lcf
            r1.endTransaction()     // Catch: java.lang.Exception -> Lcf
        Lcf:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.location.collection.uploadsave.save.DbManager.insert(java.util.List):void");
    }

    boolean prepareStorageForDataSize(long j) {
        if (j < DurationKt.MAX_MILLIS && this.mTotalLocatorDataSize + this.mTotalOthersDataSize + j < NetworkConfig.Cache.SIZE) {
            return true;
        }
        long max = Math.max(204800L, j);
        try {
            long deleteData = deleteData(false, max);
            if (deleteData < max) {
                deleteData(true, max - deleteData);
            }
            return true;
        } catch (Exception e) {
            ALLog.d(e);
            return false;
        }
    }
}
