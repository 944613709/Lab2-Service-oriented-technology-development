package com.hit.lyx.dubbo.demo.api.entity;

import com.hit.lyx.dubbo.demo.api.entity.Comment;
import com.hit.lyx.dubbo.demo.api.entity.HouseEntity;
import com.hit.lyx.dubbo.demo.api.entity.Message;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    static public List<UserT> users=new ArrayList<>();
    static public List<HouseEntity> houses=new ArrayList<>();
    static public List<Message> messages=new ArrayList<>();

    public DataGenerator(){
        HouseEntity h1=new HouseEntity("香坊健康路97号",9000,"鸡场小区 两室一厅 东西通透 交通便利","70年","普通住宅","板楼","朝南",true,89);
        HouseEntity h2=new HouseEntity("松北龙轩路与江安街交汇处",7500,"香坊公园，对口39中，一室明厅小户型，精装修，近地铁","70年","普通住宅","板楼","朝北",true,108);
        HouseEntity h3=new HouseEntity("道里群力第六大道与朗江路交汇处",7000,"道外区大同学5楼东西通透使用88米三室一厅精装修\n","70年","商住两用","塔楼","朝东",false,154);
        HouseEntity h4=new HouseEntity("哈尔滨市南岗区学府路125号",13000,"会展商圈 通透户型 欧式精装 三室明厅","70年","普通住宅","板楼","朝南",true,78);
        HouseEntity h5=new HouseEntity("哈尔滨北京路小街434号",8689,"会展商圈 红旗小区 两室方厅 精装修 南向三阳","70年","普通住宅","板楼","朝南",true,90);
        h1.getComments().add(new Comment("风景优美，环境良好，值得拥有，hhhhhhhhh"));
        h1.getComments().add(new Comment("太差了，我要差评"));
        h1.getComments().add(new Comment("很好，很好，很好"));
        h2.getComments().add(new Comment("风景优美，环境良好，但是没有电梯，不好，不好"));
        h2.getComments().add(new Comment("反正我是不会买的"));
        h2.getComments().add(new Comment("路过。。。。。。。。。。"));
        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);
        houses.add(h5);

        UserT u1=new UserT("小明",0,45,"一个精明的人","18872974839","哈尔滨香坊区");
        UserT u2=new UserT("小赵",0,45,"哈哈哈哈哈，不知道写什么","18824525429","北京市海淀区");
        UserT u3=new UserT("小李",0,45,"酒逢知己千杯少","243564335","浙江杭州");
        UserT u4=new UserT("Bob List",0,45,"一个路过的人","5434663467","长沙");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        Message m1=new Message("小明","小赵","你好，能了解一下吗");
        Message m2=new Message("小明","小赵","今天天气真好");
        Message m3=new Message("小明","小李","我想买你的房子");
        Message m4=new Message("小李","小赵","打扰一下，有兴趣吗");
        Message m5=new Message("Bob List","小明","Don't ask me.");
        messages.add(m1);
        messages.add(m2);
        messages.add(m3);
        messages.add(m4);
        messages.add(m5);

    }
}
