package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises2);

        TextView count = findViewById(R.id.text1);
        View local = findViewById(R.id.localView);
        count.setText("当前页面View数(包括view group):" + getAllChildViewCount(local));
    }

    public int getAllChildViewCount(View view) {
        //todo 补全你的代码
        int count = 1;
        if (view == null) return 0;
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                count += getAllChildViewCount(((ViewGroup) view).getChildAt(i));
            }
            return count;
        } else {
            return 1;
        }
    }

}
