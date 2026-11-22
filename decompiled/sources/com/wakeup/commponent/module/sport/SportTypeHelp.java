package com.wakeup.commponent.module.sport;

import android.text.TextUtils;
import com.wakeup.commonui.R;
import com.wakeup.commponent.module.data.SportData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportTypeHelp.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005¨\u0006\u001f"}, d2 = {"Lcom/wakeup/commponent/module/sport/SportTypeHelp;", "", "<init>", "()V", "getSportCategoryID", "", "type", "getSportIdFromCategoryID", "", "categoryId", "getCategoryIDName", "getSportIdName", "isCourse", "", "sportData", "Lcom/wakeup/commponent/module/data/SportData;", "isOtherCourse", "hasSportKm", "hasSportKmFromCategoryId", "isSportSwim", "isSportSwimFromCategoryId", "getCourseTypeToSportCourseId", "getSportTypeToBgIcon", "getSportTypeIcon", "getSportCategoryIdIcon", "hasAvgSpeed", "sportType", "hasAvgPace", "hasAvgCadenceAndStride", "hasClimb", "hasDecline", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportTypeHelp {
    public static final SportTypeHelp INSTANCE = new SportTypeHelp();

    public final int getCourseTypeToSportCourseId(int type) {
        if (type == 12) {
            return 16;
        }
        return type + 261;
    }

    public final int getSportCategoryID(int type) {
        if (type >= 1262) {
            return 1006;
        }
        if (type == 256 || type == 257 || type == 17 || type == 16 || type == 59 || type == 61 || type == 62 || type == 63) {
            return 1001;
        }
        if (type == 259) {
            return 1002;
        }
        if (type == 46 || type == 47 || type == 258) {
            return 1003;
        }
        if (type == 27 || type == 65) {
            return 1004;
        }
        if (type == 23 || type == 260) {
            return 1005;
        }
        if (type == 261 || type == 262 || type == 263 || type == 264 || type == 265 || type == 266 || type == 267 || type == 268 || type == 269 || type == 270 || type == 271 || type == 272 || (274 <= type && type < 303)) {
            return 1006;
        }
        return type;
    }

    public final boolean hasAvgCadenceAndStride(int sportType) {
        if (sportType == 23 || sportType == 28 || sportType == 48 || sportType == 51 || sportType == 59 || sportType == 256 || sportType == 257 || sportType == 259 || sportType == 260) {
            return true;
        }
        switch (sportType) {
            case 16:
            case 17:
            case 18:
                return true;
            default:
                switch (sportType) {
                    case 61:
                    case 62:
                    case 63:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean hasAvgPace(int sportType) {
        if (sportType == 23 || sportType == 28 || sportType == 48 || sportType == 51 || sportType == 59 || sportType == 256 || sportType == 257 || sportType == 259 || sportType == 260) {
            return true;
        }
        switch (sportType) {
            case 16:
            case 17:
            case 18:
                return true;
            default:
                switch (sportType) {
                    case 61:
                    case 62:
                    case 63:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean hasAvgSpeed(int sportType) {
        if (sportType == 23 || sportType == 51 || sportType == 59 || sportType == 65 || sportType == 27 || sportType == 28) {
            return true;
        }
        switch (sportType) {
            case 16:
            case 17:
            case 18:
                return true;
            default:
                switch (sportType) {
                    case 46:
                    case 47:
                    case 48:
                        return true;
                    default:
                        switch (sportType) {
                            case 61:
                            case 62:
                            case 63:
                                return true;
                            default:
                                switch (sportType) {
                                    case 256:
                                    case 257:
                                    case 258:
                                    case 259:
                                    case 260:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public final boolean hasClimb(int sportType) {
        return sportType == 37 || sportType == 256 || sportType == 258 || sportType == 259;
    }

    public final boolean hasDecline(int sportType) {
        return sportType == 256 || sportType == 258 || sportType == 259;
    }

    public final boolean hasSportKm(int type) {
        return type == 259 || type == 257 || type == 258 || type == 256 || type == 17 || type == 59 || type == 61 || type == 16 || type == 62 || type == 63 || type == 23 || type == 18 || type == 51 || type == 28 || type == 48 || type == 65 || type == 27;
    }

    public final boolean hasSportKmFromCategoryId(int categoryId) {
        return categoryId == 1001 || categoryId == 1002 || categoryId == 1003 || categoryId == 1005 || categoryId == 0;
    }

    public final boolean isSportSwim(int type) {
        return type == 65 || type == 27;
    }

    public final boolean isSportSwimFromCategoryId(int categoryId) {
        return categoryId == 1004;
    }

    private SportTypeHelp() {
    }

    public final List<Integer> getSportIdFromCategoryID(int categoryId) {
        if (categoryId == 0) {
            return new ArrayList();
        }
        switch (categoryId) {
            case 1001:
                return CollectionsKt.arrayListOf(256, 257, 17, 16, 59, 61, 62, 63);
            case 1002:
                return CollectionsKt.arrayListOf(259);
            case 1003:
                return CollectionsKt.arrayListOf(46, 47, 258);
            case 1004:
                return CollectionsKt.arrayListOf(27, 65);
            case 1005:
                return CollectionsKt.arrayListOf(23, 260);
            case 1006:
                ArrayList arrayListOf = CollectionsKt.arrayListOf(261, 262, Integer.valueOf(SportTypeConstant.Course_chest_primary), Integer.valueOf(SportTypeConstant.Course_chest_intermediate), 265, 266, 267, 268, 269, 270, Integer.valueOf(SportTypeConstant.Course_leg_advanced), 272);
                for (int i = 274; i < 303; i++) {
                    arrayListOf.add(Integer.valueOf(i));
                }
                return arrayListOf;
            default:
                return CollectionsKt.arrayListOf(Integer.valueOf(categoryId));
        }
    }

    public final int getCategoryIDName(int categoryId) {
        switch (categoryId) {
            case 1001:
                return R.string.sport_paobu;
            case 1002:
                return R.string.sport_buxing;
            case 1003:
                return R.string.sport_qixing;
            case 1004:
                return R.string.swim;
            case 1005:
                return R.string.sport_pashan;
            case 1006:
                return R.string.course_tip_100;
            default:
                return getSportIdName(categoryId);
        }
    }

    public final int getSportIdName(int type) {
        if (type == 0) {
            return R.string.string_all_sport;
        }
        switch (type) {
            case 16:
                return R.string.outdoor_run;
            case 17:
                return R.string.indoor_run;
            case 18:
                return R.string.walking;
            case 19:
                return R.string.football;
            case 20:
                return R.string.badminton;
            case 21:
                return R.string.tennis;
            case 22:
                return R.string.cycling;
            case 23:
                return R.string.climb;
            case 24:
                return R.string.basketball;
            case 25:
                return R.string.elliptical_machine;
            case 26:
                return R.string.yoga;
            case 27:
                return R.string.swim;
            case 28:
                return R.string.foot;
            case 29:
                return R.string.sit_ups;
            case 30:
                return R.string.other_sport;
            case 31:
                return R.string.push_ups;
            case 32:
                return R.string.triathlon;
            case 33:
                return R.string.free_training;
            case 34:
                return R.string.walk_machine;
            case 35:
                return R.string.rotation;
            case 36:
                return R.string.jump_rope;
            case 37:
                return R.string.other_sport;
            case 38:
                return R.string.treadmills;
            case 39:
                return R.string.aerobics;
            case 40:
                return R.string.shuttlecock_kicking;
            case 41:
                return R.string.dumbbell;
            case 42:
                return R.string.dancing;
            case 43:
                return R.string.pilates;
            case 44:
                return R.string.the_hoop;
            case 45:
                return R.string.table_tennis;
            case 46:
                return R.string.indoor_cycling;
            case 47:
                return R.string.outdoor_cycling;
            case 48:
                return R.string.foot;
            case 49:
                return R.string.strength_training;
            case 50:
                return R.string.trail_running;
            case 51:
                return R.string.race_walking;
            case 52:
                return R.string.roller_skating;
            case 53:
                return R.string.rock_climbing;
            case 54:
                return R.string.skateboard;
            case 55:
                return R.string.parkour;
            case 56:
                return R.string.terrain_vehicle;
            case 57:
                return R.string.paraglider;
            case 58:
                return R.string.rugby;
            case 59:
                return R.string.jogging;
            case 60:
                return R.string.baseball;
            case 61:
                return R.string.tantivy;
            case 62:
                return R.string.half_marathon;
            case 63:
                return R.string.half_marathon;
            case 64:
                return R.string.walk;
            case 65:
                return R.string.open_sea;
            case 66:
                return R.string.golf;
            case 67:
                return R.string.billiards;
            case 68:
                return R.string.bowling;
            case 69:
                return R.string.volleyball;
            case 70:
                return R.string.horse_riding;
            case 71:
                return R.string.glider;
            case 72:
                return R.string.row;
            case 73:
                return R.string.skating;
            case 74:
                return R.string.squash;
            case 75:
                return R.string.tai_chi;
            case 76:
                return R.string.trampoline;
            case 77:
                return R.string.jumping_jack;
            case 78:
                return R.string.thai_boxing;
            case 79:
                return R.string.martial_arts;
            case 80:
                return R.string.mountain_bike;
            case 81:
                return R.string.suburban_skiing;
            case 82:
                return R.string.physical_training;
            case 83:
                return R.string.weightlifting;
            case 84:
                return R.string.unicycle;
            case 85:
                return R.string.extend;
            case 86:
                return R.string.disco;
            case 87:
                return R.string.square_step_dance;
            case 88:
                return R.string.waltz;
            case 89:
                return R.string.bow_and_arrow;
            case 90:
                return R.string.aqu_aerobics;
            case 91:
                return R.string.ballet;
            case 92:
                return R.string.boxing;
            case 93:
                return R.string.swordsmanship;
            case 94:
                return R.string.darts;
            case 95:
                return R.string.Frisbee;
            case 96:
                return R.string.battle_rope;
            case 97:
                return R.string.ice_hockey;
            case 98:
                return R.string.jai_alai;
            case 99:
                return R.string.Motorcycle_off_road;
            case 100:
                return R.string.Directional_off_road;
            case 101:
                return R.string.polo;
            case 102:
                return R.string.jump;
            case 103:
                return R.string.softball;
            case 104:
                return R.string.wrestling;
            case 105:
                return R.string.dive;
            case 106:
                return R.string.surf;
            case 107:
                return R.string.water_volleyball;
            case 108:
                return R.string.speed_skating;
            case 109:
                return R.string.figure_skating;
            case 110:
                return R.string.sled;
            case 111:
                return R.string.judo;
            case 112:
                return R.string.karate;
            case 113:
                return R.string.taekwondo;
            case 114:
                return R.string.juggling;
            case 115:
                return R.string.gymnastics;
            case 116:
                return R.string.dodge_ball;
            case 117:
                return R.string.Zumba;
            case 118:
                return R.string.group_callisthenics;
            case 119:
                return R.string.kickboxing;
            case 120:
                return R.string.square_dancing;
            case 121:
                return R.string.Other_dances;
            case 122:
                return R.string.fly_a_kite;
            case 123:
                return R.string.handball;
            case 124:
                return R.string.cricket;
            case 125:
                return R.string.beach_soccer;
            case 126:
                return R.string.beach_volleyball;
            case 127:
                return R.string.Goalball;
            case 128:
                return R.string.hockey;
            case 129:
                return R.string.water_polo;
            case 130:
                return R.string.sepaktakraw;
            case 131:
                return R.string.street_dance;
            case 132:
                return R.string.belly_dance;
            case 133:
                return R.string.jazz;
            case 134:
                return R.string.latin_dance;
            case 135:
                return R.string.free_sparring;
            case 136:
                return R.string.fencing;
            case 137:
                return R.string.kendo;
            case 138:
                return R.string.sailboat;
            case 139:
                return R.string.dragon_boat;
            case 140:
                return R.string.kayak;
            case 141:
                return R.string.rowing;
            case 142:
                return R.string.motorboat;
            case 143:
                return R.string.strolling_machine;
            default:
                switch (type) {
                    case 256:
                        return R.string.outdoor_run;
                    case 257:
                        return R.string.indoor_run;
                    case 258:
                        return R.string.outdoor_cycling;
                    case 259:
                        return R.string.outdoor_walk;
                    case 260:
                        return R.string.climb;
                    case 261:
                        return R.string.course_back_primary;
                    case 262:
                        return R.string.course_back_intermediate;
                    case SportTypeConstant.Course_chest_primary /* 263 */:
                        return R.string.course_chest_primary;
                    case SportTypeConstant.Course_chest_intermediate /* 264 */:
                        return R.string.course_chest_intermediate;
                    case 265:
                        return R.string.Course_chest_advanced;
                    case 266:
                        return R.string.Course_abdominal_primary;
                    case 267:
                        return R.string.Course_abdominal_intermediate;
                    case 268:
                        return R.string.Course_abdominal_advanced;
                    case 269:
                        return R.string.Course_leg_primary;
                    case 270:
                        return R.string.Course_leg_intermediate;
                    case SportTypeConstant.Course_leg_advanced /* 271 */:
                        return R.string.Course_leg_advanced;
                    case 272:
                        return R.string.Course_hip_plasticity;
                    default:
                        switch (type) {
                            case 274:
                                return R.string.course_desc_41;
                            case 275:
                                return R.string.course_desc_42;
                            case 276:
                                return R.string.course_desc_43;
                            case 277:
                                return R.string.course_desc_44;
                            case 278:
                                return R.string.course_desc_45;
                            case 279:
                                return R.string.course_desc_46;
                            case 280:
                                return R.string.course_desc_47;
                            case 281:
                                return R.string.course_desc_48;
                            case SportTypeConstant.Course_21 /* 282 */:
                                return R.string.course_desc_49;
                            case 283:
                                return R.string.course_desc_50;
                            case SportTypeConstant.Course_23 /* 284 */:
                                return R.string.course_desc_51;
                            case SportTypeConstant.Course_24 /* 285 */:
                                return R.string.course_desc_52;
                            case 286:
                                return R.string.course_desc_53;
                            case 287:
                                return R.string.course_desc_54;
                            case 288:
                                return R.string.course_desc_55;
                            case SportTypeConstant.Course_28 /* 289 */:
                                return R.string.course_desc_56;
                            case 290:
                                return R.string.course_desc_57;
                            case 291:
                                return R.string.course_desc_58;
                            case 292:
                                return R.string.course_desc_59;
                            case SportTypeConstant.Course_32 /* 293 */:
                                return R.string.course_desc_60;
                            case SportTypeConstant.Course_33 /* 294 */:
                                return R.string.course_desc_61;
                            case SportTypeConstant.Course_34 /* 295 */:
                                return R.string.course_desc_62;
                            case 296:
                                return R.string.course_desc_63;
                            case 297:
                                return R.string.course_desc_64;
                            case 298:
                                return R.string.course_desc_40;
                            case SportTypeConstant.Course_38 /* 299 */:
                                return R.string.course_desc_65;
                            case 300:
                                return R.string.course_desc_66;
                            case 301:
                                return R.string.course_desc_67;
                            case 302:
                                return R.string.course_desc_68;
                            default:
                                return R.string.device_other_title;
                        }
                }
        }
    }

    public final boolean isCourse(SportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        return !TextUtils.isEmpty(sportData.getCourseRecord().getName());
    }

    public final boolean isOtherCourse(SportData sportData) {
        Intrinsics.checkNotNullParameter(sportData, "sportData");
        return sportData.getType() >= 1262 || sportData.getCourseRecord().sourceType == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSportTypeToBgIcon(int r2) {
        /*
            r1 = this;
            r0 = 17
            if (r2 == r0) goto L56
            r0 = 23
            if (r2 == r0) goto L53
            r0 = 29
            if (r2 == r0) goto L50
            r0 = 31
            if (r2 == r0) goto L50
            r0 = 49
            if (r2 == r0) goto L50
            r0 = 52
            if (r2 == r0) goto L50
            r0 = 56
            if (r2 == r0) goto L50
            r0 = 65
            if (r2 == r0) goto L4d
            r0 = 76
            if (r2 == r0) goto L50
            r0 = 257(0x101, float:3.6E-43)
            if (r2 == r0) goto L56
            r0 = 33
            if (r2 == r0) goto L50
            r0 = 34
            if (r2 == r0) goto L50
            r0 = 67
            if (r2 == r0) goto L50
            r0 = 68
            if (r2 == r0) goto L50
            switch(r2) {
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L4d;
                default: goto L3b;
            }
        L3b:
            switch(r2) {
                case 36: goto L50;
                case 37: goto L50;
                case 38: goto L50;
                case 39: goto L50;
                default: goto L3e;
            }
        L3e:
            switch(r2) {
                case 41: goto L50;
                case 42: goto L50;
                case 43: goto L50;
                case 44: goto L50;
                case 45: goto L4a;
                case 46: goto L50;
                default: goto L41;
            }
        L41:
            switch(r2) {
                case 72: goto L50;
                case 73: goto L50;
                case 74: goto L50;
                default: goto L44;
            }
        L44:
            switch(r2) {
                case 260: goto L53;
                case 261: goto L50;
                case 262: goto L50;
                case 263: goto L50;
                case 264: goto L50;
                case 265: goto L50;
                case 266: goto L50;
                case 267: goto L50;
                case 268: goto L50;
                case 269: goto L50;
                case 270: goto L50;
                case 271: goto L50;
                case 272: goto L50;
                default: goto L47;
            }
        L47:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_outdoor_bg
            return r2
        L4a:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_pingpong_bg
            return r2
        L4d:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_swimming_bg
            return r2
        L50:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_indoor_bg
            return r2
        L53:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_mountain_bg
            return r2
        L56:
            int r2 = com.wakeup.commonui.R.drawable.ic_home_treadmill_bg
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.sport.SportTypeHelp.getSportTypeToBgIcon(int):int");
    }

    public final int getSportTypeIcon(int type) {
        if (type >= 1262) {
            return R.drawable.ic_sport_course;
        }
        if (type == 0) {
            return R.drawable.ic_sport_all;
        }
        if (type == 68) {
            return R.drawable.ic_sport_bowling;
        }
        if (type == 74) {
            return R.drawable.ic_sport_squash;
        }
        if (type == 76) {
            return R.drawable.ic_sport_trampoline;
        }
        if (type == 259) {
            return R.drawable.ic_sport_walk;
        }
        if (type == 31) {
            return R.drawable.ic_sport_push_ups;
        }
        if (type == 58) {
            return R.drawable.ic_sport_rugby;
        }
        if (type == 66) {
            return R.drawable.ic_sport_golf;
        }
        if (type == 54) {
            return R.drawable.ic_sport_skateboard;
        }
        if (type == 71) {
            return R.drawable.ic_sport_glider;
        }
        if (type == 57) {
            return R.drawable.ic_sport_paraglider;
        }
        if (type == 72) {
            return R.drawable.ic_sport_row;
        }
        if (type == 39) {
            return R.drawable.ic_sport_aerobics;
        }
        if (type == 77) {
            return R.drawable.ic_sport_jumping_jack;
        }
        if (type == 24) {
            return R.drawable.ic_sport_basketball;
        }
        if (type == 49) {
            return R.drawable.ic_sport_strength_training;
        }
        if (type == 73) {
            return R.drawable.ic_sport_skating;
        }
        if (type == 52) {
            return R.drawable.ic_sport_roller_skating;
        }
        if (type == 23 || type == 260) {
            return R.drawable.ic_sport_climb;
        }
        if (type == 69) {
            return R.drawable.ic_sport_volleyball;
        }
        if (type == 53) {
            return R.drawable.ic_sport_rock_climb;
        }
        if (type == 17 || type == 257) {
            return R.drawable.ic_sport_indoor_run;
        }
        if (type == 16 || type == 256) {
            return R.drawable.ic_sport_run;
        }
        if (type == 55) {
            return R.drawable.ic_sport_parkour;
        }
        if (type == 45) {
            return R.drawable.ic_sport_table_tennis;
        }
        if (type == 43) {
            return R.drawable.ic_sport_pilates;
        }
        if (type == 70) {
            return R.drawable.ic_sport_horse_riding;
        }
        if (type == 46 || type == 47 || type == 258 || type == 22) {
            return R.drawable.ic_sport_riding;
        }
        if (type == 64) {
            return R.drawable.ic_sport_walking;
        }
        if (type == 56) {
            return R.drawable.ic_sport_terrain_vehicle;
        }
        if (type == 38) {
            return R.drawable.ic_sport_stepper;
        }
        if (type == 75) {
            return R.drawable.ic_sport_tai_chi;
        }
        if (type == 40) {
            return R.drawable.ic_sport_shuttlecock_kicking;
        }
        if (type == 36) {
            return R.drawable.ic_sport_skip;
        }
        if (type == 42) {
            return R.drawable.ic_sport_dancing;
        }
        if (type == 32) {
            return R.drawable.ic_sport_triathlon;
        }
        if (type == 25) {
            return R.drawable.ic_sport_elliptical_machine;
        }
        if (type == 21) {
            return R.drawable.ic_sport_tennis;
        }
        if (type == 41) {
            return R.drawable.ic_sport_dumbbell;
        }
        if (type == 29) {
            return R.drawable.ic_sport_sit_ups;
        }
        if (type == 27 || type == 65) {
            return R.drawable.ic_sport_swim;
        }
        if (type == 26) {
            return R.drawable.ic_sport_yoga;
        }
        if (type == 20) {
            return R.drawable.ic_sport_badminton;
        }
        if (type == 50) {
            return R.drawable.ic_sport_trail_running;
        }
        if (type == 67) {
            return R.drawable.ic_sport_billiards;
        }
        if (type == 33) {
            return R.drawable.ic_sport_free_mition;
        }
        if (type == 34) {
            return R.drawable.ic_sport_treadmills;
        }
        if (type == 19) {
            return R.drawable.ic_sport_football;
        }
        if (type == 51) {
            return R.drawable.ic_sport_race_walking;
        }
        if (type == 18) {
            return R.drawable.ic_sport_walk_briskly;
        }
        if (type == 28 || type == 48) {
            return R.drawable.ic_sport_on_fit;
        }
        if (type == 61) {
            return R.drawable.ic_sport_tantivy;
        }
        if (type == 59) {
            return R.drawable.ic_sport_jogging;
        }
        if (type == 62) {
            return R.drawable.ic_sport_half_marathon;
        }
        if (type == 63) {
            return R.drawable.ic_sport_all_marathon;
        }
        if (type == 35) {
            return R.drawable.ic_sport_whirling;
        }
        if (type == 44) {
            return R.drawable.ic_sport_hula_hoop;
        }
        if (type == 122) {
            return R.drawable.ic_sport_fly_kite;
        }
        if (type == 123) {
            return R.drawable.ic_sport_handball;
        }
        if (type == 124) {
            return R.drawable.ic_sport_cricket;
        }
        if (type == 125) {
            return R.drawable.ic_sport_beach_soccer;
        }
        if (type == 126) {
            return R.drawable.ic_sport_beach_vollryball;
        }
        if (type == 127) {
            return R.drawable.ic_sport_gallery;
        }
        if (type == 128) {
            return R.drawable.ic_sport_hockey;
        }
        if (type == 129) {
            return R.drawable.ic_sport_water_polo;
        }
        if (type == 130) {
            return R.drawable.ic_sport_sepaktakraw;
        }
        if (type == 131) {
            return R.drawable.ic_sport_street_dance;
        }
        if (type == 132) {
            return R.drawable.ic_sport_belly_dance;
        }
        if (type == 133) {
            return R.drawable.ic_sport_jazz;
        }
        if (type == 134) {
            return R.drawable.ic_sport_latin_dance;
        }
        if (type == 143) {
            return R.drawable.ic_sport_strolling_machine;
        }
        if (type == 261 || type == 262) {
            return R.drawable.ic_sport_course_back;
        }
        if (type == 263 || type == 264 || type == 265) {
            return R.drawable.ic_sport_course_chest;
        }
        if (type == 266 || type == 267 || type == 268) {
            return R.drawable.ic_sport_course_abdominal;
        }
        if (type == 269 || type == 270 || type == 271) {
            return R.drawable.ic_sport_course_leg;
        }
        if (type == 272) {
            return R.drawable.ic_sport_course_hip;
        }
        if (274 <= type && type < 303) {
            return R.drawable.ic_sport_course;
        }
        return R.drawable.ic_sport_other;
    }

    public final int getSportCategoryIdIcon(int categoryId) {
        if (categoryId == 0) {
            return R.drawable.ic_sport_all;
        }
        switch (categoryId) {
            case 1001:
                return R.drawable.ic_sport_run;
            case 1002:
                return R.drawable.ic_sport_walking;
            case 1003:
                return R.drawable.ic_sport_riding;
            case 1004:
                return R.drawable.ic_sport_swim;
            case 1005:
                return R.drawable.ic_sport_climb;
            case 1006:
                return R.drawable.ic_sport_course;
            default:
                return R.drawable.ic_sport_other;
        }
    }
}
