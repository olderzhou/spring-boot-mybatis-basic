package org.zhuiyi.yiconnect.data.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhuiyi.yiconnect.data.transfer.dto.response.base.R;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.zhuiyi.yiconnect.data.transfer" })
@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

	@GetMapping("/status")
	public R status() {
		return R.ok();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
	}
}
