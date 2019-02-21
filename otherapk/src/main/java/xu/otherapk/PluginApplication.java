package xu.otherapk;

import android.app.Application;
import android.util.Log;

/**
 * <pre>
 * File description
 * @author YeJing
 * @data 2019/2/13
 * </pre>
 */
public class PluginApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("PluginApplication", "onCreate");
	}
}
