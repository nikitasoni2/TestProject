package rbsl.lunchmode;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.ParcelUuid;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by root on 27/3/17.
 */
public class CleanReceiver extends BroadcastReceiver {
    static  final String  TEG = "inreceiver" ;
    @Override
    public void onReceive(final Context context, Intent intent)
    {
    Toast.makeText(context, "Uninstalling Application",Toast.LENGTH_LONG).show();

        Log.d(TEG, "CleanReceiver Called");
      /*  AlertDialog alertDialog = new AlertDialog.Builder(
                context).create();

        // Setting Dialog Title
        alertDialog.setTitle("Alert Dialog");

        // Setting Dialog Message
        alertDialog.setMessage("Welcome to AndroidHive.info");

        // Setting Icon to Dialog


        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
                Toast.makeText(context, "You clicked on OK", Toast.LENGTH_SHORT).show();
            }
        });
*/
        // Showing Alert Message

    }
}
