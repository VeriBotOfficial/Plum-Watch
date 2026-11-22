package com.necer.entity;

import java.io.Serializable;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public class CalendarDate implements Serializable {
    public LocalDate localDate;
    public Lunar lunar;
    public String lunarHoliday;
    public String solarHoliday;
    public String solarTerm;
}
