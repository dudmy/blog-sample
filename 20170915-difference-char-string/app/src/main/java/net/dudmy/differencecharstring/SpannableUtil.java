package net.dudmy.differencecharstring;

import android.content.Context;
import android.support.annotation.DrawableRes;

/**
 * Created by yujin on 2017. 9. 4..
 */

public interface SpannableUtil<T> {

    T getTextWithIcon(Context context, String text, @DrawableRes int resId);
}
