package com.ddd.example.app.order.dto;

import com.nebula.base.model.NebulaPageQuery;
import lombok.Data;

/**
 * @author : wh
 * @date : 2025/1/8 15:49
 * @description:
 */
@Data
public class OrderQueryDTO extends NebulaPageQuery {
    
    private Long id;
}
