package com.andy.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询分页的参数
 */
@ApiModel
@Data
public class QueryPageParam {

    @ApiModelProperty("第几页")
    private Integer pageNum = 1;

    @ApiModelProperty("每页多少条")
    private Integer pageSize = 10;
}
