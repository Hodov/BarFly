package barguests.ru.barguests;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;

import java.util.List;

/**
 * Created by skorokhodov_a on 25.02.2016.
 */
public class GeofenceTransitionsIntentService extends IntentService {


    // Must create a default constructor
    public GeofenceTransitionsIntentService() {
        // Used to name the worker thread, important only for debugging.
        super(GeofenceTransitionsIntentService.class.getSimpleName());
    }

    @Override
    public void onCreate() {
        super.onCreate(); // if you override onCreate(), make sure to call super().
        // If a Context object is needed, call getApplicationContext() here.
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()) {
            System.out.println("Ошибка");
            return;
        }


    }
}
