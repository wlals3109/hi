package com.example.list2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MajorAdapter extends BaseAdapter {
    private ArrayList<Data> userlist;
    private Context context;

    public MajorAdapter(ArrayList<Data> userlist, Context context) {
        this.userlist = userlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return userlist.size();
    }

    @Override
    public Object getItem(int i) {
        return userlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return userlist.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflate.inflate(R.layout.major_view, parent,false);
        TextView MajorView = view.findViewById(R.id.MajorName);
        TextView ProfView = view.findViewById(R.id.ProfName);
        MajorView.setText(userlist.get(i).getMajor());
        ProfView.setText(userlist.get(i).getProf());

        return  view;
    }
}
