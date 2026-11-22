package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.o0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    return;
                }
                try {
                    if (DatabaseHelper.this.database.isOpen()) {
                        try {
                            DatabaseHelper.this.database.beginTransaction();
                            DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                            DatabaseHelper.this.database.setTransactionSuccessful();
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                            try {
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th) {
                                o0.b(IDatabaseHelper.TAG, th.getMessage());
                            }
                        }
                    }
                } finally {
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th2) {
                        o0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
            /* JADX WARN: Type inference failed for: r0v6 */
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor;
                IDatabaseHelper.IDatabaseListener iDatabaseListener2;
                ?? r0 = " WHERE download_id = ? AND director_path = ?";
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                DownloadModel downloadModel = null;
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        if (DatabaseHelper.this.database.isOpen()) {
                            try {
                                cursor = DatabaseHelper.this.database.rawQuery("SELECT * FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ? AND director_path = ?", new String[]{str, str2});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            downloadModel = DownloadModel.create(cursor);
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        iDatabaseListener2 = iDatabaseListener;
                                        if (iDatabaseListener2 == null) {
                                            return;
                                        }
                                        iDatabaseListener2.onDatabase(downloadModel);
                                        return;
                                    }
                                }
                                if (cursor != null) {
                                    cursor.close();
                                }
                                iDatabaseListener2 = iDatabaseListener;
                                if (iDatabaseListener2 == null) {
                                    return;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                cursor = null;
                            } catch (Throwable th) {
                                th = th;
                                r0 = 0;
                                if (r0 != 0) {
                                    r0.close();
                                }
                                IDatabaseHelper.IDatabaseListener iDatabaseListener3 = iDatabaseListener;
                                if (iDatabaseListener3 != null) {
                                    iDatabaseListener3.onDatabase(null);
                                }
                                throw th;
                            }
                            iDatabaseListener2.onDatabase(downloadModel);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (Objects.isNotNull(iDatabaseListener)) {
                    iDatabaseListener.onDatabase(null);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursor = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursor));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                        return arrayList;
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } catch (Throwable unused) {
            if (cursor != null) {
                cursor.close();
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r6 = this;
                    java.lang.String r0 = " WHERE download_url = ?"
                    java.lang.String r1 = "SELECT * FROM "
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    if (r2 == 0) goto L1d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r2)
                    android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r2, r3)
                L1d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    r3 = 0
                    if (r2 != 0) goto La2
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L38
                    goto La2
                L38:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r2 = 1
                    java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r4 = r3     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r5 = 0
                    r2[r5] = r4     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    if (r0 == 0) goto L71
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
                    if (r1 == 0) goto L71
                    com.mbridge.msdk.foundation.download.database.DownloadModel r1 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
                    r3 = r1
                    goto L71
                L6f:
                    r1 = move-exception
                    goto L80
                L71:
                    if (r0 == 0) goto L76
                    r0.close()
                L76:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Laf
                    goto L90
                L7b:
                    r1 = move-exception
                    r0 = r3
                    goto L95
                L7e:
                    r1 = move-exception
                    r0 = r3
                L80:
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L94
                    if (r2 == 0) goto L87
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L94
                L87:
                    if (r0 == 0) goto L8c
                    r0.close()
                L8c:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Laf
                L90:
                    r0.onDatabase(r3)
                    goto Laf
                L94:
                    r1 = move-exception
                L95:
                    if (r0 == 0) goto L9a
                    r0.close()
                L9a:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto La1
                    r0.onDatabase(r3)
                La1:
                    throw r1
                La2:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Laf
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r3)
                Laf:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass2.run():void");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r3 != null) goto L26;
     */
    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.foundation.download.database.DownloadModel> getUnwantedModels(long r7) {
        /*
            r6 = this;
            java.lang.String r0 = " WHERE last_modified_time <= ?"
            java.lang.String r1 = "SELECT * FROM "
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r4 == 0) goto L1a
            com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r4 = r6.databaseOpenHelper     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r6.database = r4     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
        L1a:
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r4 != 0) goto L7a
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            boolean r4 = r4.isOpen()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r4 != 0) goto L2b
            goto L7a
        L2b:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            long r4 = r4 - r7
            android.database.sqlite.SQLiteDatabase r7 = r6.database     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r1 = r6.tableName     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r4 = 0
            r0[r4] = r1     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            android.database.Cursor r3 = r7.rawQuery(r8, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r3 == 0) goto L68
            boolean r7 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r7 == 0) goto L68
        L5b:
            com.mbridge.msdk.foundation.download.database.DownloadModel r7 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            boolean r7 = r3.moveToNext()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r7 != 0) goto L5b
        L68:
            if (r3 == 0) goto L7a
            goto L77
        L6b:
            r7 = move-exception
            goto L7b
        L6d:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L75
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L6b
        L75:
            if (r3 == 0) goto L7a
        L77:
            r3.close()
        L7a:
            return r2
        L7b:
            if (r3 == 0) goto L80
            r3.close()
        L80:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.getUnwantedModels(long):java.util.List");
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    try {
                        DatabaseHelper.this.database.beginTransaction();
                        DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                        DatabaseHelper.this.database.setTransactionSuccessful();
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                        try {
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        } catch (Throwable th) {
                            o0.b(IDatabaseHelper.TAG, th.getMessage());
                        }
                    }
                } finally {
                    try {
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    } catch (Throwable th2) {
                        o0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        boolean inTransaction;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor rawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (inTransaction) {
                            return rawQuery;
                        }
                    } catch (Throwable th) {
                    }
                    return rawQuery;
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                        return null;
                    }
                } catch (Throwable th2) {
                    if (MBridgeConstans.DEBUG) {
                        th2.printStackTrace();
                    }
                }
                return null;
            } finally {
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th3) {
                    if (MBridgeConstans.DEBUG) {
                        th3.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    th4.printStackTrace();
                }
            }
            return null;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ? AND director_path = ?", new Object[]{str, str2});
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                    DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = ?", new String[]{str});
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (Objects.isNull(DatabaseHelper.this.database) || !DatabaseHelper.this.database.isOpen()) {
                    return;
                }
                try {
                    DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ?", new Object[]{str});
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
