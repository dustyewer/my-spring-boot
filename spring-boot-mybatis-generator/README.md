mybatis 反向工程
关键点:
generatorConfig.xml配置文件中 数据库连接信息 url后面要加上 nullCatalogMeansCurrent=true 否则会匹配所有库
connectionURL="jdbc:mysql://localhost:3306/spring_test?nullCatalogMeansCurrent=true

每次生成文件时要把之前生成的文件删除,否则会在原来的文件后面追加,导致运行时出现 Result Maps collection already contains value for 的错误
