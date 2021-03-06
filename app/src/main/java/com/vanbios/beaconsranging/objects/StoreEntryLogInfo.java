package com.vanbios.beaconsranging.objects;

/**
 * Created by Ihor Bilous on 13.01.2016.
 */
public class StoreEntryLogInfo {
    private long datetime;
    private int idStore, state, visibility;

    public static final int ENTER = 1, EXIT = 0, VISIBLE = 1, UNVISIBLE = 0;


    public StoreEntryLogInfo(long datetime, int idStore, int state, int visibility) {
        this.datetime = datetime;
        this.idStore = idStore;
        this.state = state;
        this.visibility = visibility;
    }


    public long getDatetime() {
        return datetime;
    }

    public int getIdStore() {
        return idStore;
    }

    public int getState() {
        return state;
    }

    public int getVisibility() {
        return visibility;
    }
}
