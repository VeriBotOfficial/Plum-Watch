package com.wakeup.common.network.api;

import com.heytap.mcssdk.constant.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.wakeup.common.Constants;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.common.network.entity.TrainEntityBean;
import com.wakeup.common.network.entity.course.CommentBean;
import com.wakeup.common.network.entity.course.CourseCardShareImageBean;
import com.wakeup.common.network.entity.course.CourseDetailBean;
import com.wakeup.common.network.entity.course.CourseListBean;
import com.wakeup.common.network.entity.course.CourseMainSection;
import com.wakeup.common.network.entity.course.CourseRecommendBean;
import com.wakeup.common.network.entity.course.CourseSectionBean;
import com.wakeup.common.network.entity.course.CourseType;
import com.wakeup.common.network.entity.course.PlanDetailBean;
import com.wakeup.common.network.entity.course.PlanTemplateBean;
import com.wakeup.common.network.entity.course.PlanTemplateDetailBean;
import com.wakeup.common.network.entity.course.RecommendPlanBean;
import com.wakeup.common.network.entity.course.SendCommentBean;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: CourseService.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H§@¢\u0006\u0002\u0010\u0006J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0010J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u0003H§@¢\u0006\u0002\u0010\u0006J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0003\u0010\u0019\u001a\u00020\rH§@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#H§@¢\u0006\u0002\u0010$J2\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0010J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0003H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010,\u001a\u00020*H§@¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010,\u001a\u00020*H§@¢\u0006\u0002\u0010-J@\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u00032\u0010\b\u0003\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\b\b\u0001\u00102\u001a\u00020\r2\b\b\u0001\u00103\u001a\u000204H§@¢\u0006\u0002\u00105J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\rH§@¢\u0006\u0002\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u00103\u001a\u000204H§@¢\u0006\u0002\u00109J*\u0010:\u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0;H§@¢\u0006\u0002\u0010<J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u00103\u001a\u00020!H§@¢\u0006\u0002\u0010?J$\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00032\b\b\u0001\u00103\u001a\u00020!H§@¢\u0006\u0002\u0010?J\u001a\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J*\u0010D\u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0;H§@¢\u0006\u0002\u0010<J*\u0010E\u001a\b\u0012\u0004\u0012\u00020!0\u00032\u0014\b\u0001\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0;H§@¢\u0006\u0002\u0010<J&\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\b0\u00032\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010IJ$\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b0\u00032\b\b\u0001\u0010L\u001a\u00020\rH§@¢\u0006\u0002\u00107J\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u0003H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010,\u001a\u00020PH§@¢\u0006\u0002\u0010QJ\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010,\u001a\u00020PH§@¢\u0006\u0002\u0010QJ\u001a\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H§@¢\u0006\u0002\u0010\u0006J8\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00032\b\b\u0001\u0010U\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00032\b\b\u0001\u0010X\u001a\u00020\rH§@¢\u0006\u0002\u00107J\u001e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\rH§@¢\u0006\u0002\u00107¨\u0006Z"}, d2 = {"Lcom/wakeup/common/network/api/CourseService;", "", "getAllCourseList", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/course/CourseSectionBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseTypeList", "", "Lcom/wakeup/common/network/entity/course/CourseType;", "getCourseList", "Lcom/wakeup/common/network/entity/course/CourseListBean;", "courseType", "", "pageNum", "pageSize", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseListV2", "courseTarget", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendList", "Lcom/wakeup/common/network/entity/course/CourseMainSection;", "getCourseDetails", "Lcom/wakeup/common/network/entity/course/CourseDetailBean;", "courseId", "isNewVersion", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "like", "", Constants.BundleKey.BEAN, "Lcom/wakeup/common/network/entity/BasicRequest$LikeBean;", "(Lcom/wakeup/common/network/entity/BasicRequest$LikeBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendComment", "", RemoteMessageConst.MessageBody.PARAM, "Lcom/wakeup/common/network/entity/course/SendCommentBean;", "(Lcom/wakeup/common/network/entity/course/SendCommentBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommentList", "Lcom/wakeup/common/network/entity/course/CommentBean;", "getBackgroundImage", "Lcom/wakeup/common/network/entity/course/CourseCardShareImageBean;", "getPlanInfo", "Lcom/wakeup/common/network/entity/TrainEntityBean$RequestAddTrainPlanBean;", "addTrainPlan", "body", "(Lcom/wakeup/common/network/entity/TrainEntityBean$RequestAddTrainPlanBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTrainPlan", "requestPlanDetailList", "Lcom/wakeup/common/network/entity/course/PlanDetailBean;", "weekNumList", "isWholeWeek", b.s, "", "(Ljava/util/List;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "increaseShare", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTrainPlan", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRemindTime", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeekPlanInfo", "Lcom/wakeup/common/network/entity/BasicResponse$WeekPlanInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendListByType", "getCourseHitList", "getCourseRecommendList", "Lcom/wakeup/common/network/entity/course/CourseRecommendBean;", "setUserCondition", "saveExerciseExitReason", "getExercisePlanModelList", "Lcom/wakeup/common/network/entity/course/PlanTemplateBean;", "type", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExercisePlanModelDetails", "Lcom/wakeup/common/network/entity/course/PlanTemplateDetailBean;", "modelId", "getModelCustomizationList", "Lcom/wakeup/common/network/entity/BasicResponse$ModelCustomizationBean;", "saveModelCustomization", "Lcom/wakeup/common/network/entity/TrainEntityBean$SaveCustomPlanBean;", "(Lcom/wakeup/common/network/entity/TrainEntityBean$SaveCustomPlanBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateModelCustomization", "getCourseTargetList", "getRunCourseList", "categoryId", "getRecommendPlan", "Lcom/wakeup/common/network/entity/course/RecommendPlanBean;", "recommendType", "getRunCourseDetails", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CourseService {
    @POST("exercisePlan/saveCustomization")
    Object addTrainPlan(@Body TrainEntityBean.RequestAddTrainPlanBean requestAddTrainPlanBean, Continuation<? super BaseResult<String>> continuation);

    @GET("exercisePlan/delCustomization")
    Object deleteTrainPlan(@Query("startDate") long j, Continuation<? super BaseResult<Object>> continuation);

    @GET("course/getAllCourseList")
    Object getAllCourseList(Continuation<? super BaseResult<List<CourseSectionBean>>> continuation);

    @GET("course/getBackgroundImage")
    Object getBackgroundImage(Continuation<? super BaseResult<CourseCardShareImageBean>> continuation);

    @GET("course/getCommentList")
    Object getCommentList(@Query("courseId") int i, @Query("pageNum") int i2, @Query("pageSize") int i3, Continuation<? super BaseResult<CommentBean>> continuation);

    @GET("course/getCourseDetails")
    Object getCourseDetails(@Query("courseId") int i, @Query("isNewVersion") int i2, Continuation<? super BaseResult<CourseDetailBean>> continuation);

    @GET("course/getCourseHitList")
    Object getCourseHitList(Continuation<? super BaseResult<List<CourseMainSection>>> continuation);

    @GET("course/getCourseList")
    Object getCourseList(@Query("courseType") int i, @Query("pageNum") int i2, @Query("pageSize") int i3, Continuation<? super BaseResult<CourseListBean>> continuation);

    @GET("course/v2/getCourseList")
    Object getCourseListV2(@Query("courseType") int i, @Query("courseTarget") int i2, @Query("pageNum") int i3, @Query("pageSize") int i4, Continuation<? super BaseResult<CourseListBean>> continuation);

    @GET("course/getAppointRecommendList")
    Object getCourseRecommendList(Continuation<? super BaseResult<List<CourseRecommendBean>>> continuation);

    @GET("course/getCourseTargetList")
    Object getCourseTargetList(Continuation<? super BaseResult<List<CourseType>>> continuation);

    @GET("course/getCourseTypeList")
    Object getCourseTypeList(Continuation<? super BaseResult<List<CourseType>>> continuation);

    @GET("exercisePlan/getExercisePlanModelDetails")
    Object getExercisePlanModelDetails(@Query("modelId") int i, Continuation<? super BaseResult<List<PlanTemplateDetailBean>>> continuation);

    @GET("exercisePlan/getExercisePlanModelList")
    Object getExercisePlanModelList(@Query("type") Integer num, Continuation<? super BaseResult<List<PlanTemplateBean>>> continuation);

    @GET("exercisePlan/getModelCustomizationList")
    Object getModelCustomizationList(Continuation<? super BaseResult<BasicResponse.ModelCustomizationBean>> continuation);

    @GET("exercisePlan/getPlanInfo")
    Object getPlanInfo(Continuation<? super BaseResult<TrainEntityBean.RequestAddTrainPlanBean>> continuation);

    @GET("course/getRecommendList")
    Object getRecommendList(Continuation<? super BaseResult<List<CourseMainSection>>> continuation);

    @GET("course/getRecommendListByType")
    Object getRecommendListByType(@Query("recommendType") String str, Continuation<? super BaseResult<List<CourseMainSection>>> continuation);

    @GET("course/getRecommendPlan")
    Object getRecommendPlan(@Query("recommendType") int i, Continuation<? super BaseResult<RecommendPlanBean>> continuation);

    @GET("runCourse/getDetail")
    Object getRunCourseDetails(@Query("courseId") int i, Continuation<? super BaseResult<CourseDetailBean>> continuation);

    @GET("runCourse/listCourse")
    Object getRunCourseList(@Query("categoryId") int i, @Query("pageNum") int i2, @Query("pageSize") int i3, Continuation<? super BaseResult<List<CourseMainSection>>> continuation);

    @GET("exercisePlan/getWeekPlanInfo")
    Object getWeekPlanInfo(@Query("startDate") String str, Continuation<? super BaseResult<BasicResponse.WeekPlanInfo>> continuation);

    @GET("course/increaseShare")
    Object increaseShare(@Query("courseId") int i, Continuation<? super BaseResult<String>> continuation);

    @POST("course/like/increaseOrReduce")
    Object like(@Body BasicRequest.LikeBean likeBean, Continuation<? super BaseResult<Boolean>> continuation);

    @GET("exercisePlan/getCustomizationList")
    Object requestPlanDetailList(@Query("weekNumList") List<Integer> list, @Query("isWholeWeek") int i, @Query("startDate") long j, Continuation<? super BaseResult<List<PlanDetailBean>>> continuation);

    @POST("exercisePlan/saveExerciseExitReason")
    Object saveExerciseExitReason(@Body Map<String, Integer> map, Continuation<? super BaseResult<String>> continuation);

    @POST("exercisePlan/saveModelCustomization")
    Object saveModelCustomization(@Body TrainEntityBean.SaveCustomPlanBean saveCustomPlanBean, Continuation<? super BaseResult<String>> continuation);

    @POST("course/sendComment")
    Object sendComment(@Body SendCommentBean sendCommentBean, Continuation<? super BaseResult<String>> continuation);

    @POST("exercisePlan/setUserCondition")
    Object setUserCondition(@Body Map<String, Integer> map, Continuation<? super BaseResult<String>> continuation);

    @POST("exercisePlan/updateModelCustomization")
    Object updateModelCustomization(@Body TrainEntityBean.SaveCustomPlanBean saveCustomPlanBean, Continuation<? super BaseResult<String>> continuation);

    @POST("exercisePlan/updateRemindTime")
    Object updateRemindTime(@Body Map<String, String> map, Continuation<? super BaseResult<String>> continuation);

    @POST("exercisePlan/updateCustomization")
    Object updateTrainPlan(@Body TrainEntityBean.RequestAddTrainPlanBean requestAddTrainPlanBean, Continuation<? super BaseResult<String>> continuation);

    /* compiled from: CourseService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getCourseDetails$default(CourseService courseService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCourseDetails");
            }
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            return courseService.getCourseDetails(i, i2, continuation);
        }

        public static /* synthetic */ Object requestPlanDetailList$default(CourseService courseService, List list, int i, long j, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPlanDetailList");
            }
            if ((i2 & 1) != 0) {
                list = null;
            }
            return courseService.requestPlanDetailList(list, i, j, continuation);
        }

        public static /* synthetic */ Object getExercisePlanModelList$default(CourseService courseService, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExercisePlanModelList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return courseService.getExercisePlanModelList(num, continuation);
        }

        public static /* synthetic */ Object getRunCourseList$default(CourseService courseService, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRunCourseList");
            }
            if ((i4 & 4) != 0) {
                i3 = 10;
            }
            return courseService.getRunCourseList(i, i2, i3, continuation);
        }
    }
}
