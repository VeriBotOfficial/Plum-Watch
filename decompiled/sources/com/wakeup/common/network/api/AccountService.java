package com.wakeup.common.network.api;

import com.wakeup.common.Constants;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.common.network.entity.BindEntity;
import com.wakeup.common.storage.model.UserModel;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: AccountService.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00070\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010\n\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020!H§@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020$H§@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020'H§@¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0003H§@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\n\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u000201H§@¢\u0006\u0002\u00102J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504H§@¢\u0006\u0002\u0010+J\u001e\u00106\u001a\b\u0012\u0004\u0012\u000205042\b\b\u0001\u00107\u001a\u00020\u0004H§@¢\u0006\u0002\u00108J*\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H§@¢\u0006\u0002\u0010\bJ\u001a\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0\u0003H§@¢\u0006\u0002\u0010+J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020>H§@¢\u0006\u0002\u0010?J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020AH§@¢\u0006\u0002\u0010BJ\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020DH§@¢\u0006\u0002\u0010EJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020GH§@¢\u0006\u0002\u0010HJ\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020JH§@¢\u0006\u0002\u0010KJ/\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0019\b\u0001\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00070\u0006H§@¢\u0006\u0002\u0010\b¨\u0006M"}, d2 = {"Lcom/wakeup/common/network/api/AccountService;", "", "sendcode2", "Lcom/wakeup/common/network/BaseResult;", "", "params", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verification", "body", "Lcom/wakeup/common/network/entity/BasicRequest$Verification;", "(Lcom/wakeup/common/network/entity/BasicRequest$Verification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/wakeup/common/storage/model/UserModel;", "Lcom/wakeup/common/network/entity/BasicRequest$Login;", "(Lcom/wakeup/common/network/entity/BasicRequest$Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smsLogin", "Lcom/wakeup/common/network/entity/BasicRequest$SmsLogin;", "(Lcom/wakeup/common/network/entity/BasicRequest$SmsLogin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smsCheckRegister", "Lcom/wakeup/common/network/entity/BasicRequest$SmsCheckRegister;", "(Lcom/wakeup/common/network/entity/BasicRequest$SmsCheckRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rePassword", "Lcom/wakeup/common/network/entity/BasicRequest$Repassword;", "(Lcom/wakeup/common/network/entity/BasicRequest$Repassword;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MiPushClient.COMMAND_REGISTER, "Lcom/wakeup/common/network/entity/BasicRequest$Register;", "(Lcom/wakeup/common/network/entity/BasicRequest$Register;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePwd", "Lcom/wakeup/common/network/entity/BasicRequest$UpdatePwd;", "(Lcom/wakeup/common/network/entity/BasicRequest$UpdatePwd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "platformlogin", "Lcom/wakeup/common/network/entity/BasicRequest$PlatformLogin;", "(Lcom/wakeup/common/network/entity/BasicRequest$PlatformLogin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWithOneKey", "Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKey;", "(Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWithOneKeyCache", "Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKeyCache;", "(Lcom/wakeup/common/network/entity/BasicRequest$LoginWithOneKeyCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBind", "Lcom/wakeup/common/network/entity/BindEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bind", "", "Lcom/wakeup/common/network/entity/BasicRequest$Bind;", "(Lcom/wakeup/common/network/entity/BasicRequest$Bind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "Lcom/wakeup/common/network/entity/BasicRequest$Logout;", "(Lcom/wakeup/common/network/entity/BasicRequest$Logout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCaptcha", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getCaptcha2", Constants.BundleKey.ACCOUNT, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logoutSendCode", "getCountry", "", "Lcom/wakeup/common/network/entity/BasicResponse$CountryModel;", "platformBindPhone", "Lcom/wakeup/common/network/entity/BasicRequest$PlatformBindPhone;", "(Lcom/wakeup/common/network/entity/BasicRequest$PlatformBindPhone;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceBinding", "Lcom/wakeup/common/network/entity/BasicRequest$ForceBinding;", "(Lcom/wakeup/common/network/entity/BasicRequest$ForceBinding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyPhone", "Lcom/wakeup/common/network/entity/BasicRequest$ModifyPhoneRequest;", "(Lcom/wakeup/common/network/entity/BasicRequest$ModifyPhoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPassword", "Lcom/wakeup/common/network/entity/BasicRequest$setPasswordRequest;", "(Lcom/wakeup/common/network/entity/BasicRequest$setPasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindAccount", "Lcom/wakeup/common/network/entity/BasicRequest$BindAccount;", "(Lcom/wakeup/common/network/entity/BasicRequest$BindAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsetEquipmentQrcode", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AccountService {
    @POST("user/auth/platform/bind")
    Object bind(@Body BasicRequest.Bind bind, Continuation<? super BaseResult<Boolean>> continuation);

    @POST("user/auth/bind/account")
    Object bindAccount(@Body BasicRequest.BindAccount bindAccount, Continuation<? super BaseResult<String>> continuation);

    @POST("user/platformBindPhone")
    Object forceBinding(@Body BasicRequest.ForceBinding forceBinding, Continuation<? super BaseResult<String>> continuation);

    @GET("user/auth/platform/bind/get")
    Object getBind(Continuation<? super BaseResult<BindEntity>> continuation);

    @GET("user/auth/off/getCaptcha")
    Object getCaptcha(Continuation<? super Response<ResponseBody>> continuation);

    @GET("user/v2/captcha/image/{account}")
    Object getCaptcha2(@Path("account") String str, Continuation<? super Response<ResponseBody>> continuation);

    @GET("sys/areas/0")
    Object getCountry(Continuation<? super BaseResult<List<BasicResponse.CountryModel>>> continuation);

    @POST("user/login")
    Object login(@Body BasicRequest.Login login, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("user/fast/login")
    Object loginWithOneKey(@Body BasicRequest.LoginWithOneKey loginWithOneKey, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("user/fast/login")
    Object loginWithOneKeyCache(@Body BasicRequest.LoginWithOneKeyCache loginWithOneKeyCache, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("user/auth/off/user")
    Object logout(@Body BasicRequest.Logout logout, Continuation<? super BaseResult<String>> continuation);

    @POST("sysCode/auth/off/getCode")
    Object logoutSendCode(@Body Map<String, String> map, Continuation<? super BaseResult<String>> continuation);

    @POST("user/update/phone")
    Object modifyPhone(@Body BasicRequest.ModifyPhoneRequest modifyPhoneRequest, Continuation<? super BaseResult<String>> continuation);

    @POST("user/valid/platformBindPhone")
    Object platformBindPhone(@Body BasicRequest.PlatformBindPhone platformBindPhone, Continuation<? super BaseResult<String>> continuation);

    @POST("user/platformlogin")
    Object platformlogin(@Body BasicRequest.PlatformLogin platformLogin, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("user/repassword")
    Object rePassword(@Body BasicRequest.Repassword repassword, Continuation<? super BaseResult<String>> continuation);

    @POST("user/register")
    Object register(@Body BasicRequest.Register register, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("sysCode/sendcode")
    Object sendcode2(@Body Map<String, Object> map, Continuation<? super BaseResult<String>> continuation);

    @POST("user/set/password")
    Object setPassword(@Body BasicRequest.setPasswordRequest setpasswordrequest, Continuation<? super BaseResult<String>> continuation);

    @POST("user/smsCheckRegister")
    Object smsCheckRegister(@Body BasicRequest.SmsCheckRegister smsCheckRegister, Continuation<? super BaseResult<Object>> continuation);

    @POST("user/smsLogin")
    Object smsLogin(@Body BasicRequest.SmsLogin smsLogin, Continuation<? super BaseResult<UserModel>> continuation);

    @POST("user/auth/password")
    Object updatePwd(@Body BasicRequest.UpdatePwd updatePwd, Continuation<? super BaseResult<String>> continuation);

    @Headers({"Channel-Id:0", "Product-Id:0"})
    @POST("equipmentQrCode/upsetEquipmentQrcode")
    Object upsetEquipmentQrcode(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    @POST("user/verification")
    Object verification(@Body BasicRequest.Verification verification, Continuation<? super BaseResult<String>> continuation);
}
