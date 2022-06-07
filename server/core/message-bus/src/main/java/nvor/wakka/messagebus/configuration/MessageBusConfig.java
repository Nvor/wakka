package nvor.wakka.messagebus.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageBusConfig {
    public static final String QUEUE = "file_upload_queue";
    public static final String EXCHANGE = "file_upload_exchange";
    private static final String ROUTING_KEY = "file.upload.key";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder
                .bind(queue)
                .to(exchange)
                .with(ROUTING_KEY);
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        var template = new RabbitTemplate(connectionFactory);
        return template;
    }
}
