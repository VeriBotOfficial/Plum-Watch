package com.yandex.div.state.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.gov.nist.core.Separators;
import com.yandex.div.internal.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: DivStateDaoImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\u00020\b*\u00020\u001aH\u0002J\u0014\u0010\u001b\u001a\n \u001c*\u0004\u0018\u00010\f0\f*\u00020\u001aH\u0002J\u0014\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\f0\f*\u00020\u001aH\u0002J\u000e\u0010\u001e\u001a\u0004\u0018\u00010\f*\u00020\u001aH\u0002J\u001a\u0010\u001f\u001a\u00020\b*\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0!H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yandex/div/state/db/DivStateDaoImpl;", "Lcom/yandex/div/state/db/DivStateDao;", "writableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "upsertStatement", "Landroid/database/sqlite/SQLiteStatement;", "deleteAll", "", "deleteAllExcept", "cardIds", "", "", "deleteByCardId", "cardId", "deleteCardRootState", "deleteModifiedBefore", "timestamp", "", "getRootStateId", "getStates", "Lcom/yandex/div/state/db/PathToState;", "updateState", "state", "Lcom/yandex/div/state/db/DivStateEntity;", "applyAndClose", "Landroid/database/Cursor;", "getPath", "kotlin.jvm.PlatformType", "getStateId", "getStateIdOrNull", "inTransaction", "block", "Lkotlin/Function0;", "div-states_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivStateDaoImpl implements DivStateDao {
    private final SQLiteStatement upsertStatement;
    private final SQLiteDatabase writableDatabase;

    public DivStateDaoImpl(SQLiteDatabase writableDatabase) {
        Intrinsics.checkNotNullParameter(writableDatabase, "writableDatabase");
        this.writableDatabase = writableDatabase;
        if (writableDatabase.isReadOnly()) {
            Assert.fail(getClass().getName() + " require writable database!");
        }
        SQLiteStatement compileStatement = writableDatabase.compileStatement(StateSchema.SQL_UPSERT_QUERY_TEMPLATE);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "writableDatabase.compile…QL_UPSERT_QUERY_TEMPLATE)");
        this.upsertStatement = compileStatement;
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public List<PathToState> getStates(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final ArrayList arrayList = new ArrayList();
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$getStates$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                String path;
                String stateId;
                sQLiteDatabase = DivStateDaoImpl.this.writableDatabase;
                Cursor cursor = sQLiteDatabase.rawQuery(StateSchema.SQL_GET_STATES_QUERY_TEMPLATE, new String[]{cardId});
                Cursor cursor2 = cursor;
                List<PathToState> list = arrayList;
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                try {
                    Cursor cursor3 = cursor2;
                    while (cursor.moveToNext()) {
                        Intrinsics.checkNotNullExpressionValue(cursor, "cursor");
                        path = divStateDaoImpl.getPath(cursor);
                        Intrinsics.checkNotNullExpressionValue(path, "cursor.getPath()");
                        stateId = divStateDaoImpl.getStateId(cursor);
                        Intrinsics.checkNotNullExpressionValue(stateId, "cursor.getStateId()");
                        list.add(new PathToState(path, stateId));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor2, null);
                } finally {
                }
            }
        });
        return arrayList;
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void updateState(final DivStateEntity state) {
        Intrinsics.checkNotNullParameter(state, "state");
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$updateState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteStatement sQLiteStatement;
                SQLiteStatement sQLiteStatement2;
                SQLiteStatement sQLiteStatement3;
                SQLiteStatement sQLiteStatement4;
                SQLiteStatement sQLiteStatement5;
                SQLiteStatement sQLiteStatement6;
                sQLiteStatement = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement.bindString(1, state.getCardId());
                sQLiteStatement2 = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement2.bindString(2, state.getPath());
                sQLiteStatement3 = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement3.bindString(3, state.getStateId());
                sQLiteStatement4 = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement4.bindString(4, String.valueOf(state.getModificationTime()));
                sQLiteStatement5 = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement5.execute();
                sQLiteStatement6 = DivStateDaoImpl.this.upsertStatement;
                sQLiteStatement6.clearBindings();
            }
        });
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void deleteAll() {
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteAll$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                sQLiteDatabase = DivStateDaoImpl.this.writableDatabase;
                sQLiteDatabase.rawQuery(StateSchema.SQL_DELETE_ALL_QUERY, new String[0]).close();
            }
        });
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void deleteByCardId(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteByCardId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                sQLiteDatabase = divStateDaoImpl.writableDatabase;
                Cursor rawQuery = sQLiteDatabase.rawQuery(StateSchema.SQL_DELETE_BY_CARD_ID_QUERY_TEMPLATE, new String[]{cardId});
                Intrinsics.checkNotNullExpressionValue(rawQuery, "writableDatabase.rawQuer…yOf(cardId)\n            )");
                divStateDaoImpl.applyAndClose(rawQuery);
            }
        });
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void deleteAllExcept(final List<String> cardIds) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteAllExcept$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                int size = cardIds.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = Separators.QUESTION;
                }
                String joinToString$default = ArraysKt.joinToString$default(strArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                DivStateDaoImpl divStateDaoImpl = this;
                sQLiteDatabase = divStateDaoImpl.writableDatabase;
                String format = String.format(StateSchema.SQL_DELETE_ALL_EXCEPT_CARD_ID_QUERY_TEMPLATE, Arrays.copyOf(new Object[]{joinToString$default}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                Cursor rawQuery = sQLiteDatabase.rawQuery(format, (String[]) cardIds.toArray(new String[0]));
                Intrinsics.checkNotNullExpressionValue(rawQuery, "writableDatabase.rawQuer…  cardIds.toTypedArray())");
                divStateDaoImpl.applyAndClose(rawQuery);
            }
        });
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void deleteModifiedBefore(final long timestamp) {
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteModifiedBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                sQLiteDatabase = divStateDaoImpl.writableDatabase;
                Cursor rawQuery = sQLiteDatabase.rawQuery(StateSchema.SQL_DELETE_ALL_MODIFIED_BEFORE_QUERY_TEMPLATE, new String[]{String.valueOf(timestamp)});
                Intrinsics.checkNotNullExpressionValue(rawQuery, "writableDatabase.rawQuer…toString())\n            )");
                divStateDaoImpl.applyAndClose(rawQuery);
            }
        });
    }

    @Override // com.yandex.div.state.db.DivStateDao
    public void deleteCardRootState(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$deleteCardRootState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                sQLiteDatabase = divStateDaoImpl.writableDatabase;
                Cursor rawQuery = sQLiteDatabase.rawQuery(StateSchema.SQL_DELETE_CARD_ROOT_STATE_QUERY_TEMPLATE, new String[]{cardId});
                Intrinsics.checkNotNullExpressionValue(rawQuery, "writableDatabase.rawQuer…yOf(cardId)\n            )");
                divStateDaoImpl.applyAndClose(rawQuery);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.state.db.DivStateDao
    public String getRootStateId(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        inTransaction(this.writableDatabase, new Function0<Unit>() { // from class: com.yandex.div.state.db.DivStateDaoImpl$getRootStateId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SQLiteDatabase sQLiteDatabase;
                ?? stateIdOrNull;
                sQLiteDatabase = DivStateDaoImpl.this.writableDatabase;
                Cursor cursor = sQLiteDatabase.rawQuery(StateSchema.SQL_GET_ROOT_STATE_ID_QUERY_TEMPLATE, new String[]{cardId});
                Cursor cursor2 = cursor;
                Ref.ObjectRef<String> objectRef2 = objectRef;
                DivStateDaoImpl divStateDaoImpl = DivStateDaoImpl.this;
                try {
                    Cursor cursor3 = cursor2;
                    if (cursor.moveToNext()) {
                        Intrinsics.checkNotNullExpressionValue(cursor, "cursor");
                        stateIdOrNull = divStateDaoImpl.getStateIdOrNull(cursor);
                        objectRef2.element = stateIdOrNull;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor2, null);
                } finally {
                }
            }
        });
        return (String) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPath(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("path"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStateId(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(StateEntry.COLUMN_STATE_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStateIdOrNull(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(StateEntry.COLUMN_STATE_ID);
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        return cursor.getString(columnIndexOrThrow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyAndClose(Cursor cursor) {
        cursor.moveToLast();
        cursor.close();
    }

    private final void inTransaction(SQLiteDatabase sQLiteDatabase, Function0<Unit> function0) {
        sQLiteDatabase.beginTransaction();
        try {
            function0.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
