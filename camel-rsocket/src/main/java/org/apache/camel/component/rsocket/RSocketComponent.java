package org.apache.camel.component.rsocket;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;

import java.io.IOException;
import java.util.Map;

/**
 * Apache Camel RSocket Component
 *
 * @author leijuan
 */
@Component("rsocket")
public class RSocketComponent extends DefaultComponent {
    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        return null;
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
