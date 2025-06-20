package com.ddd.example.infr.order.queryentity;

import com.nebula.base.model.NebulaPageQuery;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * @author : wh
 * @date : 2025/1/8 16:06
 * @description:
 */
@Data
public class OrderQuery extends NebulaPageQuery {
    
    private String phone;
    
    private List<String> tags;
    
    private String tag;
    
    private LocalDateTime createStartTime;
    
    private LocalDateTime createEndTime;
}
