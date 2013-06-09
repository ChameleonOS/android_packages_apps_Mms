package com.android.mms.ui;

import android.app.Fragment;

public abstract class MmsBaseFragment extends Fragment {
    protected boolean mIsActive = false;

    public void setActive(boolean isActive) {
        mIsActive = isActive;
    }
}
