package com.entity.vo;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教师
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoshi")
public class JiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 教师工号
     */

    @TableField(value = "jiaoshi_uuid_number")
    private String jiaoshiUuidNumber;


    /**
     * 教师姓名
     */

    @TableField(value = "jiaoshi_name")
    private String jiaoshiName;


    /**
     * 教师手机号
     */

    @TableField(value = "jiaoshi_phone")
    private String jiaoshiPhone;


    /**
     * 教师身份证号
     */

    @TableField(value = "jiaoshi_id_number")
    private String jiaoshiIdNumber;


    /**
     * 教师头像
     */

    @TableField(value = "jiaoshi_photo")
    private String jiaoshiPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "jiaoshi_email")
    private String jiaoshiEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：教师工号
	 */
    public String getJiaoshiUuidNumber() {
        return jiaoshiUuidNumber;
    }


    /**
	 * 获取：教师工号
	 */

    public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
        this.jiaoshiUuidNumber = jiaoshiUuidNumber;
    }
    /**
	 * 设置：教师姓名
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }


    /**
	 * 获取：教师姓名
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 设置：教师手机号
	 */
    public String getJiaoshiPhone() {
        return jiaoshiPhone;
    }


    /**
	 * 获取：教师手机号
	 */

    public void setJiaoshiPhone(String jiaoshiPhone) {
        this.jiaoshiPhone = jiaoshiPhone;
    }
    /**
	 * 设置：教师身份证号
	 */
    public String getJiaoshiIdNumber() {
        return jiaoshiIdNumber;
    }


    /**
	 * 获取：教师身份证号
	 */

    public void setJiaoshiIdNumber(String jiaoshiIdNumber) {
        this.jiaoshiIdNumber = jiaoshiIdNumber;
    }
    /**
	 * 设置：教师头像
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }


    /**
	 * 获取：教师头像
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getJiaoshiEmail() {
        return jiaoshiEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setJiaoshiEmail(String jiaoshiEmail) {
        this.jiaoshiEmail = jiaoshiEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
