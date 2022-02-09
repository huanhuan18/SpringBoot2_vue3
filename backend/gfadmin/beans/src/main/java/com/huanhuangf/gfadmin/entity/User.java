package com.huanhuangf.gfadmin.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int user_id;
    private String userName;
    private String userPwd;
    private String userRealname;
    private String userImg;
}
