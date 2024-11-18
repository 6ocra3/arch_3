package backend.academy.fractal.variations.implementations;

import backend.academy.fractal.structs.Point;
import backend.academy.fractal.variations.Variation;

public class SwirlVariation implements Variation {
    @Override
    public String getName() {
        return "swirl variation";
    }

    @Override
    public Point apply(Point point) {
        double x = point.x();
        double y = point.y();
        double r = x * x + y * y;
        return new Point(
            x * Math.sin(r) - y * Math.cos(r),
            x * Math.cos(r) + y * Math.sin(r)
        );
    }
}
