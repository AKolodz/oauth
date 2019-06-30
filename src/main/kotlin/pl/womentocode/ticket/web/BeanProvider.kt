package pl.womentocode.ticket.web

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore
import javax.sql.DataSource

@Configuration
class BeanProvider {
    
    @Bean
    fun provideTokenStore(dataSource: DataSource) =
            JdbcTokenStore(dataSource)
}