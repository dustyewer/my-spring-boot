mybatis xml 格式 xml 文件放在 resources 下的 mapper 目录
需要在主配置文件 application.properties
添加以下内容

方法一：只有一个路径
mybatis.mapper-locations= classpath:mapper/*.xml
方法二：有多个路径
mybatis.mapper-locations= classpath:mapper/*.xml,classpath:mapper/user*.xml
方法三：通配符 ** 表示任意级的目录
mybatis.mapper-locations= classpath:**/*.xml

不要在 pom.xml 的 build 下加下面的内容,会出错的.
<resources>
<resource>
<directory>src/main/resources</directory>
<includes>
<include>**/*.xml</include>
</includes>
</resource>
</resources>

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class

Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

可以在 Springboot 启动类上加@MapperScan("yewer.springbootmybatisxmlresource.dao") 注解
也可以在每个 xxxMapper 类前面加上@Mapper 注解
至少要选一种.
