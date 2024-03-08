package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 科研获奖
 *
 * @author 
 * @email
 */
@TableName("keyanhuojiang")
public class KeyanhuojiangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanhuojiangEntity() {

	}

	public KeyanhuojiangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 科研获奖名称
     */
    @TableField(value = "keyanhuojiang_name")

    private String keyanhuojiangName;


    /**
     * 科研获奖类型
     */
    @TableField(value = "keyanhuojiang_types")

    private Integer keyanhuojiangTypes;


    /**
     * 相关文件
     */
    @TableField(value = "keyanhuojiang_file")

    private String keyanhuojiangFile;


    /**
     * 科研获奖详情
     */
    @TableField(value = "keyanhuojiang_content")

    private String keyanhuojiangContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 审核状态
     */
    @TableField(value = "keyanhuojiang_yesno_types")

    private Integer keyanhuojiangYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "keyanhuojiang_yesno_text")

    private String keyanhuojiangYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：科研获奖名称
	 */
    public String getKeyanhuojiangName() {
        return keyanhuojiangName;
    }


    /**
	 * 获取：科研获奖名称
	 */

    public void setKeyanhuojiangName(String keyanhuojiangName) {
        this.keyanhuojiangName = keyanhuojiangName;
    }
    /**
	 * 设置：科研获奖类型
	 */
    public Integer getKeyanhuojiangTypes() {
        return keyanhuojiangTypes;
    }


    /**
	 * 获取：科研获奖类型
	 */

    public void setKeyanhuojiangTypes(Integer keyanhuojiangTypes) {
        this.keyanhuojiangTypes = keyanhuojiangTypes;
    }
    /**
	 * 设置：相关文件
	 */
    public String getKeyanhuojiangFile() {
        return keyanhuojiangFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setKeyanhuojiangFile(String keyanhuojiangFile) {
        this.keyanhuojiangFile = keyanhuojiangFile;
    }
    /**
	 * 设置：科研获奖详情
	 */
    public String getKeyanhuojiangContent() {
        return keyanhuojiangContent;
    }


    /**
	 * 获取：科研获奖详情
	 */

    public void setKeyanhuojiangContent(String keyanhuojiangContent) {
        this.keyanhuojiangContent = keyanhuojiangContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getKeyanhuojiangYesnoTypes() {
        return keyanhuojiangYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setKeyanhuojiangYesnoTypes(Integer keyanhuojiangYesnoTypes) {
        this.keyanhuojiangYesnoTypes = keyanhuojiangYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getKeyanhuojiangYesnoText() {
        return keyanhuojiangYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setKeyanhuojiangYesnoText(String keyanhuojiangYesnoText) {
        this.keyanhuojiangYesnoText = keyanhuojiangYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        return "Keyanhuojiang{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", keyanhuojiangName=" + keyanhuojiangName +
            ", keyanhuojiangTypes=" + keyanhuojiangTypes +
            ", keyanhuojiangFile=" + keyanhuojiangFile +
            ", keyanhuojiangContent=" + keyanhuojiangContent +
            ", insertTime=" + insertTime +
            ", keyanhuojiangYesnoTypes=" + keyanhuojiangYesnoTypes +
            ", keyanhuojiangYesnoText=" + keyanhuojiangYesnoText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
