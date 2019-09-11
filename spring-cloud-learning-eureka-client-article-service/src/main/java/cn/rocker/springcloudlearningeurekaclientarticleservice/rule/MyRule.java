package cn.rocker.springcloudlearningeurekaclientarticleservice.rule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author rocker
 * @date 2019/09/10 22:00
 * @since V1.0
 */
public class MyRule implements IRule {

    private ILoadBalancer lb;

    @Override
    public Server choose(Object key) {
        List<Server> servers = lb.getAllServers();
        for (Server server : servers) {
            System.out.printf("host%s\n", server.getHostPort());
        }
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return lb;
    }

}
