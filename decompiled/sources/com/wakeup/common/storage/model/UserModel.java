package com.wakeup.common.storage.model;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.d.l;
import com.wakeup.common.utils.SystemUtils;
import com.wakeup.feature.user.constant.UserConstants;
import java.io.Serializable;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UserModel implements Serializable {
    private static final String TAG = "UserModel";
    private String aIVipDesc;
    private int aIVipStatus;
    private String account;
    private int activityNum;
    private String aiDueTime;
    private long aiDueTimeStamp;
    private int appTime;
    private int areaCid;
    private String areaCname;
    private int areaId;
    private int areaPid;
    private String areaPname;
    private String avatar;
    public String avatarLocalFile;
    private long birthday;
    private long createTime;
    private String descInfo;
    private float distance;
    private long dueTime;
    private String email;
    private int friendNum;
    private int gender;
    private int goalActiveKcal;
    private int goalActiveTime;
    private int goalExerciseCount;
    private int goalExerciseTime;
    private int goalIntensityTime;
    private int goalNum;
    private int healthType;
    private int height;
    private int info;
    private int integralScore;
    private int intervals;
    private int isVip;
    private long lastDate;
    private int len;
    private int levelNum;
    private int listType;
    private int medalNum;
    public int member7dFreeActivityStatus = 0;
    private String nickname;
    private String openId;
    private String phone;
    private int platform;
    private int signCount;
    private int stepNum;
    private int temperatureUnit;
    private String token;
    private int uid;
    private int unit;
    private String userIdEncrypt;
    private float weight;

    public static class UserInfoUpdateType {
        public static final int ACTIVE_HEAT = 17;
        public static final int ACTIVITY_HOUR = 16;
        public static final int AVATAR = 3;
        public static final int BIRTHDAY = 5;
        public static final int EXERCISE_DURATION = 13;
        public static final int GENDER = 4;
        public static final int GOALNUM = 8;
        public static final int HEIGHT = 6;
        public static final int NICNAME = 2;
        public static final int NUM_ACTIVITY = 14;
        public static final int WEIGHT = 7;
    }

    public String getUserIdEncrypt() {
        return this.userIdEncrypt;
    }

    public void setUserIdEncrypt(String userIdEncrypt) {
        this.userIdEncrypt = userIdEncrypt;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getAreaCid() {
        return this.areaCid;
    }

    public void setAreaCid(int areaCid) {
        this.areaCid = areaCid;
    }

    public String getAreaCname() {
        return this.areaCname;
    }

    public void setAreaCname(String areaCname) {
        this.areaCname = areaCname;
    }

    public int getAreaId() {
        return this.areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public int getAreaPid() {
        return this.areaPid;
    }

    public void setAreaPid(int areaPid) {
        this.areaPid = areaPid;
    }

    public String getAreaPname() {
        return this.areaPname;
    }

    public void setAreaPname(String areaPname) {
        this.areaPname = areaPname;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public int getAge() {
        if (this.birthday == 0) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.birthday * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2) + 1;
        int i6 = calendar2.get(5);
        int i7 = i4 - i;
        if (i5 < i2 || (i5 == i2 && i6 < i3)) {
            i7--;
        }
        return Math.max(i7, 0);
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return this.gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGoalNum() {
        return this.goalNum;
    }

    public void setGoalNum(int goalNum) {
        this.goalNum = goalNum;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNickname() {
        if (TextUtils.isEmpty(this.nickname)) {
            return "";
        }
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getActivityNum() {
        return this.activityNum;
    }

    public void setActivityNum(int activityNum) {
        this.activityNum = activityNum;
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getFriendNum() {
        return this.friendNum;
    }

    public void setFriendNum(int friendNum) {
        this.friendNum = friendNum;
    }

    public int getLevelNum() {
        return this.levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public int getMedalNum() {
        return this.medalNum;
    }

    public void setMedalNum(int medalNum) {
        this.medalNum = medalNum;
    }

    public int getStepNum() {
        return this.stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getTemperatureUnit() {
        return this.temperatureUnit;
    }

    public void setTemperatureUnit(int temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public int getHealthType() {
        return this.healthType;
    }

    public void setHealthType(int healthType) {
        this.healthType = healthType;
    }

    public int getListType() {
        return this.listType;
    }

    public void setListType(int listType) {
        this.listType = listType;
    }

    public long getLastDate() {
        return this.lastDate;
    }

    public void setLastDate(long lastDate) {
        this.lastDate = lastDate;
    }

    public int getIntervals() {
        return this.intervals;
    }

    public void setIntervals(int intervals) {
        this.intervals = intervals;
    }

    public int getLen() {
        return this.len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescInfo() {
        return this.descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public long getDueTime() {
        return this.dueTime;
    }

    public void setDueTime(long dueTime) {
        this.dueTime = dueTime;
    }

    public int getIsVip() {
        return this.isVip;
    }

    public void setIsVip(int isVip) {
        this.isVip = isVip;
    }

    public int getIntegralScore() {
        return this.integralScore;
    }

    public void setIntegralScore(int integralScore) {
        this.integralScore = integralScore;
    }

    public int getSignCount() {
        return this.signCount;
    }

    public void setSignCount(int signCount) {
        this.signCount = signCount;
    }

    public int getAppTime() {
        return this.appTime;
    }

    public void setAppTime(int appTime) {
        this.appTime = appTime;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public int getGoalExerciseTime() {
        return this.goalExerciseTime;
    }

    public void setGoalExerciseTime(int goalExerciseTime) {
        this.goalExerciseTime = goalExerciseTime;
    }

    public int getGoalExerciseCount() {
        return this.goalExerciseCount;
    }

    public void setGoalExerciseCount(int goalExerciseCount) {
        this.goalExerciseCount = goalExerciseCount;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getGoalActiveTime() {
        return this.goalActiveTime;
    }

    public void setGoalActiveTime(int goalActiveTime) {
        this.goalActiveTime = goalActiveTime;
    }

    public int getGoalIntensityTime() {
        return this.goalIntensityTime;
    }

    public void setGoalIntensityTime(int goalIntensityTime) {
        this.goalIntensityTime = goalIntensityTime;
    }

    public int getGoalActiveKcal() {
        return this.goalActiveKcal;
    }

    public void setGoalActiveKcal(int goalActiveKcal) {
        this.goalActiveKcal = goalActiveKcal;
    }

    public int getMemberFreeStatus() {
        return this.member7dFreeActivityStatus;
    }

    public void setMemberFreeStatus(int member7dFreeActivity) {
        this.member7dFreeActivityStatus = member7dFreeActivity;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UserConstants.AREA_ID, this.areaId);
            jSONObject.put("birthday", this.birthday);
            jSONObject.put("createTime", System.currentTimeMillis() / 1000);
            jSONObject.put("gender", this.gender);
            jSONObject.put(UserConstants.GOAL_NUM, this.goalNum);
            jSONObject.put("healthType", this.healthType);
            jSONObject.put("height", this.height);
            jSONObject.put("intervals", this.intervals);
            jSONObject.put("lastDate", this.lastDate);
            jSONObject.put("len", this.len);
            jSONObject.put("listType", this.listType);
            jSONObject.put("locale", SystemUtils.getLanguage().getLanguage());
            jSONObject.put("nickname", getNickname());
            jSONObject.put("nowTime", System.currentTimeMillis() / 1000);
            jSONObject.put("system", 1);
            jSONObject.put("unit", this.unit);
            jSONObject.put("temperatureUnit", this.temperatureUnit);
            jSONObject.put(l.a.ac, System.currentTimeMillis() / 1000);
            jSONObject.put("weight", this.weight);
            jSONObject.put("phone", this.phone);
            jSONObject.put("email", this.email);
            jSONObject.put("userIdEncrypt", this.userIdEncrypt);
            jSONObject.put("goalExerciseTime", this.goalExerciseTime);
            jSONObject.put("goalExerciseCount", this.goalExerciseCount);
            jSONObject.put("goalActiveKcal", this.goalActiveKcal);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(TAG, "user model to string json error");
            return super.toString();
        }
    }

    public String toChangeString(int updateType) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appTime", System.currentTimeMillis() / 1000);
            jSONObject.put(UserConstants.AREA_ID, this.areaId);
            jSONObject.put("avatarUrl", this.avatar);
            jSONObject.put("birthday", this.birthday);
            jSONObject.put("gender", this.gender);
            jSONObject.put(UserConstants.GOAL_NUM, this.goalNum);
            jSONObject.put("healthType", this.healthType);
            jSONObject.put("height", this.height);
            jSONObject.put("listType", this.listType);
            jSONObject.put("locale", SystemUtils.getLanguage().getLanguage());
            jSONObject.put("nickname", getNickname());
            jSONObject.put("system", 1);
            jSONObject.put("temperatureUnit", this.temperatureUnit);
            jSONObject.put("unit", this.unit);
            jSONObject.put("updateType", updateType);
            jSONObject.put("weight", this.weight);
            jSONObject.put("goalExerciseTime", this.goalExerciseTime);
            jSONObject.put("goalExerciseCount", this.goalExerciseCount);
            jSONObject.put("goalActiveKcal", this.goalActiveKcal);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(TAG, "user model change string error");
            return toString();
        }
    }

    public String changeRainbowTargetString(int type) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appTime", System.currentTimeMillis() / 1000);
            jSONObject.put("updateType", type);
            jSONObject.put("goalActiveTime", this.goalActiveTime);
            jSONObject.put("goalExerciseTime", this.goalExerciseTime);
            jSONObject.put("goalActiveKcal", this.goalActiveKcal);
            return jSONObject.toString();
        } catch (JSONException unused) {
            Log.e(TAG, "user model change rainbow target string error");
            return toString();
        }
    }

    public String getAiDueTime() {
        return this.aiDueTime;
    }

    public void setAiDueTime(String aiDueTime) {
        this.aiDueTime = aiDueTime;
    }

    public int getaIVipStatus() {
        return this.aIVipStatus;
    }

    public void setaIVipStatus(int aIVipStatus) {
        this.aIVipStatus = aIVipStatus;
    }

    public String getaIVipDesc() {
        return this.aIVipDesc;
    }

    public void setaIVipDesc(String aIVipDesc) {
        this.aIVipDesc = aIVipDesc;
    }

    public long getAiDueTimeStamp() {
        return this.aiDueTimeStamp;
    }

    public void setAiDueTimeStamp(long aiDueTimeStamp) {
        this.aiDueTimeStamp = aiDueTimeStamp;
    }
}
