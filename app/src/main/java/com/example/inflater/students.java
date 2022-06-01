package com.example.inflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class students extends AppCompatActivity {

    ImageView imageView;
    TextView name;
    TextView rollno;
    TextView section;

    public students(String name, String rollno, String section, int image) {
    }

    public TextView getName() {
        return name;
    }

    public TextView getRollno() {
        return rollno;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getSection() {
        return section;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        imageView = findViewById(R.id.imageView);
        name = findViewById(R.id.name);
        rollno = findViewById(R.id.Rollno);
        section = findViewById(R.id.Section);


    }
}
