package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.api.ErrorCode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoEntity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b7\b\u0086\b\u0018\u0000 Î\u00012\u00020\u0001:\u0002Î\u0001Bã\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\b\b\u0002\u0010'\u001a\u00020\u001e\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u00020;¢\u0006\u0004\b8\u0010<J\u0016\u0010\u0093\u0001\u001a\u00020\u001e2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0096\u0002J\t\u0010\u0096\u0001\u001a\u00020\u0007H\u0016J\u001b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0006\u0010:\u001a\u00020;2\u0007\u0010\u0099\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u009a\u0001\u001a\u00020\u0007H\u0016J\u0007\u0010\u009b\u0001\u001a\u00020\u001eJ\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010EJ\n\u0010¢\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u001eHÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010EJ\n\u0010·\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u001eHÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ê\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106HÆ\u0003J¤\u0004\u0010Ë\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u001e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010+\u001a\u00020\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106HÆ\u0001¢\u0006\u0003\u0010Ì\u0001J\n\u0010Í\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010KR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010>\"\u0004\bM\u0010NR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010BR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010BR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010>R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010>R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010H\u001a\u0004\b[\u0010ER\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010H\u001a\u0004\b\\\u0010ER\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010>R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u001f\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010a\"\u0004\be\u0010cR\u001e\u0010 \u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bf\u0010E\"\u0004\bg\u0010GR\u001a\u0010!\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010B\"\u0004\bk\u0010KR\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010>\"\u0004\bm\u0010NR\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010>\"\u0004\bo\u0010NR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010>\"\u0004\bq\u0010NR\u001a\u0010&\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010B\"\u0004\bs\u0010KR\u001a\u0010'\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010a\"\u0004\bt\u0010cR\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010>\"\u0004\bv\u0010NR\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010>\"\u0004\bx\u0010NR\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010>\"\u0004\bz\u0010NR\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010B\"\u0004\b|\u0010KR\u001d\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010>\"\u0005\b\u0082\u0001\u0010NR\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010>\"\u0005\b\u0084\u0001\u0010NR\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010>\"\u0005\b\u0086\u0001\u0010NR\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010>\"\u0005\b\u0088\u0001\u0010NR\u001e\u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010>\"\u0005\b\u008a\u0001\u0010NR\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010>\"\u0005\b\u008c\u0001\u0010NR\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010>\"\u0005\b\u008e\u0001\u0010NR&\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006Ï\u0001"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoEntity;", "Landroid/os/Parcelable;", "id", "", "categoryTitle", "categoryContent", "categoryTime", "", "categoryUnit", "categoryLevel1", "commentsNumber", "itemId", "categoryUrl", "categoryPushTime", "", "categoryPushName", "categoryPushAvatar", "categoryPushId", "imageUrl", "imageWidth", "imageHigh", "categoryCollectionId", "collectionTitle", "collectionContent", "collectionChapter", "collectionOrder", "sceneId", "traceId", "expIds", "attentionStatus", "", "likeStatus", "likeNumber", "storeStatus", "storeNumber", "browseTime", "selfClarification", "categoryVisibility", "shareNum", "isHeightSet", "categoryExtendStr", "extend", "adAgency", "adPos", HandleInvocationsFromAdViewer.KEY_AD_DATA, "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "adPlacementId", "adPositon", "majorVersion", "code", "mac", "bltName", "publishType", "imageList", "", "Lcom/wakeup/common/network/entity/video/ImageItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/wakeup/common/nativead/entity/NativeAdItemEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()Ljava/lang/String;", "getCategoryTitle", "getCategoryContent", "getCategoryTime", "()I", "getCategoryUnit", "getCategoryLevel1", "()Ljava/lang/Integer;", "setCategoryLevel1", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCommentsNumber", "setCommentsNumber", "(I)V", "getItemId", "setItemId", "(Ljava/lang/String;)V", "getCategoryUrl", "getCategoryPushTime", "()J", "getCategoryPushName", "getCategoryPushAvatar", "getCategoryPushId", "getImageUrl", "getImageWidth", "getImageHigh", "getCategoryCollectionId", "getCollectionTitle", "getCollectionContent", "getCollectionChapter", "getCollectionOrder", "getSceneId", "getTraceId", "getExpIds", "getAttentionStatus", "()Z", "setAttentionStatus", "(Z)V", "getLikeStatus", "setLikeStatus", "getLikeNumber", "setLikeNumber", "getStoreStatus", "setStoreStatus", "getStoreNumber", "setStoreNumber", "getBrowseTime", "setBrowseTime", "getSelfClarification", "setSelfClarification", "getCategoryVisibility", "setCategoryVisibility", "getShareNum", "setShareNum", "setHeightSet", "getCategoryExtendStr", "setCategoryExtendStr", "getExtend", "setExtend", "getAdAgency", "setAdAgency", "getAdPos", "setAdPos", "getAdData", "()Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "setAdData", "(Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;)V", "getAdPlacementId", "setAdPlacementId", "getAdPositon", "setAdPositon", "getMajorVersion", "setMajorVersion", "getCode", "setCode", "getMac", "setMac", "getBltName", "setBltName", "getPublishType", "setPublishType", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "equals", "other", "", "hashCode", "writeToParcel", "", "flags", "describeContents", "isImageText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/wakeup/common/nativead/entity/NativeAdItemEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/wakeup/common/network/entity/video/VideoEntity;", "toString", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoEntity implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String adAgency;
    private NativeAdItemEntity adData;
    private String adPlacementId;
    private int adPos;
    private String adPositon;
    private boolean attentionStatus;
    private String bltName;
    private String browseTime;
    private final String categoryCollectionId;
    private final String categoryContent;
    private String categoryExtendStr;
    private Integer categoryLevel1;
    private final String categoryPushAvatar;
    private final String categoryPushId;
    private final String categoryPushName;
    private final long categoryPushTime;
    private final int categoryTime;
    private final String categoryTitle;
    private final int categoryUnit;
    private final String categoryUrl;
    private String categoryVisibility;
    private String code;
    private final Integer collectionChapter;
    private final String collectionContent;
    private final Integer collectionOrder;
    private final String collectionTitle;
    private int commentsNumber;
    private final String expIds;
    private String extend;
    private final String id;
    private final int imageHigh;
    private List<ImageItem> imageList;
    private final String imageUrl;
    private final int imageWidth;
    private boolean isHeightSet;
    private String itemId;
    private Integer likeNumber;
    private boolean likeStatus;
    private String mac;
    private String majorVersion;
    private String publishType;
    private final String sceneId;
    private String selfClarification;
    private int shareNum;
    private int storeNumber;
    private boolean storeStatus;
    private final String traceId;

    public static /* synthetic */ VideoEntity copy$default(VideoEntity videoEntity, String str, String str2, String str3, int i, int i2, Integer num, int i3, String str4, String str5, long j, String str6, String str7, String str8, String str9, int i4, int i5, String str10, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, boolean z, boolean z2, Integer num4, boolean z3, int i6, String str16, String str17, String str18, int i7, boolean z4, String str19, String str20, String str21, int i8, NativeAdItemEntity nativeAdItemEntity, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, int i9, int i10, Object obj) {
        String str29 = (i9 & 1) != 0 ? videoEntity.id : str;
        return videoEntity.copy(str29, (i9 & 2) != 0 ? videoEntity.categoryTitle : str2, (i9 & 4) != 0 ? videoEntity.categoryContent : str3, (i9 & 8) != 0 ? videoEntity.categoryTime : i, (i9 & 16) != 0 ? videoEntity.categoryUnit : i2, (i9 & 32) != 0 ? videoEntity.categoryLevel1 : num, (i9 & 64) != 0 ? videoEntity.commentsNumber : i3, (i9 & 128) != 0 ? videoEntity.itemId : str4, (i9 & 256) != 0 ? videoEntity.categoryUrl : str5, (i9 & 512) != 0 ? videoEntity.categoryPushTime : j, (i9 & 1024) != 0 ? videoEntity.categoryPushName : str6, (i9 & 2048) != 0 ? videoEntity.categoryPushAvatar : str7, (i9 & 4096) != 0 ? videoEntity.categoryPushId : str8, (i9 & 8192) != 0 ? videoEntity.imageUrl : str9, (i9 & 16384) != 0 ? videoEntity.imageWidth : i4, (i9 & 32768) != 0 ? videoEntity.imageHigh : i5, (i9 & 65536) != 0 ? videoEntity.categoryCollectionId : str10, (i9 & 131072) != 0 ? videoEntity.collectionTitle : str11, (i9 & 262144) != 0 ? videoEntity.collectionContent : str12, (i9 & 524288) != 0 ? videoEntity.collectionChapter : num2, (i9 & 1048576) != 0 ? videoEntity.collectionOrder : num3, (i9 & 2097152) != 0 ? videoEntity.sceneId : str13, (i9 & 4194304) != 0 ? videoEntity.traceId : str14, (i9 & 8388608) != 0 ? videoEntity.expIds : str15, (i9 & 16777216) != 0 ? videoEntity.attentionStatus : z, (i9 & 33554432) != 0 ? videoEntity.likeStatus : z2, (i9 & 67108864) != 0 ? videoEntity.likeNumber : num4, (i9 & 134217728) != 0 ? videoEntity.storeStatus : z3, (i9 & 268435456) != 0 ? videoEntity.storeNumber : i6, (i9 & 536870912) != 0 ? videoEntity.browseTime : str16, (i9 & 1073741824) != 0 ? videoEntity.selfClarification : str17, (i9 & Integer.MIN_VALUE) != 0 ? videoEntity.categoryVisibility : str18, (i10 & 1) != 0 ? videoEntity.shareNum : i7, (i10 & 2) != 0 ? videoEntity.isHeightSet : z4, (i10 & 4) != 0 ? videoEntity.categoryExtendStr : str19, (i10 & 8) != 0 ? videoEntity.extend : str20, (i10 & 16) != 0 ? videoEntity.adAgency : str21, (i10 & 32) != 0 ? videoEntity.adPos : i8, (i10 & 64) != 0 ? videoEntity.adData : nativeAdItemEntity, (i10 & 128) != 0 ? videoEntity.adPlacementId : str22, (i10 & 256) != 0 ? videoEntity.adPositon : str23, (i10 & 512) != 0 ? videoEntity.majorVersion : str24, (i10 & 1024) != 0 ? videoEntity.code : str25, (i10 & 2048) != 0 ? videoEntity.mac : str26, (i10 & 4096) != 0 ? videoEntity.bltName : str27, (i10 & 8192) != 0 ? videoEntity.publishType : str28, (i10 & 16384) != 0 ? videoEntity.imageList : list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCategoryPushTime() {
        return this.categoryPushTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCategoryPushName() {
        return this.categoryPushName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCategoryPushAvatar() {
        return this.categoryPushAvatar;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCategoryPushId() {
        return this.categoryPushId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final int getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component16, reason: from getter */
    public final int getImageHigh() {
        return this.imageHigh;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCategoryCollectionId() {
        return this.categoryCollectionId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getCollectionTitle() {
        return this.collectionTitle;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCollectionContent() {
        return this.collectionContent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getCollectionChapter() {
        return this.collectionChapter;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getCollectionOrder() {
        return this.collectionOrder;
    }

    /* renamed from: component22, reason: from getter */
    public final String getSceneId() {
        return this.sceneId;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component24, reason: from getter */
    public final String getExpIds() {
        return this.expIds;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getLikeStatus() {
        return this.likeStatus;
    }

    /* renamed from: component27, reason: from getter */
    public final Integer getLikeNumber() {
        return this.likeNumber;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getStoreStatus() {
        return this.storeStatus;
    }

    /* renamed from: component29, reason: from getter */
    public final int getStoreNumber() {
        return this.storeNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCategoryContent() {
        return this.categoryContent;
    }

    /* renamed from: component30, reason: from getter */
    public final String getBrowseTime() {
        return this.browseTime;
    }

    /* renamed from: component31, reason: from getter */
    public final String getSelfClarification() {
        return this.selfClarification;
    }

    /* renamed from: component32, reason: from getter */
    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    /* renamed from: component33, reason: from getter */
    public final int getShareNum() {
        return this.shareNum;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getIsHeightSet() {
        return this.isHeightSet;
    }

    /* renamed from: component35, reason: from getter */
    public final String getCategoryExtendStr() {
        return this.categoryExtendStr;
    }

    /* renamed from: component36, reason: from getter */
    public final String getExtend() {
        return this.extend;
    }

    /* renamed from: component37, reason: from getter */
    public final String getAdAgency() {
        return this.adAgency;
    }

    /* renamed from: component38, reason: from getter */
    public final int getAdPos() {
        return this.adPos;
    }

    /* renamed from: component39, reason: from getter */
    public final NativeAdItemEntity getAdData() {
        return this.adData;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCategoryTime() {
        return this.categoryTime;
    }

    /* renamed from: component40, reason: from getter */
    public final String getAdPlacementId() {
        return this.adPlacementId;
    }

    /* renamed from: component41, reason: from getter */
    public final String getAdPositon() {
        return this.adPositon;
    }

    /* renamed from: component42, reason: from getter */
    public final String getMajorVersion() {
        return this.majorVersion;
    }

    /* renamed from: component43, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component44, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component45, reason: from getter */
    public final String getBltName() {
        return this.bltName;
    }

    /* renamed from: component46, reason: from getter */
    public final String getPublishType() {
        return this.publishType;
    }

    public final List<ImageItem> component47() {
        return this.imageList;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCategoryUnit() {
        return this.categoryUnit;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getCategoryLevel1() {
        return this.categoryLevel1;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCommentsNumber() {
        return this.commentsNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCategoryUrl() {
        return this.categoryUrl;
    }

    public final VideoEntity copy(String id2, String categoryTitle, String categoryContent, int categoryTime, int categoryUnit, Integer categoryLevel1, int commentsNumber, String itemId, String categoryUrl, long categoryPushTime, String categoryPushName, String categoryPushAvatar, String categoryPushId, String imageUrl, int imageWidth, int imageHigh, String categoryCollectionId, String collectionTitle, String collectionContent, Integer collectionChapter, Integer collectionOrder, String sceneId, String traceId, String expIds, boolean attentionStatus, boolean likeStatus, Integer likeNumber, boolean storeStatus, int storeNumber, String browseTime, String selfClarification, String categoryVisibility, int shareNum, boolean isHeightSet, String categoryExtendStr, String extend, String adAgency, int adPos, NativeAdItemEntity adData, String adPlacementId, String adPositon, String majorVersion, String code, String mac, String bltName, String publishType, List<ImageItem> imageList) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(categoryContent, "categoryContent");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        Intrinsics.checkNotNullParameter(categoryPushId, "categoryPushId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new VideoEntity(id2, categoryTitle, categoryContent, categoryTime, categoryUnit, categoryLevel1, commentsNumber, itemId, categoryUrl, categoryPushTime, categoryPushName, categoryPushAvatar, categoryPushId, imageUrl, imageWidth, imageHigh, categoryCollectionId, collectionTitle, collectionContent, collectionChapter, collectionOrder, sceneId, traceId, expIds, attentionStatus, likeStatus, likeNumber, storeStatus, storeNumber, browseTime, selfClarification, categoryVisibility, shareNum, isHeightSet, categoryExtendStr, extend, adAgency, adPos, adData, adPlacementId, adPositon, majorVersion, code, mac, bltName, publishType, imageList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "VideoEntity(id=" + this.id + ", categoryTitle=" + this.categoryTitle + ", categoryContent=" + this.categoryContent + ", categoryTime=" + this.categoryTime + ", categoryUnit=" + this.categoryUnit + ", categoryLevel1=" + this.categoryLevel1 + ", commentsNumber=" + this.commentsNumber + ", itemId=" + this.itemId + ", categoryUrl=" + this.categoryUrl + ", categoryPushTime=" + this.categoryPushTime + ", categoryPushName=" + this.categoryPushName + ", categoryPushAvatar=" + this.categoryPushAvatar + ", categoryPushId=" + this.categoryPushId + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHigh=" + this.imageHigh + ", categoryCollectionId=" + this.categoryCollectionId + ", collectionTitle=" + this.collectionTitle + ", collectionContent=" + this.collectionContent + ", collectionChapter=" + this.collectionChapter + ", collectionOrder=" + this.collectionOrder + ", sceneId=" + this.sceneId + ", traceId=" + this.traceId + ", expIds=" + this.expIds + ", attentionStatus=" + this.attentionStatus + ", likeStatus=" + this.likeStatus + ", likeNumber=" + this.likeNumber + ", storeStatus=" + this.storeStatus + ", storeNumber=" + this.storeNumber + ", browseTime=" + this.browseTime + ", selfClarification=" + this.selfClarification + ", categoryVisibility=" + this.categoryVisibility + ", shareNum=" + this.shareNum + ", isHeightSet=" + this.isHeightSet + ", categoryExtendStr=" + this.categoryExtendStr + ", extend=" + this.extend + ", adAgency=" + this.adAgency + ", adPos=" + this.adPos + ", adData=" + this.adData + ", adPlacementId=" + this.adPlacementId + ", adPositon=" + this.adPositon + ", majorVersion=" + this.majorVersion + ", code=" + this.code + ", mac=" + this.mac + ", bltName=" + this.bltName + ", publishType=" + this.publishType + ", imageList=" + this.imageList + Separators.RPAREN;
    }

    public VideoEntity(String id2, String str, String categoryContent, int i, int i2, Integer num, int i3, String itemId, String categoryUrl, long j, String str2, String str3, String categoryPushId, String imageUrl, int i4, int i5, String str4, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9, boolean z, boolean z2, Integer num4, boolean z3, int i6, String str10, String str11, String str12, int i7, boolean z4, String str13, String str14, String str15, int i8, NativeAdItemEntity nativeAdItemEntity, String str16, String str17, String str18, String str19, String str20, String str21, String str22, List<ImageItem> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(categoryContent, "categoryContent");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        Intrinsics.checkNotNullParameter(categoryPushId, "categoryPushId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = id2;
        this.categoryTitle = str;
        this.categoryContent = categoryContent;
        this.categoryTime = i;
        this.categoryUnit = i2;
        this.categoryLevel1 = num;
        this.commentsNumber = i3;
        this.itemId = itemId;
        this.categoryUrl = categoryUrl;
        this.categoryPushTime = j;
        this.categoryPushName = str2;
        this.categoryPushAvatar = str3;
        this.categoryPushId = categoryPushId;
        this.imageUrl = imageUrl;
        this.imageWidth = i4;
        this.imageHigh = i5;
        this.categoryCollectionId = str4;
        this.collectionTitle = str5;
        this.collectionContent = str6;
        this.collectionChapter = num2;
        this.collectionOrder = num3;
        this.sceneId = str7;
        this.traceId = str8;
        this.expIds = str9;
        this.attentionStatus = z;
        this.likeStatus = z2;
        this.likeNumber = num4;
        this.storeStatus = z3;
        this.storeNumber = i6;
        this.browseTime = str10;
        this.selfClarification = str11;
        this.categoryVisibility = str12;
        this.shareNum = i7;
        this.isHeightSet = z4;
        this.categoryExtendStr = str13;
        this.extend = str14;
        this.adAgency = str15;
        this.adPos = i8;
        this.adData = nativeAdItemEntity;
        this.adPlacementId = str16;
        this.adPositon = str17;
        this.majorVersion = str18;
        this.code = str19;
        this.mac = str20;
        this.bltName = str21;
        this.publishType = str22;
        this.imageList = list;
    }

    public /* synthetic */ VideoEntity(String str, String str2, String str3, int i, int i2, Integer num, int i3, String str4, String str5, long j, String str6, String str7, String str8, String str9, int i4, int i5, String str10, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, boolean z, boolean z2, Integer num4, boolean z3, int i6, String str16, String str17, String str18, int i7, boolean z4, String str19, String str20, String str21, int i8, NativeAdItemEntity nativeAdItemEntity, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? 0 : i, i2, num, (i9 & 64) != 0 ? 0 : i3, (i9 & 128) != 0 ? "" : str4, (i9 & 256) != 0 ? "" : str5, j, str6, str7, str8, str9, i4, i5, str10, str11, str12, num2, num3, (i9 & 2097152) != 0 ? ErrorCode.exception : str13, str14, str15, z, z2, num4, z3, i6, str16, str17, str18, i7, (i10 & 2) != 0 ? false : z4, str19, (i10 & 8) != 0 ? "" : str20, (i10 & 16) != 0 ? "" : str21, i8, (i10 & 64) != 0 ? null : nativeAdItemEntity, (i10 & 128) != 0 ? "" : str22, (i10 & 256) != 0 ? "" : str23, (i10 & 512) != 0 ? "" : str24, (i10 & 1024) != 0 ? "" : str25, (i10 & 2048) != 0 ? "" : str26, (i10 & 4096) != 0 ? "" : str27, (i10 & 8192) != 0 ? "video" : str28, (i10 & 16384) != 0 ? null : list);
    }

    public final String getId() {
        return this.id;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final String getCategoryContent() {
        return this.categoryContent;
    }

    public final int getCategoryTime() {
        return this.categoryTime;
    }

    public final int getCategoryUnit() {
        return this.categoryUnit;
    }

    public final Integer getCategoryLevel1() {
        return this.categoryLevel1;
    }

    public final void setCategoryLevel1(Integer num) {
        this.categoryLevel1 = num;
    }

    public final int getCommentsNumber() {
        return this.commentsNumber;
    }

    public final void setCommentsNumber(int i) {
        this.commentsNumber = i;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final void setItemId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemId = str;
    }

    public final String getCategoryUrl() {
        return this.categoryUrl;
    }

    public final long getCategoryPushTime() {
        return this.categoryPushTime;
    }

    public final String getCategoryPushName() {
        return this.categoryPushName;
    }

    public final String getCategoryPushAvatar() {
        return this.categoryPushAvatar;
    }

    public final String getCategoryPushId() {
        return this.categoryPushId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final int getImageHigh() {
        return this.imageHigh;
    }

    public final String getCategoryCollectionId() {
        return this.categoryCollectionId;
    }

    public final String getCollectionTitle() {
        return this.collectionTitle;
    }

    public final String getCollectionContent() {
        return this.collectionContent;
    }

    public final Integer getCollectionChapter() {
        return this.collectionChapter;
    }

    public final Integer getCollectionOrder() {
        return this.collectionOrder;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final boolean getAttentionStatus() {
        return this.attentionStatus;
    }

    public final void setAttentionStatus(boolean z) {
        this.attentionStatus = z;
    }

    public final boolean getLikeStatus() {
        return this.likeStatus;
    }

    public final void setLikeStatus(boolean z) {
        this.likeStatus = z;
    }

    public final Integer getLikeNumber() {
        return this.likeNumber;
    }

    public final void setLikeNumber(Integer num) {
        this.likeNumber = num;
    }

    public final boolean getStoreStatus() {
        return this.storeStatus;
    }

    public final void setStoreStatus(boolean z) {
        this.storeStatus = z;
    }

    public final int getStoreNumber() {
        return this.storeNumber;
    }

    public final void setStoreNumber(int i) {
        this.storeNumber = i;
    }

    public final String getBrowseTime() {
        return this.browseTime;
    }

    public final void setBrowseTime(String str) {
        this.browseTime = str;
    }

    public final String getSelfClarification() {
        return this.selfClarification;
    }

    public final void setSelfClarification(String str) {
        this.selfClarification = str;
    }

    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    public final void setCategoryVisibility(String str) {
        this.categoryVisibility = str;
    }

    public final int getShareNum() {
        return this.shareNum;
    }

    public final void setShareNum(int i) {
        this.shareNum = i;
    }

    public final boolean isHeightSet() {
        return this.isHeightSet;
    }

    public final void setHeightSet(boolean z) {
        this.isHeightSet = z;
    }

    public final String getCategoryExtendStr() {
        return this.categoryExtendStr;
    }

    public final void setCategoryExtendStr(String str) {
        this.categoryExtendStr = str;
    }

    public final String getExtend() {
        return this.extend;
    }

    public final void setExtend(String str) {
        this.extend = str;
    }

    public final String getAdAgency() {
        return this.adAgency;
    }

    public final void setAdAgency(String str) {
        this.adAgency = str;
    }

    public final int getAdPos() {
        return this.adPos;
    }

    public final void setAdPos(int i) {
        this.adPos = i;
    }

    public final NativeAdItemEntity getAdData() {
        return this.adData;
    }

    public final void setAdData(NativeAdItemEntity nativeAdItemEntity) {
        this.adData = nativeAdItemEntity;
    }

    public final String getAdPlacementId() {
        return this.adPlacementId;
    }

    public final void setAdPlacementId(String str) {
        this.adPlacementId = str;
    }

    public final String getAdPositon() {
        return this.adPositon;
    }

    public final void setAdPositon(String str) {
        this.adPositon = str;
    }

    public final String getMajorVersion() {
        return this.majorVersion;
    }

    public final void setMajorVersion(String str) {
        this.majorVersion = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    public final String getBltName() {
        return this.bltName;
    }

    public final void setBltName(String str) {
        this.bltName = str;
    }

    public final String getPublishType() {
        return this.publishType;
    }

    public final void setPublishType(String str) {
        this.publishType = str;
    }

    public final List<ImageItem> getImageList() {
        return this.imageList;
    }

    public final void setImageList(List<ImageItem> list) {
        this.imageList = list;
    }

    public boolean equals(Object other) {
        if (other instanceof VideoEntity) {
            return Intrinsics.areEqual(this.itemId, ((VideoEntity) other).itemId);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.itemId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoEntity(android.os.Parcel r56) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.video.VideoEntity.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.categoryTitle);
        parcel.writeString(this.categoryContent);
        parcel.writeInt(this.categoryTime);
        parcel.writeInt(this.categoryUnit);
        parcel.writeValue(this.categoryLevel1);
        parcel.writeInt(this.commentsNumber);
        parcel.writeString(this.itemId);
        parcel.writeString(this.categoryUrl);
        parcel.writeLong(this.categoryPushTime);
        parcel.writeString(this.categoryPushName);
        parcel.writeString(this.categoryPushAvatar);
        parcel.writeString(this.categoryPushId);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHigh);
        parcel.writeString(this.categoryCollectionId);
        parcel.writeString(this.collectionTitle);
        parcel.writeString(this.collectionContent);
        parcel.writeValue(this.collectionChapter);
        parcel.writeValue(this.collectionOrder);
        parcel.writeString(this.sceneId);
        parcel.writeString(this.traceId);
        parcel.writeString(this.expIds);
        parcel.writeByte(this.attentionStatus ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.likeStatus ? (byte) 1 : (byte) 0);
        Integer num = this.likeNumber;
        parcel.writeInt(num != null ? num.intValue() : 0);
        parcel.writeByte(this.storeStatus ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.storeNumber);
        parcel.writeString(this.browseTime);
        parcel.writeString(this.selfClarification);
        parcel.writeString(this.categoryVisibility);
        parcel.writeInt(this.shareNum);
        parcel.writeValue(Boolean.valueOf(this.isHeightSet));
        parcel.writeString(this.categoryExtendStr);
        parcel.writeString(this.extend);
        parcel.writeString(this.adAgency);
        parcel.writeInt(this.adPos);
        parcel.writeString(this.majorVersion);
        parcel.writeString(this.code);
        parcel.writeString(this.mac);
        parcel.writeString(this.bltName);
        parcel.writeString(this.publishType);
        parcel.writeTypedList(this.imageList);
    }

    public final boolean isImageText() {
        return Intrinsics.areEqual(this.publishType, "image_text");
    }

    /* compiled from: VideoEntity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/network/entity/video/VideoEntity;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.network.entity.video.VideoEntity$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<VideoEntity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoEntity[] newArray(int size) {
            return new VideoEntity[size];
        }
    }
}
