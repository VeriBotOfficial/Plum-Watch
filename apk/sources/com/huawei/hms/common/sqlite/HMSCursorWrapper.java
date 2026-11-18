package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractWindowedCursor f10316a;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor == null) {
            throw new IllegalArgumentException("cursor cannot be null");
        }
        if (!(cursor instanceof CursorWrapper)) {
            throw new IllegalArgumentException("cursor:" + cursor + " is not a subclass for CursorWrapper");
        }
        Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
        if (wrappedCursor == null) {
            throw new IllegalArgumentException("getWrappedCursor cannot be null");
        }
        if (!(wrappedCursor instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException("getWrappedCursor:" + wrappedCursor + " is not a subclass for CursorWrapper");
        }
        this.f10316a = (AbstractWindowedCursor) wrappedCursor;
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int r2, CursorWindow cursorWindow) {
        this.f10316a.fillWindow(r2, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f10316a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f10316a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int r2, int r3) {
        return this.f10316a.onMove(r2, r3);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.f10316a.setWindow(cursorWindow);
    }
}
