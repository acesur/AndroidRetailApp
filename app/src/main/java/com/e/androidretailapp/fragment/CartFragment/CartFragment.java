package com.e.androidretailapp.fragment.CartFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.e.androidretailapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {
    private CartViewModel cartViewModel;
    private ImageButton imgbtnCart;


    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_cart, container, false);
        imgbtnCart = root.findViewById(R.id.imgbtnCart);

        imgbtnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return root;
    }

}
