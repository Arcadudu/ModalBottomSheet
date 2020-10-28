package ru.arcadudu.modalbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MyBottomSheet extends BottomSheetDialogFragment{

    ImageView bsImage;
    TextView bsTitle, bsDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View bottomSheet = inflater.inflate(R.layout.bottom_sheet_layout, container, false);
        bsImage = bottomSheet.findViewById(R.id.bs_image);
        bsTitle = bottomSheet.findViewById(R.id.bs_title);
        bsDescription = bottomSheet.findViewById(R.id.bs_description);
        return bottomSheet;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


}
