package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //配置类，替代
@ComponentScan(basePackages = {"service"})
public class SpringConfig {
}
