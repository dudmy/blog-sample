package net.dudmy.differencecharstring;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;

/**
 * Created by yujin on 2017. 9. 4..
 */

public class StringSpannableUtil implements SpannableUtil<String> {

    @Override
    public String getTextWithIcon(Context context, String text, @DrawableRes int resId) {

        int size = context.getResources().getDimensionPixelSize(R.dimen.icon_size);

        Drawable icon = ContextCompat.getDrawable(context, resId);
        icon.setBounds(0, 0, size, size);

        ImageSpan imageSpan = new ImageSpan(icon, ImageSpan.ALIGN_BASELINE);

        SpannableStringBuilder builder = new SpannableStringBuilder();

        builder.append("#")
                .append(text)
                .setSpan(imageSpan, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        return builder.toString();
    }
}
