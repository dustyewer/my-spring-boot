使用Druid连接池
在数据源配置类中 要使用Druid的datasourcebuilder
例:
return DruidDataSourceBuilder.create().build();
并且配置文件里面要用url


使用默认的连接池
使用默认的DataSourceBuilder 
配置文件里面要用jdbc-url