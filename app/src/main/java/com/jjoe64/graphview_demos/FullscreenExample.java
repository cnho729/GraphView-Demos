package com.jjoe64.graphview_demos;

import android.support.annotation.LayoutRes;

import com.jjoe64.graphview_demos.examples.AddSeriesAtRuntime;
import com.jjoe64.graphview_demos.examples.AdvancedBarGraph;
import com.jjoe64.graphview_demos.examples.AdvancedLineGraph;
import com.jjoe64.graphview_demos.examples.BaseExample;
import com.jjoe64.graphview_demos.examples.CustomLabelsGraph;
import com.jjoe64.graphview_demos.examples.Dates;
import com.jjoe64.graphview_demos.examples.FixedFrame;
import com.jjoe64.graphview_demos.examples.HelloWorld;
import com.jjoe64.graphview_demos.examples.MultipleBarGraph;
import com.jjoe64.graphview_demos.examples.NoLabelsGraph;
import com.jjoe64.graphview_demos.examples.RealtimeScrolling;
import com.jjoe64.graphview_demos.examples.ScalingX;
import com.jjoe64.graphview_demos.examples.ScalingXY;
import com.jjoe64.graphview_demos.examples.ScrollingX;
import com.jjoe64.graphview_demos.examples.SecondScaleGraph;
import com.jjoe64.graphview_demos.examples.SimpleBarGraph;
import com.jjoe64.graphview_demos.examples.SimpleLineGraph;
import com.jjoe64.graphview_demos.examples.SimplePointsGraph;
import com.jjoe64.graphview_demos.examples.StaticLabelsGraph;
import com.jjoe64.graphview_demos.examples.StylingColors;
import com.jjoe64.graphview_demos.examples.StylingLabels;
import com.jjoe64.graphview_demos.examples.TapListenerGraph;

/**
 * Created by jonas on 10.09.16.
 */
public enum FullscreenExample {
    HELLO_WORLD(R.layout.fullscreen_example_simple, HelloWorld.class),
    SCALING_XY(R.layout.fullscreen_example_simple, ScalingXY.class),
    SCALING_X(R.layout.fullscreen_example_simple, ScalingX.class),
    SCROLLING_X(R.layout.fullscreen_example_simple, ScrollingX.class),
    FIXED_FRAME(R.layout.fullscreen_example_simple, FixedFrame.class),
    REALTIME_SCROLLING(R.layout.fullscreen_example_simple, RealtimeScrolling.class),
    DATES(R.layout.fullscreen_example_simple, Dates.class),
    SIMPLE_LINE_GRAPH(R.layout.fullscreen_example_simple, SimpleLineGraph.class),
    ADVANCED_LINE_GRAPH(R.layout.fullscreen_example_simple, AdvancedLineGraph.class),
    SIMPLE_BAR_GRAPH(R.layout.fullscreen_example_simple, SimpleBarGraph.class),
    ADVANCED_BAR_GRAPH(R.layout.fullscreen_example_simple, AdvancedBarGraph.class),
    MULTIPLE_BAR_GRAPH(R.layout.fullscreen_example_simple, MultipleBarGraph.class),
    SIMPLE_POINTS_GRAPH(R.layout.fullscreen_example_simple, SimplePointsGraph.class),
    SECOND_SCALE_GRAPH(R.layout.fullscreen_example_simple, SecondScaleGraph.class),
    CUSTOM_LABELS(R.layout.fullscreen_example_simple, CustomLabelsGraph.class),
    NO_LABELS(R.layout.fullscreen_example_simple, NoLabelsGraph.class),
    STATIC_LABELS(R.layout.fullscreen_example_simple, StaticLabelsGraph.class),
    TAP_LISTENER(R.layout.fullscreen_example_simple, TapListenerGraph.class),
    STYLING_LABELS(R.layout.fullscreen_example_simple, StylingLabels.class),
    STYLING_COLORS(R.layout.fullscreen_example_simple, StylingColors.class),
    ADD_SERIES(R.layout.fullscreen_example_add_series, AddSeriesAtRuntime.class);

    public static final String ARG_ID = "FEID";

    public final @LayoutRes int contentView;
    public final Class<? extends BaseExample> exampleClass;

    FullscreenExample(@LayoutRes int contentView, Class<? extends BaseExample> exampleClass) {
        this.contentView = contentView;
        this.exampleClass = exampleClass;
    }
}
