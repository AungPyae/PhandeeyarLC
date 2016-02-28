package aungpyaephyo.net.phandeeyarlivecoding.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import aungpyaephyo.net.phandeeyarlivecoding.R;
import aungpyaephyo.net.phandeeyarlivecoding.data.DataManager;
import aungpyaephyo.net.phandeeyarlivecoding.data.vos.EventVO;
import aungpyaephyo.net.phandeeyarlivecoding.views.ViewItemEvent;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventListFragment extends Fragment {

    public EventListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_list, container, false);

        LinearLayout llEventRoot = (LinearLayout) rootView.findViewById(R.id.ll_event_root);

        List<EventVO> eventList = DataManager.getInstance().getEventList();
        for (EventVO event : eventList) {
            ViewItemEvent viEvent = (ViewItemEvent) inflater.inflate(R.layout.view_item_event, container, false);
            viEvent.setData(event);

            llEventRoot.addView(viEvent);
        }

        return rootView;
    }
}
