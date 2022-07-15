package com.example.tothepointnews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {
    String title,desc,content,imageURL,url;
    private TextView newsTitle, newsDesc, newsContent;
    private ImageView newsDetImg;
    private AppCompatButton newsDetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        title = getIntent().getStringExtra("title");
        content = getIntent().getStringExtra("content");
        desc= getIntent().getStringExtra("desc");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");
        newsTitle = findViewById(R.id.NewsDetailTxt);
        newsDesc = findViewById(R.id.NewsDetailDesc);
        newsContent = findViewById(R.id.NewsDetailContent);
        newsDetImg = findViewById(R.id.NewsDetailImg);
        newsDetBtn = findViewById(R.id.NewsDetailReadNewsBtn);
        newsTitle.setText(title);
        newsDesc.setText(desc);
        newsContent.setText(content);
        Picasso.get().load(imageURL).into(newsDetImg);
        newsDetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });



    }
}