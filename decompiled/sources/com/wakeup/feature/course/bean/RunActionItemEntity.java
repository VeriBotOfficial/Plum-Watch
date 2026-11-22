package com.wakeup.feature.course.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.course.CourseActionDetail;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunActionItemEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/course/bean/RunActionItemEntity;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "dataType", "data", "Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "<init>", "(IILcom/wakeup/common/network/entity/course/CourseActionDetail;)V", "getType", "()I", "setType", "(I)V", "getDataType", "setDataType", "getData", "()Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "setData", "(Lcom/wakeup/common/network/entity/course/CourseActionDetail;)V", "itemType", "getItemType", "Companion", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RunActionItemEntity implements Serializable, MultiItemEntity {
    public static final int TYPE_CONTENT = 2;
    public static final int TYPE_TITLE = 1;
    private CourseActionDetail data;
    private int dataType;
    private int type;

    public RunActionItemEntity(int i, int i2, CourseActionDetail data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = i;
        this.dataType = i2;
        this.data = data;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public /* synthetic */ RunActionItemEntity(int i, int i2, CourseActionDetail courseActionDetail, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new CourseActionDetail() : courseActionDetail);
    }

    public final CourseActionDetail getData() {
        return this.data;
    }

    public final void setData(CourseActionDetail courseActionDetail) {
        Intrinsics.checkNotNullParameter(courseActionDetail, "<set-?>");
        this.data = courseActionDetail;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }
}
