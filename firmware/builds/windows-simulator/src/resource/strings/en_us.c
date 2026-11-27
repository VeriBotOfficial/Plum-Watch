
#include "lv_ext_resource_manager.h"

const lang_translation_t en_us_lang_translation = 
{
    .MainMenuString = {"MainMenuString", "Main Menu", {0}},
    .WatchfaceString = {"WatchfaceString", "Watchface", {0}},
    .Stopwatch = {"Stopwatch", "Stopwatch", {0}},
    .Calculator = {"Calculator", "Calculator", {0}},
    .HeartRate = {"HeartRate", "Heart Rate", {0}},
    .HeartRateString = {"HeartRateString", "Heart Rate", {0}},
    .Settings = {"Settings", "Settings", {0}},

};

const lv_i18n_lang_t en_us_lang = 
{
    .locale = "en_us",
    .translation = &en_us_lang_translation,
};
