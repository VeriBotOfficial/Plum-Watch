package io.agora.rtc2;

/* loaded from: classes6.dex */
public class UserInfo {
    public int uid;
    public String userAccount;

    public UserInfo() {
    }

    public UserInfo(int uid, String userAccount) {
        this.uid = uid;
        this.userAccount = userAccount;
    }

    public void SetUid(int uid) {
        this.uid = uid;
    }

    public void SetUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}
