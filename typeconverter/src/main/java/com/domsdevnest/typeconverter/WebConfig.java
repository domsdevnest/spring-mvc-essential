package com.domsdevnest.typeconverter;

import com.domsdevnest.typeconverter.converter.IntegerToStringConverter;
import com.domsdevnest.typeconverter.converter.IpPortToStringConverter;
import com.domsdevnest.typeconverter.converter.StringToIntegerConverter;
import com.domsdevnest.typeconverter.converter.StringToIpPortConverter;
import com.domsdevnest.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        registry.addFormatter(new MyNumberFormatter());
    }
}
