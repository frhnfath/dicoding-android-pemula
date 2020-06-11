package com.dicoding.submission1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DescActivity extends AppCompatActivity {

    TextView name, description;
    String n_name, n_description;
    int n_picture;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        Bundle bundle = getIntent().getExtras();
        n_name = bundle.getString("Name");
        n_description = bundle.getString("Description");
        n_picture = bundle.getInt("Image");

        name = (TextView) findViewById(R.id.name);
        description = (TextView) findViewById(R.id.description);
        img = (ImageView) findViewById(R.id.picture);

        name.setText(""+n_name);
        description.setText(""+n_description);

        Glide.with(DescActivity.this)
                .load(n_picture)
                .apply(new RequestOptions().override(370,370))
                .into(img);
    }
}
