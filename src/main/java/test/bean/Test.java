package test.bean;

import io.swagger.annotations.ApiModelProperty;

public class Test {
    @ApiModelProperty(value = "id",required = true)
    private int id;
    @ApiModelProperty(value = "描述",required = true)
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
