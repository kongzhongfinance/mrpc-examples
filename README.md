# mrpc 示例工程

- demo-api：服务接口定义
- spring-client：Spring客户端（生产者）
- spring-server：Spring服务端（消费者）
- spring-boot-client：SpringBoot客户端（生产者）
- spring-boot-server：SpringBoot服务端（消费者）

## 如何运行

**克隆源码**

```bash
git clone https://github.com/KongzhongFinance/mrpc-examples.git
```

### 运行Spring工程

1. 运行 `spring-server` 中的 `HelloWorldServerApplication` 中的 `main` 启动服务端
2. 运行 `spring-client` 中的 `HelloWorldClientApplication` 中的 `main` 开始调用
  
### 运行SpringBoot工程

1. 运行 `spring-boot-server` 中的 `ServerApplication` 中的 `main` 启动服务端
2. 运行 `spring-boot-client` 中的 `ClientApplication` 中的 `main` 启动客户端

## 示例大全

### Spring项目

**服务端**

- [HelloWorld](/spring-server/src/test/java/com/kongzhong/mrpc/demo/HelloWorldApplication.java)
- [注解方式暴露服务](/spring-server/src/test/java/com/kongzhong/mrpc/demo/AnnotationApplication.java)
- [注册服务到Zookeeper](/spring-server/src/test/java/com/kongzhong/mrpc/demo/AnnotationApplication.java)

**客户端**

- [HelloWorld](/spring-client/src/main/java/com/kongzhong/mrpc/demo/client/HelloWorldClientApplication.java)
- [通过Zookeeper发现服务](/spring-client/src/main/java/com/kongzhong/mrpc/demo/client/HelloWorldClientApplication.java)
