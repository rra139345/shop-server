package com.onlythinking.shop.model;

import com.onlythinking.commons.core.interceptor.CreatedTime;
import com.onlythinking.commons.core.interceptor.LastModifiedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <p> This was generated by Ot Mybatis generator. </p>
 * 
 * ot_sys_job_details
 * 
 * 系统任务
 * 
 * @author lixingping
 * Date 2020-05-07 16:48:33
 */
@Data
@ApiModel("系统任务")
public class OtSysJobDetails implements Serializable {
    /**
     * ID
     */
    @Id
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @CreatedTime
    private Date createdTime;

    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间")
    @LastModifiedTime
    private Date lastModifiedTime;

    /**
     * 备注（修改记录)
     */
    @ApiModelProperty(value = "备注（修改记录)")
    private String remark;

    /**
     * 任务执行方法
     */
    @NotBlank
    @ApiModelProperty(value = "任务执行方法", required = true)
    private String clazzPath;

    /**
     * 任务描述
     */
    @ApiModelProperty(value = "任务描述")
    private String description;

    /**
     * 任务名称
     */
    @NotBlank
    @ApiModelProperty(value = "任务名称", required = true)
    private String jobName;

    /**
     * 任务参数
     */
    @ApiModelProperty(value = "任务参数")
    private String jobParams;

    /**
     * 是否启用(1000)
     */
    @NotBlank
    @ApiModelProperty(value = "是否启用(1000)", required = true)
    private String status;

    private static final long serialVersionUID = 1L;
}