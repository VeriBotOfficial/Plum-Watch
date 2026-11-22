package com.otaliastudios.opengl.internal;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.autonavi.aps.amapapi.config.Const;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: gl.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\u001a&\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a&\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010C\u001a.\u0010H\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a&\u0010L\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010C\u001a&\u0010O\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010C\u001a.\u0010R\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010K\u001a\u001e\u0010V\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010X\u001a\u001e\u0010Y\u001a\u00020;2\u0006\u0010A\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010>\u001a\u0011\u0010[\u001a\u00020\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u001e\u0010\\\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010X\u001a&\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010d\u001a&\u0010e\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010d\u001a\u001e\u0010g\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010>\u001a\u001e\u0010i\u001a\u00020;2\u0006\u0010A\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010>\u001a&\u0010k\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010d\u001a\u001e\u0010m\u001a\u00020;2\u0006\u0010a\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bn\u0010>\u001a.\u0010o\u001a\u00020;2\u0006\u0010p\u001a\u00020\u00052\u0006\u0010q\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010K\u001a6\u0010s\u001a\u00020;2\u0006\u0010p\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00052\u0006\u0010t\u001a\u00020uH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010w\u001a\u001e\u0010x\u001a\u00020;2\u0006\u0010a\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010>\u001a>\u0010z\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00052\u0006\u0010}\u001a\u00020\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007f\u001a(\u0010\u0080\u0001\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0081\u0001\u0010d\u001a(\u0010\u0082\u0001\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0083\u0001\u0010d\u001a(\u0010\u0084\u0001\u001a\u00020;2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010a\u001a\u00020bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0085\u0001\u0010d\u001a+\u0010\u0086\u0001\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0012\u0010\u008b\u0001\u001a\u00020\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a*\u0010\u008c\u0001\u001a\u00020;2\u0007\u0010\u008d\u0001\u001a\u00020\u00052\u0007\u0010a\u001a\u00030\u008e\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008f\u0001\u0010d\u001a,\u0010\u0090\u0001\u001a\r \u0091\u0001*\u0005\u0018\u00010\u0088\u00010\u0088\u00012\u0006\u0010@\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a4\u0010\u0094\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00052\u0007\u0010\u008d\u0001\u001a\u00020\u00052\b\u0010\u0095\u0001\u001a\u00030\u008e\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a,\u0010\u0098\u0001\u001a\r \u0091\u0001*\u0005\u0018\u00010\u0088\u00010\u0088\u00012\u0006\u0010A\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0093\u0001\u001a4\u0010\u009a\u0001\u001a\u00020;2\u0006\u0010A\u001a\u00020\u00052\u0007\u0010\u008d\u0001\u001a\u00020\u00052\b\u0010\u0095\u0001\u001a\u00030\u008e\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a+\u0010\u009c\u0001\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u008a\u0001\u001a \u0010\u009e\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009f\u0001\u0010>\u001a+\u0010 \u0001\u001a\u00020;2\u0006\u0010A\u001a\u00020\u00052\b\u0010¡\u0001\u001a\u00030\u0088\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001ai\u0010¤\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010}\u001a\u00020\u00012\u0007\u0010¥\u0001\u001a\u00020\u00012\u0007\u0010¦\u0001\u001a\u00020\u00012\u0007\u0010§\u0001\u001a\u00020\u00012\u0007\u0010¨\u0001\u001a\u00020\u00012\u0007\u0010©\u0001\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u00052\t\u0010ª\u0001\u001a\u0004\u0018\u00010uH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001\u001a3\u0010\u00ad\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0007\u0010\u008d\u0001\u001a\u00020\u00052\u0007\u0010®\u0001\u001a\u00020\u0013H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001\u001a2\u0010±\u0001\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0007\u0010\u008d\u0001\u001a\u00020\u00052\u0007\u0010®\u0001\u001a\u00020\u0001H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b²\u0001\u0010K\u001a*\u0010³\u0001\u001a\u00020;2\u0007\u0010´\u0001\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u00012\r\u0010®\u0001\u001a\b0µ\u0001j\u0003`¶\u0001H\u0080\b\u001a%\u0010³\u0001\u001a\u00020;2\u0007\u0010´\u0001\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u00012\b\u0010®\u0001\u001a\u00030·\u0001H\u0080\b\u001a4\u0010¸\u0001\u001a\u00020;2\u0007\u0010´\u0001\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u00012\b\u0010¹\u0001\u001a\u00030º\u00012\r\u0010®\u0001\u001a\b0µ\u0001j\u0003`¶\u0001H\u0080\b\u001a/\u0010¸\u0001\u001a\u00020;2\u0007\u0010´\u0001\u001a\u00020\u00012\u0006\u0010`\u001a\u00020\u00012\b\u0010¹\u0001\u001a\u00030º\u00012\b\u0010®\u0001\u001a\u00030·\u0001H\u0080\b\u001a \u0010»\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¼\u0001\u0010>\u001aM\u0010½\u0001\u001a\u00020;2\u0006\u0010I\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00052\b\u0010¾\u0001\u001a\u00030º\u00012\u0007\u0010¿\u0001\u001a\u00020\u00012\u0007\u0010À\u0001\u001a\u00020uH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001\u001aW\u0010Ã\u0001\u001a\u0003HÄ\u0001\"\u0005\b\u0000\u0010Ä\u00012\u0007\u0010¡\u0001\u001a\u00020b2\t\b\u0002\u0010Å\u0001\u001a\u00020\u00012\b\b\u0002\u0010`\u001a\u00020\u00012\u0016\u0010Æ\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0005\u0012\u0003HÄ\u00010Ç\u0001H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\b\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0003\"\u0019\u0010\n\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0003\"\u0019\u0010\f\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0003\"\u0019\u0010\u000e\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0003\"\u0019\u0010\u0010\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u0013X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0019\u0010\u0016\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0003\"\u0014\u0010\u0018\u001a\u00020\u0013X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0019\u0010\u001c\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0003\"\u001b\u0010\u001e\u001a\u00020\u00058\u0000X\u0081\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0003\"\u0019\u0010 \u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0003\"\u0019\u0010\"\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0003\"\u0019\u0010$\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0003\"\u0019\u0010&\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0003\"\u0019\u0010(\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0003\"\u0019\u0010*\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0003\"\u0019\u0010,\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0003\"\u0019\u0010.\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0003\"\u0019\u00100\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0003\"\u0014\u00102\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0003\"\u0019\u00104\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0003\"\u0019\u00106\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0003\"\u0014\u00108\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Ê\u0001"}, d2 = {"GL_CLAMP_TO_EDGE", "", "getGL_CLAMP_TO_EDGE", "()I", "GL_COLOR_ATTACHMENT0", "Lkotlin/UInt;", "getGL_COLOR_ATTACHMENT0", TokenNames.I, "GL_COMPILE_STATUS", "getGL_COMPILE_STATUS", "GL_FLOAT", "getGL_FLOAT", "GL_FRAGMENT_SHADER", "getGL_FRAGMENT_SHADER", "GL_FRAMEBUFFER", "getGL_FRAMEBUFFER", "GL_FRAMEBUFFER_COMPLETE", "getGL_FRAMEBUFFER_COMPLETE", "GL_LINEAR", "", "getGL_LINEAR", "()F", "GL_LINK_STATUS", "getGL_LINK_STATUS", "GL_NEAREST", "getGL_NEAREST", "GL_NO_ERROR", "getGL_NO_ERROR", "GL_RGBA", "getGL_RGBA", "GL_SHADER_STORAGE_BUFFER", "getGL_SHADER_STORAGE_BUFFER", "GL_TEXTURE0", "getGL_TEXTURE0", "GL_TEXTURE_EXTERNAL_OES", "getGL_TEXTURE_EXTERNAL_OES", "GL_TEXTURE_MAG_FILTER", "getGL_TEXTURE_MAG_FILTER", "GL_TEXTURE_MIN_FILTER", "getGL_TEXTURE_MIN_FILTER", "GL_TEXTURE_WRAP_S", "getGL_TEXTURE_WRAP_S", "GL_TEXTURE_WRAP_T", "getGL_TEXTURE_WRAP_T", "GL_TRIANGLES", "getGL_TRIANGLES", "GL_TRIANGLE_FAN", "getGL_TRIANGLE_FAN", "GL_TRIANGLE_STRIP", "getGL_TRIANGLE_STRIP", "GL_TRUE", "getGL_TRUE", "GL_UNSIGNED_BYTE", "getGL_UNSIGNED_BYTE", "GL_VERTEX_SHADER", "getGL_VERTEX_SHADER", "GL_VIEWPORT", "getGL_VIEWPORT", "glActiveTexture", "", "unit", "glActiveTexture-WZ4Q5Ns", "(I)V", "glAttachShader", "program", "shader", "glAttachShader-feOb9K0", "(II)V", "glBindBuffer", "target", "id", "glBindBuffer-feOb9K0", "glBindBufferBase", "index", "glBindBufferBase-zly0blg", "(III)V", "glBindFramebuffer", "framebuffer", "glBindFramebuffer-feOb9K0", "glBindTexture", "texture", "glBindTexture-feOb9K0", "glBufferData", "size", Constants.COLLATION_OPTION_USAGE, "glBufferData-Mv_zs3U", "glCheckFramebufferStatus", "glCheckFramebufferStatus-WZ4Q5Ns", "(I)I", "glCompileShader", "glCompileShader-WZ4Q5Ns", "glCreateProgram", "glCreateShader", "type", "glCreateShader-WZ4Q5Ns", "glDeleteBuffers", Const.SP_KEY_CALL_LOC_COUNT, "array", "Lkotlin/UIntArray;", "glDeleteBuffers-wZx4R44", "(I[I)V", "glDeleteFramebuffers", "glDeleteFramebuffers-wZx4R44", "glDeleteProgram", "glDeleteProgram-WZ4Q5Ns", "glDeleteShader", "glDeleteShader-WZ4Q5Ns", "glDeleteTextures", "glDeleteTextures-wZx4R44", "glDisableVertexAttribArray", "glDisableVertexAttribArray-WZ4Q5Ns", "glDrawArrays", DOMConstants.ATTR_MODE, AMapLocationStaticsEntity.FIRST_LOCATE, "glDrawArrays-OzbTU-A", "glDrawElements", "indices", "Ljava/nio/Buffer;", "glDrawElements-b1QGwmY", "(IIILjava/nio/Buffer;)V", "glEnableVertexAttribArray", "glEnableVertexAttribArray-WZ4Q5Ns", "glFramebufferTexture2D", "attachment", "textureTarget", "level", "glFramebufferTexture2D-guggwrw", "(IIIII)V", "glGenBuffers", "glGenBuffers-wZx4R44", "glGenFramebuffers", "glGenFramebuffers-wZx4R44", "glGenTextures", "glGenTextures-wZx4R44", "glGetAttribLocation", "name", "", "glGetAttribLocation-qim9Vi0", "(ILjava/lang/String;)I", "glGetError", "glGetIntegerv", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "", "glGetIntegerv-qim9Vi0", "glGetProgramInfoLog", "kotlin.jvm.PlatformType", "glGetProgramInfoLog-WZ4Q5Ns", "(I)Ljava/lang/String;", "glGetProgramiv", "result", "glGetProgramiv-t3GQkyU", "(II[I)V", "glGetShaderInfoLog", "glGetShaderInfoLog-WZ4Q5Ns", "glGetShaderiv", "glGetShaderiv-t3GQkyU", "glGetUniformLocation", "glGetUniformLocation-qim9Vi0", "glLinkProgram", "glLinkProgram-WZ4Q5Ns", "glShaderSource", "source", "glShaderSource-qim9Vi0", "(ILjava/lang/String;)V", "glTexImage2D", "internalFormat", "width", "height", "border", "format", "pixels", "glTexImage2D-IcfoKm0", "(IIIIIIIILjava/nio/Buffer;)V", "glTexParameterf", "value", "glTexParameterf-t3GQkyU", "(IIF)V", "glTexParameteri", "glTexParameteri-t3GQkyU", "glUniform4fv", "location", "Ljava/nio/FloatBuffer;", "Lcom/otaliastudios/opengl/types/FloatBuffer;", "", "glUniformMatrix4fv", "transpose", "", "glUseProgram", "glUseProgram-WZ4Q5Ns", "glVertexAttribPointer", "normalized", "stride", "pointer", "glVertexAttribPointer-GaBhZ9s", "(IIIZILjava/nio/Buffer;)V", "withSignedArray", "T", "pos", "block", "Lkotlin/Function1;", "withSignedArray-p-eMuHY", "([IIILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "library_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes17.dex */
public final class GlKt {
    private static final int GL_NO_ERROR = 0;
    private static final int GL_TRUE = 1;
    private static final int GL_SHADER_STORAGE_BUFFER = UInt.m14152constructorimpl(37074);
    private static final int GL_VIEWPORT = 2978;
    private static final int GL_UNSIGNED_BYTE = UInt.m14152constructorimpl(5121);
    private static final int GL_FLOAT = UInt.m14152constructorimpl(5126);
    private static final int GL_RGBA = UInt.m14152constructorimpl(6408);
    private static final int GL_TRIANGLES = UInt.m14152constructorimpl(4);
    private static final int GL_TRIANGLE_FAN = UInt.m14152constructorimpl(6);
    private static final int GL_TRIANGLE_STRIP = UInt.m14152constructorimpl(5);
    private static final int GL_TEXTURE0 = UInt.m14152constructorimpl(33984);
    private static final int GL_TEXTURE_EXTERNAL_OES = UInt.m14152constructorimpl(36197);
    private static final int GL_TEXTURE_MIN_FILTER = UInt.m14152constructorimpl(10241);
    private static final int GL_TEXTURE_MAG_FILTER = UInt.m14152constructorimpl(10240);
    private static final int GL_TEXTURE_WRAP_S = UInt.m14152constructorimpl(10242);
    private static final int GL_TEXTURE_WRAP_T = UInt.m14152constructorimpl(10243);
    private static final int GL_CLAMP_TO_EDGE = 33071;
    private static final float GL_NEAREST = 9728.0f;
    private static final float GL_LINEAR = 9729.0f;
    private static final int GL_FRAMEBUFFER = UInt.m14152constructorimpl(36160);
    private static final int GL_FRAMEBUFFER_COMPLETE = UInt.m14152constructorimpl(36053);
    private static final int GL_COLOR_ATTACHMENT0 = UInt.m14152constructorimpl(36064);
    private static final int GL_COMPILE_STATUS = UInt.m14152constructorimpl(35713);
    private static final int GL_LINK_STATUS = UInt.m14152constructorimpl(35714);
    private static final int GL_VERTEX_SHADER = UInt.m14152constructorimpl(35633);
    private static final int GL_FRAGMENT_SHADER = UInt.m14152constructorimpl(35632);

    public static final int getGL_TRUE() {
        return GL_TRUE;
    }

    public static final int getGL_SHADER_STORAGE_BUFFER() {
        return GL_SHADER_STORAGE_BUFFER;
    }

    public static final int getGL_VIEWPORT() {
        return GL_VIEWPORT;
    }

    public static final int getGL_NO_ERROR() {
        return GL_NO_ERROR;
    }

    public static final int getGL_UNSIGNED_BYTE() {
        return GL_UNSIGNED_BYTE;
    }

    public static final int getGL_FLOAT() {
        return GL_FLOAT;
    }

    public static final int getGL_RGBA() {
        return GL_RGBA;
    }

    public static final int getGL_TRIANGLES() {
        return GL_TRIANGLES;
    }

    public static final int getGL_TRIANGLE_FAN() {
        return GL_TRIANGLE_FAN;
    }

    public static final int getGL_TRIANGLE_STRIP() {
        return GL_TRIANGLE_STRIP;
    }

    public static final int getGL_TEXTURE0() {
        return GL_TEXTURE0;
    }

    public static final int getGL_TEXTURE_EXTERNAL_OES() {
        return GL_TEXTURE_EXTERNAL_OES;
    }

    public static final int getGL_TEXTURE_MIN_FILTER() {
        return GL_TEXTURE_MIN_FILTER;
    }

    public static final int getGL_TEXTURE_MAG_FILTER() {
        return GL_TEXTURE_MAG_FILTER;
    }

    public static final int getGL_TEXTURE_WRAP_S() {
        return GL_TEXTURE_WRAP_S;
    }

    public static final int getGL_TEXTURE_WRAP_T() {
        return GL_TEXTURE_WRAP_T;
    }

    public static final int getGL_CLAMP_TO_EDGE() {
        return GL_CLAMP_TO_EDGE;
    }

    public static final float getGL_NEAREST() {
        return GL_NEAREST;
    }

    public static final float getGL_LINEAR() {
        return GL_LINEAR;
    }

    public static final int getGL_FRAMEBUFFER() {
        return GL_FRAMEBUFFER;
    }

    public static final int getGL_FRAMEBUFFER_COMPLETE() {
        return GL_FRAMEBUFFER_COMPLETE;
    }

    public static final int getGL_COLOR_ATTACHMENT0() {
        return GL_COLOR_ATTACHMENT0;
    }

    public static final int getGL_COMPILE_STATUS() {
        return GL_COMPILE_STATUS;
    }

    public static final int getGL_LINK_STATUS() {
        return GL_LINK_STATUS;
    }

    public static final int getGL_VERTEX_SHADER() {
        return GL_VERTEX_SHADER;
    }

    public static final int getGL_FRAGMENT_SHADER() {
        return GL_FRAGMENT_SHADER;
    }

    /* renamed from: glActiveTexture-WZ4Q5Ns, reason: not valid java name */
    public static final void m8191glActiveTextureWZ4Q5Ns(int i) {
        GLES20.glActiveTexture(i);
    }

    /* renamed from: glBindTexture-feOb9K0, reason: not valid java name */
    public static final void m8196glBindTexturefeOb9K0(int i, int i2) {
        GLES20.glBindTexture(i, i2);
    }

    /* renamed from: glTexParameteri-t3GQkyU, reason: not valid java name */
    public static final void m8225glTexParameterit3GQkyU(int i, int i2, int i3) {
        GLES20.glTexParameteri(i, i2, i3);
    }

    /* renamed from: glTexParameterf-t3GQkyU, reason: not valid java name */
    public static final void m8224glTexParameterft3GQkyU(int i, int i2, float f) {
        GLES20.glTexParameterf(i, i2, f);
    }

    /* renamed from: glTexImage2D-IcfoKm0, reason: not valid java name */
    public static final void m8223glTexImage2DIcfoKm0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        GLES20.glTexImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    /* renamed from: glBindFramebuffer-feOb9K0, reason: not valid java name */
    public static final void m8195glBindFramebufferfeOb9K0(int i, int i2) {
        GLES20.glBindFramebuffer(i, i2);
    }

    /* renamed from: glCheckFramebufferStatus-WZ4Q5Ns, reason: not valid java name */
    public static final int m8198glCheckFramebufferStatusWZ4Q5Ns(int i) {
        return UInt.m14152constructorimpl(GLES20.glCheckFramebufferStatus(i));
    }

    /* renamed from: glFramebufferTexture2D-guggwrw, reason: not valid java name */
    public static final void m8210glFramebufferTexture2Dguggwrw(int i, int i2, int i3, int i4, int i5) {
        GLES20.glFramebufferTexture2D(i, i2, i3, i4, i5);
    }

    /* renamed from: glBindBuffer-feOb9K0, reason: not valid java name */
    public static final void m8193glBindBufferfeOb9K0(int i, int i2) {
        GLES20.glBindBuffer(i, i2);
    }

    /* renamed from: glBufferData-Mv_zs3U, reason: not valid java name */
    public static final void m8197glBufferDataMv_zs3U(int i, int i2, int i3) {
        GLES20.glBufferData(i, i2, null, i3);
    }

    /* renamed from: glBindBufferBase-zly0blg, reason: not valid java name */
    public static final void m8194glBindBufferBasezly0blg(int i, int i2, int i3) {
        GLES30.glBindBufferBase(i, i2, i3);
    }

    /* renamed from: glCreateShader-WZ4Q5Ns, reason: not valid java name */
    public static final int m8200glCreateShaderWZ4Q5Ns(int i) {
        return UInt.m14152constructorimpl(GLES20.glCreateShader(i));
    }

    /* renamed from: glShaderSource-qim9Vi0, reason: not valid java name */
    public static final void m8222glShaderSourceqim9Vi0(int i, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        GLES20.glShaderSource(i, source);
    }

    /* renamed from: glCompileShader-WZ4Q5Ns, reason: not valid java name */
    public static final void m8199glCompileShaderWZ4Q5Ns(int i) {
        GLES20.glCompileShader(i);
    }

    /* renamed from: glDeleteShader-WZ4Q5Ns, reason: not valid java name */
    public static final void m8204glDeleteShaderWZ4Q5Ns(int i) {
        GLES20.glDeleteShader(i);
    }

    /* renamed from: glGetShaderInfoLog-WZ4Q5Ns, reason: not valid java name */
    public static final String m8218glGetShaderInfoLogWZ4Q5Ns(int i) {
        return GLES20.glGetShaderInfoLog(i);
    }

    /* renamed from: glGetShaderiv-t3GQkyU, reason: not valid java name */
    public static final void m8219glGetShaderivt3GQkyU(int i, int i2, int[] result) {
        Intrinsics.checkNotNullParameter(result, "result");
        GLES20.glGetShaderiv(i, i2, result, 0);
    }

    public static final int glCreateProgram() {
        return UInt.m14152constructorimpl(GLES20.glCreateProgram());
    }

    /* renamed from: glAttachShader-feOb9K0, reason: not valid java name */
    public static final void m8192glAttachShaderfeOb9K0(int i, int i2) {
        GLES20.glAttachShader(i, i2);
    }

    /* renamed from: glLinkProgram-WZ4Q5Ns, reason: not valid java name */
    public static final void m8221glLinkProgramWZ4Q5Ns(int i) {
        GLES20.glLinkProgram(i);
    }

    /* renamed from: glUseProgram-WZ4Q5Ns, reason: not valid java name */
    public static final void m8226glUseProgramWZ4Q5Ns(int i) {
        GLES20.glUseProgram(i);
    }

    /* renamed from: glDeleteProgram-WZ4Q5Ns, reason: not valid java name */
    public static final void m8203glDeleteProgramWZ4Q5Ns(int i) {
        GLES20.glDeleteProgram(i);
    }

    /* renamed from: glGetProgramInfoLog-WZ4Q5Ns, reason: not valid java name */
    public static final String m8216glGetProgramInfoLogWZ4Q5Ns(int i) {
        return GLES20.glGetProgramInfoLog(i);
    }

    /* renamed from: glGetProgramiv-t3GQkyU, reason: not valid java name */
    public static final void m8217glGetProgramivt3GQkyU(int i, int i2, int[] result) {
        Intrinsics.checkNotNullParameter(result, "result");
        GLES20.glGetProgramiv(i, i2, result, 0);
    }

    /* renamed from: glEnableVertexAttribArray-WZ4Q5Ns, reason: not valid java name */
    public static final void m8209glEnableVertexAttribArrayWZ4Q5Ns(int i) {
        GLES20.glEnableVertexAttribArray(i);
    }

    /* renamed from: glDisableVertexAttribArray-WZ4Q5Ns, reason: not valid java name */
    public static final void m8206glDisableVertexAttribArrayWZ4Q5Ns(int i) {
        GLES20.glDisableVertexAttribArray(i);
    }

    /* renamed from: glGetAttribLocation-qim9Vi0, reason: not valid java name */
    public static final int m8214glGetAttribLocationqim9Vi0(int i, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return GLES20.glGetAttribLocation(i, name);
    }

    /* renamed from: glGetUniformLocation-qim9Vi0, reason: not valid java name */
    public static final int m8220glGetUniformLocationqim9Vi0(int i, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return GLES20.glGetUniformLocation(i, name);
    }

    /* renamed from: glVertexAttribPointer-GaBhZ9s, reason: not valid java name */
    public static final void m8227glVertexAttribPointerGaBhZ9s(int i, int i2, int i3, boolean z, int i4, Buffer pointer) {
        Intrinsics.checkNotNullParameter(pointer, "pointer");
        GLES20.glVertexAttribPointer(i, i2, i3, z, i4, pointer);
    }

    public static final void glUniformMatrix4fv(int i, int i2, boolean z, FloatBuffer value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GLES20.glUniformMatrix4fv(i, i2, z, value);
    }

    public static final void glUniformMatrix4fv(int i, int i2, boolean z, float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GLES20.glUniformMatrix4fv(i, i2, z, value, 0);
    }

    public static final void glUniform4fv(int i, int i2, FloatBuffer value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GLES20.glUniform4fv(i, i2, value);
    }

    public static final void glUniform4fv(int i, int i2, float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GLES20.glUniform4fv(i, i2, value, 0);
    }

    /* renamed from: glGetIntegerv-qim9Vi0, reason: not valid java name */
    public static final void m8215glGetIntegervqim9Vi0(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        GLES20.glGetIntegerv(i, array, 0);
    }

    public static final int glGetError() {
        return UInt.m14152constructorimpl(GLES20.glGetError());
    }

    /* renamed from: glDrawArrays-OzbTU-A, reason: not valid java name */
    public static final void m8207glDrawArraysOzbTUA(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: glDrawElements-b1QGwmY, reason: not valid java name */
    public static final void m8208glDrawElementsb1QGwmY(int i, int i2, int i3, Buffer indices) {
        Intrinsics.checkNotNullParameter(indices, "indices");
        GLES20.glDrawElements(i, i2, i3, indices);
    }

    /* renamed from: withSignedArray-p-eMuHY$default, reason: not valid java name */
    static /* synthetic */ Object m8229withSignedArraypeMuHY$default(int[] iArr, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m14213getSizeimpl(iArr);
        }
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(iArr);
        int[] iArr2 = new int[m14213getSizeimpl];
        for (int i4 = 0; i4 < m14213getSizeimpl; i4++) {
            iArr2[i4] = UIntArray.m14212getpVg5ArA(iArr, i4);
        }
        Object invoke = function1.invoke(iArr2);
        int i5 = i2 + i;
        if (i < i5) {
            while (true) {
                int i6 = i + 1;
                UIntArray.m14217setVXSXFK8(iArr, i, UInt.m14152constructorimpl(iArr2[i]));
                if (i6 >= i5) {
                    break;
                }
                i = i6;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[], java.lang.Object] */
    /* renamed from: withSignedArray-p-eMuHY, reason: not valid java name */
    private static final <T> T m8228withSignedArraypeMuHY(int[] iArr, int i, int i2, Function1<? super int[], ? extends T> function1) {
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(iArr);
        ?? r1 = new int[m14213getSizeimpl];
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            r1[i3] = UIntArray.m14212getpVg5ArA(iArr, i3);
        }
        T invoke = function1.invoke(r1);
        int i4 = i2 + i;
        if (i < i4) {
            while (true) {
                int i5 = i + 1;
                UIntArray.m14217setVXSXFK8(iArr, i, UInt.m14152constructorimpl(r1[i]));
                if (i5 >= i4) {
                    break;
                }
                i = i5;
            }
        }
        return invoke;
    }

    /* renamed from: glGenTextures-wZx4R44, reason: not valid java name */
    public static final void m8213glGenTextureswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glGenTextures(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    /* renamed from: glDeleteTextures-wZx4R44, reason: not valid java name */
    public static final void m8205glDeleteTextureswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glDeleteTextures(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    /* renamed from: glGenFramebuffers-wZx4R44, reason: not valid java name */
    public static final void m8212glGenFramebufferswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glGenFramebuffers(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    /* renamed from: glDeleteFramebuffers-wZx4R44, reason: not valid java name */
    public static final void m8202glDeleteFramebufferswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glDeleteFramebuffers(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    /* renamed from: glGenBuffers-wZx4R44, reason: not valid java name */
    public static final void m8211glGenBufferswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glGenBuffers(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    /* renamed from: glDeleteBuffers-wZx4R44, reason: not valid java name */
    public static final void m8201glDeleteBufferswZx4R44(int i, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int m14213getSizeimpl = UIntArray.m14213getSizeimpl(array);
        int[] iArr = new int[m14213getSizeimpl];
        int i2 = 0;
        for (int i3 = 0; i3 < m14213getSizeimpl; i3++) {
            iArr[i3] = UIntArray.m14212getpVg5ArA(array, i3);
        }
        GLES20.glDeleteBuffers(i, iArr, 0);
        Unit unit = Unit.INSTANCE;
        if (i <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            UIntArray.m14217setVXSXFK8(array, i2, UInt.m14152constructorimpl(iArr[i2]));
            if (i4 >= i) {
                return;
            } else {
                i2 = i4;
            }
        }
    }
}
