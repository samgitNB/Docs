/*
package com.voodram.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.icta.eservices.common.config.BaseConfig;
import com.icta.eservices.common.util.MongoProperties;
import com.mongodb.DefaultDBDecoder;
import com.mongodb.DefaultDBEncoder;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.MongoClientURI;


@Configuration

public class RegionConfig extends BaseConfig   {

	*/
/**
	 * this variable is used to map the properties of mongoDB client
	 * 
	 * @Autowired provides more fine-grained control over where and how
	 *            AutoWiring should be accomplished.
	 *//*

	@Autowired
	private Environment environment;
	
	*/
/* (non-Javadoc)
	 * @see com.icta.eservices.common.config.BaseConfig#mongoTemplate()
	 *//*

	@Override
	public MongoTemplate mongoTemplate() throws Exception{
    MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
    return mongoTemplate;
	}
	
    
	*/
/* (non-Javadoc)
	 * @see com.icta.eservices.common.config.BaseConfig#mongoDbFactory()
	 *//*

	@Override
	public MongoDbFactory mongoDbFactory() throws Exception {
     return new SimpleMongoDbFactory(mongoClient(), environment.getProperty(MongoProperties.DATABASE));
	}
	
	*/
/* (non-Javadoc)
	 * @see com.icta.eservices.common.config.BaseConfig#mongoClient()
	 *//*

	@Override
	public MongoClient mongoClient() throws Exception{
		
		Builder builder = MongoClientOptions.builder();		
		
		*/
/**
		 * Sets the maximum number of connections per host.
		 *//*

		builder.connectionsPerHost(Integer.parseInt(environment.getProperty(MongoProperties.MAX_CONNECTIONS_PER_HOST)));
		*/
/**
		 * Sets the multiplier for number of threads allowed to block waiting
		 * for a connection
		 *//*


		builder.threadsAllowedToBlockForConnectionMultiplier(Integer
				.parseInt(environment.getProperty(MongoProperties.THREADS_ALLOWED_TO_BLOCK_FOR_CONNECTION_MULTIPLIER)));
		*/
/**
		 * Sets the server selection timeout in milliseconds
		 *//*


		builder.serverSelectionTimeout(
				Integer.parseInt(environment.getProperty(MongoProperties.SERVER_SELECTION_TIMEOUT)));
		*/
/**
		 * Sets the maximum time that a thread will block waiting for a
		 * connection
		 *//*


		builder.maxWaitTime(Integer.parseInt(environment.getProperty(MongoProperties.MAX_WAIT_TIME)));
		*/
/**
		 * Sets the connection timeout.
		 *//*


		builder.connectTimeout(Integer.parseInt(environment.getProperty(MongoProperties.CONNECT_TIMEOUT)));
		*/
/**
		 * Sets the socket timeout.
		 *//*


		builder.socketTimeout(Integer.parseInt(environment.getProperty(MongoProperties.SOCKET_TIMEOUT)));
		*/
/**
		 * Sets whether socket keep alive is enabled.
		 *//*


		builder.socketKeepAlive(Boolean.parseBoolean(environment.getProperty(MongoProperties.SOCKET_KEEP_ALIVE)));
		*/
/**
		 * Sets whether to use SSL.
		 *//*


		builder.sslEnabled(Boolean.parseBoolean(environment.getProperty(MongoProperties.SSL_ENABLED)));
		*/
/**
		 * Define whether invalid host names should be allowed
		 *//*


		builder.sslInvalidHostNameAllowed(
				Boolean.parseBoolean(environment.getProperty(MongoProperties.SSL_INVALID_HOST_NAME_ALLOWED)));
		*/
/**
		 * Sets whether JMX beans registered by the driver should always be
		 * MBeans
		 *//*


		builder.alwaysUseMBeans(Boolean.parseBoolean(environment.getProperty(MongoProperties.ALWAYS_USE_MBEANS)));
		*/
/**
		 * Sets the heartBeat frequency
		 *//*


		builder.heartbeatFrequency(Integer.parseInt(environment.getProperty(MongoProperties.HEARTBEAT_FREQUENCY)));
		*/
/**
		 * Sets the minimum heartBeat frequency
		 *//*


		builder.minHeartbeatFrequency(
				Integer.parseInt(environment.getProperty(MongoProperties.MIN_HEARTBEAT_FREQUENCY)));
		*/
/**
		 * Sets the connect timeout for connections used for the cluster
		 * heartBeat.
		 *//*


		builder.heartbeatConnectTimeout(
				Integer.parseInt(environment.getProperty(MongoProperties.HEARTBEAT_CONNECT_TIMEOUT)));
		*/
/**
		 * Sets the connect timeout for connections used for the cluster
		 * heartBeat.
		 *//*


		builder.heartbeatSocketTimeout(
				Integer.parseInt(environment.getProperty(MongoProperties.HEARTBEAT_SOCKET_TIMEOUT)));
		*/
/**
		 * Sets the local threshold.
		 *//*


		builder.localThreshold(Integer.parseInt(environment.getProperty(MongoProperties.LOCAL_THRESHOLD)));
		*/
/**
		 * Sets the decoder factory.
		 *//*


		builder.dbDecoderFactory(DefaultDBDecoder.FACTORY);
		*/
/**
		 * Sets the encoder factory.
		 *//*


		builder.dbEncoderFactory(DefaultDBEncoder.FACTORY);
		*/
/**
		 * Sets whether cursor finalizers are enabled.
		 *//*


		builder.cursorFinalizerEnabled(
				Boolean.parseBoolean(environment.getProperty(MongoProperties.CURSOR_FINALIZER_ENABLED)));
		*/
/**
		 * Creates a Mongo instance based on a (single) mongo node using a given
		 * ServerAddress and default option
		 * 
		 *//*

		//KeyEncrypter ke = new KeyEncrypter();
		//String deCryptPassword = ke.decrypt(environment.getProperty(MongoProperties.PASSWORD));
		
		MongoClient client =new MongoClient(new MongoClientURI(environment.getProperty("uri1"),builder));
//		MongoClient client = new MongoClient(new ServerAddress(environment.getProperty(MongoProperties.HOST),
//				Integer.parseInt(environment.getProperty(MongoProperties.PORT))), Arrays.asList(MongoCredential.createCredential(environment.getProperty(MongoProperties.USERNAME),environment.getProperty(MongoProperties.DATABASE), deCryptPassword.toCharArray())),builder.build());


		
		return client;
	
	}
}*/
