package tech.arturttl79.toysshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import tech.arturttl79.toysshop.entity.Product;

@Configuration
public class MethodDataRestConfig implements RepositoryRestConfigurer {
    
    private String clientUrl = Environment.getInstance().getHost();

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
       
        HttpMethod[] unsupportedActions = {
            // HttpMethod.POST,
            // HttpMethod.DELETE,
            // HttpMethod.PUT
        };

        config.exposeIdsFor(Product.class);

        disableHttpMethods(Product.class, config, unsupportedActions);

        cors.addMapping(config.getBasePath() + "/**").allowedOrigins(clientUrl);
    }

    private void disableHttpMethods(
            Class<?> self,
            RepositoryRestConfiguration config,
            HttpMethod[] unsupportedActions) {
        config.getExposureConfiguration().forDomainType(self).withItemExposure((metadata, HttpMethods) -> HttpMethods.disable(unsupportedActions)).withCollectionExposure((metadata, HttpMethods) -> HttpMethods.disable(unsupportedActions));
        }
    
}
