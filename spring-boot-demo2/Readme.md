http://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=2651478399&idx=1&sn=2b76ef336fe90b3bcfb5695d28a5434b&chksm=bd2535008a52bc164a1f8215765465fd8acb2f8bcd66429b7aedb91367076fe1b192640f2206&scene=0#rd

spring-boot:
    多个事务管理器配置

    HibernateTransactionManager
    DataSourceTransactionManager
    JtaTransactionManager
    JpaTransactionManager


    spring-boot-starter-jdbc： 会触发DataSourceTransactionManagerAutoConfiguration这个自动化配置类，
                               也会构造事务管理器DataSourceTransactionManager

    spring-boot-starter-data-jpa：会触发HibernateJpaAutoConfiguration这个自动化配置类
                                  会构造事务管理器JpaTransactionManager


    @ConditionalOnMissingBean(PlatformTransactionManager.class)
        如果我们手动配置了事务管理器，Springboot就不会再为我们自动配置事务管理器。