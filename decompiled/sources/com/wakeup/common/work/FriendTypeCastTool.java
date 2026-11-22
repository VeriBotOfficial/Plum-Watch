package com.wakeup.common.work;

import com.wakeup.common.network.entity.friend.FamilyMemberModel;
import com.wakeup.common.network.entity.friend.FriendHomeBean;
import com.wakeup.common.network.entity.friend.FriendLocationStampBean;
import com.wakeup.common.network.entity.friend.FriendUserAllDataBean;
import com.wakeup.common.network.entity.health.HealthUserCalculateDataBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FriendTypeCastTool.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\"\u001a\u0004\u0018\u00010\u00132\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010 \u001a\u0004\u0018\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020!0$2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020!J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010/\u001a\u00020\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00060"}, d2 = {"Lcom/wakeup/common/work/FriendTypeCastTool;", "", "<init>", "()V", "friendHomeBean", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean;", "getFriendHomeBean", "()Lcom/wakeup/common/network/entity/friend/FriendHomeBean;", "setFriendHomeBean", "(Lcom/wakeup/common/network/entity/friend/FriendHomeBean;)V", "friendAllDataArray", "Ljava/util/ArrayList;", "Lcom/wakeup/common/network/entity/friend/FriendUserAllDataBean;", "Lkotlin/collections/ArrayList;", "getFriendAllDataArray", "()Ljava/util/ArrayList;", "setFriendAllDataArray", "(Ljava/util/ArrayList;)V", "friendInfo2MemberModel", "Lcom/wakeup/common/network/entity/friend/FamilyMemberModel;", "friendUserInfo", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendUserInfo;", "userState", "", "memberModel2FriendInfo", "memberModel", "idFindHomeBeanBasicInfo", "findUserId", "", "idFindAllDataBasicInfo", "idFindAllDataCalculateData", "Lcom/wakeup/common/network/entity/health/HealthUserCalculateDataBean;", "idFindHomeBeanLocationVo", "Lcom/wakeup/common/network/entity/friend/FriendHomeBean$FriendLocationBean;", "idFindMemberModel", "dataList", "", "idChangeLocationVo", "newLocationBean", "addOrChangeFriendUserAllData", "", "newData", "addOrChangeFriendHomeBean", "updateLocationStamp", "locationStamp", "Lcom/wakeup/common/network/entity/friend/FriendLocationStampBean;", "idFindFriendUserAllData", "userId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FriendTypeCastTool {
    public static final FriendTypeCastTool INSTANCE = new FriendTypeCastTool();
    private static ArrayList<FriendUserAllDataBean> friendAllDataArray = new ArrayList<>();
    private static FriendHomeBean friendHomeBean;

    private FriendTypeCastTool() {
    }

    public final FriendHomeBean getFriendHomeBean() {
        return friendHomeBean;
    }

    public final void setFriendHomeBean(FriendHomeBean friendHomeBean2) {
        friendHomeBean = friendHomeBean2;
    }

    public final ArrayList<FriendUserAllDataBean> getFriendAllDataArray() {
        return friendAllDataArray;
    }

    public final void setFriendAllDataArray(ArrayList<FriendUserAllDataBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        friendAllDataArray = arrayList;
    }

    public final FamilyMemberModel friendInfo2MemberModel(FriendHomeBean.FriendUserInfo friendUserInfo, int userState) {
        Intrinsics.checkNotNullParameter(friendUserInfo, "friendUserInfo");
        friendUserInfo.getUserId();
        long userId = friendUserInfo.getUserId();
        String userName = friendUserInfo.getUserName();
        String userAvatar = friendUserInfo.getUserAvatar();
        String dataFunctionIds = friendUserInfo.getDataFunctionIds();
        Intrinsics.checkNotNull(dataFunctionIds);
        return new FamilyMemberModel(userId, userName, userAvatar, userState, dataFunctionIds);
    }

    public final FriendHomeBean.FriendUserInfo memberModel2FriendInfo(FamilyMemberModel memberModel) {
        Intrinsics.checkNotNullParameter(memberModel, "memberModel");
        return new FriendHomeBean.FriendUserInfo(Long.valueOf(System.currentTimeMillis() / 1000), memberModel.getDataFunctionIds(), memberModel.getAvatar(), memberModel.getUserId(), memberModel.getNickname(), null, 32, null);
    }

    public final FriendHomeBean.FriendUserInfo idFindHomeBeanBasicInfo(long findUserId) {
        ArrayList<FriendHomeBean.FriendUserInfo> userInfos;
        FriendHomeBean friendHomeBean2 = friendHomeBean;
        Object obj = null;
        if (friendHomeBean2 == null || (userInfos = friendHomeBean2.getUserInfos()) == null) {
            return null;
        }
        Iterator<T> it = userInfos.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FriendHomeBean.FriendUserInfo) next).getUserId() == findUserId) {
                obj = next;
                break;
            }
        }
        return (FriendHomeBean.FriendUserInfo) obj;
    }

    public final FriendHomeBean.FriendUserInfo idFindAllDataBasicInfo(long findUserId) {
        Object obj;
        Iterator<T> it = friendAllDataArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long userId = ((FriendUserAllDataBean) obj).getUserId();
            if (userId != null && userId.longValue() == findUserId) {
                break;
            }
        }
        FriendUserAllDataBean friendUserAllDataBean = (FriendUserAllDataBean) obj;
        if (friendUserAllDataBean != null) {
            return friendUserAllDataBean.getFriendUserBasicData();
        }
        return null;
    }

    public final HealthUserCalculateDataBean idFindAllDataCalculateData(long findUserId) {
        Object obj;
        Iterator<T> it = friendAllDataArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long userId = ((FriendUserAllDataBean) obj).getUserId();
            if (userId != null && userId.longValue() == findUserId) {
                break;
            }
        }
        FriendUserAllDataBean friendUserAllDataBean = (FriendUserAllDataBean) obj;
        if (friendUserAllDataBean != null) {
            return friendUserAllDataBean.getUserRecentlyInfoVo();
        }
        return null;
    }

    public final FriendHomeBean.FriendLocationBean idFindHomeBeanLocationVo(long findUserId) {
        ArrayList<FriendHomeBean.FriendLocationBean> locationList;
        FriendHomeBean friendHomeBean2 = friendHomeBean;
        Object obj = null;
        if (friendHomeBean2 == null || (locationList = friendHomeBean2.getLocationList()) == null) {
            return null;
        }
        Iterator<T> it = locationList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Long userId = ((FriendHomeBean.FriendLocationBean) next).getUserId();
            if (userId != null && userId.longValue() == findUserId) {
                obj = next;
                break;
            }
        }
        return (FriendHomeBean.FriendLocationBean) obj;
    }

    public final FamilyMemberModel idFindMemberModel(List<FamilyMemberModel> dataList, long findUserId) {
        Object obj = null;
        if (dataList == null) {
            return null;
        }
        Iterator<T> it = dataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FamilyMemberModel) next).getUserId() == findUserId) {
                obj = next;
                break;
            }
        }
        return (FamilyMemberModel) obj;
    }

    public final FriendHomeBean.FriendLocationBean idFindHomeBeanLocationVo(List<FriendHomeBean.FriendLocationBean> dataList, long findUserId) {
        Object obj;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Iterator<T> it = dataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long userId = ((FriendHomeBean.FriendLocationBean) obj).getUserId();
            if (userId != null && userId.longValue() == findUserId) {
                break;
            }
        }
        return (FriendHomeBean.FriendLocationBean) obj;
    }

    public final FriendHomeBean.FriendLocationBean idChangeLocationVo(long findUserId, FriendHomeBean.FriendLocationBean newLocationBean) {
        ArrayList<FriendHomeBean.FriendLocationBean> locationList;
        Object obj;
        Intrinsics.checkNotNullParameter(newLocationBean, "newLocationBean");
        FriendHomeBean friendHomeBean2 = friendHomeBean;
        if (friendHomeBean2 != null && (locationList = friendHomeBean2.getLocationList()) != null) {
            Iterator<T> it = locationList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long userId = ((FriendHomeBean.FriendLocationBean) obj).getUserId();
                if (userId != null && userId.longValue() == findUserId) {
                    break;
                }
            }
            if (((FriendHomeBean.FriendLocationBean) obj) == null) {
                locationList.add(newLocationBean);
            } else {
                int size = locationList.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.areEqual(locationList.get(i).getUserId(), newLocationBean.getUserId())) {
                        locationList.set(i, newLocationBean);
                        return locationList.get(i);
                    }
                }
            }
        }
        return null;
    }

    public final void addOrChangeFriendUserAllData(FriendUserAllDataBean newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        int size = friendAllDataArray.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(friendAllDataArray.get(i).getUserId(), newData.getUserId())) {
                friendAllDataArray.set(i, newData);
                return;
            }
        }
        friendAllDataArray.add(newData);
    }

    public final void addOrChangeFriendHomeBean(FriendUserAllDataBean newData) {
        ArrayList<FriendHomeBean.FriendLocationBean> locationList;
        ArrayList<FriendHomeBean.FriendLocationBean> locationList2;
        FriendHomeBean.FriendLocationBean locationVo;
        Intrinsics.checkNotNullParameter(newData, "newData");
        FriendHomeBean friendHomeBean2 = friendHomeBean;
        if (friendHomeBean2 == null || (locationList = friendHomeBean2.getLocationList()) == null) {
            return;
        }
        int size = locationList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(locationList.get(i).getUserId(), newData.getUserId()) && (locationVo = newData.getLocationVo()) != null) {
                FriendHomeBean.FriendUserInfo friendUserBasicData = newData.getFriendUserBasicData();
                if (friendUserBasicData != null) {
                    friendUserBasicData.setLocationTimestamp(locationVo.getLocationTimestamp());
                }
                locationList.set(i, locationVo);
                return;
            }
        }
        FriendHomeBean.FriendLocationBean locationVo2 = newData.getLocationVo();
        if (locationVo2 != null) {
            FriendTypeCastTool friendTypeCastTool = INSTANCE;
            FriendHomeBean friendHomeBean3 = friendHomeBean;
            if (friendHomeBean3 != null && (locationList2 = friendHomeBean3.getLocationList()) != null) {
                locationList2.add(locationVo2);
            }
            Long userId = locationVo2.getUserId();
            Intrinsics.checkNotNull(userId);
            FriendHomeBean.FriendUserInfo idFindHomeBeanBasicInfo = friendTypeCastTool.idFindHomeBeanBasicInfo(userId.longValue());
            if (idFindHomeBeanBasicInfo != null) {
                idFindHomeBeanBasicInfo.setLocationTimestamp(locationVo2.getLocationTimestamp());
            }
        }
    }

    public final void updateLocationStamp(FriendLocationStampBean locationStamp) {
        ArrayList<FriendHomeBean.FriendUserInfo> userInfos;
        Object obj;
        Intrinsics.checkNotNullParameter(locationStamp, "locationStamp");
        List<FriendLocationStampBean.LocationDates> userLocationDates = locationStamp.getUserLocationDates();
        if (userLocationDates != null) {
            for (FriendLocationStampBean.LocationDates locationDates : userLocationDates) {
                FriendHomeBean friendHomeBean2 = friendHomeBean;
                if (friendHomeBean2 != null && (userInfos = friendHomeBean2.getUserInfos()) != null) {
                    Iterator<T> it = userInfos.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        long userId = ((FriendHomeBean.FriendUserInfo) obj).getUserId();
                        Long userId2 = locationDates.getUserId();
                        if (userId2 != null && userId == userId2.longValue()) {
                            break;
                        }
                    }
                    FriendHomeBean.FriendUserInfo friendUserInfo = (FriendHomeBean.FriendUserInfo) obj;
                    if (friendUserInfo != null) {
                        friendUserInfo.setLocationTimestamp(locationDates.getTimestamp());
                    }
                }
            }
        }
    }

    public final FriendUserAllDataBean idFindFriendUserAllData(long userId) {
        Object obj;
        Iterator<T> it = friendAllDataArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long userId2 = ((FriendUserAllDataBean) obj).getUserId();
            if (userId2 != null && userId2.longValue() == userId) {
                break;
            }
        }
        return (FriendUserAllDataBean) obj;
    }
}
