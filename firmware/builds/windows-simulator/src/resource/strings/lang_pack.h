#ifndef __lang_pack__
#define __lang_pack__


typedef struct
{
    lv_i18n_phrase_t Stopwatch;
    lv_i18n_phrase_t Calculator;
    lv_i18n_phrase_t HeartRateString;
    lv_i18n_phrase_t HeartRate;
    lv_i18n_phrase_t Settings;
    lv_i18n_phrase_t WatchfaceString;
    lv_i18n_phrase_t MainMenuString;
} lang_translation_t;

extern const lv_i18n_lang_t * const lv_i18n_lang_pack[];

#endif /* __lang_pack__ */
