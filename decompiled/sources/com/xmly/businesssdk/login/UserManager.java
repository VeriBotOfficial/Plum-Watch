package com.xmly.businesssdk.login;

import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.gms.common.Scopes;
import com.xmly.businesssdk.network.bean.Profile;
import com.xmly.businesssdk.network.bean.TokenInfo;
import com.xmly.businesssdk.utils.FileUtil;
import com.xmly.businesssdk.utils.GsonHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u001e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\rJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u001a\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bJ&\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010(\u001a\u00020\nJ1\u0010)\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010(\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/xmly/businesssdk/login/UserManager;", "", "()V", "currentLoginType", "Lcom/xmly/businesssdk/login/LoginType;", Scopes.PROFILE, "Lcom/xmly/businesssdk/network/bean/Profile;", "tokenInfo", "Lcom/xmly/businesssdk/network/bean/TokenInfo;", "getAccessToken", "", "getAvatarUrl", "getId", "", "getLoginType", "getNickname", "getProfile", "getRefreshToken", "getTokenInfo", "getUid", "isLogin", "", "isVipUser", "loadLoginType", "", "logout", "refreshAccessToken", "accessToken", "refreshToken", "expiresIn", "saveLoginType", "loginType", "saveToFile", "file", "Ljava/io/File;", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "setLoginType", "setProfile", "setTokenInfo", "updateAuthEntity", "uid", "updateAuthEntityWithRefresh", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile UserManager instance;
    private LoginType currentLoginType;
    private Profile profile;
    private TokenInfo tokenInfo;

    /* compiled from: UserManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xmly/businesssdk/login/UserManager$Companion;", "", "()V", "FILE_LOGIN_TYPE", "", "FILE_PREFIX", "FILE_PROFILE", "FILE_TOKEN", "instance", "Lcom/xmly/businesssdk/login/UserManager;", "getInstance", "getLoginTypeFile", "Ljava/io/File;", "getProfileFile", "getTokenFile", "getXMToken", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getLoginTypeFile() {
            return new File(FileUtil.getBaseAppDir(), "com.xmly.business.login_type");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getProfileFile() {
            return new File(FileUtil.getBaseAppDir(), "com.xmly.business.profile");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getTokenFile() {
            return new File(FileUtil.getBaseAppDir(), "com.xmly.business.token");
        }

        @JvmStatic
        public final UserManager getInstance() {
            UserManager userManager;
            UserManager userManager2 = UserManager.instance;
            if (userManager2 != null) {
                return userManager2;
            }
            synchronized (this) {
                userManager = UserManager.instance;
                if (userManager == null) {
                    userManager = new UserManager(null);
                    Companion companion = UserManager.INSTANCE;
                    UserManager.instance = userManager;
                }
            }
            return userManager;
        }

        @JvmStatic
        public final String getXMToken() {
            TokenInfo tokenInfo = getInstance().getTokenInfo();
            if (tokenInfo != null) {
                return tokenInfo.getToken();
            }
            return null;
        }
    }

    private UserManager() {
        this.currentLoginType = LoginType.NONE;
        loadLoginType();
    }

    public /* synthetic */ UserManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final UserManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final String getXMToken() {
        return INSTANCE.getXMToken();
    }

    private final void loadLoginType() {
        LoginType loginType;
        String typeString = FileUtil.readFile2(INSTANCE.getLoginTypeFile());
        Intrinsics.checkNotNullExpressionValue(typeString, "typeString");
        if (typeString.length() > 0) {
            try {
                loginType = LoginType.valueOf(typeString);
            } catch (IllegalArgumentException unused) {
                loginType = LoginType.NONE;
            }
        } else {
            loginType = LoginType.NONE;
        }
        this.currentLoginType = loginType;
    }

    private final void saveLoginType(LoginType loginType) {
        FileUtil.writeFile2(INSTANCE.getLoginTypeFile(), loginType.name());
    }

    private final void saveToFile(File file, Object obj) {
        String json = obj != null ? GsonHelper.toJson(obj) : null;
        if (json == null) {
            json = "";
        }
        FileUtil.writeFile2(file, json);
    }

    public final String getAccessToken() {
        TokenInfo tokenInfo = getTokenInfo();
        if (tokenInfo != null) {
            return tokenInfo.getAccessToken();
        }
        return null;
    }

    public final String getAvatarUrl() {
        String avatarUrl;
        Profile profile = getProfile();
        return (profile == null || (avatarUrl = profile.getAvatarUrl()) == null) ? "" : avatarUrl;
    }

    public final long getId() {
        Profile profile = getProfile();
        if (profile != null) {
            return profile.getId();
        }
        return 0L;
    }

    /* renamed from: getLoginType, reason: from getter */
    public final LoginType getCurrentLoginType() {
        return this.currentLoginType;
    }

    public final String getNickname() {
        String nickname;
        Profile profile = getProfile();
        return (profile == null || (nickname = profile.getNickname()) == null) ? "" : nickname;
    }

    public final Profile getProfile() {
        if (this.profile == null) {
            this.profile = (Profile) GsonHelper.fromJson(FileUtil.readFile2(INSTANCE.getProfileFile()), Profile.class);
        }
        return this.profile;
    }

    public final String getRefreshToken() {
        TokenInfo tokenInfo = getTokenInfo();
        if (tokenInfo != null) {
            return tokenInfo.getRefreshToken();
        }
        return null;
    }

    public final TokenInfo getTokenInfo() {
        if (this.tokenInfo == null) {
            this.tokenInfo = (TokenInfo) GsonHelper.fromJson(FileUtil.readFile2(INSTANCE.getTokenFile()), TokenInfo.class);
        }
        return this.tokenInfo;
    }

    public final String getUid() {
        String uid;
        TokenInfo tokenInfo = getTokenInfo();
        return (tokenInfo == null || (uid = tokenInfo.getUid()) == null) ? "" : uid;
    }

    public final boolean isLogin() {
        TokenInfo tokenInfo = getTokenInfo();
        String uid = tokenInfo != null ? tokenInfo.getUid() : null;
        return !(uid == null || uid.length() == 0);
    }

    public final boolean isVipUser() {
        Profile profile = getProfile();
        return profile != null && profile.isVip() && profile.getVipExpiredAt() > System.currentTimeMillis();
    }

    public final void logout() {
        Companion companion = INSTANCE;
        FileUtil.deteleFile(companion.getTokenFile());
        FileUtil.deteleFile(companion.getProfileFile());
        FileUtil.deteleFile(companion.getLoginTypeFile());
        this.tokenInfo = null;
        this.profile = null;
        this.currentLoginType = LoginType.NONE;
    }

    public final void refreshAccessToken(String accessToken, String refreshToken, long expiresIn) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        TokenInfo tokenInfo = getTokenInfo();
        if (tokenInfo == null) {
            return;
        }
        tokenInfo.setAccessToken(accessToken);
        tokenInfo.setRefreshToken(refreshToken);
        tokenInfo.setExpires_in(expiresIn);
        saveToFile(INSTANCE.getTokenFile(), tokenInfo);
    }

    public final void setLoginType(LoginType loginType) {
        Intrinsics.checkNotNullParameter(loginType, "loginType");
        this.currentLoginType = loginType;
        saveLoginType(loginType);
    }

    public final void setProfile(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.profile = profile;
        saveToFile(INSTANCE.getProfileFile(), profile);
    }

    public final void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.tokenInfo = tokenInfo;
        saveToFile(INSTANCE.getTokenFile(), tokenInfo);
    }

    public final TokenInfo updateAuthEntity(String accessToken, String refreshToken, long expiresIn, String uid) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(uid, "uid");
        TokenInfo tokenInfo = getTokenInfo();
        if (expiresIn <= System.currentTimeMillis()) {
            expiresIn = (expiresIn * 1000) + System.currentTimeMillis();
        }
        TokenInfo tokenInfo2 = new TokenInfo(accessToken, refreshToken, tokenInfo != null ? tokenInfo.getToken() : null, tokenInfo != null ? tokenInfo.getDeviceId() : null, uid, tokenInfo != null ? tokenInfo.getScope() : null, expiresIn, tokenInfo != null ? tokenInfo.getCookie() : null);
        setTokenInfo(tokenInfo2);
        return tokenInfo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAuthEntityWithRefresh(java.lang.String r13, java.lang.String r14, long r15, java.lang.String r17, kotlin.coroutines.Continuation<? super com.xmly.businesssdk.network.bean.TokenInfo> r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$1
            if (r1 == 0) goto L15
            r1 = r0
            com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$1 r1 = (com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$1 r1 = new com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            java.lang.String r4 = "UserManager"
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 != r5) goto L38
            java.lang.Object r13 = r1.L$1
            com.xmly.businesssdk.network.bean.TokenInfo r13 = (com.xmly.businesssdk.network.bean.TokenInfo) r13
            java.lang.Object r14 = r1.L$0
            com.xmly.businesssdk.login.UserManager r14 = (com.xmly.businesssdk.login.UserManager) r14
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L35
            goto L9c
        L35:
            r0 = move-exception
            r14 = r0
            goto La4
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            kotlin.ResultKt.throwOnFailure(r0)
            long r6 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4d
            r8 = r15
            goto L56
        L4d:
            long r6 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r0
            long r8 = r8 * r15
            long r8 = r8 + r6
        L56:
            long r6 = java.lang.System.currentTimeMillis()
            r0 = 300000(0x493e0, float:4.2039E-40)
            long r10 = (long) r0
            long r10 = r10 + r6
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "接入方传入的Token已过期，expires_in="
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r3 = ", current="
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.xmly.businesssdk.utils.Logger.w(r4, r0)
            com.xmly.businesssdk.network.bean.TokenInfo r13 = r12.updateAuthEntity(r13, r14, r15, r17)
            kotlinx.coroutines.CoroutineDispatcher r14 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L35
            com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$2 r0 = new com.xmly.businesssdk.login.UserManager$updateAuthEntityWithRefresh$2     // Catch: java.lang.Exception -> L35
            r3 = 0
            r0.<init>(r3)     // Catch: java.lang.Exception -> L35
            r1.L$0 = r12     // Catch: java.lang.Exception -> L35
            r1.L$1 = r13     // Catch: java.lang.Exception -> L35
            r1.label = r5     // Catch: java.lang.Exception -> L35
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r14, r0, r1)     // Catch: java.lang.Exception -> L35
            if (r14 != r2) goto L9b
            return r2
        L9b:
            r14 = r12
        L9c:
            com.xmly.businesssdk.network.bean.TokenInfo r14 = r14.getTokenInfo()     // Catch: java.lang.Exception -> L35
            if (r14 != 0) goto La3
            return r13
        La3:
            return r14
        La4:
            java.lang.String r0 = "Token刷新失败，使用接入方提供的Token: "
            java.lang.StringBuilder r0 = com.xmly.businesssdk.c.a(r0)
            java.lang.String r14 = r14.getMessage()
            java.lang.StringBuilder r14 = r0.append(r14)
            java.lang.String r14 = r14.toString()
            com.xmly.businesssdk.utils.Logger.w(r4, r14)
            return r13
        Lba:
            com.xmly.businesssdk.network.bean.TokenInfo r13 = r12.updateAuthEntity(r13, r14, r15, r17)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.login.UserManager.updateAuthEntityWithRefresh(java.lang.String, java.lang.String, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
