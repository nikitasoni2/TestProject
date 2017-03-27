package rbsl.lunchmode;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class C extends AppCompatActivity {
Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        btnNext= (Button)findViewById(R.id.button);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(appInstalledOrNot("com.flipkart.android"))
                {
                    Intent LaunchIntent = getBaseContext().getPackageManager().getLaunchIntentForPackage("com.flipkart.android");
                    try {
                        // LaunchIntent.parseUri(UrL,Intent.FLAG_ACTIVITY_NEW_TASK);
                        LaunchIntent.setData(Uri.parse("http://www.amazon.in/Apple-iPhone-6-Silver-64GB/dp/B00O4WTRYA?tag=readyviews-21"));
                        LaunchIntent.setAction(Intent.ACTION_VIEW);
                        startActivity(LaunchIntent);


                    } catch (Exception e) {
                        Toast.makeText(C.this,"Process try failed",Toast.LENGTH_LONG).show();
                    }
                }
                else{

                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("http://www.amazon.in/Apple-iPhone-6-Silver-64GB/dp/B00O4WTRYA?tag=readyviews-21"));
                    startActivity(i);

                }
            }
        });
    }

    private boolean appInstalledOrNot(String packagename)
    {
        PackageManager pm = getBaseContext().getPackageManager();
        try {
            pm.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }



}
