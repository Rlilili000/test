package test.web.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import test.bean.Message;
import test.bean.Test;
import test.util.MessageUtil;

import java.util.Date;

@RestController
public class TestController {
    @PostMapping("/add")
    @ApiOperation("添加")
    public Message add(){
        Message<String> message=new Message();
        Date date=new Date();
        message.setTime(date.getTime());
        message.setStatus(200);
        message.setMessage("success");
        message.setData("添加信息成功");
        return message;
    }
    @GetMapping("/delete")
    @ApiOperation("删除")
    public Message delete(Test test){

        return MessageUtil.success("删除成功");
    }

    @PostMapping("/update")
    @ApiOperation("修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="id",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="desc",value="描述",paramType = "query",dataType = "String")
    })
    public Message update(int id,String desc){
        return MessageUtil.success("修改成功");

    }
}
