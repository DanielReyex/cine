package com.example.cine;

import androidx.fragment.app.Fragment;

public interface NavigationHost{

    void navigateTo(Fragment fragment,boolean addBackstack);
}