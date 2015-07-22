package com.cpmx6.devf.cpmx6.nav;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by hugo on 7/19/15.
 */
public class NavigationHelper {

    public static final String BUNDLE_EXTRAS = "extras";

    public static void startActivity(Context context, Bundle bundle, Class<?> mClass){
        Intent intent = new Intent(context, mClass);
        intent.putExtra(BUNDLE_EXTRAS, bundle);
        context.startActivity(intent);
    }
}
