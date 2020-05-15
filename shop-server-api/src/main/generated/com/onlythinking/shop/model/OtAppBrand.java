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
 * ot_app_brand
 * 
 * 应用品牌
 * 
 * @author lixingping
 * Date 2020-05-09 15:18:49
 */
@Data
@ApiModel("应用品牌")
public class OtAppBrand implements Serializable {
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
     * 应用名称
     */
    @NotBlank
    @ApiModelProperty(value = "应用名称", required = true)
    private String appName;

    /**
     * 应用编号
     */
    @NotBlank
    @ApiModelProperty(value = "应用编号", required = true)
    private String appNo;

    /**
     * 应用描述
     */
    @ApiModelProperty(value = "应用描述")
    private String appDesc;

    /**
     * Logo
     */
    @ApiModelProperty(value = "Logo")
    private String logo;

    private static final long serialVersionUID = 1L;
}