package com.wakeup.module.data;

import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.wakeup.module.data.DatabaseManager;

/* loaded from: classes4.dex */
final class DatabaseManager_AutoMigration_2_3_Impl extends Migration {
    private final AutoMigrationSpec callback;

    public DatabaseManager_AutoMigration_2_3_Impl() {
        super(2, 3);
        this.callback = new DatabaseManager.Companion.DeleteSecondMigration();
    }

    @Override // androidx.room.migration.Migration
    public void migrate(final SupportSQLiteDatabase db) {
        db.execSQL("ALTER TABLE `tab_sport` ADD COLUMN `seconds` TEXT NOT NULL DEFAULT ''");
        db.execSQL("CREATE TABLE IF NOT EXISTS `_new_tab_sport` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` INTEGER NOT NULL, `mac` TEXT NOT NULL, `time` INTEGER NOT NULL, `type` INTEGER NOT NULL, `distance` INTEGER NOT NULL, `step` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `kcal` REAL NOT NULL, `altitudes` TEXT NOT NULL, `paces` TEXT NOT NULL, `heartRates` TEXT NOT NULL, `locations` TEXT NOT NULL, `stepFrequencs` TEXT NOT NULL, `seconds` TEXT NOT NULL DEFAULT '', `courseRecord` TEXT NOT NULL, `expand` TEXT NOT NULL, `syncState` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL)");
        db.execSQL("INSERT INTO `_new_tab_sport` (`id`,`uid`,`mac`,`time`,`type`,`distance`,`step`,`duration`,`kcal`,`altitudes`,`paces`,`heartRates`,`locations`,`stepFrequencs`,`courseRecord`,`expand`,`syncState`,`updateTime`) SELECT `id`,`uid`,`mac`,`time`,`type`,`distance`,`step`,`duration`,`kcal`,`altitudes`,`paces`,`heartRates`,`locations`,`stepFrequencs`,`courseRecord`,`expand`,`syncState`,`updateTime` FROM `tab_sport`");
        db.execSQL("DROP TABLE `tab_sport`");
        db.execSQL("ALTER TABLE `_new_tab_sport` RENAME TO `tab_sport`");
        this.callback.onPostMigrate(db);
    }
}
