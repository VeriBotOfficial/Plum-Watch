package com.xmly.businesssdk.network.bean.album;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.db.entity.a;
import com.xmly.businesssdk.network.bean.Announcer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchAlbumInfo.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b_\b\u0086\b\u0018\u00002\u00020\u0001BÑ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001d\u0012\b\b\u0002\u0010!\u001a\u00020\u001d\u0012\b\b\u0002\u0010\"\u001a\u00020\u001d\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\u001d\u0012\b\b\u0002\u0010%\u001a\u00020\u001d\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\n\u0012\b\b\u0002\u0010/\u001a\u00020\u001d\u0012\b\b\u0002\u00100\u001a\u00020\u001d\u0012\b\b\u0002\u00101\u001a\u00020\u001d\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\b\b\u0002\u00104\u001a\u00020\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00107J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\t\u0010o\u001a\u00020\u0005HÆ\u0003J\t\u0010p\u001a\u00020\u001dHÆ\u0003J\t\u0010q\u001a\u00020\u001dHÆ\u0003J\t\u0010r\u001a\u00020\u001dHÆ\u0003J\t\u0010s\u001a\u00020\u001dHÆ\u0003J\t\u0010t\u001a\u00020\u001dHÆ\u0003J\t\u0010u\u001a\u00020\u001dHÆ\u0003J\t\u0010v\u001a\u00020\nHÆ\u0003J\t\u0010w\u001a\u00020\u001dHÆ\u0003J\t\u0010x\u001a\u00020\u001dHÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003JÖ\u0003\u0010\u0090\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u001d2\b\b\u0002\u0010%\u001a\u00020\u001d2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\u001d2\b\b\u0002\u00100\u001a\u00020\u001d2\b\b\u0002\u00101\u001a\u00020\u001d2\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u000106HÆ\u0001J\u0015\u0010\u0091\u0001\u001a\u00020\u001d2\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0093\u0001\u001a\u00020\nHÖ\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010)\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010%\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00109R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0016\u00103\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010CR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0016\u0010.\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010CR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010CR\u0016\u00102\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u0016\u0010$\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0016\u00100\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010?R\u0016\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010?R\u0016\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010?R\u0016\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010CR\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010?R\u0016\u0010/\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010?R\u0016\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010?R\u0016\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010?R\u0016\u0010\u001f\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010?R\u0016\u0010*\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0018\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00109R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0016\u0010'\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00109R\u0016\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0016\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00109R\u0016\u0010,\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00109R\u0016\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00109R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00109R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0016\u00101\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010?R\u0016\u00104\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010A¨\u0006\u0095\u0001"}, d2 = {"Lcom/xmly/businesssdk/network/bean/album/BatchAlbumInfo;", "", "id", "", "albumTitle", "", "albumIntro", "shortIntro", "shortRichIntro", "freeTrackCount", "", "includeTrackCount", "estimatedTrackCount", "playCount", "subscribeCount", "shareCount", "favoriteCount", "announcer", "Lcom/xmly/businesssdk/network/bean/Announcer;", "priceTypeInfo", "", "Lcom/xmly/businesssdk/network/bean/album/BatchPriceTypeInfo;", "priceTypeDetail", "composedPriceType", "coverUrl", "coverUrlSmall", "coverUrlMiddle", "coverUrlLarge", "isFreeListener", "", "isPaid", "isVipFree", "isVipExclusive", "isChildVipFree", "isChildVipExclusive", "isFinished", "hasSample", "canDownload", "categoryId", "qualityScore", "qualityTags", "albumTags", "kind", "recommendReason", "saleIntro", "sellingPoint", "freeToPaidFlag", "isGradientActivity", "isActivity", "tracksNaturalOrdered", "freeTrackIds", "createdAt", "updatedAt", "lastUptrack", "Lcom/xmly/businesssdk/network/bean/album/LastUptrack;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJJJLcom/xmly/businesssdk/network/bean/Announcer;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZIZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;JJLcom/xmly/businesssdk/network/bean/album/LastUptrack;)V", "getAlbumIntro", "()Ljava/lang/String;", "getAlbumTags", "getAlbumTitle", "getAnnouncer", "()Lcom/xmly/businesssdk/network/bean/Announcer;", "getCanDownload", "()Z", "getCategoryId", "()J", "getComposedPriceType", "()I", "getCoverUrl", "getCoverUrlLarge", "getCoverUrlMiddle", "getCoverUrlSmall", "getCreatedAt", "getEstimatedTrackCount", "getFavoriteCount", "getFreeToPaidFlag", "getFreeTrackCount", "getFreeTrackIds", "getHasSample", "getId", "getIncludeTrackCount", "getKind", "getLastUptrack", "()Lcom/xmly/businesssdk/network/bean/album/LastUptrack;", "getPlayCount", "getPriceTypeDetail", "getPriceTypeInfo", "()Ljava/util/List;", "getQualityScore", "getQualityTags", "getRecommendReason", "getSaleIntro", "getSellingPoint", "getShareCount", "getShortIntro", "getShortRichIntro", "getSubscribeCount", "getTracksNaturalOrdered", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BatchAlbumInfo {

    @SerializedName("album_intro")
    private final String albumIntro;

    @SerializedName("album_tags")
    private final String albumTags;

    @SerializedName("album_title")
    private final String albumTitle;

    @SerializedName("announcer")
    private final Announcer announcer;

    @SerializedName("can_download")
    private final boolean canDownload;

    @SerializedName("category_id")
    private final long categoryId;

    @SerializedName("composed_price_type")
    private final int composedPriceType;

    @SerializedName("cover_url")
    private final String coverUrl;

    @SerializedName("cover_url_large")
    private final String coverUrlLarge;

    @SerializedName("cover_url_middle")
    private final String coverUrlMiddle;

    @SerializedName("cover_url_small")
    private final String coverUrlSmall;

    @SerializedName("created_at")
    private final long createdAt;

    @SerializedName("estimated_track_count")
    private final int estimatedTrackCount;

    @SerializedName("favorite_count")
    private final long favoriteCount;

    @SerializedName("free_to_paid_flag")
    private final int freeToPaidFlag;

    @SerializedName("free_track_count")
    private final int freeTrackCount;

    @SerializedName("free_track_ids")
    private final String freeTrackIds;

    @SerializedName("has_sample")
    private final boolean hasSample;

    @SerializedName("id")
    private final long id;

    @SerializedName("include_track_count")
    private final int includeTrackCount;

    @SerializedName("is_activity")
    private final boolean isActivity;

    @SerializedName("is_child_vipexclusive")
    private final boolean isChildVipExclusive;

    @SerializedName("is_child_vipfree")
    private final boolean isChildVipFree;

    @SerializedName("is_finished")
    private final int isFinished;

    @SerializedName("is_free_listen")
    private final boolean isFreeListener;

    @SerializedName("is_gradient_activity")
    private final boolean isGradientActivity;

    @SerializedName("is_paid")
    private final boolean isPaid;

    @SerializedName("is_vip_exclusive")
    private final boolean isVipExclusive;

    @SerializedName("is_vipfree")
    private final boolean isVipFree;

    @SerializedName("kind")
    private final String kind;

    @SerializedName("last_uptrack")
    private final LastUptrack lastUptrack;

    @SerializedName("play_count")
    private final long playCount;

    @SerializedName("price_type_detail")
    private final String priceTypeDetail;

    @SerializedName("price_type_info")
    private final List<BatchPriceTypeInfo> priceTypeInfo;

    @SerializedName("quality_score")
    private final String qualityScore;

    @SerializedName("quality_tags")
    private final String qualityTags;

    @SerializedName("recommend_reason")
    private final String recommendReason;

    @SerializedName("sale_intro")
    private final String saleIntro;

    @SerializedName("selling_point")
    private final String sellingPoint;

    @SerializedName("share_count")
    private final long shareCount;

    @SerializedName("short_intro")
    private final String shortIntro;

    @SerializedName("short_rich_intro")
    private final String shortRichIntro;

    @SerializedName("subscribe_count")
    private final long subscribeCount;

    @SerializedName("tracks_natural_ordered")
    private final boolean tracksNaturalOrdered;

    @SerializedName("updated_at")
    private final long updatedAt;

    public BatchAlbumInfo() {
        this(0L, null, null, null, null, 0, 0, 0, 0L, 0L, 0L, 0L, null, null, null, 0, null, null, null, null, false, false, false, false, false, false, 0, false, false, 0L, null, null, null, null, null, null, null, 0, false, false, false, null, 0L, 0L, null, -1, 8191, null);
    }

    public BatchAlbumInfo(long j, String albumTitle, String albumIntro, String shortIntro, String shortRichIntro, int i, int i2, int i3, long j2, long j3, long j4, long j5, Announcer announcer, List<BatchPriceTypeInfo> priceTypeInfo, String priceTypeDetail, int i4, String coverUrl, String coverUrlSmall, String coverUrlMiddle, String coverUrlLarge, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, boolean z8, long j6, String qualityScore, String qualityTags, String albumTags, String kind, String recommendReason, String saleIntro, String sellingPoint, int i6, boolean z9, boolean z10, boolean z11, String freeTrackIds, long j7, long j8, LastUptrack lastUptrack) {
        Intrinsics.checkNotNullParameter(albumTitle, "albumTitle");
        Intrinsics.checkNotNullParameter(albumIntro, "albumIntro");
        Intrinsics.checkNotNullParameter(shortIntro, "shortIntro");
        Intrinsics.checkNotNullParameter(shortRichIntro, "shortRichIntro");
        Intrinsics.checkNotNullParameter(priceTypeInfo, "priceTypeInfo");
        Intrinsics.checkNotNullParameter(priceTypeDetail, "priceTypeDetail");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(coverUrlSmall, "coverUrlSmall");
        Intrinsics.checkNotNullParameter(coverUrlMiddle, "coverUrlMiddle");
        Intrinsics.checkNotNullParameter(coverUrlLarge, "coverUrlLarge");
        Intrinsics.checkNotNullParameter(qualityScore, "qualityScore");
        Intrinsics.checkNotNullParameter(qualityTags, "qualityTags");
        Intrinsics.checkNotNullParameter(albumTags, "albumTags");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(recommendReason, "recommendReason");
        Intrinsics.checkNotNullParameter(saleIntro, "saleIntro");
        Intrinsics.checkNotNullParameter(sellingPoint, "sellingPoint");
        Intrinsics.checkNotNullParameter(freeTrackIds, "freeTrackIds");
        this.id = j;
        this.albumTitle = albumTitle;
        this.albumIntro = albumIntro;
        this.shortIntro = shortIntro;
        this.shortRichIntro = shortRichIntro;
        this.freeTrackCount = i;
        this.includeTrackCount = i2;
        this.estimatedTrackCount = i3;
        this.playCount = j2;
        this.subscribeCount = j3;
        this.shareCount = j4;
        this.favoriteCount = j5;
        this.announcer = announcer;
        this.priceTypeInfo = priceTypeInfo;
        this.priceTypeDetail = priceTypeDetail;
        this.composedPriceType = i4;
        this.coverUrl = coverUrl;
        this.coverUrlSmall = coverUrlSmall;
        this.coverUrlMiddle = coverUrlMiddle;
        this.coverUrlLarge = coverUrlLarge;
        this.isFreeListener = z;
        this.isPaid = z2;
        this.isVipFree = z3;
        this.isVipExclusive = z4;
        this.isChildVipFree = z5;
        this.isChildVipExclusive = z6;
        this.isFinished = i5;
        this.hasSample = z7;
        this.canDownload = z8;
        this.categoryId = j6;
        this.qualityScore = qualityScore;
        this.qualityTags = qualityTags;
        this.albumTags = albumTags;
        this.kind = kind;
        this.recommendReason = recommendReason;
        this.saleIntro = saleIntro;
        this.sellingPoint = sellingPoint;
        this.freeToPaidFlag = i6;
        this.isGradientActivity = z9;
        this.isActivity = z10;
        this.tracksNaturalOrdered = z11;
        this.freeTrackIds = freeTrackIds;
        this.createdAt = j7;
        this.updatedAt = j8;
        this.lastUptrack = lastUptrack;
    }

    public static /* synthetic */ BatchAlbumInfo copy$default(BatchAlbumInfo batchAlbumInfo, long j, String str, String str2, String str3, String str4, int i, int i2, int i3, long j2, long j3, long j4, long j5, Announcer announcer, List list, String str5, int i4, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, boolean z8, long j6, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i6, boolean z9, boolean z10, boolean z11, String str17, long j7, long j8, LastUptrack lastUptrack, int i7, int i8, Object obj) {
        long j9 = (i7 & 1) != 0 ? batchAlbumInfo.id : j;
        String str18 = (i7 & 2) != 0 ? batchAlbumInfo.albumTitle : str;
        String str19 = (i7 & 4) != 0 ? batchAlbumInfo.albumIntro : str2;
        String str20 = (i7 & 8) != 0 ? batchAlbumInfo.shortIntro : str3;
        String str21 = (i7 & 16) != 0 ? batchAlbumInfo.shortRichIntro : str4;
        int i9 = (i7 & 32) != 0 ? batchAlbumInfo.freeTrackCount : i;
        int i10 = (i7 & 64) != 0 ? batchAlbumInfo.includeTrackCount : i2;
        int i11 = (i7 & 128) != 0 ? batchAlbumInfo.estimatedTrackCount : i3;
        long j10 = (i7 & 256) != 0 ? batchAlbumInfo.playCount : j2;
        long j11 = (i7 & 512) != 0 ? batchAlbumInfo.subscribeCount : j3;
        long j12 = j9;
        long j13 = (i7 & 1024) != 0 ? batchAlbumInfo.shareCount : j4;
        long j14 = (i7 & 2048) != 0 ? batchAlbumInfo.favoriteCount : j5;
        Announcer announcer2 = (i7 & 4096) != 0 ? batchAlbumInfo.announcer : announcer;
        List list2 = (i7 & 8192) != 0 ? batchAlbumInfo.priceTypeInfo : list;
        Announcer announcer3 = announcer2;
        String str22 = (i7 & 16384) != 0 ? batchAlbumInfo.priceTypeDetail : str5;
        return batchAlbumInfo.copy(j12, str18, str19, str20, str21, i9, i10, i11, j10, j11, j13, j14, announcer3, list2, str22, (i7 & 32768) != 0 ? batchAlbumInfo.composedPriceType : i4, (i7 & 65536) != 0 ? batchAlbumInfo.coverUrl : str6, (i7 & 131072) != 0 ? batchAlbumInfo.coverUrlSmall : str7, (i7 & 262144) != 0 ? batchAlbumInfo.coverUrlMiddle : str8, (i7 & 524288) != 0 ? batchAlbumInfo.coverUrlLarge : str9, (i7 & 1048576) != 0 ? batchAlbumInfo.isFreeListener : z, (i7 & 2097152) != 0 ? batchAlbumInfo.isPaid : z2, (i7 & 4194304) != 0 ? batchAlbumInfo.isVipFree : z3, (i7 & 8388608) != 0 ? batchAlbumInfo.isVipExclusive : z4, (i7 & 16777216) != 0 ? batchAlbumInfo.isChildVipFree : z5, (i7 & 33554432) != 0 ? batchAlbumInfo.isChildVipExclusive : z6, (i7 & 67108864) != 0 ? batchAlbumInfo.isFinished : i5, (i7 & 134217728) != 0 ? batchAlbumInfo.hasSample : z7, (i7 & 268435456) != 0 ? batchAlbumInfo.canDownload : z8, (i7 & 536870912) != 0 ? batchAlbumInfo.categoryId : j6, (i7 & 1073741824) != 0 ? batchAlbumInfo.qualityScore : str10, (i7 & Integer.MIN_VALUE) != 0 ? batchAlbumInfo.qualityTags : str11, (i8 & 1) != 0 ? batchAlbumInfo.albumTags : str12, (i8 & 2) != 0 ? batchAlbumInfo.kind : str13, (i8 & 4) != 0 ? batchAlbumInfo.recommendReason : str14, (i8 & 8) != 0 ? batchAlbumInfo.saleIntro : str15, (i8 & 16) != 0 ? batchAlbumInfo.sellingPoint : str16, (i8 & 32) != 0 ? batchAlbumInfo.freeToPaidFlag : i6, (i8 & 64) != 0 ? batchAlbumInfo.isGradientActivity : z9, (i8 & 128) != 0 ? batchAlbumInfo.isActivity : z10, (i8 & 256) != 0 ? batchAlbumInfo.tracksNaturalOrdered : z11, (i8 & 512) != 0 ? batchAlbumInfo.freeTrackIds : str17, (i8 & 1024) != 0 ? batchAlbumInfo.createdAt : j7, (i8 & 2048) != 0 ? batchAlbumInfo.updatedAt : j8, (i8 & 4096) != 0 ? batchAlbumInfo.lastUptrack : lastUptrack);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getSubscribeCount() {
        return this.subscribeCount;
    }

    /* renamed from: component11, reason: from getter */
    public final long getShareCount() {
        return this.shareCount;
    }

    /* renamed from: component12, reason: from getter */
    public final long getFavoriteCount() {
        return this.favoriteCount;
    }

    /* renamed from: component13, reason: from getter */
    public final Announcer getAnnouncer() {
        return this.announcer;
    }

    public final List<BatchPriceTypeInfo> component14() {
        return this.priceTypeInfo;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPriceTypeDetail() {
        return this.priceTypeDetail;
    }

    /* renamed from: component16, reason: from getter */
    public final int getComposedPriceType() {
        return this.composedPriceType;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    /* renamed from: component19, reason: from getter */
    public final String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    /* renamed from: component20, reason: from getter */
    public final String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsFreeListener() {
        return this.isFreeListener;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsPaid() {
        return this.isPaid;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsVipFree() {
        return this.isVipFree;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsVipExclusive() {
        return this.isVipExclusive;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsChildVipFree() {
        return this.isChildVipFree;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsChildVipExclusive() {
        return this.isChildVipExclusive;
    }

    /* renamed from: component27, reason: from getter */
    public final int getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasSample() {
        return this.hasSample;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getCanDownload() {
        return this.canDownload;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlbumIntro() {
        return this.albumIntro;
    }

    /* renamed from: component30, reason: from getter */
    public final long getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component31, reason: from getter */
    public final String getQualityScore() {
        return this.qualityScore;
    }

    /* renamed from: component32, reason: from getter */
    public final String getQualityTags() {
        return this.qualityTags;
    }

    /* renamed from: component33, reason: from getter */
    public final String getAlbumTags() {
        return this.albumTags;
    }

    /* renamed from: component34, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component35, reason: from getter */
    public final String getRecommendReason() {
        return this.recommendReason;
    }

    /* renamed from: component36, reason: from getter */
    public final String getSaleIntro() {
        return this.saleIntro;
    }

    /* renamed from: component37, reason: from getter */
    public final String getSellingPoint() {
        return this.sellingPoint;
    }

    /* renamed from: component38, reason: from getter */
    public final int getFreeToPaidFlag() {
        return this.freeToPaidFlag;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsGradientActivity() {
        return this.isGradientActivity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getShortIntro() {
        return this.shortIntro;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsActivity() {
        return this.isActivity;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getTracksNaturalOrdered() {
        return this.tracksNaturalOrdered;
    }

    /* renamed from: component42, reason: from getter */
    public final String getFreeTrackIds() {
        return this.freeTrackIds;
    }

    /* renamed from: component43, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component44, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component45, reason: from getter */
    public final LastUptrack getLastUptrack() {
        return this.lastUptrack;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShortRichIntro() {
        return this.shortRichIntro;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFreeTrackCount() {
        return this.freeTrackCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIncludeTrackCount() {
        return this.includeTrackCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getEstimatedTrackCount() {
        return this.estimatedTrackCount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getPlayCount() {
        return this.playCount;
    }

    public final BatchAlbumInfo copy(long id2, String albumTitle, String albumIntro, String shortIntro, String shortRichIntro, int freeTrackCount, int includeTrackCount, int estimatedTrackCount, long playCount, long subscribeCount, long shareCount, long favoriteCount, Announcer announcer, List<BatchPriceTypeInfo> priceTypeInfo, String priceTypeDetail, int composedPriceType, String coverUrl, String coverUrlSmall, String coverUrlMiddle, String coverUrlLarge, boolean isFreeListener, boolean isPaid, boolean isVipFree, boolean isVipExclusive, boolean isChildVipFree, boolean isChildVipExclusive, int isFinished, boolean hasSample, boolean canDownload, long categoryId, String qualityScore, String qualityTags, String albumTags, String kind, String recommendReason, String saleIntro, String sellingPoint, int freeToPaidFlag, boolean isGradientActivity, boolean isActivity, boolean tracksNaturalOrdered, String freeTrackIds, long createdAt, long updatedAt, LastUptrack lastUptrack) {
        Intrinsics.checkNotNullParameter(albumTitle, "albumTitle");
        Intrinsics.checkNotNullParameter(albumIntro, "albumIntro");
        Intrinsics.checkNotNullParameter(shortIntro, "shortIntro");
        Intrinsics.checkNotNullParameter(shortRichIntro, "shortRichIntro");
        Intrinsics.checkNotNullParameter(priceTypeInfo, "priceTypeInfo");
        Intrinsics.checkNotNullParameter(priceTypeDetail, "priceTypeDetail");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(coverUrlSmall, "coverUrlSmall");
        Intrinsics.checkNotNullParameter(coverUrlMiddle, "coverUrlMiddle");
        Intrinsics.checkNotNullParameter(coverUrlLarge, "coverUrlLarge");
        Intrinsics.checkNotNullParameter(qualityScore, "qualityScore");
        Intrinsics.checkNotNullParameter(qualityTags, "qualityTags");
        Intrinsics.checkNotNullParameter(albumTags, "albumTags");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(recommendReason, "recommendReason");
        Intrinsics.checkNotNullParameter(saleIntro, "saleIntro");
        Intrinsics.checkNotNullParameter(sellingPoint, "sellingPoint");
        Intrinsics.checkNotNullParameter(freeTrackIds, "freeTrackIds");
        return new BatchAlbumInfo(id2, albumTitle, albumIntro, shortIntro, shortRichIntro, freeTrackCount, includeTrackCount, estimatedTrackCount, playCount, subscribeCount, shareCount, favoriteCount, announcer, priceTypeInfo, priceTypeDetail, composedPriceType, coverUrl, coverUrlSmall, coverUrlMiddle, coverUrlLarge, isFreeListener, isPaid, isVipFree, isVipExclusive, isChildVipFree, isChildVipExclusive, isFinished, hasSample, canDownload, categoryId, qualityScore, qualityTags, albumTags, kind, recommendReason, saleIntro, sellingPoint, freeToPaidFlag, isGradientActivity, isActivity, tracksNaturalOrdered, freeTrackIds, createdAt, updatedAt, lastUptrack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchAlbumInfo)) {
            return false;
        }
        BatchAlbumInfo batchAlbumInfo = (BatchAlbumInfo) other;
        return this.id == batchAlbumInfo.id && Intrinsics.areEqual(this.albumTitle, batchAlbumInfo.albumTitle) && Intrinsics.areEqual(this.albumIntro, batchAlbumInfo.albumIntro) && Intrinsics.areEqual(this.shortIntro, batchAlbumInfo.shortIntro) && Intrinsics.areEqual(this.shortRichIntro, batchAlbumInfo.shortRichIntro) && this.freeTrackCount == batchAlbumInfo.freeTrackCount && this.includeTrackCount == batchAlbumInfo.includeTrackCount && this.estimatedTrackCount == batchAlbumInfo.estimatedTrackCount && this.playCount == batchAlbumInfo.playCount && this.subscribeCount == batchAlbumInfo.subscribeCount && this.shareCount == batchAlbumInfo.shareCount && this.favoriteCount == batchAlbumInfo.favoriteCount && Intrinsics.areEqual(this.announcer, batchAlbumInfo.announcer) && Intrinsics.areEqual(this.priceTypeInfo, batchAlbumInfo.priceTypeInfo) && Intrinsics.areEqual(this.priceTypeDetail, batchAlbumInfo.priceTypeDetail) && this.composedPriceType == batchAlbumInfo.composedPriceType && Intrinsics.areEqual(this.coverUrl, batchAlbumInfo.coverUrl) && Intrinsics.areEqual(this.coverUrlSmall, batchAlbumInfo.coverUrlSmall) && Intrinsics.areEqual(this.coverUrlMiddle, batchAlbumInfo.coverUrlMiddle) && Intrinsics.areEqual(this.coverUrlLarge, batchAlbumInfo.coverUrlLarge) && this.isFreeListener == batchAlbumInfo.isFreeListener && this.isPaid == batchAlbumInfo.isPaid && this.isVipFree == batchAlbumInfo.isVipFree && this.isVipExclusive == batchAlbumInfo.isVipExclusive && this.isChildVipFree == batchAlbumInfo.isChildVipFree && this.isChildVipExclusive == batchAlbumInfo.isChildVipExclusive && this.isFinished == batchAlbumInfo.isFinished && this.hasSample == batchAlbumInfo.hasSample && this.canDownload == batchAlbumInfo.canDownload && this.categoryId == batchAlbumInfo.categoryId && Intrinsics.areEqual(this.qualityScore, batchAlbumInfo.qualityScore) && Intrinsics.areEqual(this.qualityTags, batchAlbumInfo.qualityTags) && Intrinsics.areEqual(this.albumTags, batchAlbumInfo.albumTags) && Intrinsics.areEqual(this.kind, batchAlbumInfo.kind) && Intrinsics.areEqual(this.recommendReason, batchAlbumInfo.recommendReason) && Intrinsics.areEqual(this.saleIntro, batchAlbumInfo.saleIntro) && Intrinsics.areEqual(this.sellingPoint, batchAlbumInfo.sellingPoint) && this.freeToPaidFlag == batchAlbumInfo.freeToPaidFlag && this.isGradientActivity == batchAlbumInfo.isGradientActivity && this.isActivity == batchAlbumInfo.isActivity && this.tracksNaturalOrdered == batchAlbumInfo.tracksNaturalOrdered && Intrinsics.areEqual(this.freeTrackIds, batchAlbumInfo.freeTrackIds) && this.createdAt == batchAlbumInfo.createdAt && this.updatedAt == batchAlbumInfo.updatedAt && Intrinsics.areEqual(this.lastUptrack, batchAlbumInfo.lastUptrack);
    }

    public final String getAlbumIntro() {
        return this.albumIntro;
    }

    public final String getAlbumTags() {
        return this.albumTags;
    }

    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    public final Announcer getAnnouncer() {
        return this.announcer;
    }

    public final boolean getCanDownload() {
        return this.canDownload;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final int getComposedPriceType() {
        return this.composedPriceType;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public final String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    public final String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getEstimatedTrackCount() {
        return this.estimatedTrackCount;
    }

    public final long getFavoriteCount() {
        return this.favoriteCount;
    }

    public final int getFreeToPaidFlag() {
        return this.freeToPaidFlag;
    }

    public final int getFreeTrackCount() {
        return this.freeTrackCount;
    }

    public final String getFreeTrackIds() {
        return this.freeTrackIds;
    }

    public final boolean getHasSample() {
        return this.hasSample;
    }

    public final long getId() {
        return this.id;
    }

    public final int getIncludeTrackCount() {
        return this.includeTrackCount;
    }

    public final String getKind() {
        return this.kind;
    }

    public final LastUptrack getLastUptrack() {
        return this.lastUptrack;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final String getPriceTypeDetail() {
        return this.priceTypeDetail;
    }

    public final List<BatchPriceTypeInfo> getPriceTypeInfo() {
        return this.priceTypeInfo;
    }

    public final String getQualityScore() {
        return this.qualityScore;
    }

    public final String getQualityTags() {
        return this.qualityTags;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getSaleIntro() {
        return this.saleIntro;
    }

    public final String getSellingPoint() {
        return this.sellingPoint;
    }

    public final long getShareCount() {
        return this.shareCount;
    }

    public final String getShortIntro() {
        return this.shortIntro;
    }

    public final String getShortRichIntro() {
        return this.shortRichIntro;
    }

    public final long getSubscribeCount() {
        return this.subscribeCount;
    }

    public final boolean getTracksNaturalOrdered() {
        return this.tracksNaturalOrdered;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = a.a(this.favoriteCount, a.a(this.shareCount, a.a(this.subscribeCount, a.a(this.playCount, b.a(this.estimatedTrackCount, b.a(this.includeTrackCount, b.a(this.freeTrackCount, com.xmly.businesssdk.config.a.a(this.shortRichIntro, com.xmly.businesssdk.config.a.a(this.shortIntro, com.xmly.businesssdk.config.a.a(this.albumIntro, com.xmly.businesssdk.config.a.a(this.albumTitle, Long.hashCode(this.id) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Announcer announcer = this.announcer;
        int a3 = com.xmly.businesssdk.config.a.a(this.coverUrlLarge, com.xmly.businesssdk.config.a.a(this.coverUrlMiddle, com.xmly.businesssdk.config.a.a(this.coverUrlSmall, com.xmly.businesssdk.config.a.a(this.coverUrl, b.a(this.composedPriceType, com.xmly.businesssdk.config.a.a(this.priceTypeDetail, (this.priceTypeInfo.hashCode() + ((a2 + (announcer == null ? 0 : announcer.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31);
        boolean z = this.isFreeListener;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a3 + i) * 31;
        boolean z2 = this.isPaid;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isVipFree;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isVipExclusive;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.isChildVipFree;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.isChildVipExclusive;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int a4 = b.a(this.isFinished, (i10 + i11) * 31, 31);
        boolean z7 = this.hasSample;
        int i12 = z7;
        if (z7 != 0) {
            i12 = 1;
        }
        int i13 = (a4 + i12) * 31;
        boolean z8 = this.canDownload;
        int i14 = z8;
        if (z8 != 0) {
            i14 = 1;
        }
        int a5 = b.a(this.freeToPaidFlag, com.xmly.businesssdk.config.a.a(this.sellingPoint, com.xmly.businesssdk.config.a.a(this.saleIntro, com.xmly.businesssdk.config.a.a(this.recommendReason, com.xmly.businesssdk.config.a.a(this.kind, com.xmly.businesssdk.config.a.a(this.albumTags, com.xmly.businesssdk.config.a.a(this.qualityTags, com.xmly.businesssdk.config.a.a(this.qualityScore, a.a(this.categoryId, (i13 + i14) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        boolean z9 = this.isGradientActivity;
        int i15 = z9;
        if (z9 != 0) {
            i15 = 1;
        }
        int i16 = (a5 + i15) * 31;
        boolean z10 = this.isActivity;
        int i17 = z10;
        if (z10 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z11 = this.tracksNaturalOrdered;
        int a6 = a.a(this.updatedAt, a.a(this.createdAt, com.xmly.businesssdk.config.a.a(this.freeTrackIds, (i18 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31), 31), 31);
        LastUptrack lastUptrack = this.lastUptrack;
        return a6 + (lastUptrack != null ? lastUptrack.hashCode() : 0);
    }

    public final boolean isActivity() {
        return this.isActivity;
    }

    public final boolean isChildVipExclusive() {
        return this.isChildVipExclusive;
    }

    public final boolean isChildVipFree() {
        return this.isChildVipFree;
    }

    public final int isFinished() {
        return this.isFinished;
    }

    public final boolean isFreeListener() {
        return this.isFreeListener;
    }

    public final boolean isGradientActivity() {
        return this.isGradientActivity;
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    public final boolean isVipExclusive() {
        return this.isVipExclusive;
    }

    public final boolean isVipFree() {
        return this.isVipFree;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BatchAlbumInfo(id=");
        sb.append(this.id).append(", albumTitle=").append(this.albumTitle).append(", albumIntro=").append(this.albumIntro).append(", shortIntro=").append(this.shortIntro).append(", shortRichIntro=").append(this.shortRichIntro).append(", freeTrackCount=").append(this.freeTrackCount).append(", includeTrackCount=").append(this.includeTrackCount).append(", estimatedTrackCount=").append(this.estimatedTrackCount).append(", playCount=").append(this.playCount).append(", subscribeCount=").append(this.subscribeCount).append(", shareCount=").append(this.shareCount).append(", favoriteCount=");
        sb.append(this.favoriteCount).append(", announcer=").append(this.announcer).append(", priceTypeInfo=").append(this.priceTypeInfo).append(", priceTypeDetail=").append(this.priceTypeDetail).append(", composedPriceType=").append(this.composedPriceType).append(", coverUrl=").append(this.coverUrl).append(", coverUrlSmall=").append(this.coverUrlSmall).append(", coverUrlMiddle=").append(this.coverUrlMiddle).append(", coverUrlLarge=").append(this.coverUrlLarge).append(", isFreeListener=").append(this.isFreeListener).append(", isPaid=").append(this.isPaid).append(", isVipFree=").append(this.isVipFree);
        sb.append(", isVipExclusive=").append(this.isVipExclusive).append(", isChildVipFree=").append(this.isChildVipFree).append(", isChildVipExclusive=").append(this.isChildVipExclusive).append(", isFinished=").append(this.isFinished).append(", hasSample=").append(this.hasSample).append(", canDownload=").append(this.canDownload).append(", categoryId=").append(this.categoryId).append(", qualityScore=").append(this.qualityScore).append(", qualityTags=").append(this.qualityTags).append(", albumTags=").append(this.albumTags).append(", kind=").append(this.kind).append(", recommendReason=");
        sb.append(this.recommendReason).append(", saleIntro=").append(this.saleIntro).append(", sellingPoint=").append(this.sellingPoint).append(", freeToPaidFlag=").append(this.freeToPaidFlag).append(", isGradientActivity=").append(this.isGradientActivity).append(", isActivity=").append(this.isActivity).append(", tracksNaturalOrdered=").append(this.tracksNaturalOrdered).append(", freeTrackIds=").append(this.freeTrackIds).append(", createdAt=").append(this.createdAt).append(", updatedAt=").append(this.updatedAt).append(", lastUptrack=").append(this.lastUptrack).append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BatchAlbumInfo(long r51, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, int r57, int r58, int r59, long r60, long r62, long r64, long r66, com.xmly.businesssdk.network.bean.Announcer r68, java.util.List r69, java.lang.String r70, int r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, int r82, boolean r83, boolean r84, long r85, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, int r94, boolean r95, boolean r96, boolean r97, java.lang.String r98, long r99, long r101, com.xmly.businesssdk.network.bean.album.LastUptrack r103, int r104, int r105, kotlin.jvm.internal.DefaultConstructorMarker r106) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.network.bean.album.BatchAlbumInfo.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, long, long, long, long, com.xmly.businesssdk.network.bean.Announcer, java.util.List, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, java.lang.String, long, long, com.xmly.businesssdk.network.bean.album.LastUptrack, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
