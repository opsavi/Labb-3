package com.example.labb3;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class InteractiveSearcher extends View {

    private ListPopUpWindow listPopUpWindow;
    private EditText editText;

    public InteractiveSearcher(Context context) {
        super(context);
    }

    public InteractiveSearcher(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View myView(){
        View v;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.interactive_searcher, null);
        editText = findViewById(R.id.input_field);
        listPopUpWindow = findViewById(R.id.pop_up_window);
        return v;
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
