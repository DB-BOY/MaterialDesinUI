package db_boy.com.materialdesinui.immersion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import db_boy.com.materialdesinui.R;

/**
 * Created by db.boy on 2018/4/20.
 */

public class ImmersionActivity extends AppCompatActivity {
    public static Intent getInstance(Context context) {
        return new Intent(context, ImmersionActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置状态栏的透明属性
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)//全屏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_immersion);
        //5.0+可以直接用API来修改状态栏的颜色。
        //getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_grey_800));

        
        
        
        
        
        /*另一种方式*/
        //        setContentView(R.layout.activity_immersion);

    }
}


//
//
//    //设置状态栏的透明属性
//    //		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)//全屏
//    getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        setContentView(R.layout.activity_main);
//        //5.0+可以直接用API来修改状态栏的颜色。
//        //		getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_grey_800));
//        //1.先设置toolbar的高度
//        toolbar = (Toolbar)findViewById(R.id.toolbar);
//        //		LayoutParams params = toolbar.getLayoutParams();
//        //		int statusBarHeight = getStatusBarHeight(this);
//        //		params.height += statusBarHeight ;
//        //		toolbar.setLayoutParams(params );
//        //2.设置paddingTop，以达到状态栏不遮挡toolbar的内容。
//        toolbar.setPadding(
//        toolbar.getPaddingLeft(),
//        toolbar.getPaddingTop()+getStatusBarHeight(this),
//        toolbar.getPaddingRight(),
//        toolbar.getPaddingBottom());
//
//
//        }
//
///**
// * 获取状态栏的高度
// * @param context
// * @return
// */
//private int getStatusBarHeight(Context context) {
//        // 反射手机运行的类：android.R.dimen.status_bar_height.
//        int statusHeight = -1;
//        try {
//        Class<?> clazz = Class.forName("com.android.internal.R$dimen");
//        Object object = clazz.newInstance();
//        String heightStr = clazz.getField("status_bar_height").get(object).toString();
//        int height = Integer.parseInt(heightStr);
//        //dp--->px
//        statusHeight = context.getResources().getDimensionPixelSize(height);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//        return statusHeight;
//        }

