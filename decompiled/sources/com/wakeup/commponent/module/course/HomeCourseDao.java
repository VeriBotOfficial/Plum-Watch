package com.wakeup.commponent.module.course;

import com.blankj.utilcode.util.Utils;
import com.wakeup.common.network.entity.course.CourseMainSection;
import com.wakeup.common.utils.SerializableUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HomeCourseRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commponent/module/course/HomeCourseDao;", "", "<init>", "()V", "fileName", "", "getData", "", "Lcom/wakeup/common/network/entity/course/CourseMainSection;", "type", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertData", "", "data", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeCourseDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile HomeCourseDao localData;
    private final String fileName = "home_course_list";

    public final Object getData(String str, Continuation<? super List<CourseMainSection>> continuation) {
        return SerializableUtil.readObjectForList(Utils.getApp(), this.fileName + "_" + str);
    }

    public final Object insertData(String str, List<CourseMainSection> list, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(SerializableUtil.saveSerializable(Utils.getApp(), list, this.fileName + "_" + str));
    }

    /* compiled from: HomeCourseRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/wakeup/commponent/module/course/HomeCourseDao$Companion;", "", "<init>", "()V", "localData", "Lcom/wakeup/commponent/module/course/HomeCourseDao;", "getInstance", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HomeCourseDao getInstance() {
            HomeCourseDao homeCourseDao;
            HomeCourseDao homeCourseDao2 = HomeCourseDao.localData;
            if (homeCourseDao2 != null) {
                return homeCourseDao2;
            }
            synchronized (this) {
                homeCourseDao = HomeCourseDao.localData;
                if (homeCourseDao == null) {
                    homeCourseDao = new HomeCourseDao();
                    Companion companion = HomeCourseDao.INSTANCE;
                    HomeCourseDao.localData = homeCourseDao;
                }
            }
            return homeCourseDao;
        }
    }
}
