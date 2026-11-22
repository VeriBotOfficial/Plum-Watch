package com.wakeup.common.network.host;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LenovoHost.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bl\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR\u001b\u0010\u0015\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\tR\u001b\u0010\u0018\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0019\u0010\tR\u001b\u0010\u001b\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001c\u0010\tR\u001b\u0010\u001e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b\u001f\u0010\tR\u001b\u0010!\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b\"\u0010\tR\u001b\u0010$\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b%\u0010\tR\u001b\u0010'\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b(\u0010\tR\u001b\u0010*\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b+\u0010\tR\u001b\u0010-\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b.\u0010\tR\u001b\u00100\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b1\u0010\tR\u001b\u00103\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b4\u0010\tR\u001b\u00106\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b7\u0010\tR\u001b\u00109\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b:\u0010\tR\u001b\u0010<\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u000b\u001a\u0004\b=\u0010\tR\u001b\u0010?\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\b@\u0010\tR\u001b\u0010B\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bC\u0010\tR\u001b\u0010E\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bF\u0010\tR\u001b\u0010H\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u000b\u001a\u0004\bI\u0010\tR\u001b\u0010K\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u000b\u001a\u0004\bL\u0010\tR\u001b\u0010N\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u000b\u001a\u0004\bO\u0010\tR\u001b\u0010Q\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\bR\u0010\tR\u001b\u0010T\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\u000b\u001a\u0004\bU\u0010\tR\u001b\u0010W\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u000b\u001a\u0004\bX\u0010\tR\u001b\u0010Z\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\u000b\u001a\u0004\b[\u0010\tR\u001b\u0010]\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010\u000b\u001a\u0004\b^\u0010\tR\u001b\u0010`\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010\u000b\u001a\u0004\ba\u0010\tR\u001b\u0010c\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010\u000b\u001a\u0004\bd\u0010\tR\u001b\u0010f\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bh\u0010\u000b\u001a\u0004\bg\u0010\tR\u001b\u0010i\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bk\u0010\u000b\u001a\u0004\bj\u0010\tR\u001b\u0010l\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010\u000b\u001a\u0004\bm\u0010\tR\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/wakeup/common/network/host/LenovoHost;", "", "<init>", "()V", "tag", "", "TEST_URL", "mainHost", "getMainHost", "()Ljava/lang/String;", "mainHost$delegate", "Lkotlin/Lazy;", "biHost", "getBiHost", "biHost$delegate", "healthHost", "getHealthHost", "healthHost$delegate", "sportHost", "getSportHost", "sportHost$delegate", "operateHost", "getOperateHost", "operateHost$delegate", "MiniAppSearchHost", "getMiniAppSearchHost", "MiniAppSearchHost$delegate", "AiSearchHost", "getAiSearchHost", "AiSearchHost$delegate", "courseHost", "getCourseHost", "courseHost$delegate", "scheduleHost", "getScheduleHost", "scheduleHost$delegate", "alipBindHost", "getAlipBindHost", "alipBindHost$delegate", "medalHost", "getMedalHost", "medalHost$delegate", "breathHost", "getBreathHost", "breathHost$delegate", "mallHost", "getMallHost", "mallHost$delegate", "scanLoginHost", "getScanLoginHost", "scanLoginHost$delegate", "headlinesHost", "getHeadlinesHost", "headlinesHost$delegate", "clusterHost", "getClusterHost", "clusterHost$delegate", "clusterWeiLifeHost", "getClusterWeiLifeHost", "clusterWeiLifeHost$delegate", "microserviceHost", "getMicroserviceHost", "microserviceHost$delegate", "northStarHost", "getNorthStarHost", "northStarHost$delegate", "aiHost", "getAiHost", "aiHost$delegate", "aiASRHost", "getAiASRHost", "aiASRHost$delegate", "aiPayHost", "getAiPayHost", "aiPayHost$delegate", "aiVipHost", "getAiVipHost", "aiVipHost$delegate", "aiVipPayHost", "getAiVipPayHost", "aiVipPayHost$delegate", "aiVipDialog", "getAiVipDialog", "aiVipDialog$delegate", "wechatCallsHost", "getWechatCallsHost", "wechatCallsHost$delegate", "agentHost", "getAgentHost", "agentHost$delegate", "pushHost", "getPushHost", "pushHost$delegate", "glassesHost", "getGlassesHost", "glassesHost$delegate", "switchHost", "getSwitchHost", "switchHost$delegate", "overseasPaymentHost", "getOverseasPaymentHost", "overseasPaymentHost$delegate", "himalayaHost", "getHimalayaHost", "himalayaHost$delegate", "apmHost", "getApmHost", "apmHost$delegate", "wechatReply", "getWechatReply", "wechatReply$delegate", "WEATHER_DATA_URL", "BAIDU_AIGC_BASE_URL", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LenovoHost {
    public static final String BAIDU_AIGC_BASE_URL = "https://afd.bj.baidubce.com/";
    private static final String TEST_URL = "https://lenovo-api.idours.cn/";
    public static final String WEATHER_DATA_URL = "https://howear.iwhop.cn/howearapi/";
    private static final String tag = "LenovoHost";
    public static final LenovoHost INSTANCE = new LenovoHost();

    /* renamed from: mainHost$delegate, reason: from kotlin metadata */
    private static final Lazy mainHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String mainHost_delegate$lambda$0;
            mainHost_delegate$lambda$0 = LenovoHost.mainHost_delegate$lambda$0();
            return mainHost_delegate$lambda$0;
        }
    });

    /* renamed from: biHost$delegate, reason: from kotlin metadata */
    private static final Lazy biHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String biHost_delegate$lambda$1;
            biHost_delegate$lambda$1 = LenovoHost.biHost_delegate$lambda$1();
            return biHost_delegate$lambda$1;
        }
    });

    /* renamed from: healthHost$delegate, reason: from kotlin metadata */
    private static final Lazy healthHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String healthHost_delegate$lambda$2;
            healthHost_delegate$lambda$2 = LenovoHost.healthHost_delegate$lambda$2();
            return healthHost_delegate$lambda$2;
        }
    });

    /* renamed from: sportHost$delegate, reason: from kotlin metadata */
    private static final Lazy sportHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda19
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String sportHost_delegate$lambda$3;
            sportHost_delegate$lambda$3 = LenovoHost.sportHost_delegate$lambda$3();
            return sportHost_delegate$lambda$3;
        }
    });

    /* renamed from: operateHost$delegate, reason: from kotlin metadata */
    private static final Lazy operateHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String operateHost_delegate$lambda$4;
            operateHost_delegate$lambda$4 = LenovoHost.operateHost_delegate$lambda$4();
            return operateHost_delegate$lambda$4;
        }
    });

    /* renamed from: MiniAppSearchHost$delegate, reason: from kotlin metadata */
    private static final Lazy MiniAppSearchHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda21
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String MiniAppSearchHost_delegate$lambda$5;
            MiniAppSearchHost_delegate$lambda$5 = LenovoHost.MiniAppSearchHost_delegate$lambda$5();
            return MiniAppSearchHost_delegate$lambda$5;
        }
    });

    /* renamed from: AiSearchHost$delegate, reason: from kotlin metadata */
    private static final Lazy AiSearchHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda23
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String AiSearchHost_delegate$lambda$6;
            AiSearchHost_delegate$lambda$6 = LenovoHost.AiSearchHost_delegate$lambda$6();
            return AiSearchHost_delegate$lambda$6;
        }
    });

    /* renamed from: courseHost$delegate, reason: from kotlin metadata */
    private static final Lazy courseHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String courseHost_delegate$lambda$7;
            courseHost_delegate$lambda$7 = LenovoHost.courseHost_delegate$lambda$7();
            return courseHost_delegate$lambda$7;
        }
    });

    /* renamed from: scheduleHost$delegate, reason: from kotlin metadata */
    private static final Lazy scheduleHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda25
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String scheduleHost_delegate$lambda$8;
            scheduleHost_delegate$lambda$8 = LenovoHost.scheduleHost_delegate$lambda$8();
            return scheduleHost_delegate$lambda$8;
        }
    });

    /* renamed from: alipBindHost$delegate, reason: from kotlin metadata */
    private static final Lazy alipBindHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda26
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String alipBindHost_delegate$lambda$9;
            alipBindHost_delegate$lambda$9 = LenovoHost.alipBindHost_delegate$lambda$9();
            return alipBindHost_delegate$lambda$9;
        }
    });

    /* renamed from: medalHost$delegate, reason: from kotlin metadata */
    private static final Lazy medalHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String medalHost_delegate$lambda$10;
            medalHost_delegate$lambda$10 = LenovoHost.medalHost_delegate$lambda$10();
            return medalHost_delegate$lambda$10;
        }
    });

    /* renamed from: breathHost$delegate, reason: from kotlin metadata */
    private static final Lazy breathHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda22
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String breathHost_delegate$lambda$11;
            breathHost_delegate$lambda$11 = LenovoHost.breathHost_delegate$lambda$11();
            return breathHost_delegate$lambda$11;
        }
    });

    /* renamed from: mallHost$delegate, reason: from kotlin metadata */
    private static final Lazy mallHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda27
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String mallHost_delegate$lambda$12;
            mallHost_delegate$lambda$12 = LenovoHost.mallHost_delegate$lambda$12();
            return mallHost_delegate$lambda$12;
        }
    });

    /* renamed from: scanLoginHost$delegate, reason: from kotlin metadata */
    private static final Lazy scanLoginHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String scanLoginHost_delegate$lambda$13;
            scanLoginHost_delegate$lambda$13 = LenovoHost.scanLoginHost_delegate$lambda$13();
            return scanLoginHost_delegate$lambda$13;
        }
    });

    /* renamed from: headlinesHost$delegate, reason: from kotlin metadata */
    private static final Lazy headlinesHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda29
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String headlinesHost_delegate$lambda$14;
            headlinesHost_delegate$lambda$14 = LenovoHost.headlinesHost_delegate$lambda$14();
            return headlinesHost_delegate$lambda$14;
        }
    });

    /* renamed from: clusterHost$delegate, reason: from kotlin metadata */
    private static final Lazy clusterHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda30
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String clusterHost_delegate$lambda$15;
            clusterHost_delegate$lambda$15 = LenovoHost.clusterHost_delegate$lambda$15();
            return clusterHost_delegate$lambda$15;
        }
    });

    /* renamed from: clusterWeiLifeHost$delegate, reason: from kotlin metadata */
    private static final Lazy clusterWeiLifeHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda31
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String clusterWeiLifeHost_delegate$lambda$16;
            clusterWeiLifeHost_delegate$lambda$16 = LenovoHost.clusterWeiLifeHost_delegate$lambda$16();
            return clusterWeiLifeHost_delegate$lambda$16;
        }
    });

    /* renamed from: microserviceHost$delegate, reason: from kotlin metadata */
    private static final Lazy microserviceHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda32
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String microserviceHost_delegate$lambda$17;
            microserviceHost_delegate$lambda$17 = LenovoHost.microserviceHost_delegate$lambda$17();
            return microserviceHost_delegate$lambda$17;
        }
    });

    /* renamed from: northStarHost$delegate, reason: from kotlin metadata */
    private static final Lazy northStarHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda33
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String northStarHost_delegate$lambda$18;
            northStarHost_delegate$lambda$18 = LenovoHost.northStarHost_delegate$lambda$18();
            return northStarHost_delegate$lambda$18;
        }
    });

    /* renamed from: aiHost$delegate, reason: from kotlin metadata */
    private static final Lazy aiHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiHost_delegate$lambda$19;
            aiHost_delegate$lambda$19 = LenovoHost.aiHost_delegate$lambda$19();
            return aiHost_delegate$lambda$19;
        }
    });

    /* renamed from: aiASRHost$delegate, reason: from kotlin metadata */
    private static final Lazy aiASRHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiASRHost_delegate$lambda$20;
            aiASRHost_delegate$lambda$20 = LenovoHost.aiASRHost_delegate$lambda$20();
            return aiASRHost_delegate$lambda$20;
        }
    });

    /* renamed from: aiPayHost$delegate, reason: from kotlin metadata */
    private static final Lazy aiPayHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiPayHost_delegate$lambda$21;
            aiPayHost_delegate$lambda$21 = LenovoHost.aiPayHost_delegate$lambda$21();
            return aiPayHost_delegate$lambda$21;
        }
    });

    /* renamed from: aiVipHost$delegate, reason: from kotlin metadata */
    private static final Lazy aiVipHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiVipHost_delegate$lambda$22;
            aiVipHost_delegate$lambda$22 = LenovoHost.aiVipHost_delegate$lambda$22();
            return aiVipHost_delegate$lambda$22;
        }
    });

    /* renamed from: aiVipPayHost$delegate, reason: from kotlin metadata */
    private static final Lazy aiVipPayHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiVipPayHost_delegate$lambda$23;
            aiVipPayHost_delegate$lambda$23 = LenovoHost.aiVipPayHost_delegate$lambda$23();
            return aiVipPayHost_delegate$lambda$23;
        }
    });

    /* renamed from: aiVipDialog$delegate, reason: from kotlin metadata */
    private static final Lazy aiVipDialog = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String aiVipDialog_delegate$lambda$24;
            aiVipDialog_delegate$lambda$24 = LenovoHost.aiVipDialog_delegate$lambda$24();
            return aiVipDialog_delegate$lambda$24;
        }
    });

    /* renamed from: wechatCallsHost$delegate, reason: from kotlin metadata */
    private static final Lazy wechatCallsHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String wechatCallsHost_delegate$lambda$25;
            wechatCallsHost_delegate$lambda$25 = LenovoHost.wechatCallsHost_delegate$lambda$25();
            return wechatCallsHost_delegate$lambda$25;
        }
    });

    /* renamed from: agentHost$delegate, reason: from kotlin metadata */
    private static final Lazy agentHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String agentHost_delegate$lambda$26;
            agentHost_delegate$lambda$26 = LenovoHost.agentHost_delegate$lambda$26();
            return agentHost_delegate$lambda$26;
        }
    });

    /* renamed from: pushHost$delegate, reason: from kotlin metadata */
    private static final Lazy pushHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String pushHost_delegate$lambda$27;
            pushHost_delegate$lambda$27 = LenovoHost.pushHost_delegate$lambda$27();
            return pushHost_delegate$lambda$27;
        }
    });

    /* renamed from: glassesHost$delegate, reason: from kotlin metadata */
    private static final Lazy glassesHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String glassesHost_delegate$lambda$28;
            glassesHost_delegate$lambda$28 = LenovoHost.glassesHost_delegate$lambda$28();
            return glassesHost_delegate$lambda$28;
        }
    });

    /* renamed from: switchHost$delegate, reason: from kotlin metadata */
    private static final Lazy switchHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String switchHost_delegate$lambda$29;
            switchHost_delegate$lambda$29 = LenovoHost.switchHost_delegate$lambda$29();
            return switchHost_delegate$lambda$29;
        }
    });

    /* renamed from: overseasPaymentHost$delegate, reason: from kotlin metadata */
    private static final Lazy overseasPaymentHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String overseasPaymentHost_delegate$lambda$30;
            overseasPaymentHost_delegate$lambda$30 = LenovoHost.overseasPaymentHost_delegate$lambda$30();
            return overseasPaymentHost_delegate$lambda$30;
        }
    });

    /* renamed from: himalayaHost$delegate, reason: from kotlin metadata */
    private static final Lazy himalayaHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String himalayaHost_delegate$lambda$31;
            himalayaHost_delegate$lambda$31 = LenovoHost.himalayaHost_delegate$lambda$31();
            return himalayaHost_delegate$lambda$31;
        }
    });

    /* renamed from: apmHost$delegate, reason: from kotlin metadata */
    private static final Lazy apmHost = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String apmHost_delegate$lambda$32;
            apmHost_delegate$lambda$32 = LenovoHost.apmHost_delegate$lambda$32();
            return apmHost_delegate$lambda$32;
        }
    });

    /* renamed from: wechatReply$delegate, reason: from kotlin metadata */
    private static final Lazy wechatReply = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.network.host.LenovoHost$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String wechatReply_delegate$lambda$33;
            wechatReply_delegate$lambda$33 = LenovoHost.wechatReply_delegate$lambda$33();
            return wechatReply_delegate$lambda$33;
        }
    });

    private LenovoHost() {
    }

    public final String getMainHost() {
        return (String) mainHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mainHost_delegate$lambda$0() {
        return "https://lenovo-api-en.vkcto.com/base/";
    }

    public final String getBiHost() {
        return (String) biHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String biHost_delegate$lambda$1() {
        return EvnMgr.isTest() ? "https://beta.howear.iwhop.cn/howearapitest/tracking/" : "https://tracking.iwhop.cn/";
    }

    public final String getHealthHost() {
        return (String) healthHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String healthHost_delegate$lambda$2() {
        return "https://lenovo-api-en.vkcto.com/health/";
    }

    public final String getSportHost() {
        return (String) sportHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sportHost_delegate$lambda$3() {
        return "https://lenovo-api-en.vkcto.com/sport/";
    }

    public final String getOperateHost() {
        return (String) operateHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String operateHost_delegate$lambda$4() {
        return EvnMgr.isTest() ? TEST_URL : "https://operate.iwhop.com/";
    }

    public final String getMiniAppSearchHost() {
        return (String) MiniAppSearchHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MiniAppSearchHost_delegate$lambda$5() {
        return EvnMgr.isMiniAppRelease() ? "https://super-app.iwhop.com/" : (EvnMgr.isMiniAppTest() || EvnMgr.isTest()) ? "https://test-ai-howear.iwhop.cn/" : "https://super-app.iwhop.com/";
    }

    public final String getAiSearchHost() {
        return (String) AiSearchHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AiSearchHost_delegate$lambda$6() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/" : "https://super-app.iwhop.com/";
    }

    public final String getCourseHost() {
        return (String) courseHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String courseHost_delegate$lambda$7() {
        return EvnMgr.isTest() ? "https://lenovo-api.idours.cn/course/" : "https://course.iwhop.com/";
    }

    public final String getScheduleHost() {
        return (String) scheduleHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String scheduleHost_delegate$lambda$8() {
        return EvnMgr.isTest() ? TEST_URL : "https://schedule.iwhop.com/";
    }

    public final String getAlipBindHost() {
        return (String) alipBindHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String alipBindHost_delegate$lambda$9() {
        return EvnMgr.isTest() ? "https://beta.howear.iwhop.cn/howearapitest/zfbMac/" : "https://zfbmac.iwhop.cn/";
    }

    public final String getMedalHost() {
        return (String) medalHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String medalHost_delegate$lambda$10() {
        return EvnMgr.isTest() ? TEST_URL : "https://medal.iwhop.com/";
    }

    public final String getBreathHost() {
        return (String) breathHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String breathHost_delegate$lambda$11() {
        return "https://lenovo-api-en.vkcto.com/music/";
    }

    public final String getMallHost() {
        return (String) mallHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mallHost_delegate$lambda$12() {
        return EvnMgr.isTest() ? TEST_URL : "https://mall.iwhop.cn/";
    }

    public final String getScanLoginHost() {
        return (String) scanLoginHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String scanLoginHost_delegate$lambda$13() {
        return EvnMgr.isTest() ? TEST_URL : "https://health-monitor.iwhop.com/";
    }

    public final String getHeadlinesHost() {
        return (String) headlinesHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String headlinesHost_delegate$lambda$14() {
        return EvnMgr.isTest() ? TEST_URL : "https://health-news.iwhop.com/";
    }

    public final String getClusterHost() {
        return (String) clusterHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clusterHost_delegate$lambda$15() {
        return "https://lenovo-api-en.vkcto.com/";
    }

    public final String getClusterWeiLifeHost() {
        return (String) clusterWeiLifeHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clusterWeiLifeHost_delegate$lambda$16() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/howeartest/" : "https://api-cluster.iwhop.com/";
    }

    public final String getMicroserviceHost() {
        return (String) microserviceHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String microserviceHost_delegate$lambda$17() {
        return "https://micro-life.iwhop.com/";
    }

    public final String getNorthStarHost() {
        return (String) northStarHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String northStarHost_delegate$lambda$18() {
        return "http://music.iwhop.com/";
    }

    public final String getAiHost() {
        return (String) aiHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiHost_delegate$lambda$19() {
        return "https://gateway.iwhop.cn/";
    }

    public final String getAiASRHost() {
        return (String) aiASRHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiASRHost_delegate$lambda$20() {
        return EvnMgr.isTest() ? "ws://test-ai-howear.iwhop.cn/" : "ws://gateway.iwhop.com/";
    }

    public final String getAiPayHost() {
        return (String) aiPayHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiPayHost_delegate$lambda$21() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/" : "https://gateway.iwhop.com/";
    }

    public final String getAiVipHost() {
        return (String) aiVipHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiVipHost_delegate$lambda$22() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/member/" : "https://gateway.iwhop.cn/gateway/member/";
    }

    public final String getAiVipPayHost() {
        return (String) aiVipPayHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiVipPayHost_delegate$lambda$23() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/wearfitPay/" : "https://gateway.iwhop.cn/gateway/wearfitPay/";
    }

    public final String getAiVipDialog() {
        return (String) aiVipDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aiVipDialog_delegate$lambda$24() {
        return EvnMgr.isTest() ? "https://test.iwhopro.com/howeartest/homePage/" : "https://operate.iwhop.cn/homePage/";
    }

    public final String getWechatCallsHost() {
        return (String) wechatCallsHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wechatCallsHost_delegate$lambda$25() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/" : "https://gateway.iwhop.com/gateway/user/";
    }

    public final String getAgentHost() {
        return (String) agentHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String agentHost_delegate$lambda$26() {
        return EvnMgr.isTest() ? "https://test-tourism-agent.iwhop.cn/howeartest/" : "https://tourism-agent.iwhop.com/";
    }

    public final String getPushHost() {
        return (String) pushHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pushHost_delegate$lambda$27() {
        if (EvnMgr.isTest()) {
            return "http://en-test.iwhop.com/";
        }
        return "https://push-hk.iwhop.com/";
    }

    public final String getGlassesHost() {
        return (String) glassesHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String glassesHost_delegate$lambda$28() {
        return EvnMgr.isTest() ? "https://test.iwhopro.com/howeartest/" : "https://howear.iwhop.com/howearapi/";
    }

    public final String getSwitchHost() {
        return (String) switchHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String switchHost_delegate$lambda$29() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/howeartest/microLife" : "https://micro-life.iwhop.com/microLife";
    }

    public final String getOverseasPaymentHost() {
        return (String) overseasPaymentHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String overseasPaymentHost_delegate$lambda$30() {
        return EvnMgr.isTest() ? "https://test.iwhopro.com/" : "https://pre.iwhop.com/";
    }

    public final String getHimalayaHost() {
        return (String) himalayaHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String himalayaHost_delegate$lambda$31() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/" : "https://gateway.iwhop.com/gateway/user/";
    }

    public final String getApmHost() {
        return (String) apmHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String apmHost_delegate$lambda$32() {
        return EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/apm/" : "https://apm.iwhop.com/";
    }

    public final String getWechatReply() {
        return (String) wechatReply.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wechatReply_delegate$lambda$33() {
        return EvnMgr.isTest() ? "http://101.42.221.237:4408/" : "http://wx-finder.iwhopodm.cn/";
    }
}
