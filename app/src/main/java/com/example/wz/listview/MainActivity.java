package com.example.wz.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.lv_main);
        ArrayList<ListBean> al = Beanutils.getApps(context);
        MyAdapter ma = new MyAdapter(context,al);
        lv.setAdapter(ma);
    }

    /**
     * 自定义Adapter继承于最常使用的BaseAdapter，并重写其中4个抽象方法
     */
    class MyAdapter extends BaseAdapter{
        private Context context;
        private ArrayList<ListBean> al;
        public MyAdapter(Context mcontext, ArrayList<ListBean> al){
            this.context = mcontext;
            this.al = al;
        }
        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int position) {
            return al.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = null;
            if(convertView!=null){
                view =  convertView;
            }else{
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = layoutInflater.inflate(R.layout.list, null);
            }
            ImageView pic = (ImageView) view.findViewById(R.id.iv_pic);
            TextView name = (TextView) view.findViewById(R.id.tv_name);
            //3.获取postion位置条目对应的list集合中的新闻数据，Bean对象
            ListBean listBean = al.get(position);
            //4.将数据设置给这些子控件做显示
            pic.setImageDrawable(listBean.pic);//设置imageView的图片
            name.setText(listBean.title);
            return view;
        }
    }
}
