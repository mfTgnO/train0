package springrecipes.sequence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = {"springrecipes.sequence.*Dao",
                                "springrecipes.sequence.*Service"})
        },
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = {org.springframework.stereotype.Controller.class}

        )})
public class SequenceGeneratorConfiguration {
}
