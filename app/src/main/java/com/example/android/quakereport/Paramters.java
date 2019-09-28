package com.example.android.quakereport;

public class Paramters  {

    private int eMageId ;
    private int elocationId ;
    private int edaraId ;

public Paramters (int mag, int loc, int date) {

    eMageId = mag ;
    elocationId = loc;
    edaraId = date;

}

    public int getEdaraId() {
        return edaraId;
    }

    public int getElocationId() {
        return elocationId;
    }

    public int geteMageId() {
        return eMageId;
    }
}
