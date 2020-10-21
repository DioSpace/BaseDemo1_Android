package com.my.basedemo1;

import android.app.Activity;
import android.widget.Toast;

public class Handle {

    public String func_1(Activity activity) {
        Toast.makeText(activity, "Show Tip", Toast.LENGTH_SHORT).show();
        return "==== func1 ====";
    }

    public String func_2(Activity activity) {
        return "==== func2 ====";
    }

    public String func_3(Activity activity) {
        return "==== func3 ====";
    }

    public String func_4(Activity activity) {
        return "==== func4 ====";
    }

    public String add(Activity activity) {
        return "==== add ====";
    }

}
