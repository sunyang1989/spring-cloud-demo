Spring Cloud：
    微服务工具包，为开发者提供了在分布式系统的配置管理、服务发现、断路器、智能路由、微代理、控制总线等开发工具包。

Spring Boot:
    旨在简化创建产品级的 Spring 应用和服务，简化了配置文件，使用嵌入式web服务器，含有诸多开箱即用微服务功能.

Spring Cloud Config：
    配置管理开发工具包，可以让你把配置放到远程服务器，目前支持本地存储、Git以及Subversion。
    config-server 配置服务端，服务管理配置信息
    config-client 客户端，客户端调用server端暴露接口获取配置信息
        http://blog.csdn.net/liaokailin/article/details/51307215

Spring Cloud Netflix：
    针对多种Netflix组件提供的开发工具包，其中包括Eureka、Hystrix、Zuul、Ribbon、Archaius等。

    Netflix Eureka：云端负载均衡，一个基于 REST 的服务，用于定位服务，以实现云端的负载均衡和中间层服务器的故障转移。
        http://blog.csdn.net/beyannanfei/article/details/52069725
        http://m.blog.csdn.net/article/details?id=51314001

    Netflix Hystrix：容错管理工具，旨在通过控制服务和第三方库的节点,从而对延迟和故障提供更强大的容错能力。

    Netflix Zuul：边缘服务工具，是提供动态路由，监控，弹性，安全等的边缘服务。

    Netflix Ribbon：客户端负载均衡。可以自定义负载均衡算法
        http://blog.csdn.net/w_x_z_/article/details/53242310

    Netflix Archaius：配置管理API，包含一系列配置管理API，提供动态类型化属性、线程安全配置操作、轮询框架、回调机制等功能

Spring Cloud Consul：
    封装了Consul操作，consul是一个服务发现与配置工具，与Docker容器可以无缝集成。

Spring Cloud Zookeeper：
    操作Zookeeper的工具包，用于使用zookeeper方式的服务注册和发现。

Spring Cloud Sleuth：
    为SpringCloud应用实现了一种分布式追踪解决方案。

Spring Cloud Security：
    安全工具包，为应用程序添加安全控制，主要是指OAuth2。


