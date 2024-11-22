package backend.academy.fractal.config;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = false, chain = false)
public class TransformationConfig {
    private double[] transformation;
    private double chance;
}