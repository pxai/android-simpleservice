package info.pello.android.service.password;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by PELLO_ALTADILL on 20/12/2016.
 */
public class WakeUpBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, PasswordService.class);
        context.startService(startServiceIntent);
    }
}