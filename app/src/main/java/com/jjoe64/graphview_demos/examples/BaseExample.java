package com.jjoe64.graphview_demos.examples;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview_demos.FullscreenActivity;

public abstract class BaseExample {
    public abstract void onCreate(FullscreenActivity fullscreenActivity);
    public abstract void initGraph(GraphView graph);

    public void onPause() {}
    public void onResume() {}
}
