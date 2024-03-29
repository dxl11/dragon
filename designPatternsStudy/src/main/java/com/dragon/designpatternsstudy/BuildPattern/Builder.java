package com.dragon.designpatternsstudy.BuildPattern;

import java.util.Date;

public abstract class Builder {
    protected AutoMessage msg;

    /**
     * 标题零件中的建造方法
     */
    public abstract void buildSubject();

    /**
     * 内容零件的建造方法
     */
    public abstract void buildBody();

    /**
     * 收件人的建造方法
     */
    public void buildTo(String to) {
        msg.setTo(to);
    }

    /**
     * 发件人的建造方法
     */
    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    /**
     * 发送事件的建造方法
     */
    public void buildSendDate() {
        msg.setSendDate(new Date());
    }

    /**
     * 邮件完成后，用此方法发送邮件，此方法相当于产品返还方法
     */
    public void sendMessage() {
        msg.send();
    }

}
