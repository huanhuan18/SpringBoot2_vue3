package com.huanhuangf.gfadmin.dao;

import com.huanhuangf.gfadmin.entity.User;

public interface UserDAO {

    public User queryUserByName(String name);
}
