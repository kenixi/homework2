package chapter.android.aweme.ss.com.homework;

import android.app.Application;
//注意修改AndroidManifest.xml中application的android:name
public class TEXT_KEY extends Application {

    private String TEXT_KEY;
    private int N;

    public String getTEXT_KEY(){
        return TEXT_KEY;
    }
    public void setTEXT_KEY(String s){
        this.TEXT_KEY = s;
    }
    public int getN(){return N; }
    public void setN(int n){this.N = n; }

    public void onCreate() {
        super.onCreate();
        setTEXT_KEY("");
        setN(0);
    }

}
