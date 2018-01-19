package com.example.administrator.customseekbar;

import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;

import static com.example.administrator.customseekbar.Utils.dp2px;
import static com.example.administrator.customseekbar.Utils.sp2px;

/**
 * Created by Administrator on 2018/1/19.
 */

public class SeekBarConfigBuilder {

    float min;
    float max;
    float progress;
    boolean floatType;
    int trackSize;
    int secondTrackSize;
    int thumbRadius;
    int thumbRadiusOnDragging;
    int trackColor;
    int secondTrackColor;
    int thumbColor;
    int sectionCount;
    boolean showSectionMark;
    boolean autoAdjustSectionMark;
    boolean showSectionText;
    int sectionTextSize;
    int sectionTextColor;
    @CustomSeekBar.TextPosition
    int sectionTextPosition;
    int sectionTextInterval;
    boolean showThumbText;
    int thumbTextSize;
    int thumbTextColor;
    boolean showProgressInFloat;
    long animDuration;
    boolean touchToSeek;
    boolean seekStepSection;
    boolean seekBySection;
    int bubbleColor;
    int bubbleTextSize;
    int bubbleTextColor;
    boolean alwaysShowBubble;
    long alwaysShowBubbleDelay;
    boolean hideBubble;
    boolean rtl;

    private CustomSeekBar mcustomSeekBar;

    SeekBarConfigBuilder(CustomSeekBar customSeekBar) {
        mcustomSeekBar = customSeekBar;
    }

    public void build() {
        mcustomSeekBar.config(this);
    }

    public SeekBarConfigBuilder min(float min) {
        this.min = min;
        this.progress = min;
        return this;
    }

    public SeekBarConfigBuilder max(float max) {
        this.max = max;
        return this;
    }

    public SeekBarConfigBuilder progress(float progress) {
        this.progress = progress;
        return this;
    }

    public SeekBarConfigBuilder floatType() {
        this.floatType = true;
        return this;
    }

    public SeekBarConfigBuilder trackSize(int dp) {
        this.trackSize = dp2px(dp);
        return this;
    }

    public SeekBarConfigBuilder secondTrackSize(int dp) {
        this.secondTrackSize = dp2px(dp);
        return this;
    }

    public SeekBarConfigBuilder thumbRadius(int dp) {
        this.thumbRadius = dp2px(dp);
        return this;
    }

    public SeekBarConfigBuilder thumbRadiusOnDragging(int dp) {
        this.thumbRadiusOnDragging = dp2px(dp);
        return this;
    }

    public SeekBarConfigBuilder trackColor(@ColorInt int color) {
        this.trackColor = color;
        this.sectionTextColor = color;
        return this;
    }

    public SeekBarConfigBuilder secondTrackColor(@ColorInt int color) {
        this.secondTrackColor = color;
        this.thumbColor = color;
        this.thumbTextColor = color;
        this.bubbleColor = color;
        return this;
    }

    public SeekBarConfigBuilder thumbColor(@ColorInt int color) {
        this.thumbColor = color;
        return this;
    }

    public SeekBarConfigBuilder sectionCount(@IntRange(from = 1) int count) {
        this.sectionCount = count;
        return this;
    }

    public SeekBarConfigBuilder showSectionMark() {
        this.showSectionMark = true;
        return this;
    }

    public SeekBarConfigBuilder autoAdjustSectionMark() {
        this.autoAdjustSectionMark = true;
        return this;
    }

    public SeekBarConfigBuilder showSectionText() {
        this.showSectionText = true;
        return this;
    }

    public SeekBarConfigBuilder sectionTextSize(int sp) {
        this.sectionTextSize = sp2px(sp);
        return this;
    }

    public SeekBarConfigBuilder sectionTextColor(@ColorInt int color) {
        this.sectionTextColor = color;
        return this;
    }

    public SeekBarConfigBuilder sectionTextPosition(@CustomSeekBar.TextPosition int position) {
        this.sectionTextPosition = position;
        return this;
    }

    public SeekBarConfigBuilder sectionTextInterval(@IntRange(from = 1) int interval) {
        this.sectionTextInterval = interval;
        return this;
    }

