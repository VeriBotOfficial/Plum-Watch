package com.wakeup.module.data.dao;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.commponent.module.data.HealthConfig;
import com.wakeup.commponent.module.data.SportConfig;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SqlHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ&\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/wakeup/module/data/dao/SqlHelper;", "", "<init>", "()V", "createQuerySql", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "uid", "", "config", "Lcom/wakeup/commponent/module/data/HealthConfig;", "createQueryDay", "type", "time", "", "mac", "", "createQueryMonth", "Lcom/wakeup/commponent/module/data/SportConfig;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SqlHelper {
    public static final SqlHelper INSTANCE = new SqlHelper();

    private SqlHelper() {
    }

    public final SimpleSQLiteQuery createQuerySql(int uid, HealthConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        StringBuffer stringBuffer = new StringBuffer("SELECT * FROM tab_health WHERE");
        stringBuffer.append(" uid = " + uid);
        stringBuffer.append(" AND type = " + config.getType());
        if (config.getStartTime() >= 0 && config.getEndTime() >= 0) {
            stringBuffer.append(" AND time between " + config.getStartTime() + " AND " + config.getEndTime());
        }
        if (!TextUtils.isEmpty(config.getMac())) {
            stringBuffer.append(" AND mac = '" + config.getMac() + Separators.QUOTE);
        }
        stringBuffer.append(" ORDER BY time ".concat(config.isDesc() ? "DESC" : "ASC"));
        if (config.getLimit() > 0) {
            stringBuffer.append(" LIMIT " + config.getLimit());
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return new SimpleSQLiteQuery(stringBuffer2);
    }

    public final SimpleSQLiteQuery createQueryDay(int uid, int type, long time, String mac) {
        String dateUtil = DateUtil.toString(time * 1000, "yyyy-MM");
        StringBuffer stringBuffer = new StringBuffer("SELECT strftime('%Y-%m-%d', date(time, 'unixepoch', 'localtime')) AS rq FROM tab_health WHERE");
        stringBuffer.append(" uid = " + uid);
        stringBuffer.append(" AND type = " + type);
        if (!TextUtils.isEmpty(mac)) {
            stringBuffer.append(" AND mac = '" + mac + Separators.QUOTE);
        }
        stringBuffer.append(" AND strftime('%Y-%m', date(time, 'unixepoch', 'localtime')) = '" + dateUtil + Separators.QUOTE);
        stringBuffer.append(" GROUP BY rq");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return new SimpleSQLiteQuery(stringBuffer2);
    }

    public final SimpleSQLiteQuery createQueryMonth(int uid, int type, long time, String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String dateUtil = DateUtil.toString(time * 1000, "yyyy");
        StringBuffer stringBuffer = new StringBuffer("SELECT strftime('%Y-%m', date(time, 'unixepoch', 'localtime')) AS rq FROM tab_health WHERE");
        stringBuffer.append(" uid = " + uid);
        stringBuffer.append(" AND type = " + type);
        if (!TextUtils.isEmpty(mac)) {
            stringBuffer.append(" AND mac = '" + mac + Separators.QUOTE);
        }
        stringBuffer.append(" AND strftime('%Y', date(time, 'unixepoch', 'localtime')) = '" + dateUtil + Separators.QUOTE);
        stringBuffer.append(" GROUP BY rq");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return new SimpleSQLiteQuery(stringBuffer2);
    }

    public final SimpleSQLiteQuery createQuerySql(int uid, SportConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        StringBuffer stringBuffer = new StringBuffer("SELECT * FROM tab_sport WHERE");
        stringBuffer.append(" uid = " + uid);
        int i = 0;
        if (!config.getTypeList().isEmpty()) {
            int i2 = 0;
            for (Object obj : config.getTypeList()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int intValue = ((Number) obj).intValue();
                if (i2 == 0) {
                    stringBuffer.append(" AND (type = '" + intValue + Separators.QUOTE);
                } else {
                    stringBuffer.append(" or type = '" + intValue + Separators.QUOTE);
                }
                i2 = i3;
            }
            stringBuffer.append(Separators.RPAREN);
        }
        if (config.getStartTime() >= 0 && config.getEndTime() >= 0) {
            stringBuffer.append(" AND time between " + config.getStartTime() + " AND " + config.getEndTime());
        }
        if (!TextUtils.isEmpty(config.getMac())) {
            stringBuffer.append(" AND mac = '" + config.getMac() + Separators.QUOTE);
        }
        if (!config.getSynStateList().isEmpty()) {
            for (Object obj2 : config.getSynStateList()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int intValue2 = ((Number) obj2).intValue();
                if (i == 0) {
                    stringBuffer.append(" AND (syncState = '" + intValue2 + Separators.QUOTE);
                } else {
                    stringBuffer.append(" or syncState = '" + intValue2 + Separators.QUOTE);
                }
                i = i4;
            }
            stringBuffer.append(Separators.RPAREN);
        }
        stringBuffer.append(" ORDER BY time ".concat(config.getIsDesc() ? "DESC" : "ASC"));
        if (config.getLimit() > 0) {
            stringBuffer.append(" LIMIT " + config.getLimit());
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return new SimpleSQLiteQuery(stringBuffer2);
    }
}
