package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.course.activity.CourseListActivity;
import com.wakeup.feature.course.activity.CourseSportShareActivity;
import com.wakeup.feature.course.activity.CourseTrainListActivity;
import com.wakeup.feature.course.activity.CreatePhysicalStatusActivity;
import com.wakeup.feature.course.activity.CustomCourseActivity;
import com.wakeup.feature.course.activity.RunCourseListActivity;
import com.wakeup.feature.course.activity.TrainPlanTemplateActivity;
import com.wakeup.feature.course.activity.TrainVideoActivity;
import com.wakeup.feature.course.newui.activity.CourseMainActivity;
import com.wakeup.feature.course.newui.activity.TrainingPlanActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$coursePage implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_CUSTOM_RUN_COURSE, RouteMeta.build(RouteType.ACTIVITY, CustomCourseActivity.class, "/coursepage/customruncourse", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_COURSE_HOME, RouteMeta.build(RouteType.ACTIVITY, CourseMainActivity.class, "/coursepage/home", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_COURSE_LIST, RouteMeta.build(RouteType.ACTIVITY, CourseListActivity.class, "/coursepage/list", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_CREATE_PHYSICAL_STATUS, RouteMeta.build(RouteType.ACTIVITY, CreatePhysicalStatusActivity.class, "/coursepage/physicalstatus", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_PLAN_HOME, RouteMeta.build(RouteType.ACTIVITY, TrainingPlanActivity.class, "/coursepage/planhome", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_RUN_COURSE_LIST, RouteMeta.build(RouteType.ACTIVITY, RunCourseListActivity.class, "/coursepage/runcourselist", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_COURSE_TRAIN_DETAIL, RouteMeta.build(RouteType.ACTIVITY, CourseSportShareActivity.class, "/coursepage/traindetail", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_COURSE_TRAIN_LIST, RouteMeta.build(RouteType.ACTIVITY, CourseTrainListActivity.class, "/coursepage/trainlist", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_TRAIN_PLAN_TEMPLATE, RouteMeta.build(RouteType.ACTIVITY, TrainPlanTemplateActivity.class, "/coursepage/trainplantemplate", "coursepage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_COURSE_TRAIN_VIDEO, RouteMeta.build(RouteType.ACTIVITY, TrainVideoActivity.class, "/coursepage/trainvideo", "coursepage", null, -1, Integer.MIN_VALUE));
    }
}
