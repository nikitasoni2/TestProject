package rbsl.lunchmode;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jaredrummler.android.device.DeviceName;

public class A extends AppCompatActivity {
Button btnNext;
  //String DeviceName= "SM-G550FY";
    public static final String TEG = "CHECKDATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        DeviceName.DeviceInfo deviceName = DeviceName.getDeviceInfo(this);
        String market_name = deviceName.marketName;
        Log.d(TEG,"market-name"+market_name);
        btnNext= (Button)findViewById(R.id.button);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  DeviceName.with(context).request(new DeviceName.Callback() {

                    @Override public void onFinished(DeviceName.DeviceInfo info, Exception error) {
                        String manufacturer = info.manufacturer;  // "Samsung"
                        String name = info.marketName;            // "Galaxy S7 Edge"
                        String model = info.model;                // "SAMSUNG-SM-G935A"
                        String codename = info.codename;          // "hero2lte"
                        String deviceName = info.getName();       // "Galaxy S7 Edge"
                        // FYI: We are on the UI thread.
                    }
                });*/
               /* String deviceName = android.os.Build.MODEL;
                String deviceMan = android.os.Build.MANUFACTURER;
                getDeviceName(deviceMan,deviceName);
                Log.d(TEG,getDeviceName(deviceMan,deviceName));
                System.out.println(getDeviceName(deviceMan, deviceName));*/
// Using https://github.com/jaredrummler/AndroidDeviceNames
               /* System.out.println(DeviceName.getDeviceName());*/
            }
        });

    }

    /*public getDeviceName() {
        DeviceName.with(context).request(new DeviceName.Callback() {

            @Override
            public void onFinished(DeviceName.DeviceInfo info, Exception error) {
                String manufacturer = info.manufacturer;  // "Samsung"
                String name = info.marketName;            // "Galaxy S7 Edge"
                String model = info.model;                // "SAMSUNG-SM-G935A"
                String codename = info.codename;          // "hero2lte"
                String deviceName = info.getName();       // "Galaxy S7 Edge"
                // FYI: We are on the UI thread.
            }
        });
    }*/


}
