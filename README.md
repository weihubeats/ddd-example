### ddd-example
DDD 分包分层规范及通用组件说明


### 项目分层说明
![img.png](doc/img/项目依赖.png)

- adapter: web层(应用层)
- domain: 领域层
- infrastructure：数据层
- app:应用层
- rpc: 远程rpc调用
- component: 基础组件层

> rpc层可以单独拆分一个模块出来,地位和infrastructure层一致，都是属于数据层，也可以直接放在infrastructure层
> 整体架构设计参考[CLOA](https://github.com/alibaba/COLA)阿里简洁架构设计
> 没有一层不变的架构设计，只有最合适的

### 为什么 app层可以直接越过领域层直达infrastructure

### 基础服务框架
推荐使用[spring-boot-nebula](https://github.com/weihubeats/spring-boot-nebula)

### 编码规范

### 事件驱动编程的重要性

不同领域之间的通信我们都推荐使用事件通信。

任何现实业务逻辑的变化都会有相应的事件触发，从而触发下游业务逻辑的变更

比如下单操作，就出发了一个下单时间，这时候对于下单时间我们需要有其他业务逻辑的处理就形成了解耦。
我们不需要再下单之后修改原有的下单逻辑，只需要监听下单逻辑，然后处理相应的时间。比如下单后需要扣减库存、添加积分等。
都是一个个独立的事件监听，相互不会影响

事件驱动不要使用`spring event`,会丢失事件
推荐自研或者参考[event-bus-rocketmq-all](https://github.com/weihubeats/event-bus-rocketmq-all)

### 如何避免出现上帝聚合根

上帝聚合根是指一个聚合根包含了所有的业务逻辑，这样的聚合根会变得非常臃肿，不利于维护和扩展。

### 函数式编程构造聚合根
