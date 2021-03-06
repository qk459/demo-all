package com.demo.controller;

import com.demo.entity.SysUser;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RequestMappingg是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
@RestController//@RestController = @Controller+@ResponseBody
@RequestMapping(path = "/UserController")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(path = "getUserById")
    public SysUser getUserById(Integer userId){
        return userService.getUserById(userId);
    }

/*

    @RequestMapping(path = "selectExtTest")
    public List<User> selectExtTest(Integer age){
        return null;
    }

    @RequestMapping(path = "/index")
    public void getIndex(){
        System.out.println("112312");
    }


    @GetMapping(path = "/{city_id}/{user_id}")
    public Map getmapping(@PathVariable("city_id") String cityId, @PathVariable String userid){
        Map map=new HashMap<>();
        map.put("GetMapping","测试getMapping");
        map.put("cityId",cityId);
        map.put("userId",userid);
        return map;
    }


    @DeleteMapping(path = "/DeleteMapping")
    public Map deleteMapping(@PathVariable("city_id") String cityId, @PathVariable String userid){
        Map map=new HashMap<>();
        map.put("DeleteMapping","测试DeleteMapping");
        map.put("cityId",cityId);
        map.put("userId",userid);
        return map;
    }


    @RequestMapping(path = "getAllUser/{page}/{size}")
    public List<User> getAllUser(@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "size",defaultValue = "3")Integer size){
        PageHelper.startPage(page,size);
        return  null;// userService.getAllUser();
    }
*/

}
