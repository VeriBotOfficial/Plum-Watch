package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.wechat.ChatRoomMember;
import com.wakeup.common.network.entity.wechat.FindUserInfo;
import com.wakeup.common.network.entity.wechat.FriendDetail;
import com.wakeup.common.network.entity.wechat.FriendList;
import com.wakeup.common.network.entity.wechat.GeWechatResult;
import com.wakeup.common.network.entity.wechat.ImgEmoEntity;
import com.wakeup.common.network.entity.wechat.LoginCheckBean;
import com.wakeup.common.network.entity.wechat.LoginQrCode;
import com.wakeup.common.network.entity.wechat.SecureVerify;
import com.wakeup.common.network.entity.wechat.SendMsgBean;
import com.wakeup.common.network.entity.wechat.UserQrCode;
import com.wakeup.common.network.entity.wechat.VerifyComplete;
import com.wakeup.common.network.entity.wechat.VoiceBean;
import com.wakeup.common.network.entity.wechat.WxUserInfo;
import com.wakeup.common.network.host.EvnMgr;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: WechatReplyApiService.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJE\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\u000eJ9\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ9\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ?\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ?\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ9\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ;\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ;\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ;\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ;\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\u000eJ9\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ9\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ9\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\u0019\b\u0001\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\t0\bH§@¢\u0006\u0002\u0010\nJ(\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020'H§@¢\u0006\u0002\u0010(JB\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*2\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u00062\b\b\u0001\u0010/\u001a\u00020\u0006H§@¢\u0006\u0002\u00100J\u0018\u00101\u001a\u0002022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u00103J\u0018\u00104\u001a\u0002052\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u00103J$\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070+0*2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u00103¨\u00068"}, d2 = {"Lcom/wakeup/common/network/api/WechatReplyApiService;", "", "getLoginQrCode", "Lcom/wakeup/common/network/entity/wechat/GeWechatResult;", "Lcom/wakeup/common/network/entity/wechat/LoginQrCode;", "url", "", "body", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginCheckQR", "Lcom/wakeup/common/network/entity/wechat/LoginCheckBean;", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCallback", "logout", "getFriends", "Lcom/wakeup/common/network/entity/wechat/FriendList;", "getFriendDetails", "", "Lcom/wakeup/common/network/entity/wechat/FriendDetail;", "getGroupFriendDetails", "getChatroomMemberList", "Lcom/wakeup/common/network/entity/wechat/ChatRoomMember;", "sendTextMsg", "Lcom/wakeup/common/network/entity/wechat/SendMsgBean;", "sendImageMsg", "sendEmojiMsg", "sendVoiceMsg", "loginState", "", "getUserQrCode", "Lcom/wakeup/common/network/entity/wechat/UserQrCode;", "getUserInfo", "Lcom/wakeup/common/network/entity/wechat/WxUserInfo;", "reconnection", "downloadVoice", "Lcom/wakeup/common/network/entity/wechat/VoiceBean;", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFriendUserInfo", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/wechat/FindUserInfo;", "wxid", "nickname", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSecureVerify", "Lcom/wakeup/common/network/entity/wechat/SecureVerify;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "secureVerifyComplete", "Lcom/wakeup/common/network/entity/wechat/VerifyComplete;", "queryImgEmo", "Lcom/wakeup/common/network/entity/wechat/ImgEmoEntity;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WechatReplyApiService {
    @POST("finder/v2/api/message/downloadVoice")
    Object downloadVoice(@Header("VIDEOSAPI-TOKEN") String str, @Body RequestBody requestBody, Continuation<? super GeWechatResult<VoiceBean>> continuation);

    @POST("finder/v2/api/group/getChatroomMemberList")
    Object getChatroomMemberList(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<ChatRoomMember>> continuation);

    @POST("finder/v2/api/contacts/getDetailInfo")
    Object getFriendDetails(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<List<FriendDetail>>> continuation);

    @GET
    Object getFriendUserInfo(@Url String str, @Query("wxid") String str2, @Query("nickname") String str3, @Query("message") String str4, Continuation<? super BaseResult<List<FindUserInfo>>> continuation);

    @POST("finder/v2/api/contacts/fetchContactsList")
    Object getFriends(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<FriendList>> continuation);

    @POST("finder/v2/api/group/getChatroomMemberDetail")
    Object getGroupFriendDetails(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<List<FriendDetail>>> continuation);

    @POST
    Object getLoginQrCode(@Url String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<LoginQrCode>> continuation);

    @GET
    Object getSecureVerify(@Url String str, Continuation<? super SecureVerify> continuation);

    @POST("finder/v2/api/personal/getProfile")
    Object getUserInfo(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<WxUserInfo>> continuation);

    @POST("finder/v2/api/personal/getQrCode")
    Object getUserQrCode(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<UserQrCode>> continuation);

    @POST
    Object loginCheckQR(@Url String str, @Header("VIDEOSAPI-TOKEN") String str2, @Body Map<String, Object> map, Continuation<? super GeWechatResult<LoginCheckBean>> continuation);

    @POST
    Object loginState(@Url String str, @Header("VIDEOSAPI-TOKEN") String str2, @Body Map<String, Object> map, Continuation<? super GeWechatResult<Boolean>> continuation);

    @POST("finder/v2/api/login/logout")
    Object logout(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<Object>> continuation);

    @POST
    Object queryImgEmo(@Url String str, Continuation<? super BaseResult<List<ImgEmoEntity>>> continuation);

    @POST("finder/v2/api/login/reconnection")
    Object reconnection(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<String>> continuation);

    @GET
    Object secureVerifyComplete(@Url String str, Continuation<? super VerifyComplete> continuation);

    @POST("finder/v2/api/message/postEmoji")
    Object sendEmojiMsg(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<SendMsgBean>> continuation);

    @POST("finder/v2/api/message/postImage")
    Object sendImageMsg(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<SendMsgBean>> continuation);

    @POST("finder/v2/api/message/postText")
    Object sendTextMsg(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<SendMsgBean>> continuation);

    @POST("finder/v2/api/message/postVoice")
    Object sendVoiceMsg(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<SendMsgBean>> continuation);

    @POST("finder/v2/api/login/setCallback")
    Object setCallback(@Header("VIDEOSAPI-TOKEN") String str, @Body Map<String, Object> map, Continuation<? super GeWechatResult<Object>> continuation);

    /* compiled from: WechatReplyApiService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getLoginQrCode$default(WechatReplyApiService wechatReplyApiService, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLoginQrCode");
            }
            if ((i & 1) != 0) {
                str = EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/api/v3/api/login/getLoginQrCode" : "https://gateway.iwhop.cn/gateway/user/api/v3/api/login/getLoginQrCode";
            }
            return wechatReplyApiService.getLoginQrCode(str, map, continuation);
        }

        public static /* synthetic */ Object loginCheckQR$default(WechatReplyApiService wechatReplyApiService, String str, String str2, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginCheckQR");
            }
            if ((i & 1) != 0) {
                str = EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/api/v2/api/login/checkLogin" : "https://gateway.iwhop.cn/gateway/user/api/v2/api/login/checkLogin";
            }
            return wechatReplyApiService.loginCheckQR(str, str2, map, continuation);
        }

        public static /* synthetic */ Object loginState$default(WechatReplyApiService wechatReplyApiService, String str, String str2, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginState");
            }
            if ((i & 1) != 0) {
                str = EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/api/v2/api/login/checkOnline" : "https://gateway.iwhop.cn/gateway/user/api/v2/api/login/checkOnline";
            }
            return wechatReplyApiService.loginState(str, str2, map, continuation);
        }

        public static /* synthetic */ Object getFriendUserInfo$default(WechatReplyApiService wechatReplyApiService, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFriendUserInfo");
            }
            if ((i & 1) != 0) {
                str = EvnMgr.isTest() ? "http://101.42.221.237:7080/msg/v2/getFriendUserInfo" : "http://v3-wechat.iwhopodm.cn/msg/v2/getFriendUserInfo";
            }
            return wechatReplyApiService.getFriendUserInfo(str, str2, str3, str4, continuation);
        }

        public static /* synthetic */ Object queryImgEmo$default(WechatReplyApiService wechatReplyApiService, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryImgEmo");
            }
            if ((i & 1) != 0) {
                str = EvnMgr.isTest() ? "https://test-ai-howear.iwhop.cn/gateway/user/api/v1/queryEmojiIconList" : "https://gateway.iwhop.cn/gateway/user/api/v1/queryEmojiIconList";
            }
            return wechatReplyApiService.queryImgEmo(str, continuation);
        }
    }
}
