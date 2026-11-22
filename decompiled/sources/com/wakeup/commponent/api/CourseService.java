package com.wakeup.commponent.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.SingleLiveEvent;
import com.wakeup.common.network.entity.course.CourseDetailBean;
import com.wakeup.common.network.entity.course.PlanDetailBean;
import com.wakeup.common.network.entity.course.PlanDetailTitleBean;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CourseService.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J,\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0007H&J\b\u0010\u001d\u001a\u00020\u0007H&¨\u0006\u001e"}, d2 = {"Lcom/wakeup/commponent/api/CourseService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getTrainDeviceStatusLiveData", "Lcom/wakeup/common/SingleLiveEvent;", "", "getTrainDeviceHeartData", "sendTrainPlanInfo", "", "detailBean", "", "Lcom/wakeup/common/network/entity/course/PlanDetailBean;", "list", "Lcom/wakeup/common/network/entity/course/PlanDetailTitleBean;", "remindTime", "", "sendTrainDetail", "Lcom/wakeup/common/network/entity/course/CourseDetailBean;", "index", "sendTrainPlanStatus", "status", "sendTrainResponseStatus", "handCourseStart", "data", "", "sendCourseAppStatus", "courseId", "isFinishDownload", "", "requestCourseDeviceVersion", "getCourseDeviceData", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CourseService extends IProvider {
    void getCourseDeviceData();

    SingleLiveEvent<Integer> getTrainDeviceHeartData();

    SingleLiveEvent<Integer> getTrainDeviceStatusLiveData();

    void handCourseStart(List<Integer> data);

    void requestCourseDeviceVersion();

    void sendCourseAppStatus(int courseId, boolean isFinishDownload);

    void sendTrainDetail(CourseDetailBean detailBean, int index);

    void sendTrainPlanInfo(List<PlanDetailBean> detailBean, List<PlanDetailTitleBean> list, String remindTime);

    void sendTrainPlanStatus(int status);

    void sendTrainResponseStatus();
}
