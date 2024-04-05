
/*
package neskj.TestSprindData;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Value("${spring.datasource.url}")
    public String sourceUrl;
    @Value("${spring.datasource.username}")
    public String sourceName;
    @Value("${spring.datasource.password}")
    public String sourcePass;

    @Bean
    public DataSource dataSource(){
        HikariDataSource source=new HikariDataSource();
        source.setJdbcUrl(sourceUrl);
        source.setUsername(sourceName);
        source.setPassword(sourcePass);
        source.setConnectionTimeout(2000);
        return source;
    }
}


*/