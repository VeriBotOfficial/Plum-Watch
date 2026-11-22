package com.wakeup.common.storage;

import android.text.TextUtils;
import com.wakeup.common.network.entity.user.UserAiMemberResp;
import com.wakeup.common.network.entity.user.UserIntegralInfo;
import com.wakeup.common.storage.model.UserModel;

/* loaded from: classes2.dex */
public class UserDao {
    private static final String CACHE_KEY = "cache_user";
    private static final String LAST_ACCOUNT_KEY = "last_login_account";

    public static boolean hasLogin() {
        return getUser() != null;
    }

    public static UserModel getUser() {
        return (UserModel) CacheManager.INSTANCE.getData(CACHE_KEY, UserModel.class);
    }

    public static String getToken() {
        UserModel user = getUser();
        return user != null ? user.getToken() : "";
    }

    public static String getUid() {
        UserModel user = getUser();
        return user != null ? String.valueOf(user.getUid()) : "";
    }

    public static String getOtherUid() {
        UserModel user = getUser();
        return user != null ? String.valueOf(user.getUserIdEncrypt()) : "";
    }

    public static int getHeight() {
        UserModel user = getUser();
        if (user != null) {
            return user.getHeight();
        }
        return 170;
    }

    public static float getWeight() {
        UserModel user = getUser();
        if (user != null) {
            return user.getWeight();
        }
        return 60.0f;
    }

    public static boolean isVip() {
        UserModel user = getUser();
        return user != null && user.getIsVip() == 1;
    }

    public static boolean isAIVip() {
        UserModel user = getUser();
        if (user != null) {
            return user.getaIVipStatus() == 2 || user.getaIVipStatus() == 3;
        }
        return false;
    }

    public static int getMemberFreeStatus() {
        return getUser().member7dFreeActivityStatus;
    }

    public static void saveMemberFreeStatus(int memberFreeStatus) {
        UserModel user = getUser();
        if (user == null) {
            return;
        }
        user.setMemberFreeStatus(memberFreeStatus);
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
    }

    public static String getBind() {
        UserModel user = getUser();
        if (user == null || TextUtils.isEmpty(user.getPhone())) {
            return "";
        }
        return user.getPhone();
    }

    public static int getUnit() {
        UserModel user = getUser();
        if (user == null) {
            return 1;
        }
        return user.getUnit();
    }

    public static int getTemperatureUnit() {
        UserModel user = getUser();
        if (user == null) {
            return 0;
        }
        return user.getTemperatureUnit();
    }

    public static String getGenderStr() {
        UserModel user = getUser();
        return user == null ? "" : user.getGender() + "";
    }

    public static String getAgeStr() {
        UserModel user = getUser();
        return user == null ? "" : user.getAge() + "";
    }

    public static void saveUser(UserModel userModel) {
        removeUser();
        CacheManager.INSTANCE.saveData(CACHE_KEY, userModel);
    }

    public static void editUser(UserModel userModel) {
        CacheManager.INSTANCE.saveData(CACHE_KEY, userModel);
    }

    public static void saveUserByInfo(UserModel model) {
        UserModel user = getUser();
        if (user == null) {
            return;
        }
        user.setActivityNum(model.getActivityNum());
        user.setAvatar(model.getAvatar());
        user.setDistance(model.getDistance());
        user.setFriendNum(model.getFriendNum());
        user.setLevelNum(model.getLevelNum());
        user.setMedalNum(model.getMedalNum());
        user.setNickname(model.getNickname());
        user.setStepNum(model.getStepNum());
        user.setAreaCid(model.getAreaCid());
        user.setAreaCname(model.getAreaCname());
        user.setAreaId(model.getAreaId());
        user.setAreaPid(model.getAreaPid());
        user.setAreaPname(model.getAreaPname());
        user.setBirthday(model.getBirthday());
        user.setGender(model.getGender());
        user.setGoalNum(model.getGoalNum());
        user.setHeight(model.getHeight());
        user.setInfo(model.getInfo());
        user.setUid(model.getUid());
        user.setWeight(model.getWeight());
        user.setUnit(model.getUnit());
        user.setHealthType(model.getHealthType());
        user.setListType(model.getListType());
        user.setLastDate(model.getLastDate());
        user.setIntervals(model.getIntervals());
        user.setLen(model.getLen());
        user.setCreateTime(model.getCreateTime());
        if (!TextUtils.isEmpty(model.getPhone())) {
            user.setPhone(model.getPhone());
        }
        if (!TextUtils.isEmpty(model.getEmail())) {
            user.setEmail(model.getEmail());
        }
        user.setGoalActiveTime(model.getGoalActiveTime());
        user.setGoalIntensityTime(model.getGoalIntensityTime());
        user.setUserIdEncrypt(model.getUserIdEncrypt());
        user.setGoalExerciseTime(model.getGoalExerciseTime());
        user.setGoalActiveKcal(model.getGoalActiveKcal());
        user.setGoalExerciseCount(model.getGoalExerciseCount());
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
    }

    public static UserModel saveUserByVip(UserModel model) {
        UserModel user = getUser();
        if (user == null || model == null) {
            return null;
        }
        user.setDescInfo(model.getDescInfo());
        user.setDueTime(model.getDueTime());
        user.setIsVip(model.getIsVip());
        user.setMemberFreeStatus(model.getMemberFreeStatus());
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
        return user;
    }

    public static UserModel saveUserByAIVip(UserAiMemberResp aiMemberResp) {
        UserModel user = getUser();
        if (user == null || aiMemberResp == null) {
            return null;
        }
        user.setAiDueTime(aiMemberResp.getDueTime());
        user.setAiDueTimeStamp(aiMemberResp.getDueTimeStamp());
        user.setaIVipStatus(aiMemberResp.getAiMemberStatus());
        user.setaIVipDesc(aiMemberResp.getDesc());
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
        return user;
    }

    public static void savePhone(String phone) {
        UserModel user = getUser();
        if (user == null) {
            return;
        }
        user.setPhone(phone);
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
    }

    public static UserModel saveUserByIntegral(UserIntegralInfo model) {
        UserModel user = getUser();
        if (user == null) {
            return null;
        }
        user.setIntegralScore(model.getIntegralScore());
        user.setSignCount(model.getSignCount());
        user.setAppTime(model.getAppTime());
        CacheManager.INSTANCE.saveData(CACHE_KEY, user);
        return user;
    }

    public static void removeUser() {
        CacheManager.INSTANCE.remove(CACHE_KEY);
    }

    public static void saveLastLoginAccount(String account) {
        CacheManager.INSTANCE.saveString(LAST_ACCOUNT_KEY, account);
    }

    public static String getLastLoginAccount() {
        return CacheManager.INSTANCE.getString(LAST_ACCOUNT_KEY, "");
    }

    public static void clearLastLoginAccount() {
        CacheManager.INSTANCE.remove(LAST_ACCOUNT_KEY);
    }
}
