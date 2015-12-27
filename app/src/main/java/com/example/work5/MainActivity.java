package com.example.work5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
private Intent intent;
    private Uri uri;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         intent =new Intent();
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add(0,1,1," 打开游览器");
        menu.add(0,2,2,"显示地图");
        menu.add(0,3,3,"打电话");
        menu.add(0,4,4,"发短信");
        menu.add(0,5,5,"自己定义的intent filter");
        menu.add(0,6,6,"分享到微信");
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case 1:
                uri=Uri.parse("http://www.gdmec.cn");
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(uri);
                break;
            case 2:
                uri=Uri.parse("geo:23.383,113,440,机电学院的北校区");
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(uri);
                break;
            case 3:
                uri = Uri.parse("tel:110");
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(uri);
                break;
            case 4:
                uri= Uri.parse("smste:120");
                intent.setAction(intent.ACTION_VIEW)
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
