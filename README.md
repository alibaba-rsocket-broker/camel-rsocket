camel-rsocket
================

Apache Camel RSocket component，主要包括以下特性：

* request_response: 数据处理
* fire_and_forget: 无返回的数据处理
* request_stream: source，消息订阅


```
rsocket:tcp:host:42252/fnf?route=demo.xxxx&mimeType=0x05
rsocket:tcp:host:42252/stream?route=demo.xxxx&mimeType=0x05
```


### Options

* route: 路由key，详情参考 https://github.com/rsocket/rsocket/blob/master/Extensions/Routing.md
* mimeType: Stream data的mime type，详情参考： https://github.com/rsocket/rsocket/blob/master/Extensions/PerStreamDataMimeTypesDefinition.md

### References

* WRITING COMPONENTS: https://camel.apache.org/manual/latest/writing-components.html
* camel-avro-rpc：https://github.com/apache/camel/tree/main/components/camel-avro-rpc
* 
