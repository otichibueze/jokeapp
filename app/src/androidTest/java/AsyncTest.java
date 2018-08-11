import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertNotNull;
@RunWith(AndroidJUnit4.class)
public class AsyncTest {


    private static final String LOG_TAG = "AsyncTest";

    @Test
    public void GetJokeTest() {
        // Async task Test
        // You can test this from androidTest -> Run 'All Tests'
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(InstrumentationRegistry.getContext(), null);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.v(LOG_TAG, "Retrieved successfully from endpoints : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
        assertNotSame(EndpointsAsyncTask.ERROR_MSG,result);
    }
}