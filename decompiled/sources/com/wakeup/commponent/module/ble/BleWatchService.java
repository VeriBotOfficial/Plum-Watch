package com.wakeup.commponent.module.ble;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.anythink.core.common.e.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.ak;
import com.wakeup.common.Constants;
import com.wakeup.common.location.LocationBean;
import com.wakeup.common.network.entity.weather.WeatherAllInfo;
import com.wakeup.commponent.module.health.MenstrualBean;
import com.wakeup.commponent.module.sport.SportCacheData;
import com.wakeup.feature.user.constant.UserConstants;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: BleWatchService.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0012\n\u0002\bb\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bH\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0005H&J8\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H&JH\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H&J0\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&JS\u00102\u001a\b\u0012\u0004\u0012\u00020\u0003032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H&¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0005H&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0005H&J0\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H&J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010E\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010G\u001a\u00020\u0003H&J\b\u0010H\u001a\u00020\u0003H&J\b\u0010I\u001a\u00020\u0003H&J\b\u0010J\u001a\u00020\u0003H&JS\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0003032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H&¢\u0006\u0002\u00109J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010,\u001a\u00020MH&J\u0018\u0010N\u001a\u00020\u00032\u0006\u0010,\u001a\u00020M2\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0018\u0010O\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H&J\"\u0010Q\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010R\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0005H&J \u0010S\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010U\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J0\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0005H&JS\u0010[\u001a\b\u0012\u0004\u0012\u00020\u0003032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\u0005H&¢\u0006\u0002\u00109J3\u0010_\u001a\b\u0012\u0004\u0012\u00020\u0003032\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H&¢\u0006\u0002\u0010`J \u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00052\u0006\u0010c\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\u0005H&J\u0010\u0010e\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J\u0010\u0010g\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J\u0018\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u00052\u0006\u0010j\u001a\u00020\u0005H&J@\u0010k\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\u00052\u0006\u0010m\u001a\u00020\u00052\u0006\u0010n\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u0018H&J \u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\u0005H&J\u0018\u0010r\u001a\u00020\u00032\u0006\u0010s\u001a\u00020f2\u0006\u0010t\u001a\u00020\u0005H&J \u0010u\u001a\u00020\u00032\u0006\u0010c\u001a\u00020f2\u0006\u0010i\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010v\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J\u0018\u0010w\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u0018H&J\u0010\u0010x\u001a\u00020\u00032\u0006\u0010y\u001a\u00020fH&J\b\u0010z\u001a\u00020\u0003H&J\b\u0010{\u001a\u00020\u0003H&J \u0010|\u001a\u00020\u00032\u0006\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u0005H&J\u001b\u0010\u0080\u0001\u001a\u00020\u00032\u0007\u0010\u0081\u0001\u001a\u00020\u00052\u0007\u0010\u0082\u0001\u001a\u00020\u0005H&J-\u0010\u0083\u0001\u001a\u00020\u00032\u0007\u0010\u0084\u0001\u001a\u00020\u00052\u0007\u0010\u0085\u0001\u001a\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u00052\u0007\u0010\u0087\u0001\u001a\u00020\u0005H&J-\u0010\u0088\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u00052\u0007\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u008b\u0001\u001a\u00020\u00052\u0007\u0010\u008c\u0001\u001a\u00020\u0005H&JP\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u008e\u0001\u001a\u00020\u00052\u0007\u0010\u008f\u0001\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0007\u0010\u0090\u0001\u001a\u00020\u00052\u0007\u0010\u0091\u0001\u001a\u00020\u00052\u0007\u0010\u0092\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020\u00052\u0007\u0010\u0094\u0001\u001a\u00020\u0005H&J\u001b\u0010\u0095\u0001\u001a\u00020\u00032\u0007\u0010\u0096\u0001\u001a\u00020\u00052\u0007\u0010\u0097\u0001\u001a\u00020\u0005H&J\u0011\u0010\u0098\u0001\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0005H&J\u0019\u0010\u0099\u0001\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u0018H&J\u0011\u0010\u009a\u0001\u001a\u00020\u00032\u0006\u0010y\u001a\u00020fH&J-\u0010\u009b\u0001\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u00020\u00052\u0007\u0010\u009d\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010\u009f\u0001\u001a\u00020\u0005H&J-\u0010 \u0001\u001a\u00020\u00032\u0007\u0010\u009c\u0001\u001a\u00020\u00052\u0007\u0010\u009d\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010¡\u0001\u001a\u00020\u0005H&J\u0011\u0010¢\u0001\u001a\u00020\u00032\u0006\u0010y\u001a\u00020fH&J\u0012\u0010£\u0001\u001a\u00020\u00032\u0007\u0010¤\u0001\u001a\u00020\u0018H&J\u0011\u0010¥\u0001\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010¦\u0001\u001a\u00020\u00032\u0007\u0010§\u0001\u001a\u00020MH&J\u0011\u0010¨\u0001\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0019\u0010©\u0001\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u00052\u0006\u0010p\u001a\u00020\u0005H&J\u0011\u0010ª\u0001\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J$\u0010«\u0001\u001a\u00020\u00032\u0007\u0010¬\u0001\u001a\u00020\u00052\u0007\u0010\u00ad\u0001\u001a\u00020\u00052\u0007\u0010®\u0001\u001a\u00020\u0005H&J\u0011\u0010¯\u0001\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u0005H&J\u0012\u0010°\u0001\u001a\u00020\u00032\u0007\u0010±\u0001\u001a\u00020\u0005H&J\u0012\u0010²\u0001\u001a\u00020\u00032\u0007\u0010³\u0001\u001a\u00020\u0005H&J\t\u0010´\u0001\u001a\u00020\u0003H&J\u0011\u0010µ\u0001\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J\u0011\u0010¶\u0001\u001a\u00020\u00032\u0006\u0010c\u001a\u00020fH&J\u0012\u0010·\u0001\u001a\u00020\u00032\u0007\u0010¸\u0001\u001a\u00020\u0005H&J\u001b\u0010¹\u0001\u001a\u00020\u00032\u0007\u0010º\u0001\u001a\u00020\u00052\u0007\u0010¸\u0001\u001a\u00020\u0005H&J\u001b\u0010»\u0001\u001a\u00020\u00032\u0007\u0010¼\u0001\u001a\u00020\u00052\u0007\u0010½\u0001\u001a\u00020\u0005H&J4\u0010¾\u0001\u001a\u00020\u00032\u0007\u0010¿\u0001\u001a\u00020\u00052\u0007\u0010À\u0001\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0007\u0010Á\u0001\u001a\u00020\u0005H&J\u001a\u0010Â\u0001\u001a\u00020\u00032\u0007\u0010Ã\u0001\u001a\u00020\u00052\u0006\u0010c\u001a\u00020fH&J\u001b\u0010Ä\u0001\u001a\u00020\u00032\u0007\u0010Å\u0001\u001a\u00020\u00052\u0007\u0010Æ\u0001\u001a\u00020\bH&J\u0019\u0010Ç\u0001\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&J#\u0010È\u0001\u001a\u00030É\u00012\u000f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u00012\u0006\u0010Y\u001a\u00020\u0005H&J\u001b\u0010Í\u0001\u001a\u00020\u00032\u0007\u0010\n\u001a\u00030Î\u00012\u0007\u0010Ï\u0001\u001a\u00020\u0005H&J\u0011\u0010Ð\u0001\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0013\u0010Ñ\u0001\u001a\u00020\u00032\b\u0010Ò\u0001\u001a\u00030Ó\u0001H&J\t\u0010Ô\u0001\u001a\u00020\u0003H&J\t\u0010Õ\u0001\u001a\u00020\u0003H&J\u0012\u0010Ö\u0001\u001a\u00020\u00032\u0007\u0010×\u0001\u001a\u00020MH&J\t\u0010Ø\u0001\u001a\u00020\u0003H&J\t\u0010Ù\u0001\u001a\u00020\u0003H&J\u001b\u0010Ú\u0001\u001a\u00020\u00032\u0007\u0010Û\u0001\u001a\u00020\u00052\u0007\u0010Ü\u0001\u001a\u00020\u0018H&J\u001a\u0010Ý\u0001\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0007\u0010Þ\u0001\u001a\u00020\u0018H&J\t\u0010ß\u0001\u001a\u00020\u0003H&J#\u0010à\u0001\u001a\u00020\u00032\u0007\u0010á\u0001\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0007\u0010â\u0001\u001a\u00020\u0018H&J\u001b\u0010ã\u0001\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u00052\u0007\u0010â\u0001\u001a\u00020\u0018H&J\u0012\u0010å\u0001\u001a\u00020\u00032\u0007\u0010ä\u0001\u001a\u00020\u0005H&J\u0012\u0010æ\u0001\u001a\u00020\u00032\u0007\u0010ç\u0001\u001a\u00020\u0005H&J\t\u0010è\u0001\u001a\u00020\u0003H&J\t\u0010é\u0001\u001a\u00020\u0003H&J\t\u0010ê\u0001\u001a\u00020\u0003H&J\u0012\u0010ë\u0001\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\u0012\u0010ì\u0001\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\u001b\u0010í\u0001\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010î\u0001\u001a\u00020\u0005H&J\u001a\u0010ï\u0001\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0007\u0010ð\u0001\u001a\u00020\u0005H&J\t\u0010ñ\u0001\u001a\u00020\u0003H&J\t\u0010ò\u0001\u001a\u00020\u0003H&J\u0019\u0010ó\u0001\u001a\u00020\u00032\u000e\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050õ\u0001H&J\u0012\u0010ö\u0001\u001a\u00020\u00032\u0007\u0010÷\u0001\u001a\u00020\u0005H&J\t\u0010ø\u0001\u001a\u00020\u0003H&J\t\u0010ù\u0001\u001a\u00020\u0003H&J\u001b\u0010ú\u0001\u001a\u00020\u00032\u0007\u0010û\u0001\u001a\u00020\u00052\u0007\u0010ü\u0001\u001a\u00020\u0005H&J$\u0010ý\u0001\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010î\u0001\u001a\u00020\u00052\u0007\u0010þ\u0001\u001a\u00020MH&J\u0012\u0010ÿ\u0001\u001a\u00020\u00032\u0007\u0010\u0080\u0002\u001a\u00020\u0005H&J\u0013\u0010\u0081\u0002\u001a\u00020\u00032\b\u0010\u0082\u0002\u001a\u00030\u0083\u0002H&J\t\u0010\u0084\u0002\u001a\u00020\u0003H&J\t\u0010\u0085\u0002\u001a\u00020\u0003H&J\u0011\u0010\u0086\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\t\u0010\u0087\u0002\u001a\u00020\u0003H&J\u001b\u0010\u0088\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010î\u0001\u001a\u00020\u0005H&J\u0012\u0010\u0089\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J$\u0010\u008a\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010\u008b\u0002\u001a\u00020\u00052\u0007\u0010\u008c\u0002\u001a\u00020\u0005H&J\u0012\u0010\u008d\u0002\u001a\u00020\u00032\u0007\u0010\u008e\u0002\u001a\u00020MH&J#\u0010\u008f\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u00052\u0007\u0010\u008b\u0002\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H&J\t\u0010\u0090\u0002\u001a\u00020\u0003H&J\t\u0010\u0091\u0002\u001a\u00020\u0003H&J\u0011\u0010\u0092\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J4\u0010\u0093\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0007\u0010\u0094\u0002\u001a\u00020\u00052\u0007\u0010\u0095\u0002\u001a\u00020\u00052\u0007\u0010\u0096\u0002\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001a\u0010\u0097\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\u0012\u0010\u0098\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\t\u0010\u0099\u0002\u001a\u00020\u0003H&J\t\u0010\u009a\u0002\u001a\u00020\u0003H&J\u0011\u0010\u009b\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020MH&J\u0012\u0010\u009c\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\u0012\u0010\u009d\u0002\u001a\u00020\u00032\u0007\u0010\u009e\u0002\u001a\u00020MH&J\u0012\u0010\u009f\u0002\u001a\u00020\u00032\u0007\u0010 \u0002\u001a\u00020\u0018H&J\u001a\u0010¡\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0007\u0010 \u0002\u001a\u00020\u0018H&J-\u0010¢\u0002\u001a\u00020\u00032\u0007\u0010£\u0002\u001a\u00020\u00052\u0007\u0010¤\u0002\u001a\u00020\u00052\u0007\u0010¥\u0002\u001a\u00020\u00052\u0007\u0010¦\u0002\u001a\u00020\u0005H&J$\u0010§\u0002\u001a\u00020\u00032\u0007\u0010£\u0002\u001a\u00020\u00052\u0007\u0010¤\u0002\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u0005H&J\t\u0010¨\u0002\u001a\u00020\u0003H&J$\u0010©\u0002\u001a\u00020\u00032\u0007\u0010ª\u0002\u001a\u00020\u00052\u0007\u0010«\u0002\u001a\u00020\u00052\u0007\u0010¬\u0002\u001a\u00020\u0005H&J!\u0010\u00ad\u0002\u001a\u00020\u00032\u000e\u0010®\u0002\u001a\t\u0012\u0004\u0012\u00020\u00180Ë\u00012\u0006\u0010Y\u001a\u00020\u0005H&JG\u0010¯\u0002\u001a\u00020\u00032\u0007\u0010°\u0002\u001a\u00020\u00052\u0007\u0010±\u0002\u001a\u00020\u00052\u0007\u0010²\u0002\u001a\u00020\u00052\u0007\u0010³\u0002\u001a\u00020\u00052\u0007\u0010´\u0002\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u00052\u0007\u0010µ\u0002\u001a\u00020\u0005H&J\u0011\u0010¶\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u001d\u0010·\u0002\u001a\u00020\u00032\u0007\u0010¸\u0002\u001a\u00020\u00182\t\u0010¹\u0002\u001a\u0004\u0018\u00010\u0018H&J\u001d\u0010º\u0002\u001a\u00020\u00032\u0007\u0010¸\u0002\u001a\u00020\u00182\t\u0010¹\u0002\u001a\u0004\u0018\u00010\u0018H&J\t\u0010»\u0002\u001a\u00020\u0003H&J\u0011\u0010¼\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020MH&J\t\u0010½\u0002\u001a\u00020\u0003H&J\t\u0010¾\u0002\u001a\u00020\u0003H&J\u0011\u0010¿\u0002\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u0018H&J\u0012\u0010À\u0002\u001a\u00020\u00032\u0007\u0010Á\u0002\u001a\u00020\u0018H&J\u0011\u0010Â\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020MH&J\u0011\u0010Ã\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020MH&J\t\u0010Ä\u0002\u001a\u00020\u0003H&J\t\u0010Å\u0002\u001a\u00020\u0003H&J\t\u0010Æ\u0002\u001a\u00020\u0003H&J\t\u0010Ç\u0002\u001a\u00020\u0003H&J\t\u0010È\u0002\u001a\u00020\u0003H&J\u0011\u0010É\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J\t\u0010Ê\u0002\u001a\u00020\u0003H&¨\u0006Ë\u0002"}, d2 = {"Lcom/wakeup/commponent/module/ble/BleWatchService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getShortVideoLikeNumOrder", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "likes", "", "sendAirPressureAndUV", "weatherAllInfo", "Lcom/wakeup/common/network/entity/weather/WeatherAllInfo;", "setOnceOrRealTimeMeasure", "status", "control", "bodyTempMeasure", "setSyncDataHr", "timeInMillis", "", "syncSleepData", "syncSleepApnea", "findBand", "smartWarnNoContent", "messageId", "type", "setSmartWarnCarryContent", "content", "", "setQr", "qr", "setAlertClock", "id", a.C0193a.l, Constants.BundleKey.MINUTE, "repeat", "remindFlags", "sendUserInfo", "unit", "temperatureUnit", "birthday", "height", "weight", "", UserConstants.GOAL_NUM, "gender", "energyUnit", "setDisturbanceModel", "isOpen", "startHour", "startMinute", "endHour", "endMinute", "setUpHandLightScreen", "setDrinkWater", "", "otherStr", "controlStr", "startMin", "endMin", ak.aT, "(Ljava/lang/String;Ljava/lang/String;IIIIII)[Lcom/wakeup/commponent/module/ble/BleOrderModel;", "setOnTimeMeasure", "setSharkTakePhoto", "setBandLanguage", "language", "setBandLanguage2", "setSleepTimeRange", "sleepHour", "sleepMinute", "soberHour", "soberMinute", "set12HourSystem", "sendWeatherInfo2", "sendWeatherInfo", "setTimeSync", "setTimeZoneSync", "setClearData", "setResetBand", "setSedentaryWarn", "switchSpeed", "", "switchSpeed2", "setContactNum", "num", "sendContactName", "name", "sendContactPhone", "phone", "getMtu", "sendDialReq", "dataLength", HiAnalyticsConstant.Direction.REQUEST, "crc", "fileSize", "setRemind", "index", "min", "other", "heartReminder", "(Ljava/lang/String;Ljava/lang/String;II)[Lcom/wakeup/commponent/module/ble/BleOrderModel;", "marketInstall", "typeId", "data", "weChatPaySwitch", "sendGlucose", "", "sendBreathe", "verifyFriendInfo", "friendIndex", "checkResult", "sendFriendNameAndDate", "year", a.C0193a.j, a.C0193a.k, "sendFriendImage", "imageCrc", "packageSize", "sendFriendImageData", "imageData", "packageNo", "sendFriendAddressAndLocation", "sendFriendHealthData", "reminderSwitch", "sendDialData", ApiConstants.BYTES, "setSendPhoneSystem", "setSendLicenseNum", "mesNotifyPush", "iconPrompt", "notifyDisplay", "hideNotifyDetail", "notDisturbMode", "allDay", "sportDisturb", "setSleepMode", "autoOpen", "sleepMode", "sleepTracking", "chargeMind", "setPhysicalTraining", "autoPauseResume", "startPrompt", "stopPrompt", "keyPauseResume", "setHrEarlyWarning", "aerobicFitnessNotificationControl", "aerobicFitnessNotificationVal", "restingHrNotificationMinVal", "restingHrNotificationMaxVal", "sleepHrNotificationControl", "sleepHrNotificationMinVal", "SleepHrNotificationMaxVal", "setWakeUpScreenSettings", "knobTwiddleUp", "backToHome", "setSetLanguageSettings", "setSendUserinfoRequest", "setSendWeight", "setSendBodyFatRate", "rate", "flag", "state", "fatRate7Integer", "setSendMuscleMass", "FatRate7Integer", "setSendBmi", "sendCityName", "cityName", "sendCityWeather", "sendWeatherSwitch", "boolean", "sendCityAllWeather", "sendRTTAvatarImgWithIndex", "sendWeight", "synchronousRequest", "syncType", "checkCrc", "newCrc", "exerciseDuration", "numberOfActivities", "times", "activityHeat", Constants.BundleKey.KCAL, "getDeviceInfoData", "sendFileTransHead", "sendFileTransData", "sendFileReceiveHeadResp", "responseCode", "sendFileReceiveDataResp", "blockNo", "sendStreamCtrl", "streamId", "ctrl", "sendNucleicAcidCodeHead", "block_size", "block_no", "dataSize", "sendNucleicAcidCodeData", "package_no", "sendAltitudeAndPressure", "altitude", "weatherInfo", "sendMenstrualCheckData", "sendMenstrualInfo", "", "list", "", "Lcom/wakeup/commponent/module/health/MenstrualBean;", "sendSportStatus", "Lcom/wakeup/commponent/module/ble/DeviceSportStatus;", "sportType", "sendSwitchResponse", "sendSportData", "sportData", "Lcom/wakeup/commponent/module/sport/SportCacheData;", "checkSportDisConnectStatus", "getAudioBleMac", "sendAudioBle", "open", "getSicheLog", "getDeviceLog", "sendConnectRequestType", "connectType", "deviceModel", "sendProjectMessageNotification", "title", "checkDeviceNaviStatus", "sendMapNaviStatus", "naviType", FirebaseAnalytics.Param.DESTINATION, "sendMapNaviData", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "sendMapNaviDirection", "sendMapMode", DOMConstants.ATTR_MODE, "getDeviceSN", "getDeviceFN", "replyDeviceHeartBeat", "sendBtStatus", "sendTemperatureUnit", "sendNfcState", "errorCode", "getAvailableMemory", "type2", "sendIsForeground", "getScreen", "sendMetData", "dataList", "", "syncMetGoal", "met", "sendZkOtaFix1", "sendZkOtaFix2", "sendHeartSetting", "enable", "intervalTime", "sendEphemerisState", "isOffline", "syncGpsData", "time", "sendLocation", Constants.BundleKey.BEAN, "Lcom/wakeup/common/location/LocationBean;", "sendUserToken", "syncGpsLog", "sendCallStatus", "startZkOta", "sendBulletState", "sendNaviTransferOverState", "sendNaviState", "error", "frame", "sendCameraPreviewState", "isResume", "sendCameraPhotoState", "getDevVideoInfo", "getDeviceThumbInfo", "getDeviceThumbResolution", "sendQuestionSteamResult", "code", "completeCode", "overLength", "sendRecordPermission", "sendRecordState", "sendRecordTimeOut", "sendContentPaste", "sendAudioSearchSwitch", "getNetworkShareState", "sendXmlyResult", "isSuccess", "sendSleepKey", "key", "sendYouJieKey", "sendTransLangId", "deviceType", "project", "sourceLangId", "transLangId", "sendTransIdState", "syncSchedule", "ftpOTAStart", "version1", "version2", "size", "ftpOTAFileList", "fileNames", "ftpOTAProgress", "percent", "totalSize", "sentSize", "fileCount", "fileIndex", "fileSendSize", "ftpOTAEnd", "setWiFi", "ssid", "pwd", "deleteWiFi", "getWifiState", "switchWifiUdp", "getBtStatus", "sendBtReconnect", "sendLicense", "sendLocationStr", "str", "switchWifiP2P", "switchWifiAP", "requestDeviceCollapseData", "requestDevicePowerConsumption", "requestDeviceCpuUsed", "requestDeviceOtaResult", "requestDeviceLicense", "sendDelPoint", "requestLicenseEncryption", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BleWatchService extends IProvider {
    BleOrderModel activityHeat(int kcal);

    BleOrderModel bodyTempMeasure(int control);

    BleOrderModel checkDeviceNaviStatus();

    BleOrderModel checkSportDisConnectStatus();

    BleOrderModel deleteWiFi(String ssid, String pwd);

    BleOrderModel exerciseDuration(int data);

    BleOrderModel findBand();

    BleOrderModel ftpOTAEnd(int status);

    BleOrderModel ftpOTAFileList(List<String> fileNames, int crc);

    BleOrderModel ftpOTAProgress(int percent, int totalSize, int sentSize, int fileCount, int fileIndex, int fileSize, int fileSendSize);

    BleOrderModel ftpOTAStart(int version1, int version2, int size);

    BleOrderModel getAudioBleMac();

    BleOrderModel getAvailableMemory(int type, int type2);

    BleOrderModel getBtStatus();

    BleOrderModel getDevVideoInfo();

    BleOrderModel getDeviceFN();

    BleOrderModel getDeviceInfoData();

    BleOrderModel getDeviceLog();

    BleOrderModel getDeviceSN();

    BleOrderModel getDeviceThumbInfo();

    BleOrderModel getDeviceThumbResolution(int type);

    BleOrderModel getMtu(int type);

    BleOrderModel getNetworkShareState(int state);

    BleOrderModel getScreen();

    BleOrderModel getShortVideoLikeNumOrder(int likes);

    BleOrderModel getSicheLog();

    BleOrderModel getWifiState();

    BleOrderModel[] heartReminder(String otherStr, String controlStr, int type, int num);

    BleOrderModel marketInstall(int typeId, int data, int weChatPaySwitch);

    BleOrderModel mesNotifyPush(int iconPrompt, int notifyDisplay, int hideNotifyDetail);

    BleOrderModel notDisturbMode(int allDay, int sportDisturb);

    BleOrderModel numberOfActivities(int times);

    BleOrderModel reminderSwitch(String controlStr, String other);

    BleOrderModel replyDeviceHeartBeat();

    BleOrderModel requestDeviceCollapseData();

    BleOrderModel requestDeviceCpuUsed();

    BleOrderModel requestDeviceLicense();

    BleOrderModel requestDeviceOtaResult();

    BleOrderModel requestDevicePowerConsumption();

    BleOrderModel requestLicenseEncryption();

    BleOrderModel sendAirPressureAndUV(WeatherAllInfo weatherAllInfo);

    BleOrderModel sendAltitudeAndPressure(int altitude, WeatherAllInfo weatherInfo);

    BleOrderModel sendAudioBle(boolean open);

    BleOrderModel sendAudioSearchSwitch(boolean isOpen);

    BleOrderModel sendBreathe(byte[] data);

    BleOrderModel sendBtReconnect();

    BleOrderModel sendBtStatus(int state);

    BleOrderModel sendBulletState(int state, int errorCode);

    BleOrderModel sendCallStatus(int status);

    BleOrderModel sendCameraPhotoState(int state, int error, int num);

    BleOrderModel sendCameraPreviewState(boolean isResume);

    BleOrderModel sendCityAllWeather(WeatherAllInfo weatherAllInfo);

    BleOrderModel sendCityName(String cityName);

    BleOrderModel sendCityWeather(WeatherAllInfo weatherAllInfo);

    BleOrderModel sendConnectRequestType(int connectType, String deviceModel);

    BleOrderModel sendContactName(int id2, String name, int type);

    BleOrderModel sendContactPhone(int id2, String phone, int type);

    BleOrderModel sendContentPaste();

    BleOrderModel sendDelPoint(int type);

    BleOrderModel sendDialData(byte[] bytes);

    BleOrderModel sendDialReq(int dataLength, int req, int crc, int status, int fileSize);

    BleOrderModel sendEphemerisState(int state, int errorCode, boolean isOffline);

    BleOrderModel sendFileReceiveDataResp(int blockNo, int responseCode);

    BleOrderModel sendFileReceiveHeadResp(int responseCode);

    BleOrderModel sendFileTransData(byte[] data);

    BleOrderModel sendFileTransHead(byte[] data);

    BleOrderModel sendFriendAddressAndLocation(byte[] data, int friendIndex, int type);

    BleOrderModel sendFriendHealthData(byte[] data);

    BleOrderModel sendFriendImage(int imageCrc, long packageSize, int friendIndex);

    BleOrderModel sendFriendImageData(byte[] imageData, int packageNo);

    BleOrderModel sendFriendNameAndDate(int friendIndex, int year, int month, int day, int hour, int min, String name);

    BleOrderModel sendGlucose(byte[] data);

    BleOrderModel sendHeartSetting(int enable, int intervalTime);

    BleOrderModel sendIsForeground();

    BleOrderModel sendLicense(String data);

    BleOrderModel sendLocation(LocationBean bean);

    BleOrderModel sendLocationStr(String str);

    BleOrderModel sendMapMode(int mode);

    BleOrderModel sendMapNaviData(int direction, String destination);

    BleOrderModel sendMapNaviDirection(int direction);

    BleOrderModel sendMapNaviStatus(int naviType, int status, String destination);

    BleOrderModel sendMenstrualCheckData(int index, int status);

    void sendMenstrualInfo(List<MenstrualBean> list, int crc);

    BleOrderModel sendMetData(List<Integer> dataList);

    BleOrderModel sendNaviState(int state, int error, int frame);

    BleOrderModel sendNaviTransferOverState(int state);

    BleOrderModel sendNfcState(int state, int errorCode);

    BleOrderModel sendNucleicAcidCodeData(int package_no, byte[] data);

    BleOrderModel sendNucleicAcidCodeHead(int block_size, int block_no, int crc, int status, int dataSize);

    BleOrderModel sendProjectMessageNotification(String content, String title);

    BleOrderModel sendQuestionSteamResult(int type, int code, int completeCode, int overLength, String content);

    BleOrderModel sendRTTAvatarImgWithIndex(int friendIndex, int imageCrc);

    BleOrderModel sendRecordPermission(int type, int state);

    BleOrderModel sendRecordState(int state);

    BleOrderModel sendRecordTimeOut();

    BleOrderModel sendSleepKey(String key);

    BleOrderModel sendSportData(SportCacheData sportData);

    BleOrderModel sendSportStatus(DeviceSportStatus status, int sportType);

    BleOrderModel sendStreamCtrl(int streamId, int ctrl);

    BleOrderModel sendSwitchResponse(int status);

    BleOrderModel sendTemperatureUnit(int state);

    BleOrderModel sendTransIdState(int deviceType, int project, int state);

    BleOrderModel sendTransLangId(int deviceType, int project, int sourceLangId, int transLangId);

    BleOrderModel sendUserInfo(int unit, int temperatureUnit, long birthday, int height, float weight, int goalNum, int gender, int energyUnit);

    BleOrderModel sendUserToken();

    BleOrderModel sendWeatherInfo(WeatherAllInfo weatherAllInfo);

    BleOrderModel sendWeatherInfo2(WeatherAllInfo weatherAllInfo);

    BleOrderModel sendWeatherSwitch(boolean r1);

    BleOrderModel sendWeight(byte[] data);

    BleOrderModel sendXmlyResult(boolean isSuccess);

    BleOrderModel sendYouJieKey(int type, String key);

    BleOrderModel sendZkOtaFix1();

    BleOrderModel sendZkOtaFix2();

    BleOrderModel set12HourSystem(int control);

    BleOrderModel setAlertClock(int id2, int status, int hour, int minute, int repeat, int remindFlags);

    BleOrderModel setBandLanguage(int language);

    BleOrderModel setBandLanguage2(int language);

    BleOrderModel setClearData();

    BleOrderModel setContactNum(int id2, int num);

    BleOrderModel setDisturbanceModel(int isOpen, int startHour, int startMinute, int endHour, int endMinute);

    BleOrderModel[] setDrinkWater(String otherStr, String controlStr, int control, int startHour, int startMin, int endHour, int endMin, int interval);

    BleOrderModel setHrEarlyWarning(int aerobicFitnessNotificationControl, int aerobicFitnessNotificationVal, int control, int restingHrNotificationMinVal, int restingHrNotificationMaxVal, int sleepHrNotificationControl, int sleepHrNotificationMinVal, int SleepHrNotificationMaxVal);

    BleOrderModel setOnTimeMeasure(int control);

    BleOrderModel setOnceOrRealTimeMeasure(int status, int control);

    BleOrderModel setPhysicalTraining(int autoPauseResume, int startPrompt, int stopPrompt, int keyPauseResume);

    BleOrderModel setQr(String qr, int type);

    BleOrderModel[] setRemind(String otherStr, String controlStr, int type, int index, int control, int hour, int min, int other);

    BleOrderModel setResetBand();

    BleOrderModel[] setSedentaryWarn(String otherStr, String controlStr, int control, int startHour, int startMinute, int endHour, int endMinute, int interval);

    BleOrderModel setSendBmi(byte[] bytes);

    BleOrderModel setSendBodyFatRate(int rate, int flag, int state, int fatRate7Integer);

    BleOrderModel setSendLicenseNum();

    BleOrderModel setSendMuscleMass(int rate, int flag, int state, int FatRate7Integer);

    BleOrderModel setSendPhoneSystem();

    BleOrderModel setSendUserinfoRequest(int imageCrc, String name);

    BleOrderModel setSendWeight(byte[] bytes);

    BleOrderModel setSetLanguageSettings(int language);

    BleOrderModel setSharkTakePhoto(int control);

    BleOrderModel setSleepMode(int autoOpen, int sleepMode, int sleepTracking, int chargeMind);

    BleOrderModel setSleepTimeRange(int control, int sleepHour, int sleepMinute, int soberHour, int soberMinute);

    BleOrderModel setSmartWarnCarryContent(int messageId, int type, String content);

    BleOrderModel setSyncDataHr(long timeInMillis);

    BleOrderModel setTimeSync();

    BleOrderModel setTimeZoneSync();

    BleOrderModel setUpHandLightScreen(int control);

    BleOrderModel setWakeUpScreenSettings(int knobTwiddleUp, int backToHome);

    BleOrderModel setWiFi(String ssid, String pwd);

    BleOrderModel smartWarnNoContent(int messageId, int type);

    BleOrderModel startZkOta();

    BleOrderModel switchSpeed(boolean isOpen);

    BleOrderModel switchSpeed2(boolean isOpen, int type);

    BleOrderModel switchWifiAP(boolean isOpen);

    BleOrderModel switchWifiP2P(boolean isOpen);

    BleOrderModel switchWifiUdp(boolean isOpen);

    BleOrderModel syncGpsData(int time);

    BleOrderModel syncGpsLog();

    BleOrderModel syncMetGoal(int met);

    BleOrderModel syncSchedule();

    BleOrderModel syncSleepApnea(long timeInMillis);

    BleOrderModel syncSleepData(long timeInMillis);

    BleOrderModel synchronousRequest(int syncType, int checkCrc, int newCrc);

    BleOrderModel verifyFriendInfo(int friendIndex, int checkResult);
}
