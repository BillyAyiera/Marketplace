package com.moringaschool.tradewithme;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyTradeArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mTrade;
    private String[] mGoods;

    public MyTradeArrayAdapter(Context mContext, int resource, String[] mTrade, String[] mGoods) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mTrade = mTrade;
        this.mGoods = mGoods;
    }

    @Override
    public Object getItem(int position) {
        String trade = mTrade[position];
        String goods = mGoods[position];
        return String.format("%s \nSells awesome: %s", trade, goods);
    }

    @Override
    public int getCount() {
        return mTrade.length;
    }
}
