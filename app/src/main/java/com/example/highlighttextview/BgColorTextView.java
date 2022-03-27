package com.example.highlighttextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class BgColorTextView extends AppCompatTextView {
    private final static int COLOR_HIGHLIGHT = Color.YELLOW;

    public BgColorTextView(Context context) {
        super(context);
    }

    public BgColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BgColorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw(Canvas canvas) {
        int lineCount = getLayout().getLineCount();
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setColor(COLOR_HIGHLIGHT);
        for (int i = 0; i < lineCount; i++) {
            rect.top = (getLayout().getLineTop(i));
            rect.left = (int) getLayout().getLineLeft(i);
            rect.right = (int) getLayout().getLineRight(i);
            rect.bottom = (int) (getLayout().getLineBottom(i) - ((i + 1 == lineCount) ? 0 : getLayout().getSpacingAdd()));

            canvas.drawRect(rect, paint);
        }
        super.draw(canvas);
    }
}