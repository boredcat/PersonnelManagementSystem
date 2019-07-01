package com.evan.sm.service;

import com.evan.sm.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id, String password);
}
