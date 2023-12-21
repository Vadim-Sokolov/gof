package gof.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class LimitedResource {

    private static final int MAX_INSTANCES = 10;
    private static final List<LimitedResource> instances = new ArrayList<>();

    public LimitedResource() {
            if(instances.size() < MAX_INSTANCES) {
                instances.add(this);
            } else {
                throw new IllegalStateException("Instance limit reached. Limit = " + MAX_INSTANCES);
            }
    }

    public static List<LimitedResource> getInstances() {
        return instances;
    }
}
