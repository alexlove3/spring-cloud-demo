eureka服务高可用配置

单实例时本身就只是 server，不需要自己注册自己

多实例高可用配置时，既是 server 又是 client ，所以需要自己注册自己

注意多实例高可用配置时 appName 要统一，否则会当成多个注册中心来用了

本地测试注意修改 /etc/hosts 文件