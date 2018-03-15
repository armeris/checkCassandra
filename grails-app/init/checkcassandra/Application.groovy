package checkcassandra

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.session.cassandra.CassandraFlushMode
import org.springframework.session.cassandra.http.EnableCassandraHttpSession

@EnableCassandraHttpSession(cassandraFlushMode = CassandraFlushMode.IMMEDIATE)
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}