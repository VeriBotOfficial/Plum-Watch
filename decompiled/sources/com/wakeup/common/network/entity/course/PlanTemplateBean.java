package com.wakeup.common.network.entity.course;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: PlanTemplateBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/course/PlanTemplateBean;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()I", "name", "", "getName", "()Ljava/lang/String;", "description", "getDescription", "num", "getNum", "coverImg", "getCoverImg", "courseCategory", "getCourseCategory", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanTemplateBean implements Serializable {
    private final int courseCategory;
    private final int id;
    private final int num;
    private final String name = "";
    private final String description = "";
    private final String coverImg = "";

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getNum() {
        return this.num;
    }

    public final String getCoverImg() {
        return this.coverImg;
    }

    public final int getCourseCategory() {
        return this.courseCategory;
    }
}
