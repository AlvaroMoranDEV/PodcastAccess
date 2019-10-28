package com.alvaromoran.data;

import java.util.Collection;

/**
 * Root for the JSON received from the ITunes Store
 * @author AlvaroMoranDEV
 * @version 0.1
 */
public class JsonRoot {

    public int resultCount;
    public Collection<PodCastChannelDTO> results;
}
