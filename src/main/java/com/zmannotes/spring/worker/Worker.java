package com.zmannotes.spring.worker;

import java.util.Collection;
import java.util.List;

public class Worker {

    private List<String> connectionInitSqls;

    public Collection<String> getConnectionInitSqls() {
        return connectionInitSqls;
    }

    public void setConnectionInitSqls(Collection<String> connectionInitSqls) {
        this.connectionInitSqls.addAll(connectionInitSqls);
    }
}
