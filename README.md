camel-rsocket
================

Apache Camel RSocket component, 同时支持producer和consumer模式, 主要包括以下特性：

*  Producer
    * request_response: 数据发送
    * fire_and_forget: 无返回的数据处理
*  Consumer
   * request_stream: source，消息订阅

Maven users will need to add the following dependency to their pom.xml for this component:

```xml
<dependency>
    <groupId>com.alibaba.rsocket</groupId>
    <artifactId>camel-rsocket</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

# Using RSocket in Apache Camel

```
rsocket:tcp:host:42252/fnf?route=demo.xxxx&mimeType=0x05
rsocket:tcp:host:42252/stream?route=demo.xxxx&mimeType=0x05
```


# COMPONENT OPTIONS

* route: 路由key，详情参考 https://github.com/rsocket/rsocket/blob/master/Extensions/Routing.md
* mimeType: Stream data的mime type，详情参考： https://github.com/rsocket/rsocket/blob/master/Extensions/PerStreamDataMimeTypesDefinition.md

# References

* WRITING COMPONENTS: https://camel.apache.org/manual/latest/writing-components.html
* camel-avro-rpc：https://github.com/apache/camel/tree/main/components/camel-avro-rpc

