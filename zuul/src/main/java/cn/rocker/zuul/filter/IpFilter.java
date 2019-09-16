package cn.rocker.zuul.filter;

import cn.rocker.zuul.utils.IPUtils;
import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.http.protocol.ResponseDate;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author rocker
 * @date 2019/09/16 21:40
 * @since V1.0
 */
public class IpFilter extends ZuulFilter {

    private List<String> blackIpList = Arrays.asList("127.0.0.1");

    /**
     * 过滤器类型，可选值有pre、route、post、error
     * 这里spring没有给我们提供一个常量或者枚举吗？好奇怪
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的执行顺序，数值越小，优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        String ipAddr = IPUtils.getIpAddr(requestContext.getRequest());
        if(!StringUtils.isEmpty(ipAddr) && blackIpList.contains(ipAddr)){
            requestContext.setSendZuulResponse(false);
            HashMap<String, String> result = new HashMap<>();
            result.put("no_auth","401");
            requestContext.setResponseBody(JSON.toJSONString(result));
            return null;
        }
        return null;
    }
}
