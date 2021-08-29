package org.apache.camel.component.rsocket;


import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CamelTest extends RouteBuilder {
    private CamelContext camelContext;

    @Override
    public void configure() throws Exception {

    }

    @BeforeAll
    public void setUp() throws Exception {
        this.camelContext = new DefaultCamelContext();
        camelContext.addRoutes(this);
        camelContext.start();
    }

    @AfterAll
    public void tearDown() throws Exception {
        this.camelContext.stop();
    }

    @Test
    public void testRSocketComponent() throws Exception {
        final Component component = this.camelContext.getComponent("rsocket");
        System.out.println(component.getClass());
    }
}
