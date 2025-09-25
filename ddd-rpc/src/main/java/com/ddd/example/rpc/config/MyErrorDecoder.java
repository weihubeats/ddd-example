package com.ddd.example.rpc.config;

import com.nebula.base.utils.JsonUtil;
import com.nebula.web.boot.api.NebulaResponse;
import com.nebula.web.boot.exception.BizException;
import feign.Response;
import feign.codec.ErrorDecoder;
import feign.Util;
import java.io.IOException;
import java.util.Optional;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : wh
 * @date : 2025/3/15 16:45
 * @description:
 */
@Slf4j
public class MyErrorDecoder extends ErrorDecoder.Default {

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == HttpServletResponse.SC_BAD_REQUEST) {
            // 自定义异常
            BizException exception = null;
            try {
                // 获取原始的返回内容
                String json = Util.toString(response.body().asReader());
                String msg = Optional.ofNullable(JsonUtil.json2JavaBean(json, NebulaResponse.class)).map(NebulaResponse::getMsg).orElse(json);
                // 抛出业务异常
                exception = new BizException(msg);
            } catch (IOException ex) {
                log.error(ex.getMessage(), ex);
            }
            return exception;
        }
        return super.decode(methodKey, response);
    }
}
