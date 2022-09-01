package com.spring.springinit.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Setter
@Getter
@ToString
@Component
@ConfigurationProperties("test")
@Validated
public class SampleProperties {

    @NotEmpty
    private String name;

    private int age;

    private String fullname;

    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTime;
}
