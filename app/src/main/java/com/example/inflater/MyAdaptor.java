package com.example.inflater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MyAdaptor extends ArrayAdapter<students> {
    private static final int resource = 0;

    public MyAdaptor(@NonNull Context context, ArrayList<students> st) {
        super(context, resource , st);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        students stu = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_students,parent);

        TextView name = convertView.findViewById(R.id.name);
        TextView rollno = convertView.findViewById(R.id.Rollno);
        TextView section = convertView.findViewById(R.id.Section);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        return convertView;
    }
}
