package com.wakeup.common.network.entity.course;

import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CourseRecommendBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseRecommendBean;", "", "<init>", "()V", "recommendType", "", "getRecommendType", "()I", "title", "", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", SocialConstants.PARAM_IMG_URL, "getImg", "courseRecommendVOList", "", "Lcom/wakeup/common/network/entity/course/CourseMainSection;", "getCourseRecommendVOList", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CourseRecommendBean {
    private final List<CourseMainSection> courseRecommendVOList;
    private final int recommendType;
    private final String title = "";
    private final String subtitle = "";
    private final String img = "";

    public final int getRecommendType() {
        return this.recommendType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getImg() {
        return this.img;
    }

    public final List<CourseMainSection> getCourseRecommendVOList() {
        return this.courseRecommendVOList;
    }
}
