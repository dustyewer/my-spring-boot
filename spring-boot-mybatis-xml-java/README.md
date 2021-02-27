mybatis xml 格式 xml 文件放在和 mapper类 同一个目录下

看各种介绍都要在 pom.xml 的 build 下加入下面的内容,但在本工程会出错的,本工程不加反而一切正常
<resources>
<resource>
<directory>src/main/java</directory>
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
