//package com.huangmaojie.duomall.gateway.config;
//
//import com.netflix.discovery.util.StringUtil;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.ZuulFilterResult;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.apache.commons.lang.StringUtils;
//import org.apache.http.protocol.RequestContent;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author huangmaojie
// * @date 2020/3/26
// */
//@Component
//public class WebFilter extends ZuulFilter {
//
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    public WebFilter() {
//        super();
//    }
//
//    @Override
//    public boolean isStaticFilter() {
//        return super.isStaticFilter();
//    }
//
//    @Override
//    public String disablePropertyName() {
//        return super.disablePropertyName();
//    }
//
//    @Override
//    public boolean isFilterDisabled() {
//        return super.isFilterDisabled();
//    }
//
//    @Override
//    public ZuulFilterResult runFilter() {
//        return super.runFilter();
//    }
//
//    @Override
//    public int compareTo(ZuulFilter filter) {
//        return super.compareTo(filter);
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        //认证头信息
//        String authorizationHeader = request.getHeader("Authorization");
//        if(StringUtils.isNotEmpty(authorizationHeader)){
//            currentContext.addZuulRequestHeader("Authorization",authorizationHeader);
//        }
//        //跨域头信息
//        currentContext.addZuulRequestHeader("Access-Control-Allow-Origin","*");
//        return null;
//    }
//}
