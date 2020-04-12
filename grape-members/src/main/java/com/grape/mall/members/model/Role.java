package com.grape.mall.members.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author grape_mall
 * @since 2020-04-12
 */
@Data
@TableName("mb_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 角色编码
	 */
	@TableField(value="role_code")
	private String roleCode;

	/**
	 * 角色编码
	 */
	@TableField(value="role_name")
	private String roleName;

	/**
	 * 角色名称
	 */
	@TableField(value="role_desc")
	private String roleDesc;

	/**
	 * 是否启用
	 */
	@TableField(value="role_enabled")
	private Integer roleEnabled;

	/**
	 * 是否删除
	 */
	@TableLogic
	@TableField(value="is_deleted")
	private Integer isDeleted;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time", fill = FieldFill.INSERT)
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

}
