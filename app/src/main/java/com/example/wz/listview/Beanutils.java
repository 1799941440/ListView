package com.example.wz.listview;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by wz on 2018/4/13.
 */

public class Beanutils {
    public  static ArrayList<ListBean> getApps(Context context){
        ArrayList<ListBean> al = new ArrayList<ListBean>();
        ListBean lb_temp;
        lb_temp = new ListBean("QQ",context.getResources().getDrawable(R.drawable.qq));
        al.add(lb_temp);
        lb_temp = new ListBean("京东",context.getResources().getDrawable(R.drawable.jd));
        al.add(lb_temp);
        lb_temp = new ListBean("欢乐斗地主",context.getResources().getDrawable(R.drawable.dz));
        al.add(lb_temp);
        lb_temp = new ListBean("天猫",context.getResources().getDrawable(R.drawable.tm));
        al.add(lb_temp);
        lb_temp = new ListBean("UC浏览器",context.getResources().getDrawable(R.drawable.uc));
        al.add(lb_temp);
        lb_temp = new ListBean("微信",context.getResources().getDrawable(R.drawable.wx));
        al.add(lb_temp);
        lb_temp = new ListBean("新浪微博",context.getResources().getDrawable(R.drawable.xl));
        al.add(lb_temp);
        return al;
    }
}
