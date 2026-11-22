package com.wakeup.common.network.oss;

import kotlin.Metadata;

/* compiled from: OssConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/wakeup/common/network/oss/OssConfig;", "", "<init>", "()V", "OSS_ENDPOINT", "", "BUCKET_NAME_IMAGE", "OSS_ACCESS_KEY_ID", "OSS_ACCESS_KEY_SECRET", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OssConfig {
    public static final String BUCKET_NAME_IMAGE = "shenzhen-file-bucket";
    public static final OssConfig INSTANCE = new OssConfig();
    public static final String OSS_ACCESS_KEY_ID = "LTAI5tRYsYAtUjLJDDd7BJ8u";
    public static final String OSS_ACCESS_KEY_SECRET = "xfefuvMKQOmVc8KQ6ZT9TUotCIBsmu";
    public static final String OSS_ENDPOINT = "http://oss-cn-shenzhen.aliyuncs.com";

    private OssConfig() {
    }
}
