package com.wakeup.feature.user.ranking;

import com.blankj.utilcode.util.Utils;
import com.wakeup.common.network.entity.RankingModel;
import com.wakeup.common.utils.SerializableUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RankDao.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/feature/user/ranking/RankDao;", "", "<init>", "()V", "getData", "Lcom/wakeup/common/network/entity/RankingModel;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertData", "", "data", "(ILcom/wakeup/common/network/entity/RankingModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileName", "", "Companion", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RankDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile RankDao localData;

    public final Object getData(int i, Continuation<? super RankingModel> continuation) {
        return SerializableUtil.readSerializable(Utils.getApp(), getFileName(i));
    }

    public final Object insertData(int i, RankingModel rankingModel, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(SerializableUtil.saveSerializable(Utils.getApp(), rankingModel, getFileName(i)));
    }

    public final String getFileName(int page) {
        return "rank_" + page;
    }

    /* compiled from: RankDao.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/user/ranking/RankDao$Companion;", "", "<init>", "()V", "localData", "Lcom/wakeup/feature/user/ranking/RankDao;", "getInstance", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RankDao getInstance() {
            RankDao rankDao;
            RankDao rankDao2 = RankDao.localData;
            if (rankDao2 != null) {
                return rankDao2;
            }
            synchronized (this) {
                rankDao = RankDao.localData;
                if (rankDao == null) {
                    rankDao = new RankDao();
                    Companion companion = RankDao.INSTANCE;
                    RankDao.localData = rankDao;
                }
            }
            return rankDao;
        }
    }
}
