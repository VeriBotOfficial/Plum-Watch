package com.wakeup.module.data;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.module.data.dao.EventDataDao;
import com.wakeup.module.data.dao.HealthDataDao;
import com.wakeup.module.data.dao.SportDataDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatabaseManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/data/DatabaseManager;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "getHealthDao", "Lcom/wakeup/module/data/dao/HealthDataDao;", "getEventDao", "Lcom/wakeup/module/data/dao/EventDataDao;", "getSportDao", "Lcom/wakeup/module/data/dao/SportDataDao;", "Companion", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DatabaseManager extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DATABASE_NAME = "wearfit_health.db";
    private static volatile DatabaseManager INSTANCE;

    public abstract EventDataDao getEventDao();

    public abstract HealthDataDao getHealthDao();

    public abstract SportDataDao getSportDao();

    /* compiled from: DatabaseManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/wakeup/module/data/DatabaseManager$Companion;", "", "<init>", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/wakeup/module/data/DatabaseManager;", "getInstance", "DeleteSecondMigration", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: DatabaseManager.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/wakeup/module/data/DatabaseManager$Companion$DeleteSecondMigration;", "Landroidx/room/migration/AutoMigrationSpec;", "<init>", "()V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DeleteSecondMigration implements AutoMigrationSpec {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DatabaseManager getInstance() {
            DatabaseManager databaseManager;
            DatabaseManager databaseManager2 = DatabaseManager.INSTANCE;
            if (databaseManager2 != null) {
                return databaseManager2;
            }
            synchronized (this) {
                Context context = BaseApplication.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                databaseManager = (DatabaseManager) Room.databaseBuilder(context, DatabaseManager.class, DatabaseManager.DATABASE_NAME).fallbackToDestructiveMigration().build();
                Companion companion = DatabaseManager.INSTANCE;
                DatabaseManager.INSTANCE = databaseManager;
            }
            return databaseManager;
        }
    }
}
