package com.huanhuangf.controller;

import com.huanhuangf.gfadmin.service.UserService;
import com.huanhuangf.gfadmin.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

//@Controller
//@ResponseBody    //该controller下所有请求都是异步请求，返回的都是json数据
@RestController   //将@Controller和@ResponseBody合并
@RequestMapping("/user")
@Api(value = "提供登录注册接口", tags = "用户管理")
public class UserController {

    @Resource    //用Autowired注入也可以
    private UserService userService;   //注入的是接口，但实际上是把impl注入进来

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username", value = "用户登录账户", required = true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "用户登录密码", required = false, defaultValue = "111111")
    })
    @GetMapping("/login")
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password", defaultValue = "111111") String pwd){
        return userService.checkLogin(name, pwd);
    }

    //请求URL: http://localhost:8080/user/delete/1   商品1
    //        http://localhost:8080/user/delete/2   商品2
        @GetMapping("/delete/{gid}")
        public ResultVO deleteGoods(@PathVariable("gid") int goodsId){
            System.out.println("------"+goodsId);
            return new ResultVO(10000, "delete success", null);
        }
}
