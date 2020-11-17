package com.example.labb3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class ListPopUpWindow extends View {

    private int textColor = Color.BLACK;
    private int backgroundColor = Color.WHITE;
    private int textSize = 100;
    private int nameCount = 10;
    private String[] names = new String[nameCount];

    private EditText inputField;

    public ListPopUpWindow(Context context) {
        super(context);
    }

    public ListPopUpWindow(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint();
        canvas.drawColor(backgroundColor);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        paint.setAntiAlias(true);

        for(int i = 0; i < nameCount; i++){
            canvas.drawText("Test " + i, 100, 100*i, paint);
        }
    }

    public void drawNames(Canvas canvas){
        Paint paint = new Paint();
        canvas.drawColor(backgroundColor);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        paint.setAntiAlias(true);

        for(int i = 0; i < nameCount; i++){
            canvas.drawText("Test " + i, 100, 100*i, paint);
        }
    }

}
