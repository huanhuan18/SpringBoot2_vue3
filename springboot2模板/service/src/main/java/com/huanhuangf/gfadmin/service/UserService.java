package com.huanhuangf.gfadmin.service;

import com.huanhuangf.gfadmin.entity.User;
import com.huanhuangf.gfadmin.vo.ResultVO;

public interface UserService {

    public ResultVO checkLogin(String name, String pwd);
}
