package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Chatroom extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        TextView tv_content_info = findViewById(R.id.tv_content_info);
        TEXT_KEY application = (TEXT_KEY)this.getApplication();
        tv_content_info.setText("这是第" + application.getN() + "个item");
    }

}
