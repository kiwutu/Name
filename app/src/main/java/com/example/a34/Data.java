package com.example.a34;

import org.jetbrains.annotations.Nullable;

public class Data {

    private final String sn;
    private final String n;
    private final String pt;
    private final String phn;


    public Data(String sn, String phn, String n, String pt) {
        this.sn = sn;
        this.n = n;
        this.pt = pt;

        this.phn = phn;

    }

    public String getFn() {
        return sn;
    }

    public String getSn() {
        return n;
    }
    public String getPt() {
        return pt;
    }

    public String getPhn() {
        return phn;
    }


    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Data guest = (Data) obj;

        return
                sn.equals(guest.getFn())
                        && n.equals(guest.getSn())
                        &&pt.equals(guest.getPt())
                        && phn.equals(guest.getPhn());

    }
}