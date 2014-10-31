package fr.edps.systemvolume;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;

public class SystemVolume extends CordovaPlugin {
	public SystemVolume(){

	}

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("setSystemVolume")) {
			this.setSystemVolume(args.getDouble(0));
		} else {
			if(action.equals("getSystemVolum")) {
				
			} else {
				return false;
			}
		}
		callbackContext.success();
		return true;
	}

	public void setSystemVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
		int Level = (am.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * volume)

        	am.setStreamVolume(AudioManager.STREAM_MUSIC, Level, 0);
		/*am.setStreamVolume(
			AudioManager.STREAM_SYSTEM,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM) * volume),
			0);
			*/
	}
	
	public int getSystemVolume(int percent) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
		try {
	        	int Level;
        		int max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
    			int current =am.getStreamVolume(AudioManager.STREAM_MUSIC);
			Level = Math.round(current / maxVolume);
			return Level;
		}catch (Exception e) {
		      Log.e(TAG, "Get volume error: " + e.getMessage(), e);
		      return 1;	
		}
	}
}
