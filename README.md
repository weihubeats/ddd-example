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

> rpc层可以单独拆分一个模块出来,地位和infrastructure层一致，都是属于数据层，也可以直接放在地位和infrastructure层一致

### 为什么 app层可以直接越过领域层直达infrastructure


### 编码规范