package lk.ijse.dep8.spring;

import org.hibernate.HibernateConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.register(HibernateConfig.class);
        ctx.register(XMLConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