    public SeekBarConfigBuilder showThumbText() {
        this.showThumbText = true;
        return this;
    }

    public SeekBarConfigBuilder thumbTextSize(int sp) {
        this.thumbTextSize = sp2px(sp);
        return this;
    }

    public SeekBarConfigBuilder thumbTextColor(@ColorInt int color) {
        thumbTextColor = color;
        return this;
    }

    public SeekBarConfigBuilder showProgressInFloat() {
        this.showProgressInFloat = true;
        return this;
    }

    public SeekBarConfigBuilder animDuration(long duration) {
        animDuration = duration;
        return this;
    }

    public SeekBarConfigBuilder touchToSeek() {
        this.touchToSeek = true;
        return this;
    }

    public SeekBarConfigBuilder seekStepSection() {
        this.seekStepSection = true;
        return this;
    }

    public SeekBarConfigBuilder seekBySection() {
        this.seekBySection = true;
        return this;
    }

    public SeekBarConfigBuilder bubbleColor(@ColorInt int color) {
        this.bubbleColor = color;
        return this;
    }

    public SeekBarConfigBuilder bubbleTextSize(int sp) {
        this.bubbleTextSize = sp2px(sp);
        return this;
    }

    public SeekBarConfigBuilder bubbleTextColor(@ColorInt int color) {
        this.bubbleTextColor = color;
        return this;
    }

    public SeekBarConfigBuilder alwaysShowBubble() {
        this.alwaysShowBubble = true;
        return this;
    }

    public SeekBarConfigBuilder alwaysShowBubbleDelay(long delay) {
        alwaysShowBubbleDelay = delay;
        return this;
    }

    public SeekBarConfigBuilder hideBubble() {
        this.hideBubble = true;
        return this;
    }

    public SeekBarConfigBuilder rtl() {
        this.rtl = true;
        return this;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public float getProgress() {
        return progress;
    }

    public boolean isFloatType() {
        return floatType;
    }

    public int getTrackSize() {
        return trackSize;
    }

    public int getSecondTrackSize() {
        return secondTrackSize;
    }

    public int getThumbRadius() {
        return thumbRadius;
    }

    public int getThumbRadiusOnDragging() {
        return thumbRadiusOnDragging;
    }

    public int getTrackColor() {
        return trackColor;
    }

    public int getSecondTrackColor() {
        return secondTrackColor;
    }

    public int getThumbColor() {
        return thumbColor;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public boolean isShowSectionMark() {
        return showSectionMark;
    }

    public boolean isAutoAdjustSectionMark() {
        return autoAdjustSectionMark;
    }

    public boolean isShowSectionText() {
        return showSectionText;
    }

    public int getSectionTextSize() {
        return sectionTextSize;
    }

    public int getSectionTextColor() {
        return sectionTextColor;
    }

    public int getSectionTextPosition() {
        return sectionTextPosition;
    }

    public int getSectionTextInterval() {
        return sectionTextInterval;
    }

    public boolean isShowThumbText() {
        return showThumbText;
    }

    public int getThumbTextSize() {
        return thumbTextSize;
    }

    public int getThumbTextColor() {
        return thumbTextColor;
    }

    public boolean isShowProgressInFloat() {
        return showProgressInFloat;
    }

    public long getAnimDuration() {
        return animDuration;
    }

    public boolean isTouchToSeek() {
        return touchToSeek;
    }

    public boolean isSeekStepSection() {
        return seekStepSection;
    }

    public boolean isSeekBySection() {
        return seekBySection;
    }

    public int getBubbleColor() {
        return bubbleColor;
    }

    public int getBubbleTextSize() {
        return bubbleTextSize;
    }

    public int getBubbleTextColor() {
        return bubbleTextColor;
    }

    public boolean isAlwaysShowBubble() {
        return alwaysShowBubble;
    }

    public long getAlwaysShowBubbleDelay() {
        return alwaysShowBubbleDelay;
    }

    public boolean isHideBubble() {
        return hideBubble;
    }

    public boolean isRtl() {
        return rtl;
    }
}
