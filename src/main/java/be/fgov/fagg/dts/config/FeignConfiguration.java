package be.fgov.fagg.dts.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "be.fgov.fagg.dts")
public class FeignConfiguration {

}
