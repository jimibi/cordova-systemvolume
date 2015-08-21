package fr.edps.systemvolume;

<<<<<<< HEAD
import org.apache.cordova.*;
=======
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
>>>>>>> origin/master
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;

<<<<<<< HEAD
public class systemVolume extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("setSystemVolume")) {
            this.setSystemVolume(args.getDouble(0));
            String message = "Success System Volume Set";
            callbackContext.success(message);
            return true;
        } else if (action.equals("setAudioVolume")) {
            this.setAudioVolume(args.getDouble(0));
            String message = "Success Audio Volume Set";
            callbackContext.success(message);
            return true;
        } else if (action.equals("getAudioVolume")) {
            this.getSystemVolume();
            String message = "Success Audio Volume Get";
            callbackContext.success(message);
            return true;
        } else {
            String message = "No action";
            callbackContext.error(message);
            return false;
        }
    }
    public void setSystemVolume(double volume) {
        AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
        
        am.setStreamVolume(AudioManager.STREAM_MUSIC, (int) (am.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * volume), 0);
    }
    public void setAudioVolume(double volume) {
        AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
        
        am.setStreamVolume(AudioManager.STREAM_MUSIC, (int) (am.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * volume), 0);
    }
    public int getSystemVolume() {
        AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
        try {
                int Level;
                int max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                int current =am.getStreamVolume(AudioManager.STREAM_MUSIC);
                Level = Math.round(current / max);
                return Level;
        }catch (Exception e) {
                return 1; 
        }
    }
=======
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
		
        am.setStreamVolume(AudioManager.STREAM_MUSIC, (int) (am.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * volume), 0);
	}
	
	public int getSystemVolume(int percent) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);
		try {
	        	int Level;
        		int max = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
    			int current =am.getStreamVolume(AudioManager.STREAM_MUSIC);
			Level = Math.round(current / max);
			return Level;
		}catch (Exception e) {
		      return 1;	
		}
	}
>>>>>>> origin/master
}
