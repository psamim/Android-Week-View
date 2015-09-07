package com.alamkanak.weekview;

import android.graphics.Canvas;
import android.graphics.RectF;

public interface EventRenderer {
    void renderEvent(WeekViewEvent event, Canvas canvas, RectF rect, RectF visibleRect);
}
