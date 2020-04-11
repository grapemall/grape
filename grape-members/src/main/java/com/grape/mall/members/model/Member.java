package com.grape.mall.members.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@TableName(value = "mb_member")
public class Member {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 用户名
     */
    @TableField(value = "member_name")
    private String memberName;

    /**
     * 登录密码
     */
    @TableField(value = "member_pwd")
    private String memberPwd;

    /**
     * 性别
     */
    @TableField(value = "member_sex")
    private Boolean memberSex;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 会员状态
     */
    @TableField(value = "state")
    private Boolean state;

    /**
     * 会员是否有购买权限
     */
    @TableField(value = "allow_buy")
    private Boolean allowBuy;

    /**
     * 会员积分
     */
    @TableField(value = "member_points")
    private Long memberPoints;

    /**
     * 注册时间
     */
    @TableField(value = "register_time")
    private Date registerTime;

    /**
     * 登录时间
     */
    @TableField(value = "login_time")
    private Date loginTime;

    public static final String COL_ID = "id";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_MEMBER_NAME = "member_name";

    public static final String COL_MEMBER_PWD = "member_pwd";

    public static final String COL_MEMBER_SEX = "member_sex";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_STATE = "state";

    public static final String COL_ALLOW_BUY = "allow_buy";

    public static final String COL_MEMBER_POINTS = "member_points";

    public static final String COL_REGISTER_TIME = "register_time";

    public static final String COL_LOGIN_TIME = "login_time";
}