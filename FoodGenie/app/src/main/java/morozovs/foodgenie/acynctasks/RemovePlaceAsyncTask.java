package morozovs.foodgenie.acynctasks;

import android.content.Context;

import morozovs.foodgenie.models.MyPlaceInfo;
import morozovs.foodgenie.utils.AppController;

public class RemovePlaceAsyncTask extends BasePlaceAsyncTask {
    public RemovePlaceAsyncTask(Context context){
        super(context);
    }

    @Override
    protected Boolean doInBackground(MyPlaceInfo... params) {
        if(params.length == 0 || params.length > 1)
            return false;

        MyPlaceInfo p = params[0];
        AppController.getPlacesGetter().removeVisitedPlace(p.getPlace_id());
        return true;
    }
}
