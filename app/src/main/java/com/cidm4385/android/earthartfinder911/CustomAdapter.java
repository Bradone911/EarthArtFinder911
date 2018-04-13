package com.cidm4385.android.earthartfinder911;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context c;
    String[] names = {"SpiralJetty", "Amarillo Ramp", "Double Negative", "Broken Circle",
            "City","Lighting Field", "Sun Tunnels"};
    String[] price = {"10000", "150000", "20000", "400000", "340000", "490000", "500000"};
    int[] images = {R.drawable.spiraljetty,
                R.drawable.amarilloramp,
                R.drawable.doublenegative,
                R.drawable.brokencircle,
                R.drawable.city,
                R.drawable.lightingfield,
                R.drawable.suntunnels};

    public  CustomAdapter (Context ctx) {
        this.c=ctx;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {


        if (convertView==null)  {
            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.mobiles,null);
        }

        //get view
        TextView nametxt = (TextView) convertView.findViewById(R.id.name);
        TextView pricetxt = (TextView) convertView.findViewById(R.id.price);
        ImageView img = (ImageView) convertView.findViewById(R.id.imgid);

        //set data
        nametxt.setText(names[pos]);
        pricetxt.setText(price[pos]);
        img.setImageResource(images[pos]);

        return convertView;
    }
}
