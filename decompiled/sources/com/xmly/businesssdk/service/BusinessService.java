package com.xmly.businesssdk.service;

import com.facebook.hermes.intl.Constants;
import com.xmly.businesssdk.network.bean.AlbumInfo;
import com.xmly.businesssdk.network.bean.ApiResponse;
import com.xmly.businesssdk.network.bean.BaseRequestInfo;
import com.xmly.businesssdk.network.bean.CardInfo;
import com.xmly.businesssdk.network.bean.CommonSubscribeResponse;
import com.xmly.businesssdk.network.bean.DeviceVipInfo;
import com.xmly.businesssdk.network.bean.EcoBenefitData;
import com.xmly.businesssdk.network.bean.HistoryInfo;
import com.xmly.businesssdk.network.bean.PagedApiResponse;
import com.xmly.businesssdk.network.bean.album.Album;
import com.xmly.businesssdk.network.bean.listen.ListenGroup;
import com.xmly.businesssdk.network.bean.search.TextSearchResponse;
import com.xmly.businesssdk.network.bean.track.Track;
import com.xmly.businesssdk.network.bean.track.TrackPage;
import io.nats.client.support.ApiConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.opencv.videoio.Videoio;

/* compiled from: BusinessService.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH&J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t\u0018\u00010\bH&J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH&J:\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\t\u0018\u00010\bH&J.\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\bH&J \u0010\u0017\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t\u0018\u00010\bH&J\u001c\u0010\u0019\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0018\u00010\bJ,\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t\u0018\u00010\bH&J \u0010\u001c\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d\u0018\u00010\bH&JD\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u001f0\t\u0018\u00010\bH&J(\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH&J(\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH&J&\u0010#\u001a\u00020\u00042\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000e0\t\u0018\u00010\bH&J.\u0010%\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000e0\t\u0018\u00010\bH&JH\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\r2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\bH&J4\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\r2\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0\u001f0\t\u0018\u00010\bH&J\u0010\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H&J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020)H&J\u0018\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\rH&J$\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\rH&J0\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\rH&J>\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t\u0018\u00010\bH&J(\u0010:\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0018\u00010\bH&J0\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\t\u0018\u00010\bH&J(\u0010@\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0018\u00010\bH&J\"\u0010A\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\bH&¨\u0006D"}, d2 = {"Lcom/xmly/businesssdk/service/BusinessService;", "", "()V", "fetchAblumList", "", "cardId", "", "callback", "Lcom/xmly/businesssdk/service/Callback;", "Lcom/xmly/businesssdk/network/bean/ApiResponse;", "Lcom/xmly/businesssdk/network/bean/CardInfo;", "fetchAlbumBatch", "ids", "", "", "Lcom/xmly/businesssdk/network/bean/album/Album;", "fetchCardList", "fetchCommonHistoryList", "page", ApiConstants.LIMIT, "Lcom/xmly/businesssdk/network/bean/HistoryInfo;", "fetchCommonSubscribeList", "Lcom/xmly/businesssdk/network/bean/CommonSubscribeResponse;", "fetchDeviceVipInfo", "Lcom/xmly/businesssdk/network/bean/DeviceVipInfo;", "fetchEcoBenefitQualification", "Lcom/xmly/businesssdk/network/bean/EcoBenefitData;", "thirdDeviceInfo", "fetchHistoryList", "Lcom/xmly/businesssdk/network/bean/PagedApiResponse;", "fetchListenList", "", "Lcom/xmly/businesssdk/network/bean/listen/ListenGroup;", "fetchRankList", "fetchRecommendList", "fetchSubscribeList", "Lcom/xmly/businesssdk/network/bean/AlbumInfo;", "fetchTrackBatch", "Lcom/xmly/businesssdk/network/bean/track/Track;", "fetchTrackList", "albumId", "", "recordId", Constants.SORT, "Lcom/xmly/businesssdk/network/bean/track/TrackPage;", "isSubscribeBatch", "albumIds", "", "jumpAlbumInfoList", "id", "jumpTrackInfo", "jumpWith", "jumpType", "jumpValue", "extValue", "title", "searchAlbum", "query", "subscribeAlbum", "Lcom/xmly/businesssdk/network/bean/BaseRequestInfo;", "", "textAiSearch", "text", "Lcom/xmly/businesssdk/network/bean/search/TextSearchResponse;", "unsubscribeAlbum", "verifyAlbumPermission", "Lcom/xmly/businesssdk/service/AuthResult;", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BusinessService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, String> CARD_STYLE_MAP = MapsKt.mapOf(TuplesKt.to(562, "1xN"), TuplesKt.to(Integer.valueOf(Videoio.CAP_PROP_XI_KNEEPOINT1), "1xN_min"), TuplesKt.to(Integer.valueOf(Videoio.CAP_PROP_XI_TS_RST_MODE), "banner"));

    /* compiled from: BusinessService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xmly/businesssdk/service/BusinessService$Companion;", "", "()V", "CARD_STYLE_MAP", "", "", "", "getStyleByCardId", "cardId", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getStyleByCardId(int cardId) {
            String str = (String) BusinessService.CARD_STYLE_MAP.get(Integer.valueOf(cardId));
            return str == null ? "1xN" : str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAblumList$default(BusinessService businessService, int i, Callback callback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAblumList");
        }
        if ((i2 & 2) != 0) {
            callback = null;
        }
        businessService.fetchAblumList(i, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAlbumBatch$default(BusinessService businessService, String str, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAlbumBatch");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.fetchAlbumBatch(str, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCardList$default(BusinessService businessService, int i, Callback callback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCardList");
        }
        if ((i2 & 2) != 0) {
            callback = null;
        }
        businessService.fetchCardList(i, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCommonHistoryList$default(BusinessService businessService, int i, int i2, Callback callback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCommonHistoryList");
        }
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        if ((i3 & 4) != 0) {
            callback = null;
        }
        businessService.fetchCommonHistoryList(i, i2, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCommonSubscribeList$default(BusinessService businessService, int i, int i2, Callback callback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCommonSubscribeList");
        }
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        if ((i3 & 4) != 0) {
            callback = null;
        }
        businessService.fetchCommonSubscribeList(i, i2, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchDeviceVipInfo$default(BusinessService businessService, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchDeviceVipInfo");
        }
        if ((i & 1) != 0) {
            callback = null;
        }
        businessService.fetchDeviceVipInfo(callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchEcoBenefitQualification$default(BusinessService businessService, String str, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchEcoBenefitQualification");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.fetchEcoBenefitQualification(str, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchHistoryList$default(BusinessService businessService, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchHistoryList");
        }
        if ((i & 1) != 0) {
            callback = null;
        }
        businessService.fetchHistoryList(callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchListenList$default(BusinessService businessService, int i, int i2, String str, Callback callback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchListenList");
        }
        if ((i3 & 8) != 0) {
            callback = null;
        }
        businessService.fetchListenList(i, i2, str, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchRankList$default(BusinessService businessService, int i, Callback callback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRankList");
        }
        if ((i2 & 2) != 0) {
            callback = null;
        }
        businessService.fetchRankList(i, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchRecommendList$default(BusinessService businessService, int i, Callback callback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRecommendList");
        }
        if ((i2 & 2) != 0) {
            callback = null;
        }
        businessService.fetchRecommendList(i, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchSubscribeList$default(BusinessService businessService, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSubscribeList");
        }
        if ((i & 1) != 0) {
            callback = null;
        }
        businessService.fetchSubscribeList(callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchTrackBatch$default(BusinessService businessService, String str, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrackBatch");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.fetchTrackBatch(str, callback);
    }

    public static /* synthetic */ void fetchTrackList$default(BusinessService businessService, long j, long j2, int i, int i2, String str, Callback callback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrackList");
        }
        if ((i3 & 4) != 0) {
            i = 1;
        }
        businessService.fetchTrackList(j, j2, i, (i3 & 8) != 0 ? 20 : i2, (i3 & 16) != 0 ? "asc" : str, (i3 & 32) != 0 ? null : callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isSubscribeBatch$default(BusinessService businessService, String str, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSubscribeBatch");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.isSubscribeBatch(str, callback);
    }

    public static /* synthetic */ void jumpWith$default(BusinessService businessService, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpWith");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        businessService.jumpWith(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void searchAlbum$default(BusinessService businessService, String str, int i, int i2, Callback callback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchAlbum");
        }
        if ((i3 & 8) != 0) {
            callback = null;
        }
        businessService.searchAlbum(str, i, i2, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscribeAlbum$default(BusinessService businessService, long j, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeAlbum");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.subscribeAlbum(j, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void textAiSearch$default(BusinessService businessService, String str, String str2, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: textAiSearch");
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        businessService.textAiSearch(str, str2, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unsubscribeAlbum$default(BusinessService businessService, long j, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribeAlbum");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.unsubscribeAlbum(j, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void verifyAlbumPermission$default(BusinessService businessService, long j, Callback callback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyAlbumPermission");
        }
        if ((i & 2) != 0) {
            callback = null;
        }
        businessService.verifyAlbumPermission(j, callback);
    }

    public abstract void fetchAblumList(int cardId, Callback<ApiResponse<CardInfo>> callback);

    public abstract void fetchAlbumBatch(String ids, Callback<ApiResponse<List<Album>>> callback);

    public abstract void fetchCardList(int cardId, Callback<ApiResponse<CardInfo>> callback);

    public abstract void fetchCommonHistoryList(int page, int limit, Callback<ApiResponse<List<HistoryInfo>>> callback);

    public abstract void fetchCommonSubscribeList(int page, int limit, Callback<CommonSubscribeResponse> callback);

    public abstract void fetchDeviceVipInfo(Callback<ApiResponse<DeviceVipInfo>> callback);

    public final void fetchEcoBenefitQualification(Callback<ApiResponse<EcoBenefitData>> callback) {
        fetchEcoBenefitQualification(null, callback);
    }

    public abstract void fetchEcoBenefitQualification(String thirdDeviceInfo, Callback<ApiResponse<EcoBenefitData>> callback);

    public abstract void fetchHistoryList(Callback<PagedApiResponse<HistoryInfo>> callback);

    public abstract void fetchListenList(int page, int limit, String ids, Callback<ApiResponse<Map<String, ListenGroup>>> callback);

    public abstract void fetchRankList(int cardId, Callback<ApiResponse<CardInfo>> callback);

    public abstract void fetchRecommendList(int cardId, Callback<ApiResponse<CardInfo>> callback);

    public abstract void fetchSubscribeList(Callback<ApiResponse<List<AlbumInfo>>> callback);

    public abstract void fetchTrackBatch(String ids, Callback<ApiResponse<List<Track>>> callback);

    public abstract void fetchTrackList(long albumId, long recordId, int page, int limit, String sort, Callback<TrackPage> callback);

    public abstract void isSubscribeBatch(String albumIds, Callback<ApiResponse<Map<String, Boolean>>> callback);

    public abstract void jumpAlbumInfoList(long id2);

    public abstract void jumpTrackInfo(long id2);

    public abstract void jumpWith(String jumpType, String jumpValue);

    public abstract void jumpWith(String jumpType, String jumpValue, String extValue);

    public abstract void jumpWith(String jumpType, String jumpValue, String title, String extValue);

    public abstract void searchAlbum(String query, int page, int limit, Callback<ApiResponse<List<Album>>> callback);

    public abstract void subscribeAlbum(long albumId, Callback<BaseRequestInfo> callback);

    public abstract void textAiSearch(String text, String limit, Callback<ApiResponse<TextSearchResponse>> callback);

    public abstract void unsubscribeAlbum(long albumId, Callback<BaseRequestInfo> callback);

    public abstract void verifyAlbumPermission(long albumId, Callback<AuthResult> callback);

    public static /* synthetic */ void jumpWith$default(BusinessService businessService, String str, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpWith");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        businessService.jumpWith(str, str2, str3, str4);
    }
}
