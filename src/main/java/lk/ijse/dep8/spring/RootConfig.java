package lk.ijse.dep8.spring;

import org.hibernate.HibernateConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({AppConfig.class, XMLConfig.class, HibernateConfig.class})
@Configuration
public class RootConfig {
}
