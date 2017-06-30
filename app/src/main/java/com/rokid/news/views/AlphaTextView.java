package com.rokid.news.views;


import android.content.Context;
import android.util.AttributeSet;

import com.rokid.news.base.HTextView;

/**
 * Created by fanfeng on 2017/6/6.
 */

public class AlphaTextView extends HTextView {

    public AlphaTextView(Context context) {
        super(context);
    }

    public AlphaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AlphaTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void animateText(CharSequence text) {

    }
}
