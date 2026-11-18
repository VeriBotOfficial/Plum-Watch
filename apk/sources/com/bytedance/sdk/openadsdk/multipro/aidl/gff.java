package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.video.AudioStats;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class gff implements Cursor {
    Map<String, List<String>> fxn;
    int gff = 0;
    String[] kg;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int r1, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getType(int r1) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public gff(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.fxn = new HashMap();
            return;
        }
        this.fxn = map;
        try {
            this.kg = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.kg;
            if (strArr != null && strArr.length != 0) {
                return this.fxn.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.gff;
    }

    @Override // android.database.Cursor
    public boolean move(int r3) {
        if (this.gff + r3 >= getCount()) {
            return false;
        }
        this.gff += r3;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int r2) {
        if (r2 >= getCount()) {
            return false;
        }
        this.gff = r2;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.gff = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.gff = this.fxn.get(this.kg[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.gff + 1 >= getCount()) {
            return false;
        }
        this.gff++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int r0 = this.gff;
        if (r0 - 1 < 0) {
            return false;
        }
        this.gff = r0 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.gff == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.gff == getCount() - 1;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.kg;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int r1 = 0;
        while (true) {
            String[] strArr2 = this.kg;
            if (r1 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[r1])) {
                return r1;
            }
            r1++;
        }
    }

    @Override // android.database.Cursor
    public String getColumnName(int r3) {
        if (r3 >= 0) {
            String[] strArr = this.kg;
            if (r3 < strArr.length) {
                return strArr[r3];
            }
            return "";
        }
        return "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.kg;
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.kg;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int r1) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public String getString(int r3) {
        if (r3 < 0 || r3 >= getColumnCount()) {
            return "";
        }
        return this.fxn.get(this.kg[r3]).get(getPosition());
    }

    @Override // android.database.Cursor
    public short getShort(int r1) {
        try {
            return Short.parseShort(getString(r1));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int r1) {
        try {
            return Integer.parseInt(getString(r1));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int r3) {
        try {
            return Long.parseLong(getString(r3));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public float getFloat(int r1) {
        try {
            return Float.parseFloat(getString(r1));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int r3) {
        try {
            return Double.parseDouble(getString(r3));
        } catch (Exception unused) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    @Override // android.database.Cursor
    public boolean isNull(int r1) {
        return getString(r1) == null;
    }
}
