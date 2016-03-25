package cn.edu.nuaa.burning.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import cn.edu.nuaa.burning.resource.DemoResource;

/**
 * Created by yuchuan.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(DemoResource.class);
    }
}